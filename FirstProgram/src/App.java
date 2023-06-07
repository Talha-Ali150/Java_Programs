//without using static method, creating instance of app and then using its function
// public class App {
//     public static void main(String[] args) throws Exception {
//         // System.out.println("Hello, World!");

//         App app = new App();
//         app.findAvg(10, 20, 30);
//     }

//     public void findAvg(int a, int b, int c) {
//         int sum = a + b + c;
//         int avg = sum / 3;
//         System.out.println(avg);
//     }
// }

// using static method
public class App {
    public static void main(String[] args) throws Exception {
        findAvg(10, 20, 30);
    }
    

    public static void findAvg(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        System.out.println(avg);
    }
}
