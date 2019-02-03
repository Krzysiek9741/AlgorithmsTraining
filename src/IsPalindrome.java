public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
    }

    private static boolean isPalindrome(String str) {
        int count = 0;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.substring(i, i + 1).equals(str.substring(str.length() - i - 1, str.length() - i))) {
                count++;
            }
        }
        return count == str.length() / 2;
    }
}
