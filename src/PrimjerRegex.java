public class PrimjerRegex {
    public static void main(String[] args) {

        String text = "he ll   hh    eo";
        String[] characters = text.split("");
//        String[] characters = text.split("[\\s]");
        for (String character : characters) {
            System.out.print(character);
        }
    }
}
