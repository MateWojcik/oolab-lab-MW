package agh.ics.oop;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Random;

public class GrassField extends AbstractWorldMap implements IWorldMap{
    private LinkedList<Grass> grassList;

    private int grassCount;


    public GrassField(int fieldsCount){
         lowerBound =new Vector2d(0,0);

         upperBound = new Vector2d(10,10);
        grassList = new LinkedList<>();
        Random rn = new Random();
        this.grassCount = (int) Math.sqrt(fieldsCount*10)+1;
        int x,y;
        while (fieldsCount>0){
            x = rn.nextInt(grassCount);
            y = rn.nextInt(grassCount);
            Vector2d tempV = new Vector2d(x,y);
            if (grassList.stream().noneMatch(n -> n.getPosition().equals(tempV))){
                grassList.add(new Grass(tempV));
                fieldsCount--;
            }
        }
    }

    @Override
    public boolean canMoveTo(Vector2d position) {
        boolean result = false;
        if (grassList.stream().anyMatch(n -> n.getPosition().equals(position))){
            return false;
        }
        if (getAnimalsList().stream().anyMatch(n -> n.getPosition().equals(position))){
            return false;
        }
        return true;
    }



    @Override
    public boolean isOccupied(Vector2d position) {
        return !this.canMoveTo(position);
    }

    @Override
    public Object objectAt(Vector2d position) {
        for (Animal animal: animals){
            if (animal.getPosition().equals(position)){
                return animal;
            }
        }

        for (Grass grass : grassList) {
            if (Objects.equals(grass.getPosition(), position)) {
                return grass;
            }
        }
        return 0;

    }



}
