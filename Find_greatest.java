public class Program_03 {
    public static void main(String args[]){
        int a = 1200000;
        int b = 13443230;
        int c = 23456340;
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
