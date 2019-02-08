import java.util.Arrays;
import java.util.List;

public class CeasarCode {
    public static void main(String[] args) {


        String a = ceasarCode("ABC XYZ");
        String b = ceasarCode("Niezwyciezony");
        System.out.println(a);
        System.out.println(decoder(a));
        System.out.println(b);
        System.out.println(decoder(b));
    }


    private static String ceasarCode(String messageOrg) {
        String[] alphabetTab = new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
                "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        List<String> alphabet = Arrays.asList(alphabetTab);
        String message = messageOrg.toUpperCase();
        String encoded = "";
        StringBuilder strB = new StringBuilder(encoded);
        for (int i = 0; i < message.length(); i++) {
            int a = alphabet.indexOf(message.substring(i, i + 1));
            if (message.substring(i, i + 1).equals(" ")) {
                strB.append(" ");
            } else if (a >= alphabet.size() - 3) {
                strB.append(alphabet.get(a - 23));
            } else {
                strB.append(alphabet.get(a + 3));
            }
        }
        return strB.toString();
    }

    private static String decoder(String encodedOrg) {
        String[] alphabetTab = new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
                "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        List<String> alphabet = Arrays.asList(alphabetTab);
        String encoded = encodedOrg.toUpperCase();
        String decoded = "";
        StringBuilder strB = new StringBuilder(decoded);
        for (int i = 0; i < encoded.length(); i++) {
            int a = alphabet.indexOf(encoded.substring(i, i + 1));
            if (encoded.substring(i, i + 1).equals(" ")) {
                strB.append(" ");
            } else if (a <= 2) {
                strB.append(alphabet.get(a + 23));
            } else {
                strB.append(alphabet.get(a - 3));
            }
        }
        return strB.toString();
    }

}
