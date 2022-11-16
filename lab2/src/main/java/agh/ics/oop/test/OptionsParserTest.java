package agh.ics.oop.test;

import agh.ics.oop.Animal;
import agh.ics.oop.MoveDirection;
import agh.ics.oop.OptionsParser;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OptionsParserTest {

        @Test
        public void testParser(){
            Animal zw2 = new Animal();
            String[] test = {"r","f","f","f"};
            MoveDirection[] mapDirection = OptionsParser.parse(test);
            for (int i = 0; i < mapDirection.length; i++) {
                zw2.move(mapDirection[i]);
            }
            Assert.assertEquals(zw2.toString(), "Position: (4, 2), orientation: Wschód");
        }
}
