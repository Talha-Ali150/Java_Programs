public class App1 {
    public static void main(String args[]) {
        int result = naturalSum(5);
        System.out.println("Sum = " + result);
        int result1 = naturalSum1(5);
        System.out.println("Sum = " + result1);
    }

    // sum of natural numbers using loop
    public static int naturalSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // sum of natural numbers using formula
    public static int naturalSum1(int n) {
        return (n * (n + 1))/2;
    }
}
