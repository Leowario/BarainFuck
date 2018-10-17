package brainFuck;

public class CycleBeginCommand implements Command {
    public Context perform(char[] contentArray, char[] commandsArray, Context context) {
        char currentValue = contentArray[context.getContentPosition()];
        if (currentValue == '\u0000') {
            for (int commandPosition = context.getCommandPosition();
                 commandPosition < commandsArray.length; commandPosition++) {

                if (commandsArray[commandPosition] == ']') {
                    return new Context(commandPosition, context.getContentPosition());
                }
            }
        }
        return context;
    }
}
