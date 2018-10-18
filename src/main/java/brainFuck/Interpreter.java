package brainFuck;

public class Interpreter {

    private Interpreter() {

    }

    public static Interpreter instance() {
        return Singleton.VALUE.value;
    }

    public void start(char contentArray[], String code) {
        char commandsArray[] = code.toCharArray();
        int contentPosition = 0;
        for (int commandPosition = 0; commandPosition < commandsArray.length; commandPosition++) {
            Command command = CommandFactory.getCommand(commandsArray[commandPosition]);
            Context context = command.perform(contentArray, commandsArray,
                    new Context(commandPosition, contentPosition));
            commandPosition = context.getCommandPosition();
            contentPosition = context.getContentPosition();
        }
    }

    enum Singleton {
        VALUE;
        private Interpreter value = new Interpreter();
    }
}

