import java.util.Scanner;

public class userinputt {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Age:");
        byte age=scanner.nextByte();
        System.out.print("Your Age is:"+age);
    }
}
