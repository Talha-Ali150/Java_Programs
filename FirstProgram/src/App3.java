public class App3 {
    public static void main(String args[]) {

        // way of declaring array 1
        // int[] myList = new int[4];
        // myList[0] = 1;
        // myList[1] = 2;
        // myList[2] = 3;
        // myList[3] = 4;

        // way of declaring array 2
        // int myList[] = new int[4];
        // myList[0] = 1;
        // myList[1] = 2;
        // myList[2] = 3;
        // myList[3] = 4;

        // way of declaring array 3
        int[] myList = {1,2,3,4};
        printArray(myList);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
