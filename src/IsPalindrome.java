public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Może jutro ta dama da tortu jeżom"));
    }

    private static boolean isPalindrome(String str) {
        String newStr = str.toLowerCase().replaceAll("\\s+", "");
        int count = 0;
        for (int i = 0; i < newStr.length() / 2; i++) {
            if (newStr.substring(i, i + 1).equals(newStr.substring(newStr.length() - i - 1, newStr.length() - i))) {
                count++;
            }
        }
        return count == newStr.length() / 2;
    }
}
