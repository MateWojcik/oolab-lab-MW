package agh.ics.oop;

public enum MapDirection {
    NORTH{
        public String toString(){
            return "N";}
    }, SOUTH{
        public String toString(){
            return "S";}
    }, WEST{
        public String toString(){
            return "W";}
    }, EAST{
        public String toString(){
            return "E";}
    };


    public MapDirection next()
    {
        if (this.equals(EAST)) return SOUTH;
        if (this.equals(WEST)) return NORTH;
        if (this.equals(NORTH)) return EAST;
        if (this.equals(SOUTH)) return WEST;
        return null;
    }

    public MapDirection previous()
    {
        if (this.equals(EAST)) return NORTH;
        if (this.equals(WEST)) return SOUTH;
        if (this.equals(NORTH)) return WEST;
        if (this.equals(SOUTH)) return EAST;
        return null;
    }
    Vector2d toUnitVector(){
        if (this.equals(EAST)) return new Vector2d(1,0);
        if (this.equals(WEST)) return new Vector2d(-1,0);
        if (this.equals(NORTH)) return new Vector2d(0,1);
        if (this.equals(SOUTH)) return new Vector2d(0,-1);
        return null;
    }


}
