package test;

public class Ball implements Movable {

    @Override
    public int move(){
        System.out.println("공이 움직인다.");
        return 0;
    }

    @Override
    public int stop() {
        System.out.println("공이 멈춘다.");
        return 0;
    }
}
