package cu.edu.java.ee7.batch.sample.chunk.partition;

public class MyOutputRecord {
    private int id;
            
    public MyOutputRecord() { }
    
    public MyOutputRecord(int id) {
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
        return "MyOutputRecord: " + id;
    }
}
