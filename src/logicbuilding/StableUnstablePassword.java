package logicbuilding;

public class StableUnstablePassword {

    public static int getPassword(int input1, int input2, int input3, int input4, int input5) {
        int[] inputs = {input1, input2, input3, input4, input5};
        int stableCount = 0, unstableCount = 0;

        for (int num : inputs) {
            if (isStable(num)) {
                stableCount++;
            } else {
                unstableCount++;
            }
        }
        return unstableCount * 10 + stableCount;
    }

    // Helper to determine if a number is stable
    private static boolean isStable(int num) {
        int[] freq = new int[10];
        while (num > 0) {
            freq[num % 10]++;
            num /= 10;
        }
        int count = 0;
        for (int f : freq) {
            if (f > 0) {
                if (count == 0) count = f;
                else if (f != count) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        if (args.length != 5) {
            System.out.println("Please provide exactly 5 integer arguments.");
            System.out.println("Usage: java StableUnstablePassword <num1> <num2> <num3> <num4> <num5>");
            return;
        }

        int[] inputs = new int[5];
        try {
            for (int i = 0; i < 5; i++) {
                inputs[i] = Integer.parseInt(args[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("All arguments must be valid integers.");
            return;
        }

        int password = getPassword(inputs[0], inputs[1], inputs[2], inputs[3], inputs[4]);
        System.out.println("Password: " + password);
    }
}
