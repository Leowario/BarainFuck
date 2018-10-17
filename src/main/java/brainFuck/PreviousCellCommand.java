package brainFuck;

public class PreviousCellCommand implements Command {
    public Context perform(char[] contentArray, char[] commandsArray, Context context) {
        int preciousCell = context.getContentPosition() - 1;
        return new Context(context.getCommandPosition(), preciousCell);
    }
}
