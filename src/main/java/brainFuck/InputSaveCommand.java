package brainFuck;

public class InputSaveCommand implements Command {
    public Context perform(char[] contentArray, char[] commandsArray, Context context) {
        return context;
    }
}
