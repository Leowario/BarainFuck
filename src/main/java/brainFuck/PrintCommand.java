package brainFuck;

public class PrintCommand implements Command {
    public Context perform(char[] contentArray, char[] commandsArray, Context context) {
        char value = contentArray[context.getContentPosition()];
        System.out.println(value);
        return context;
    }
}
