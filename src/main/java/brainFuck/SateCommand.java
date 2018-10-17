package brainFuck;

public enum SateCommand {
    NEXTCELL('>'),
    PREVIOUSCELL('<'),
    INCREMENT('+'),
    DECREMENT('-'),
    PRINT('.'),
    INPUTSAVE(','),
    CYCLEBEGIN('['),
    CYCLEEND(']');

    private char value;

    SateCommand(char value) {
        this.value = value;
    }

    public char value() {
        return this.value;
    }
}
