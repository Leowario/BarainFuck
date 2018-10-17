package brainFuck;

public class CycleEndCommand implements Command {
    public Context perform(char[] contentArray, char[] commandsArray, Context context) {
        char currentValue = contentArray[context.getContentPosition()];
        if (currentValue != '\u0000') {
            for (int commandPosition = context.getCommandPosition();
                 commandPosition != 0; commandPosition--) {
                if (commandsArray[commandPosition] == '[') {
                    return new Context(commandPosition, context.getContentPosition());
                }
            }
        }
        return context;
    }
}
