/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cu.edu.java.ee7.jsf.primefaces;

/**
 *
 * @author paata1
 */
import java.io.Serializable;

public class Car implements Serializable {

    public String id;
    public int year;
    public String manufacturer;
    public String color;
    public int price;
    public boolean sold;

    public Car(String id, int year, String manufacturer, String color) {
        this.id = id;
        this.year = year;
        this.manufacturer = manufacturer;
        this.color = color;
    }

    public Car(String model, int year, String manufacturer, String color, int price, boolean sold) {
        this(model, year, manufacturer, color);
        this.price = price;
        this.sold = sold;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Car)) {
            return false;
        }

        Car compare = (Car) obj;

        return compare.id.equals(this.id);
    }

    @Override
    public int hashCode() {
        int hash = 1;

        return hash * 31 + id.hashCode();
    }

    @Override
    public String toString() {
        return "Car{" + "id=" + id + ", year=" + year + ", manufacturer=" + manufacturer + ", color=" + color + ", price=" + price + '}';
    }
}
