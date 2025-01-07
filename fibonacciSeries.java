import java.util.*;
// class fibonacciSeries{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int fib[] = new int[n];
//         fib[0] = 0;
//         fib[1] = 1;
//         for(int i = 2; i<n;i++){
//             fib[i] = fib[i-1] + fib[i-2];
//         }
//         for(int i = 0; i<fib.length;i++){
//             System.out.print(fib[i]+" ");
//         }
//     }
// }


 class fibonacciSeries{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        fibonacci(n,2,arr);
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void fibonacci(int n, int i, int arr[]){
        if( i == n){
            return;
        }
        arr[i] = arr[i-1] + arr[i-2];
        fibonacci(n, i+1, arr);
    }
 }