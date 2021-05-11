package com.hillel;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Concurency {

    enum Parts {
        COVER,
        BASE,
        DOOR;
    }

    public static void main(String[] args) {
        Concurency c = new Concurency();
        Table table1 = new Table("table1");
        Table table2 = new Table("table2");

        Runnable coverManufacturer1 = c.makeManufacture(Parts.COVER,table1,4);
        Runnable baseManufacturer1 = c.makeManufacture(Parts.BASE,table1,3);
        Runnable doorManufacturer1 = c.makeManufacture(Parts.DOOR,table1,2);

        Runnable coverManufacturer2 = c.makeManufacture(Parts.COVER,table2,7);
        Runnable baseManufacturer2 = c.makeManufacture(Parts.BASE,table2,6);
        Runnable doorManufacturer2 = c.makeManufacture(Parts.DOOR,table2,5);

        Runnable worker1 = c.makeWorker("Worker1",table1);
        Runnable worker2 = c.makeWorker("Worker2",table2);

        ExecutorService pool = Executors.newCachedThreadPool();

        pool.execute(worker1);
        pool.execute(worker2);
        pool.execute(coverManufacturer1);
        pool.execute(baseManufacturer1);
        pool.execute(doorManufacturer1);

        pool.execute(coverManufacturer2);
        pool.execute(baseManufacturer2);
        pool.execute(doorManufacturer2);

        pool.shutdown();
    }


    Runnable makeManufacture(Parts parts, Table table, long delay) {
        return () -> {
            System.out.printf("  Start manufacturing %s for %s  \n", parts.name(), table.getTableName());

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (Throwable t) {
                // NOTHING TO DO HERE
            }

            System.out.printf("  %s for %s is ready!\n", parts.name(),table.getTableName());

            switch (parts) {
                case COVER:  table.setCoverReady(true);   break;
                case BASE:   table.setBaseReady(true);    break;
                case DOOR:   table.setDoorReady(true);    break;
            }
            synchronized (this) {
                notifyAll();
            }

        };
    }

    Runnable makeWorker(String name, Table table) {
        return () -> {
            while (!table.partsReady()) {
                System.out.printf("%s : Waiting for %s parts will be ready ... \n", name, table.getTableName());
                synchronized (this) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.printf("%s %s is DONE !\n", name,table.getTableName());

        };
    }


}
