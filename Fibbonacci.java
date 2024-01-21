public class Fibbonacci {
    public static void main(String args[]){
        int first=0, second=1, next;

        for(int i=0;i<=10;i++){
            System.out.println(first);
            next = first + second;
            first = second;
            second = next;
        }
    }
}

