import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Molimo unesite unos za brojanje znakova");
        String unesenString = sc.nextLine();
        int slova = 0, brojevi = 0, ostali = 0;
        char ch;
        for (int i = 0; i < unesenString.length(); i++) {
            //Definiram character na poziciji i
            ch = unesenString.charAt(i);
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                slova++;
            } else if (ch >= '0' && ch <= '9') {
                brojevi++;
            } else
                ostali++;

        }
        System.out.println("Broj slova u riječi je : \t" + slova);
        System.out.println("Broj brojeva u riječi je : \t" + brojevi);
        System.out.println("Broj ostalih znakova u riječi je : \t" + ostali);

    }


}