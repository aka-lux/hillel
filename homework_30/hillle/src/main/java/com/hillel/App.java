package com.hillel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {

        Integer sum2 = 0;
        List<Future<Integer>> results = new ArrayList<>();
        final ExecutorService pool = Executors.newCachedThreadPool();

        for (int j = 1; j <= 100; j+=10) {
            final int start = j;

        Callable<Integer> c = () -> {
            System.out.println("calc started");
            int sum = 0;
            for (int i = start; i <  start + 9; i++) {
                sum += i;
            }
            return sum;
        };

        results.add(pool.submit(c));

        }

        pool.shutdown();
        pool.awaitTermination(1,TimeUnit.MINUTES);




        System.out.println( "Hello World!" +  results.get(1));
    }
}
