package recursion;

public class TowersOfHanoiDriver {
    public static void main(String[]args) {
        TowersOfHanoi towers = new TowersOfHanoi();

        System.out.println(towers.solution(5, 1,2,3));

    }
}
