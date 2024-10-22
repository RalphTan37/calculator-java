import java.util.ArrayList;
import java.util.List;

public class PreAlgebra {
    //Prime Factorization of a Number
    public static List<Integer> primeFactorization(int number){
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= number; i++){
            while (number % i == 0){
                factors.add(i);
                number /= i;
            }
        }
        return factors;
    }

    //GCF (Greatest Common Factor)
    public static int gcf(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    //LCM (Least Common Multiple)
    public static int lcm(int a, int b){
        return (a * b) / gcf(a,b);
    }
}
