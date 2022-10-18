package agh.ics.oop.test;

import agh.ics.oop.MapDirection;
import agh.ics.oop.Vector2d;
import com.sun.source.tree.AssertTree;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Objects;

public class Vector2dTest {

    @Test
    public void testEquals(){
        Vector2d v1= new Vector2d(1,1);
        Vector2d v2= new Vector2d(1,1);
        Vector2d v3= new Vector2d(1,-1);
        Vector2d v4= new Vector2d(-1,-1);
        Assert.assertTrue(v1.equals(v2));
        Assert.assertFalse(v1.equals(v3));
        Assert.assertFalse(v1.equals(v4));
    }

    @Test
    public void testToString(){
        Vector2d v1= new Vector2d(1,1);
        Assert.assertEquals(v1.toString(), "(1, 1)");
    }

    @Test
    public void testPrecedes(){
        Vector2d v1= new Vector2d(1,1);
        Vector2d v2= new Vector2d(1,-1);
        Vector2d v3= new Vector2d(-1,-1);
        Assert.assertTrue(v1.precedes(v1));
        Assert.assertFalse(v1.precedes(v2));
        Assert.assertFalse(v1.precedes(v3));
    }
    @Test
    public void testFollows(){
        Vector2d v1= new Vector2d(1,1);
        Vector2d v2= new Vector2d(1,-1);
        Assert.assertTrue(v1.follows(v1));
        Assert.assertTrue(v1.follows(v2));

    }
    @Test
    public void testUpperRight(){
        Vector2d v1= new Vector2d(-1,1);
        Vector2d v2= new Vector2d(1,-1);
        Vector2d v4 = new Vector2d(1,1);
        Assert.assertEquals(v4, v1.upperRight(v2));
    }
    @Test
    public void testLowerLeft(){
        Vector2d v1= new Vector2d(-1,1);
        Vector2d v2= new Vector2d(1,-1);

        Vector2d v4 = new Vector2d(-1,-1);
        Assert.assertEquals(v4, v1.lowerLeft(v2));
    }
    @Test
    public void testAdd(){
        Vector2d v1= new Vector2d(1,1);
        Vector2d v2= new Vector2d(1,-1);

        Vector2d v4 = new Vector2d(2,0);
        Assert.assertEquals(v4,v1.add(v2));
    }
    @Test
    public void testSubtract(){
        Vector2d v1= new Vector2d(1,1);
        Vector2d v2= new Vector2d(1,-1);
        Vector2d v4 = new Vector2d(0,2);
        Assert.assertEquals(v4, v1.subtract(v2));
    }
    @Test
    public void testOpposite(){
        Vector2d v1= new Vector2d(1,-1);
        Vector2d v2= new Vector2d(-1,1);
        Assert.assertEquals(v1.opposite(),v2);
    }
}
