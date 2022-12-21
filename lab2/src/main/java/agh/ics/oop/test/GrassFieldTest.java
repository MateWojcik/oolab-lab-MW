package agh.ics.oop.test;

import agh.ics.oop.Animal;
import agh.ics.oop.GrassField;
import agh.ics.oop.MapVisualizer;
import agh.ics.oop.Vector2d;
import org.junit.Assert;
import org.junit.Test;

public class GrassFieldTest {
    @Test
    public void placeTest(){
        GrassField testMap = new GrassField(0);
        MapVisualizer mv = new MapVisualizer(testMap);
        Animal zw1 = new Animal(testMap, new Vector2d(0,0));
        testMap.place(zw1);
        Assert.assertTrue(testMap.canMoveTo(new Vector2d(5,5)));
        Assert.assertFalse(testMap.canMoveTo(new Vector2d(0,0)));

    }

    @Test
    public void isOccupiesTest(){
        GrassField testMap = new GrassField(0);
        MapVisualizer mv = new MapVisualizer(testMap);
        Animal zw1 = new Animal(testMap, new Vector2d(0,0));
        testMap.place(zw1);
        Assert.assertFalse(testMap.isOccupied(new Vector2d(5,5)));
        Assert.assertTrue(testMap.isOccupied(new Vector2d(0,0)));

    }
    @Test
    public void canMoveToTest(){
        GrassField testMap = new GrassField(0);
        MapVisualizer mv = new MapVisualizer(testMap);
        Animal zw1 = new Animal(testMap, new Vector2d(0,0));
        testMap.place(zw1);
        Assert.assertTrue(testMap.canMoveTo(new Vector2d(5,5)));
        Assert.assertFalse(testMap.canMoveTo(new Vector2d(0,0)));

    }



    @Test
    public void objectAtTest(){
        GrassField testMap = new GrassField(0);
        MapVisualizer mv = new MapVisualizer(testMap);
        Animal zw1 = new Animal(testMap, new Vector2d(0,0));
        testMap.place(zw1);
        Assert.assertEquals(zw1, testMap.objectAt(new Vector2d(0,0)));
    }
}
