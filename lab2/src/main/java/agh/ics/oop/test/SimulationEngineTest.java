package agh.ics.oop.test;

import agh.ics.oop.*;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SimulationEngineTest {

    @Test
    public void testRun() throws Exception{
        String s = "f b r l f f r r f f f f f f f f";
        MoveDirection[] directions = new OptionsParser().parse(s.split(" "));
        IWorldMap map = new RectangularMap(10, 10);
        Vector2d[] positions = { new Vector2d(2,2), new Vector2d(3,4) };
        IEngine engine = new SimulationEngine(directions, map, positions);
        Assert.assertEquals(engine.run(),"(2, 3)");

    }
}


