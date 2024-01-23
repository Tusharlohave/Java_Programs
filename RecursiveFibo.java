public class RecursiveFibo {
    public static void main(String args[]){
        Fibo f1 = new Fibo();
        System.out.println(f1.fibo(10));
    }
}
class Fibo{
    int fibo(int n){
    if(n==1) return 1;
    if(n==0) return 0;
    return fibo(n-1) + fibo(n-2);
}
}
