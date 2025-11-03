import java.util.Scanner;

public class TransformiraniString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Molimo unesite riječ za obrnuti redoslijed");
        String unesenString = sc.nextLine();
        for (int i = unesenString.length() - 1; i >= 0; i--) {
            System.out.print(unesenString.charAt(i));

        }


    }
}
