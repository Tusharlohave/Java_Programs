public class Method {
    public static void main(String args[]){
        Shape s1 = new Shape();
        System.out.println(s1.calcArea(2));

        Shape s2 = new Shape();
        System.out.println(s2.calcArea(2,3));

    }
}

class Shape{
   double calcArea(int a){
    return Math.PI*Math.pow(a,2);
   } 
   double calcArea(int a,int b){
    return a*b;
   }
}
