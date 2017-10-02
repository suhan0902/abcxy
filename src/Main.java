import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,c,x,y;
        System.out.print("num1:");
        a=input.nextInt();
        System.out.print("num2:");
        b=input.nextInt();
        System.out.print("num3:");
        c=input.nextInt();
        System.out.print("num4:");
        x=input.nextInt();
        y=a*x*x+b*x+c;
        System.out.printf("%d*%d*%d+%d*%d+%d=%d", a,x,x,b,x,c,y);
        input.close();
   }
}
