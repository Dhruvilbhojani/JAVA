import java.util.Scanner;

class logoperator{
    public static void main(String[] args){
        String User="Dhruvil", pwd="Bhojani";
        Scanner sc=new Scanner(System.in);
        String EnteredUser=sc.next();
        String Enteredpwd=sc.next();
        if(User.equals(EnteredUser) && pwd.equals(Enteredpwd)) //you can use &&,||,! in place of &&
            System.out.println("Welcome");
        else
            System.out.println("Try Again");
    }
}