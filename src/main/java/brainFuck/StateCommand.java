package brainFuck;

public enum StateCommand {
    NEXTCELL('>'),
    PREVIOUSCELL('<'),
    INCREMENT('+'),
    DECREMENT('-'),
    PRINT('.'),
    INPUTSAVE(','),
    CYCLEBEGIN('['),
    CYCLEEND(']');

    private char value;

    StateCommand(char value) {
        this.value = value;
    }

    public char value() {
        return this.value;
    }
}
