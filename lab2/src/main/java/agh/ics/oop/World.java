package agh.ics.oop;

public class World {

    public static void main(String[] args) {

        Animal zw = new Animal();
        System.out.println(zw.toString());
//
        zw.move(MoveDirection.BACKWARD);
        //zw.move(MoveDirection.RIGHT);
        System.out.println(zw.toString());
//        zw.move(MoveDirection.FORWARD);
//        zw.move(MoveDirection.FORWARD);
//        zw.move(MoveDirection.FORWARD);
//        System.out.println(zw.toString());
//
       // Animal zw2 = new Animal(new Wo);
        String[] test = {"r","f","f","f"};
        MoveDirection[] mapDirection = OptionsParser.parse(test);

       for (int i = 0; i < mapDirection.length; i++) {
           System.out.println(zw.getPosition());
            zw.move(MoveDirection.BACKWARD);
        }

//testy
       // Application.launch(Label_Test.class, args);
    }
}
