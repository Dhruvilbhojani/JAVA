import java.lang. Math.*;

class format{
    public static void main(String[] args){
        int x=100;
        System.out.format("Value x is " + x + "\n");
        double y=Math.PI;
        System.out.println(y);
        System.out.println((float)y);
        System.out.println((int)y);
        System.out.println((long)y);
        System.out.format("Value of PI = %.2f\n",y);
        System.out.format("Value of PI = %7.2f\n",y);
        System.out.format("Value of PI = %06.2f\n",y);
        System.out.printf("x=%d y=%f",x,y);
    }
}