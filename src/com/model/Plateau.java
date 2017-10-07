package com.model;

public class Plateau {


    public Plateau() {

    }

    public Plateau(String input) {
        this.xMax = Integer.parseInt(input.split(" ")[0]);
        this.yMax = Integer.parseInt(input.split(" ")[1]);
    }

    public Plateau(int xMin, int xMax, int yMin, int yMax) {
        this.xMax = xMax;
        this.yMax = yMax;
    }

    private int xMax;

    public int getxMin() {
        return xMin;
    }

    public void setxMin(int xMin) {
        this.xMin = xMin;
    }

    public int getyMin() {
        return yMin;
    }

    public void setyMin(int yMin) {
        this.yMin = yMin;
    }

    private int xMin;

    private int yMax;

    private int yMin;

    public int getxMax() {
        return xMax;
    }

    public void setxMax(int xMax) {
        this.xMax = xMax;
    }

    public int getyMax() {
        return yMax;
    }

    public void setyMax(int yMax) {
        this.yMax = yMax;
    }
}
