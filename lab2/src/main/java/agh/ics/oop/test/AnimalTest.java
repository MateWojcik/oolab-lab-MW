package agh.ics.oop.test;

import agh.ics.oop.Animal;
import agh.ics.oop.MapDirection;
import agh.ics.oop.MoveDirection;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AnimalTest {
    // testuję pojedyńczą funkcję dlatego nie użwyam Paresr-a
    @Test
    public void testMovement(){
        Animal zw = new Animal();
        Assert.assertEquals(zw.toString(), "Position: (2, 2), orientation: Północ");
        zw.move(MoveDirection.FORWARD);
        Assert.assertEquals(zw.toString(), "Position: (2, 3), orientation: Północ");
        zw.move(MoveDirection.FORWARD);
        Assert.assertEquals(zw.toString(), "Position: (2, 4), orientation: Północ");
        zw.move(MoveDirection.FORWARD);
        Assert.assertEquals(zw.toString(), "Position: (2, 4), orientation: Północ");

        zw = new Animal();
        zw.move(MoveDirection.BACKWARD);
        Assert.assertEquals(zw.toString(), "Position: (2, 1), orientation: Północ");
        zw.move(MoveDirection.BACKWARD);
        Assert.assertEquals(zw.toString(), "Position: (2, 0), orientation: Północ");
        zw.move(MoveDirection.BACKWARD);
        Assert.assertEquals(zw.toString(), "Position: (2, 0), orientation: Północ");

        zw = new Animal();
        zw.move(MoveDirection.LEFT);
        Assert.assertEquals(zw.toString(), "Position: (2, 2), orientation: Zachód");
        zw.move(MoveDirection.LEFT);
        Assert.assertEquals(zw.toString(), "Position: (2, 2), orientation: Południe");
        zw.move(MoveDirection.LEFT);
        Assert.assertEquals(zw.toString(), "Position: (2, 2), orientation: Wschód");
        zw.move(MoveDirection.LEFT);
        Assert.assertEquals(zw.toString(), "Position: (2, 2), orientation: Północ");

        zw = new Animal();
        zw.move(MoveDirection.RIGHT);
        System.out.println(zw);
        Assert.assertEquals(zw.toString(), "Position: (2, 2), orientation: Wschód");
        zw.move(MoveDirection.RIGHT);
        Assert.assertEquals(zw.toString(), "Position: (2, 2), orientation: Południe");
        zw.move(MoveDirection.RIGHT);
        Assert.assertEquals(zw.toString(), "Position: (2, 2), orientation: Zachód");
        zw.move(MoveDirection.RIGHT);
        Assert.assertEquals(zw.toString(), "Position: (2, 2), orientation: Północ");
    }
}
