package org.example;

public class Wall {
    private double width;
    private double height;

    public Wall(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        if(height <= 0){
            this.height = 0;
        }else {
            this.height = height;
        }
    }

    public void setWidth(double width) {
        if(width <= 0){
            this.width = 0;
        }else {
            this.width = width;
        }
    }

    public double getArea(){
        return this.width * this.height;
    }
}
