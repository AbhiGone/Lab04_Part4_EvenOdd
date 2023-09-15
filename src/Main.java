import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        System.out.println("Enter an interger");
        num = scan.nextInt();
        if(num % 2 == 0){
            System.out.println("Your number is even");
        }else{
            System.out.println("Your number is odd");
        }
    }
}