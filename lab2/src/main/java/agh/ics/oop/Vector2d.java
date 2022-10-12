package agh.ics.oop;

public class Vector2d {
    final int x;
    final int y;
    public Vector2d(int x, int y){

        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "(" + this.x + ", "+ this.y +")";
    }
//string format
     boolean follows(Vector2d other){
        if(this.x >= other.x && this.y >= other.y){
            return true;
        }
        return false;
    }
    Vector2d add(Vector2d other){
        return new Vector2d(this.x+ other.x, this.y+other.y);
    }
    Vector2d subtract(Vector2d other){
        return new Vector2d(this.x- other.x, this.y-other.y);
    }
    Vector2d upperRight(Vector2d other){
        int x,y;
        if(this.x>other.x){
            x=this.x;
        }
        else {
            x= other.x;
        }

        if (this.y> other.y){
            y=this.y;
        }else{
            y= other.y;
        }
        return new Vector2d(x, y);
    }

    Vector2d lowerLeft(Vector2d other){
        int x,y;
        if(this.x<other.x){
            x=this.x;
        }
        else {
            x= other.x;
        }

        if (this.y< other.y){
            y=this.y;
        }else{
            y= other.y;
        }
        return new Vector2d(x, y);
    }

    Vector2d opposite(){
        return new Vector2d(-this.x,-this.y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector2d temp = (Vector2d) o;
        return this.x == temp.x && this.y == temp.y;
}}
