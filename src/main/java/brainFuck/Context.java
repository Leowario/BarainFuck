package brainFuck;

public class Context {

    private int currentCommandPosition;
    private int currentContentPosition;

    public Context(int currentCommandPosition, int currentContentPosition) {
        this.currentCommandPosition = currentCommandPosition;
        this.currentContentPosition = currentContentPosition;
    }

    public int getCommandPosition() {
        return currentCommandPosition;
    }

    public int getContentPosition() {
        return currentContentPosition;
    }
}
