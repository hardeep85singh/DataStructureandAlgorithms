package recursionTests;

import org.junit.Test;
import static org.junit.Assert.*;
import recursion.TowersOfHanoi;

public class TowersOfHanoiTest {

    TowersOfHanoi towers = new TowersOfHanoi();
    int fromPeg = 1;
    int toPeg = 2;
    int auxPeg = 3;

    @Test
    public void test1(){
        int disks = 0;

    }

    @Test
    public void test2(){
        int disks = 1;
        assertEquals(1, towers.solution(disks,fromPeg, toPeg, auxPeg));
    }

    @Test
    public void test3(){
        int disks =4;
        assertEquals(15, towers.solution(disks,fromPeg,toPeg,auxPeg));
    }

    @Test
    public void test4(){
        int disk = -1;
    }
}
