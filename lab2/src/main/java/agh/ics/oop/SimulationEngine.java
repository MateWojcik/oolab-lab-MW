package agh.ics.oop;

import java.util.LinkedList;
import java.util.List;

public class SimulationEngine implements IEngine{

    private final MoveDirection[] moveTab;
    private final IWorldMap map;
    public final List<Animal> animalList;

    public SimulationEngine(MoveDirection[] moveTab, IWorldMap map, Vector2d[] posistion){
        this.moveTab = moveTab;
        this.animalList = new LinkedList<>();
        this.map = map;


        for (Vector2d vector: posistion){
            Animal animal = new Animal(this.map, vector);
            if(this.map.place(animal)){
                this.animalList.add(animal);
            }
        }
    }

    public String run(){
        System.out.println(map);
        int animalsCount = this.animalList.size();
        for(int i = 0; i < moveTab.length; i++){
            //interacja po ani list
            Animal animal = this.animalList.get(i % animalsCount);
            animal.move(moveTab[i]);

        }
        return map.toString();
    }
}