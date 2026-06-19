import java.util.Scanner;
public class Q42 {
    public static int maximum(int x,int y){
        return (x>y) ? x : y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        int result = maximum(num1,num2);
        System.out.println("The maximum of "+num1+" and "+num2+" is: "+result);
        sc.close();
    }
}