package stackImplementation;

public class StackArrayImpl implements Stack {
    private int[] nums;
    private int length;
    private int current;

    public StackArrayImpl() {
        nums = new int[10];
        length = 10;
        current = 0;
    }

    @Override
    public void push(int data) {
        if (current == length) {
            int[] temp = new int[2 * length];
            for (int i = 0; i < length; i++) {
                temp[i] = nums[i];
            }
            length = length * 2;
            nums = temp;
        }
        nums[current] = data;
        current++;
    }

    @Override
    public int pop() {
        if (current == 0) {
            throw new ArrayIndexOutOfBoundsException(
                    "There are no elements to delete."
            );
        }
        int top = nums[current - 1];
        nums[current - 1] = 0;
        current--;
        return top;
    }

    @Override
    public int peek() {
        return nums[current - 1];
    }

    @Override
    public int size() {
        return current;
    }

    @Override
    public boolean empty() {
        if (current == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int search(int index) {
        if (index > current) {
            throw new IndexOutOfBoundsException("The index you are searching is not present.");
        }
        return nums[index];
    }
}
