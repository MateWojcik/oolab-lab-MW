package agh.ics.oop.test;


import agh.ics.oop.MapDirection;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;
import java.util.Objects;




//test nesxt, prevoius
public class MapDirectionTest {
    @Test
    public void testPrevious(){

        MapDirection a = MapDirection.EAST;
        Assert.assertEquals(MapDirection.NORTH, a.previous());
        a = MapDirection.WEST;
        Assert.assertEquals(MapDirection.SOUTH, a.previous());
        a = MapDirection.NORTH;
        Assert.assertEquals(MapDirection.WEST, a.previous());
        a = MapDirection.SOUTH;
        Assert.assertEquals(MapDirection.EAST, a.previous());
    }



}
