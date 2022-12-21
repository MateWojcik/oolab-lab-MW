package agh.ics.oop;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public abstract class AbstractWorldMap implements IWorldMap {
    protected List<Animal> animals;
    protected MapVisualizer map;
    protected Vector2d lowerBound;
    protected Vector2d upperBound;
//poprawka zamiast kopii listy
    public List<Animal> getAnimalsList(){
        return Collections.unmodifiableList(animals);
    }

    protected AbstractWorldMap(){
        this.map = new MapVisualizer(this);
        this.animals = new LinkedList<>();

    }

    public boolean place(Animal animal) {
        if(!isOccupied(animal.getPosition())){
            animals.add(animal);
            return true;
        }
        return false;

    }

    public String toString(){
        return map.draw(lowerBound, upperBound);
    }

    public Vector2d getLowerBound() {
        Vector2d re = new Vector2d(lowerBound.x, lowerBound.y);
        return re;
    }

    public Vector2d getUpperBound() {
        Vector2d re = new Vector2d(upperBound.x, upperBound.y);
        return re;
    }

}
