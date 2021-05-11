package com.hillel;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) {
        Concurency c1 = new Concurency();
        Concurency c2 = new Concurency();
        Table table1 = new Table("table1");
        Table table2 = new Table("table2");

        Runnable coverManufacturer1 = c1.makeManufacture(Concurency.Parts.COVER,table1,4);
        Runnable baseManufacturer1 = c1.makeManufacture(Concurency.Parts.BASE,table1,3);
        Runnable doorManufacturer1 = c1.makeManufacture(Concurency.Parts.DOOR,table1,2);

        Runnable coverManufacturer2 = c2.makeManufacture(Concurency.Parts.COVER,table2,7);
        Runnable baseManufacturer2 = c2.makeManufacture(Concurency.Parts.BASE,table2,6);
        Runnable doorManufacturer2 = c2.makeManufacture(Concurency.Parts.DOOR,table2,5);

        Runnable worker1 = c1.makeWorker("Worker1",table1);
        Runnable worker2 = c2.makeWorker("Worker2",table2);

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
}
