package agh.ics.oop;

public class OptionsParser {
     public static MoveDirection[] parse(String[] tab){
       MoveDirection[] moveTab = new MoveDirection[tab.length];
        int j=0;

        for (int i = 0; i < tab.length; i++) {
            switch (tab[i]){
                case "f"->moveTab[j++] = MoveDirection.FORWARD;
                case  "b"->moveTab[j++] = MoveDirection.BACKWARD;
                case  "l"->moveTab[j++] = MoveDirection.LEFT;
                case  "r"->moveTab[j++] = MoveDirection.RIGHT;
            }
        }
        return moveTab;
    }
}
