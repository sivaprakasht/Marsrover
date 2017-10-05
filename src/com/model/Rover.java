package com.model;

public class Rover {

    private String name;
    private int x;
    private int y;
    private char direction;

    public Rover() {

    }

    public Rover(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Rover(String input) {
        String[] inputs = input.split(" ");
        this.x = Integer.parseInt(inputs[0]);
        this.y = Integer.parseInt(inputs[1]);
        this.direction = inputs[2].toCharArray()[0];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getDirection() {
        return direction;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void navigate(String input, Plateau plateau) {
        for (char action : input.toCharArray()) {
            if (action == 'M') {
                if (this.direction == 'N') {
                    this.y++;
                } else if (this.direction == 'S') {
                    this.y--;
                } else if (this.direction == 'E') {
                    this.x++;
                } else if (this.direction == 'W') {
                    this.x--;
                }
            } else {

                if (action == 'R') {
                    if (this.direction == 'N') {
                        this.direction = 'E';
                    } else if (this.direction == 'S') {
                        this.direction = 'W';
                    } else if (this.direction == 'E') {
                        this.direction = 'S';
                    } else if (this.direction == 'W') {
                        this.direction = 'N';
                    }
                } else if (action == 'L') {
                    if (this.direction == 'N') {
                        this.direction = 'W';
                    } else if (this.direction == 'S') {
                        this.direction = 'E';
                    } else if (this.direction == 'E') {
                        this.direction = 'N';
                    } else if (this.direction == 'W') {
                        this.direction = 'S';
                    }
                }
            }
        }
    }

    public String getLocation() {
        return this.x + ", " + this.y + ", " + this.direction;
    }


}
