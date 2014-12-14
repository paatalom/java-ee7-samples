package org.javaee7.batch.chunk.simple;

public class MyInputRecord {
    private int id;
            
    public MyInputRecord() { }
    
    public MyInputRecord(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "MyInputRecord: " + id;
    }
}
