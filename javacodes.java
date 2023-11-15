import java.util.*;
public class javacodes {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print ("input an integer: ");
        int digits = sc.nextInt();
        System.out.println("the sum is" + sumDigits(digits));
    }

    public static int sumDigits(int n){
        int sumofDigits = 0;
        while(n>0){
            int lastDigits = n%10;
            sumofDigits += lastDigits;
            n/=10;
        }
        return sumofDigits;
    }

    @Override
    public String toString() {
        return "javaprogram []";
    }
}