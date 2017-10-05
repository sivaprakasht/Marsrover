package com.model;

public class Plateau {


    public Plateau() {

    }

    public Plateau(String input) {
        this.xMax = Integer.parseInt(input.split(" ")[0]);
        this.yMax = Integer.parseInt(input.split(" ")[1]);
    }

    public Plateau(int xMax, int yMax) {
        this.xMax = xMax;
        this.yMax = yMax;
    }

    private int xMax;

    private int yMax;

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
