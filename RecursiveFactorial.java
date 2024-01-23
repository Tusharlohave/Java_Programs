public class RecursiveFactorial {
    public static void main(String args[]){
        factorial f1 = new factorial();
        System.out.println(f1.fact(5));
    }
}
class factorial{
    int fact(int n){
            if(n==1) return 1;
            return n*fact(n-1);
    }
}