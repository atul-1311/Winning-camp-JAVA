import java.util.Scanner;

public class formattedOutput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String s= sc.next();
            int x= sc.nextInt();
            System.out.printf("%-15s %03d %n",s,x);

        }
    }
}
