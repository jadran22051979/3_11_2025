import java.util.Scanner;
import java.util.regex.Pattern;

public class TransformiraniString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Molimo unesite riječ za obrnuti redoslijed riječi :");
        String unesenString = sc.nextLine();

        //Bjeline razdvajaju
        Pattern pattern = Pattern.compile("\\s");

        String[] temp = pattern.split(unesenString);
        String rezultat = "";

        //Iteriranje 
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                rezultat = temp[i] + rezultat;
            else
                rezultat = " " + temp[i] + rezultat;
        }
        System.out.println("Unešeni string je:\t " + unesenString);
        System.out.println("Rezultat je :\t" + rezultat);


    }
}
