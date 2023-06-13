public class App9 {
    public static void main(String args[]){
        int[] myArray = {5,9,3,10};
        printArray(myArray);
        System.out.println();
        System.out.println(myArray.length);
        myArray = resizeArray(myArray, 8);
        printArray(myArray);
        System.out.println();
        System.out.println(myArray.length);
    }
    
    public static int[] resizeArray(int[] arr, int capacity){
        int[] newArr = new int[capacity];
        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
        return arr;
    }

    public static void printArray(int[] arr){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
