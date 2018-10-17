package brainFuck;


public class NextCellCommand implements Command {
    public Context perform(char[] contentArray, char[] commandsArray, Context context) {
        int nextCellPosition = context.getContentPosition() + 1;
        return new Context(context.getCommandPosition(), nextCellPosition);
    }
}
