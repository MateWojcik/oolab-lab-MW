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
        orientation = MapDirection.NORTH;
        position = new Vector2d(2,2);
        this.map = map;
    }

    public Animal(IWorldMap map, Vector2d initialPosition) {
        orientation = MapDirection.NORTH;
        position = initialPosition;
        this.map = map;
    }

    @Override
    public String toString() {

        //oreintationa.toString zwraca pojedyńczą literę
        return "Position: "+ position.toString() + ", orientation: " + orientation;
    }

    boolean isAt(Vector2d position){
        return  this.position.equals(position);
    }

   public Vector2d getPosition(){
        return new Vector2d(position.x, position.y);
    }

    // dodać implementecje cnmove
    public void move(MoveDirection direction) {

        if(direction.equals(MoveDirection.RIGHT)){
            orientation = orientation.next();
        } else if (direction.equals(MoveDirection.LEFT)) {
            orientation = orientation.previous();
        } else if (direction.equals(MoveDirection.FORWARD)) {
            if(orientation.equals(MapDirection.NORTH))
            {
                if(map.canMoveTo(new Vector2d(position.x, position.y+1 )))
                    position =position.add(new Vector2d(0,1));}
            else if (orientation.equals(MapDirection.SOUTH)) {
                if(map.canMoveTo(new Vector2d(position.x, position.y-1 )))
                    position =position.add(new Vector2d(0,-1));
            }
            else if (orientation.equals(MapDirection.EAST)) {
                if(map.canMoveTo(new Vector2d(position.x+1, position.y)))
                    position =position.add(new Vector2d(1,0));
            }
            else if (orientation.equals(MapDirection.WEST)) {
                if(map.canMoveTo(new Vector2d(position.x-1, position.y)))
                    position =position.add(new Vector2d(-1,0));
            }

        } else if (direction.equals(MoveDirection.BACKWARD)) {
            if(orientation.equals(MapDirection.NORTH))
            {
                if(map.canMoveTo(new Vector2d(position.x, position.y-1 )))
                    position =position.add(new Vector2d(0,-1));}
            else if (orientation.equals(MapDirection.SOUTH)) {
                if(map.canMoveTo(new Vector2d(position.x, position.y+1 )))
                    position =position.add(new Vector2d(0,1));
            }
            else if (orientation.equals(MapDirection.EAST)) {
                if(map.canMoveTo(new Vector2d(position.x-1, position.y)))
                    position = position.add(new Vector2d(-1,0));
            }
            else if (orientation.equals(MapDirection.WEST)) {
                if(map.canMoveTo(new Vector2d(position.x+1, position.y)))
                position = position.add(new Vector2d(1,0));
            }
        }
        //zmieniłem


    }



}




