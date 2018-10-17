package brainFuck;


public interface Command {
    Context perform(char[] contentArray, char[] commandsArray, Context context);
}
