package com.model;

public enum Direction {
    //Code, right, left
    NORTH('N', 'E', 'W'),
    EAST('E', 'S', 'N'),
    WEST('W', 'N', 'S'),
    SOUTH('S', 'W', 'E');

    char code;
    char right;
    char left;

    Direction(char code, char right, char left) {
        this.code = code;
        this.right = right;
        this.left = left;
    }

    public char getCode() {
        return this.code;
    }

    public Direction getLeft() {
        return getByCode(this.left);
    }

    public Direction getRight() {
        return getByCode(this.right);
    }

    private Direction getByCode(char code){
        for (Direction direction : Direction.values()) {
            if (code == direction.getCode()) {
                return direction;
            }
        }
        return null;
    }
}
