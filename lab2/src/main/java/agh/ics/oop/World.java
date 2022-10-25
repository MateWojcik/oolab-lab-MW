package agh.ics.oop;

public class World {

    public static void main(String[] args) {

        Animal zw = new Animal();
        System.out.println(zw.toString());

        zw.move(MoveDirection.RIGHT);
        zw.move(MoveDirection.FORWARD);
        zw.move(MoveDirection.FORWARD);
        zw.move(MoveDirection.FORWARD);
        System.out.println(zw.toString());

        Animal zw2 = new Animal();
        String[] test = {"r","f","f","f"};
        MoveDirection[] mapDirection = OptionsParser.parse(test);
        for (int i = 0; i < mapDirection.length; i++) {
            zw2.move(mapDirection[i]);
        }
        System.out.println(zw);
//testy
    }
}
