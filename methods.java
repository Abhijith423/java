public class methods {
     static int a = 10;
    static void myCheck() {
       if(a > 5) {
           System.out.println("a is greater than 5");
       }
       else {
           System.out.println("a is not greater than 5");
       }
    }
    public static void main(String[] args) {
        myCheck();
    }
}


public class methods {
     static int n = 17;
    static void isPrime() {
       boolean prime = true;
       if (n <= 1) {
           prime = false;
       }
       
       for (int i = 2; i * i <= n; i++) {
           if (n % i == 0) {
               prime = false;
               break;
           }
       }
       if(prime) {
           System.out.println(n + " is prime");
       }
       else {
           System.out.println(n + " is not prime");
       }
    }
    public static void main(String[] args) {
        isPrime();
    }
}
