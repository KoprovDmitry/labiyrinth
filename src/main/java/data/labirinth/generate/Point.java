package data.labirinth.generate;

public class Point {
    private boolean isFinish;
    private boolean isHero;
    private char isBlock;
    public Point(){
        this.isFinish = false;
        this.isHero = false;
        this.isBlock = PointGraphics.BLOCK.getValue();
    }
}
