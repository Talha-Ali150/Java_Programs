public class App7 {
    public static void main(String args[]) {

        int[] myArray =  {10, 9, 8, 7, 1, 2, 3, 4, 16, 100};
        System.out.println(secondMax(myArray));

    }

    public static int secondMax(int[] arr) {
        int max_1 = arr[0];
        int max_2 = arr[1];
        for (int i = 2; i < arr.length; i++) {
            if (max_1 < arr[i]) {
                max_2 = max_1;
                max_1 = arr[i];

            } else if (max_2 < arr[i] && arr[i] != max_1) {
                max_2 = arr[i];
            }
        }
        return max_2;
    }

    }
