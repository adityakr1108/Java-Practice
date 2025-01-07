import java.util.*;

//  basic method
public class prime{
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.print(isPrime(n));
}
public static boolean isPrime(int n){
    if(n< 2){
        return false;
    }
    if(n == 2) return true;;
    if(n % 2 == 0) return false;
    for(int i = 3; i<=Math.sqrt(n);i+=2){
        if(n % i == 0){
            return false;
        }
    }
    return true;
}
}