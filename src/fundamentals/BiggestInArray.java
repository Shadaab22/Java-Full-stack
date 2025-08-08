package fundamentals;

public class BiggestInArray {
    public static void main(String[] args) {
        // Check if exactly 9 arguments are provided
        if(args.length != 9) {
            System.out.println("Please enter 9 integer numbers");
            return;
        }
        
        int[][] arr = new int[3][3];
        int max = Integer.MIN_VALUE;
        int index = 0;
        
        // Fill the 3x3 array and track the maximum number
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                try {
                    arr[i][j] = Integer.parseInt(args[index]);
                } catch(NumberFormatException e) {
                    System.out.println("Invalid input. Please enter 9 integer numbers.");
                    return;
                }
                if(arr[i][j] > max)
                    max = arr[i][j];
                index++;
            }
        }
        
        // Print the array
        System.out.println("The given array is :");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        // Print the biggest number
        System.out.println("The biggest number in the given array is " + max);
    }
}
