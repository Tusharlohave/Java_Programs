import java.util.Scanner;
public class Find_greatest {
    public static void main(String args[]){
        Scannner sc = new Scanner(System.in);

        System.out.println("Enter the three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int g;

        if(a > b){
            if(a > c){
               g = a;
            }
            else{
                g = c;
            }
        }
        else{
            if(b>c){
                g = b;
            }
            else{
                g = c;
            }
        }
        System.out.println("Grestest number is " + g);
    }
}
