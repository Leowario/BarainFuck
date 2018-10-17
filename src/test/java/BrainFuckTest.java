import brainFuck.Interpreter;
import org.junit.Test;

public class BrainFuckTest {

    @Test
    public void algorithmTest() {
        String code = "++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++" +
                ".>+.+++++++..+++.>++.<<+++++++++++++++.>.+++." +
                "------.--------.>+.>.";
        char contentArray[] = new char[30000];
        Interpreter.instance().start(contentArray, code);
    }

}
