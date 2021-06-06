class point{
    int x;
    int y;
}

class pointer{
    public static void main(String[] args){
        point p=new point();
        p.x=10;
        p.y=30;
        System.out.println(p.x);
        System.out.println(p.y);
        System.out.println(p.x+p.y);
    }
}