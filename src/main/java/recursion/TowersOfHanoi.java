package recursion;

public class TowersOfHanoi {
//   Time complexity = O(2^n)
//    Solution = 2^n -1
    int count = 1;

    public int solution(int disks, int fromPeg, int toPeg, int auxPeg) {
        if (disks <= 0){
            throw new IllegalArgumentException("Number of disks cannot be zero or less than zero.");
        }

        if (disks == 1) {
            return count;
        }
        solution(disks - 1, fromPeg, auxPeg, toPeg);
        count++;
        solution(disks - 1, auxPeg, toPeg, fromPeg);
        count++;
        return count;
    }

}
