package agh.ics.oop;


public class Main {
    public static void main(String[] args) {

//        Vector2d position1 = new Vector2d(1,2);
//        System.out.println(position1);
//        Vector2d position2 = new Vector2d(-2,1);
//        System.out.println(position2);
//        System.out.println(position1.add(position2));
        String s = "f b r l f f r r f f f f f f f f";
        MoveDirection[] directions = new OptionsParser().parse(s.split(" "));
        IWorldMap map = new RectangularMap(10, 10);
        Vector2d[] positions = { new Vector2d(2,2), new Vector2d(3,4) };
        IEngine engine = new SimulationEngine(directions, map, positions);
        engine.run();
    }
}