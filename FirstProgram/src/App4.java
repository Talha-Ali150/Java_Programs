public class App4 {
    public static void main(String args[]) {

        int[] myArray = {3,2,4,7,10,6,5};
        printArray(returnOdd(myArray));
    }

    public static int[] returnOdd(int[] arr) {
        int oddCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCounter++;
            }
        }

        int[] oddList = new int[oddCounter];
        int counter = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] % 2 != 0) {
                oddList[counter] = arr[i];
                counter++;
            }
        }
        return oddList;
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}