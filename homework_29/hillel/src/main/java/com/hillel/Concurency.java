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

    Runnable makeManufacture(Parts parts, Table table, long delay) {
        return () -> {
            System.out.printf("  Start manufacturing %s for %s  \n", parts.name(), table.getTableName());

            try {
                TimeUnit.SECONDS.sleep(delay);
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
