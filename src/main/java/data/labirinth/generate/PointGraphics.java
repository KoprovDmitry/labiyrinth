package data.labirinth.generate;

public enum PointGraphics {
    BLOCK('☒'),
    ROAD(' '),
    HERO('H'),
    FINISH('⚐');
    private final char valueInPoint;

    PointGraphics(char valueInPoint) {
        this.valueInPoint = valueInPoint;
    }
    char getValue(){
        return this.valueInPoint;
    }
}
