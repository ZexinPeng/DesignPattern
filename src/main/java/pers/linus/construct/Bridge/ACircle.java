package main.java.pers.linus.construct.Bridge;

public class ACircle implements DrawAPI{
    @Override
    public void draw(int x, int y, int radius) {
        System.out.println("draw A Circle");
    }

    @Override
    public void draw(int x, int y, int length, int width) {

    }
}
