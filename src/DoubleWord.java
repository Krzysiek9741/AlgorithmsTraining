public class DoubleWord {
    public static void main(String[] args) {
        System.out.println(isDoubleWord("ABBAABBC"));


    }

    private static boolean isDoubleWord(String str){
        String a = str.substring(0, str.length()/2);
        String b = str.substring(str.length()/2);
        return a.equals(b);
    }
}
