package brainFuck;

public class Interpreter {

    private Interpreter() {

    }

    public static Interpreter instance() {
        return singleton.VALUE.value;
    }

    public void start(char contentArray[], String code) {
        char commandsArray[] = code.toCharArray();
        int contentPosition = 0;
        CommandStrategy commandStrategy = new CommandStrategy();
        for (int commandPosition = 0; commandPosition < commandsArray.length; commandPosition++) {
            Command command = CommandFactory.getCommand(commandsArray[commandPosition]);
            Context context = command.perform(contentArray, commandsArray,
                    new Context(commandPosition, contentPosition));
            commandPosition = context.getCommandPosition();
            contentPosition = context.getContentPosition();
            commandStrategy.sateCommands.put(command, context);//TODO
        }
    }

    enum singleton {
        VALUE;
        private Interpreter value = new Interpreter();
    }
}

