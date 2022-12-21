package agh.ics.oop;

public class Animal{
    private MapDirection orientation;
    private Vector2d position;
    private IWorldMap map;
    public Animal(){
        orientation = MapDirection.NORTH;
        position = new Vector2d(2,2);
    }

    public Animal(IWorldMap map) {
        this.orientation = MapDirection.NORTH;
        this.position = new Vector2d(2,2);
        this.map = map;
    }

    public Animal(IWorldMap map, Vector2d initialPosition) {
        this.orientation = MapDirection.NORTH;
        this.position = initialPosition;
        this.map = map;
    }

    @Override
    public String toString() {

        //oreintationa.toString zwraca pojedyńczą literę
        return orientation.toString();
    }

    boolean isAt(Vector2d position){
        return  this.position.equals(position);
    }

   public Vector2d getPosition(){
        return new Vector2d(position.x, position.y);
    }

    // refaktor na metody
    public void move(MoveDirection direction) {
        Vector2d testMove = new Vector2d(0,0);
        switch(direction){
            case LEFT -> this.orientation = this.orientation.previous();
            case RIGHT -> this.orientation = this.orientation.next();
            case BACKWARD -> testMove = this.orientation.toUnitVector().opposite();
            case FORWARD -> testMove = this.orientation.toUnitVector();
        }
        Vector2d testPosition = this.position.add(testMove);
        //System.out.println(testPosition);
        if(this.map.canMoveTo(testPosition) && testPosition.x <=10 && testPosition.x>=0 && testPosition.y>=0  &&testPosition.y<=10){
            this.position = this.position.add(testMove);
        }

    }



}





