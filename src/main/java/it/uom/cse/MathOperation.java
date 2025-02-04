package it.uom.cse;

import java.util.Arrays;


public class MathOperation {

    public static double add(double... operands)
    {
        return Arrays.stream(operands).reduce(0d, Double::sum);
    }

    public static double subtract(double operand1, double operand2)
    {
        return operand1 - operand2;
    }


    public static int sumOfPrimes(int n){
        boolean prime[]=new boolean[n + 1];
        Arrays.fill(prime, true);
        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true) {
                for (int i = p * 2; i <= n; i += p)
                    prime[i] = false;
            }
        }

        int sum_primes = 0;
        for (int j = 2; j <= n; j++)
            if (prime[j])
                sum_primes += j;
        return sum_primes;

    }



    public static int fib(int n){

        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }

        return fib(n - 1) + fib(n - 2);

    }


    public static int sumOfIntegers(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

}

