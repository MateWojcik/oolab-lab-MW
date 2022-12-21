package agh.ics.oop;

public class RectangularMap extends AbstractWorldMap implements IWorldMap {
    private int width, height;
    private Animal[][] map;




    public RectangularMap(int width, int height) {
        this.lowerBound = new Vector2d(0, 0);
        this.width = width;
        this.height = height;
        this.upperBound = new Vector2d(this.width - 1, this.height - 1);
        this.map = new Animal[width][height];
    }
//tutaj implementacja opera się o tablicę
    @Override
    public boolean place(Animal animal) {
        if(!isOccupied(animal.getPosition())){
            map[animal.getPosition().x][animal.getPosition().y]= animal;
            return true;
        }
        return false;
    }
    @Override
    public boolean canMoveTo(Vector2d position) {
        if (position.x >0 && position.y >0 && map[position.x][position.y] == null) {
            return true;
        }
        return false;
    }


    @Override
    public boolean isOccupied(Vector2d position) {
        if (map[position.x][position.y] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object objectAt(Vector2d position) {
        //specjalnie nie przez kopie map to tablica obiektów, więc zwraca null jeśli nie ma tam obiektu
        return map[position.x][position.y];

    }


}
