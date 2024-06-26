public class PrimeChecker {
    // Method to check if a number is prime
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Create an instance of PrimeChecker
        PrimeChecker primeChecker = new PrimeChecker();

        // Test the isPrime method with a number
        int number = 29;
        if (primeChecker.isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
