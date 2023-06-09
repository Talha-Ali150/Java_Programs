public class App8 {
    public static void main(String args[]) {
        int[] myArray = { 8, 1, 0, 2, 1, 0, 3 };
        printArray(myArray);
        System.out.println();
        moveZero(myArray);
        printArray(myArray);
    }

    public static void moveZero(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
