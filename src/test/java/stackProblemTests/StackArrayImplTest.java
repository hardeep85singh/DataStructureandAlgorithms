package stackProblemTests;
import static org.junit.Assert.*;
import org.junit.Test;
import stackProblems.StackArrayImpl;


public class StackArrayImplTest {
    StackArrayImpl stackArray = new StackArrayImpl();

    @Test
    public void test1(){
        int data = 1;
        assertEquals("No element to pop", stackArray.pop());
    }
}
