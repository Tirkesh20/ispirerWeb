package by.ispaerSystems.demo.model;

import java.util.concurrent.atomic.AtomicInteger;

public class CountableClass {

    private static final AtomicInteger atomicInteger=new AtomicInteger(0);

    public CountableClass() {
        atomicInteger.getAndIncrement();

    }

    public static   int getClassCount(){
        return atomicInteger.get();
    }

}
