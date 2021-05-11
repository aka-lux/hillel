package com.hillel;

public class Table  {

     String tableName;
     boolean coverReady;
     boolean baseReady;
     boolean doorReady;


    public Table(String tableName) {
        this.tableName = tableName;
    }

    public String getTableName() {
        return tableName;
    }

    public synchronized boolean partsReady() {
        return coverReady && baseReady && doorReady;
    }

    public synchronized void setCoverReady(boolean coverReady) {
        this.coverReady = coverReady;
    }

    public synchronized void setBaseReady(boolean baseReady) {
        this.baseReady = baseReady;
    }

    public synchronized void setDoorReady(boolean doorReady) {
        this.doorReady = doorReady;
    }
}
