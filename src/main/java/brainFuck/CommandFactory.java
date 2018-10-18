package brainFuck;

import static brainFuck.StateCommand.*;

public class CommandFactory {
    public static Command getCommand(char currentCommand) {
        if (currentCommand == NEXTCELL.value()) {
            return new NextCellCommand();
        }
        if (currentCommand == PREVIOUSCELL.value()) {
            return new PreviousCellCommand();
        }
        if (currentCommand == INCREMENT.value()) {
            return new IncrementCommand();
        }
        if (currentCommand == DECREMENT.value()) {
            return new DecrementCommand();
        }
        if (currentCommand == PRINT.value()) {
            return new PrintCommand();
        }
        if (currentCommand == INPUTSAVE.value()) {
            return new InputSaveCommand();
        }
        if (currentCommand == CYCLEBEGIN.value()) {
            return new CycleBeginCommand();
        }
        if (currentCommand == CYCLEEND.value()) {
            return new CycleEndCommand();
        } else {
            throw new IllegalArgumentException("Uncorrected command detected");
        }
    }
}
