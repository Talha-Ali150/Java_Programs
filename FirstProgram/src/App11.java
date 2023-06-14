public class App11 {
    public static void main(String args[]) {
        String word = "madam";
        System.out.println(isPalindrome(word));

    }

    public static boolean isPalindrome(String word) {
        // boolean palindrome = true;
        // String[] myArray = word.split("");
        // String[] reverseArray = new String[myArray.length];
        // int myCounter = myArray.length - 1;

        // for (int i = 0; i < myArray.length; i++) {
        //     reverseArray[i] = myArray[myCounter];
        //     myCounter = myCounter - 1;
        // }
        // for (int i = 0; i < myArray.length; i++) {
        //     if (!(reverseArray[i].equals(myArray[i]))) {
        //         palindrome = false;
        //         break;
        //     }
        // }
        // return palindrome;

        char[] charArray = word.toCharArray();
        int start =0;
        int end = word.length()-1;
        while(start < end){
            if(charArray[start] != charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
