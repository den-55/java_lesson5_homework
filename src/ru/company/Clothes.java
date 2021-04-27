package ru.company;

import java.awt.*;

public class Clothes {
    private String brand;
    private Integer size;
    private Color color;
    private int pocketCount;

    public Clothes(String brand, Integer size, Color color, int pocketCount) {
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.pocketCount = pocketCount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPocketCount() {
        return pocketCount;
    }

    public void setPocketCount(int pocketCount) {
        this.pocketCount = pocketCount;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                ", color=" + color +
                ", pocketCount=" + pocketCount +
                '}';
    }
}
