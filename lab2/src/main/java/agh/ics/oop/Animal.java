package agh.ics.oop;

import java.util.Map;

public class Animal {
    private MapDirection orientation;
    private Vector2d position;

    public Animal(){
        orientation = MapDirection.NORTH;
        position = new Vector2d(2,2);

    }

    @Override
    public String toString() {
        return "Position: "+ position.toString() + ", orientation: " + orientation.toString();
    }

    boolean isAt(Vector2d position){
        return  this.position.equals(position);
    }

    // fix 4,0
    public void move(MoveDirection direction){

        if(direction.equals(MoveDirection.RIGHT)){
            orientation = orientation.next();
        } else if (direction.equals(MoveDirection.LEFT)) {
            orientation = orientation.previous();
        } else if (direction.equals(MoveDirection.FORWARD)) {
            if(orientation.equals(MapDirection.NORTH))
            {
                if(position.y < 4)
                    position =position.add(new Vector2d(0,1));}
            else if (orientation.equals(MapDirection.SOUTH)) {
                if(position.y > 0)
                    position =position.add(new Vector2d(0,-1));
            }
            else if (orientation.equals(MapDirection.EAST)) {
                if(position.x < 4)
                    position =position.add(new Vector2d(1,0));
            }
            else if (orientation.equals(MapDirection.WEST)) {
                if(position.x > 0)
                    position =position.add(new Vector2d(-1,0));
            }

        } else if (direction.equals(MoveDirection.BACKWARD)) {
            if(orientation.equals(MapDirection.NORTH))
            {
                if(position.y > 0)
                    position =position.add(new Vector2d(0,-1));}
            else if (orientation.equals(MapDirection.SOUTH)) {
                if(position.y < 4)
                    position =position.add(new Vector2d(0,1));
            }
            else if (orientation.equals(MapDirection.EAST)) {
                if(position.x > 0)
                    position = position.add(new Vector2d(-1,0));
            }
            else if (orientation.equals(MapDirection.WEST)) {
                if(position.x < 4)
                position = position.add(new Vector2d(1,0));
            }
        }


    }



}




