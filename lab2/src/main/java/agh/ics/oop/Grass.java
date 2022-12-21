package agh.ics.oop;

public class Grass {
    private Vector2d position;
    Grass(Vector2d position){
        this.position = position;
    }

    public Vector2d getPosition(){
        return new Vector2d(position.x, position.y);
    }

   public String toString(){
        return "*";
    }
}
