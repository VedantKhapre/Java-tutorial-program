public class SieveOfEratosthenes {
    public static void main(String[] args) {
        boolean[] primes = new boolean[1000]; // Index 0 and 1 are not used.

        // Initialize all elements to true initially (assuming all numbers are prime).
        for (int i = 2; i < primes.length; i++) {
            primes[i] = true;
        }

        // Apply the Sieve of Eratosthenes algorithm to mark non-prime numbers.
        for (int i = 2; i * i < primes.length; i++) {
            if (primes[i]) {
                // Mark multiples of the current prime as non-prime.
                for (int j = i * i; j < primes.length; j += i) {
                    primes[j] = false;
                }
            }
        }

        // Display prime numbers between 2 and 999.
        System.out.println("Prime numbers between 2 and 999:");
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
