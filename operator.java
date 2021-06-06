class operator{
    public static void main(String[] args){
        int x=10,y=20;
        System.out.println("x=10,y=20");
        System.out.println("x+y=" + (x+y)); //you can use +,-,*,/,%,<<,>>,! and other operators in place of +
        int z=(x+y*10);
        System.out.println("x+y*10=" + z);
        z=x++;
        System.out.println( "after z=x++, z = " + z + ", x = " + x);
        z=++x;
        System.out.println( "after z=++x, z = " + z + ", x = " + x);
    }
}