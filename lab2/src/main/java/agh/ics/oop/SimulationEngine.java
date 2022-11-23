package agh.ics.oop;

public class SimulationEngine implements IEngine{
    private IWorldMap map;
    private Vector2d[] aniTab;
    private boolean[] check;
    private MoveDirection[] moveTab;

    public SimulationEngine(MoveDirection[] moveTab, IWorldMap map, Vector2d[] animalTab){

        this.map = map;
        this.aniTab = animalTab;
        this.moveTab = moveTab;
        check = new boolean[animalTab.length];

        for (int i = 0; i < animalTab.length; i++) {
            // jeśli uda się dodać zmianiam wartość na flase, jeśli nie to false jest domyślne
           if(this.map.place(new Animal(map, animalTab[i]))){
               check[i] = true;
           }
        }
    }
    @Override
    public String run() {
        String last = "";
        for (int i = 0; i < moveTab.length; i++) {
            for (int j = 0; j < aniTab.length; j++) {
                if (check[j] == true) {
                    Animal a = (Animal) map.objectAt(aniTab[j]);
                    if( map.canMoveTo(aniTab[j].add(a.getPosition()))){
                        a.move(moveTab[i]);
                       last = a.getPosition().toString();
                    }
                    break;
                }

            }
        }
        return last;
    }
    
}
