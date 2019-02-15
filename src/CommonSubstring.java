public class CommonSubstring {
    public static void main(String[] args) {

        System.out.println(commonSubstring("ABABBA", "ABAABA"));
    }

    private static String commonSubstring(String s1, String s2) {
        int minimumLength = Integer.min(s1.length(), s2.length());
        String common = "";
        for (int i = 0; i < minimumLength; i++) {
            if (s1.substring(i, i+1).equals(s2.substring(i,i+1))){
                common = common + s1.substring(i, i+1);
            }else{
                break;
            }
        }
        return common;
    }
}
