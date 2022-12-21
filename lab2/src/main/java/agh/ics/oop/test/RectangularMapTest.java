package agh.ics.oop.test;

import agh.ics.oop.*;
import org.junit.Assert;
import org.junit.Test;

public class RectangularMapTest {
    @Test
    public void placeTest(){
        RectangularMap testMap = new RectangularMap(10,10);
        MapVisualizer mv = new MapVisualizer(testMap);
        Animal zw1 = new Animal(testMap, new Vector2d(0,0));
        testMap.place(zw1);
        Assert.assertTrue(testMap.canMoveTo(new Vector2d(5,5)));
        Assert.assertFalse(testMap.canMoveTo(new Vector2d(0,0)));

    }

    @Test
    public void isOccupiesTest(){
        RectangularMap testMap = new RectangularMap(10,10);
        MapVisualizer mv = new MapVisualizer(testMap);
        Animal zw1 = new Animal(testMap, new Vector2d(0,0));
        testMap.place(zw1);
        Assert.assertFalse(testMap.isOccupied(new Vector2d(5,5)));
        Assert.assertTrue(testMap.isOccupied(new Vector2d(0,0)));

    }
    @Test
    public void canMoveToTest(){
        RectangularMap testMap = new RectangularMap(10,10);
        MapVisualizer mv = new MapVisualizer(testMap);
        Animal zw1 = new Animal(testMap, new Vector2d(0,0));
        testMap.place(zw1);
        Assert.assertTrue(testMap.canMoveTo(new Vector2d(5,5)));
        Assert.assertFalse(testMap.canMoveTo(new Vector2d(0,0)));

    }



    @Test
    public void objectAtTest(){
        RectangularMap testMap = new RectangularMap(10,10);
        MapVisualizer mv = new MapVisualizer(testMap);
        Animal zw1 = new Animal(testMap, new Vector2d(0,0));
        testMap.place(zw1);
        Assert.assertEquals(zw1, testMap.objectAt(new Vector2d(0,0)));
    }
}
