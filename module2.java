import java.math.*;
import java.util.Arrays;

public class module2 {
    public static void main(String[] args) throws Exception {
        module2.Robot rob=new module2.Robot(10,10, Direction.DOWN);

        module2.moveRobot(rob, 20, 20);
        System.out.println(rob.getX());
        System.out.println(rob.getY());

    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static class Robot {
        int x;
        int y;
        Direction dir;

        public Robot (int x, int y, Direction dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }

        public Direction getDirection() {return dir;}

        public int getX() {return x;}

        public int getY() {return y;}

        public void turnLeft() {
            if      (dir == Direction.UP)    {dir = Direction.LEFT;}
            else if (dir == Direction.DOWN)  {dir = Direction.RIGHT;}
            else if (dir == Direction.LEFT)  {dir = Direction.DOWN;}
            else if (dir == Direction.RIGHT) {dir = Direction.UP;}
        }

        public void turnRight() {
            if      (dir == Direction.UP)    {dir = Direction.RIGHT;}
            else if (dir == Direction.DOWN)  {dir = Direction.LEFT;}
            else if (dir == Direction.LEFT)  {dir = Direction.UP;}
            else if (dir == Direction.RIGHT) {dir = Direction.DOWN;}
        }

        public void stepForward() {
            if (dir == Direction.UP)    {y++;}
            if (dir == Direction.DOWN)  {y--;}
            if (dir == Direction.LEFT)  {x--;}
            if (dir == Direction.RIGHT) {x++;}
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        int stepx=Math.abs(toX-robot.getX());
        int stepy=Math.abs(toY-robot.getY());

        if(robot.getDirection()==Direction.DOWN) {
            robot.turnRight();
            robot.turnRight();
        }
        if(robot.getDirection()==Direction.LEFT)robot.turnRight();
        if(robot.getDirection()==Direction.RIGHT)robot.turnLeft();

        if(robot.getY()<toY){
            for(int i=0;i<stepy;i++){
                robot.stepForward();
            }
        }

        if(robot.getY()>toY){
            robot.turnRight();
            robot.turnRight();
            for(int i=0;i<stepy;i++){
                robot.stepForward();
            }
        }

        if(robot.getDirection()==Direction.DOWN)robot.turnLeft();
        if(robot.getDirection()==Direction.UP)robot.turnRight();

        if(robot.getX()<toX){
            for(int i=0;i<stepx;i++){
                robot.stepForward();
            }
        }

        if(robot.getX()>toX){
            robot.turnRight();
            robot.turnRight();
            for(int i=0;i<stepx;i++){
                robot.stepForward();
            }
        }

    }
}
