class PrimeNumberRange 
{
 
    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }

        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
 
    }

    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
 
        System.out.print("Enter a Number : ");
        int a = s.nextInt();
 
        for (int j = 1; j <= a; j++) {
            if (isPrime(j)) {
                System.out.println(j);
            }
        }
    }
}