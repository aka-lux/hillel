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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Table table = (Table) o;

        if (coverReady != table.coverReady) return false;
        if (baseReady != table.baseReady) return false;
        if (doorReady != table.doorReady) return false;
        return tableName != null ? tableName.equals(table.tableName) : table.tableName == null;
    }

    @Override
    public int hashCode() {
        int result = tableName != null ? tableName.hashCode() : 0;
        result = 31 * result + (coverReady ? 1 : 0);
        result = 31 * result + (baseReady ? 1 : 0);
        result = 31 * result + (doorReady ? 1 : 0);
        return result;
    }
}
