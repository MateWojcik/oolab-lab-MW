package agh.ics.oop;

public class RectangularMap implements IWorldMap{
    private int width, height;
    private Animal[][] map;
    public RectangularMap(int width, int height){
        this.width = width;
        this.height = height;
        map = new Animal[width][height];
    }


    @Override
    public boolean canMoveTo(Vector2d position) {
        if (map[position.x][position.y]==null){
            return true;
        }
        return false;
    }

    @Override
    public boolean place(Animal animal) {
        if(!isOccupied(animal.getPosition())){
            map[animal.getPosition().x][animal.getPosition().y]= animal;
            return true;
        }
        return false;
    }

    @Override
    public boolean isOccupied(Vector2d position) {
        if (map[position.x][position.y]==null){
            return false;
        }
        return true;
    }

    @Override
    public Object objectAt(Vector2d position) {
      //specjalnie nie przez kopie map to tablica obiektów, więc zwraca null jeśli nie ma tam obiektu
            return map[position.x][position.y];

    }

    @Override
    public String toString() {
        return new MapVisualizer(this).draw(new Vector2d(0,0), new Vector2d(width-1,height-1));
    }
}
