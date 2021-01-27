package recursionTests;

import org.junit.Test;
import recursion.Factorial;

import static org.junit.Assert.*;

public class FactorialTest {
    Factorial factorial = new Factorial();

    @Test
    public void test1(){
        int number = 0;
        assertEquals(1, factorial.factorialCal(number));
    }

    @Test
    public  void test2(){
        int number = 1;
        assertEquals(1, factorial.factorialCal(number));
    }

    @Test
    public void test3(){
        int number = 4;
        assertEquals(24, factorial.factorialCal(number));
    }

    @Test (expected = NullPointerException.class)
    public void test4(){
        int number = -1;
        factorial.factorialCal(number);
    }
}
