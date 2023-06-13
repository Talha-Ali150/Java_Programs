public class App10 {
    public static void main(String args[]) {
        int[] myArray = { 2, 4, 1, 8, 6, 3, 7 };
        System.out.println("missing number is: " + missingNum(myArray));
    }

    public static int missingNum(int[] arr) {
        boolean zeroExists = false;
        int num1;
        for (int num : arr) {
            if (num == 0) {
                zeroExists = true;
            }
        }
        if (zeroExists) {
            num1 = arr.length;
        } else {
            num1 = arr.length + 1;
        }
        int result1 = ((num1 * (num1 + 1)) / 2);
        int result2 = 0;
        for (int num : arr) {
            result2 = result2 + num;
        }
        return result1 - result2;
    }

}
