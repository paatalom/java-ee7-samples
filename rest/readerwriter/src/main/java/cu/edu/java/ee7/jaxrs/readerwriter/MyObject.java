package cu.edu.java.ee7.jaxrs.readerwriter;

import java.io.Serializable;

public class MyObject implements Serializable {
    public static final String MIME_TYPE = "application/myType";

    private int index;

    public MyObject() {
    }

    public MyObject(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
