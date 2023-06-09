public class App6 {
    public static void main(String args[]) {
        int[] myArray = {1,2,3,4,10,12};
        System.out.println(findMin(myArray));
    }

    // program to find min number from given array
    public static int findMin(int[] arr){
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

}
