class asoperator{
    public static void main(String[] args){
        int x=10,y=6,z;
        System.out.println("x="+x+"y="+y);
        x+=y;
        System.out.println("x+=y --> x = " + x); //you can use +=,-=,*=,/=,%=,<<=,>>=,!= and other operators in place of +=
        x%=y;
        System.out.println("x%=y --> x = " + x);
        z=x=y;
        System.out.println( "z=x=y --> z = " + z + ", x = " + x + ", y = " + y);
    }
}