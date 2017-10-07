package com.model;

public class Rover {

    private String name;
    private int x;
    private int y;
    private Direction direction;

    public Rover() {

    }

    public Rover(String input) {
        String[] inputs = input.split(" ");
        this.x = Integer.parseInt(inputs[0]);
        this.y = Integer.parseInt(inputs[1]);
        this.direction = getDirectionByCode(inputs[2].toCharArray()[0]);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
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
            switch (action) {
                case 'M':
                    switch (this.direction) {
                        case NORTH:
                            y = y < plateau.getyMax() ? y + 1 : y;
                            break;
                        case SOUTH:
                            y = y > plateau.getxMin() ? y - 1 : y;
                            break;
                        case EAST:
                            x = x < plateau.getxMax() ? x + 1 : x;
                            break;
                        case WEST:
                            x = x > plateau.getxMin() ? x - 1 : x;
                            break;
                    }
                    break;
                case 'R':
                    this.direction = this.direction.getRight();
                    break;
                case 'L':
                    this.direction = this.direction.getLeft();
                    break;
            }
        }
    }

    public String getLocation() {
        return this.x + ", " + this.y + ", " + this.direction.getCode();
    }

    private Direction getDirectionByCode(char code) {
        for (Direction direction : Direction.values()) {
            if (code == direction.getCode()) {
                return direction;
            }
        }
        return null;
    }


}
