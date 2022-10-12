package agh.ics.oop;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public enum MapDirection {
    NORTH, SOUTH, WEST, EAST;


    public String toString(){
        if (this.equals(EAST)) return "Wschód";
        if (this.equals(WEST)) return "Zachód";
        if (this.equals(NORTH)) return
        if (this.equals(SOUTH)) return
    }
}
