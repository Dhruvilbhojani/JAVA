class shortcircuit{
    public static void main(String[] args){
        int x=1;
        int y=1;
        System.out.println("x=" + x + " y=" + y);
        if(x==y)
            System.out.println("if x==y then I'm appeared");
        else
            System.out.println("if x==y is False then I'm appeared");
        if(--x!=0 && ++y!=0)
            System.out.println("if (--x!=0 && ++y!=0) then I'm appeared");
        else
            System.out.println("if (--x!=0 && ++y!=0) is False then I'm appeared");
        System.out.println(" now x=" + x + " y=" + y);
    }
}