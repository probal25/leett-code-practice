package ws.probal.easy.prob_58;

import java.util.List;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        String newS= s.trim();
        char[] charArray = newS.toCharArray();
        int count = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 32) {
                count = 0;
            } else {
                count++;
            }
        }
        return count;
    }

    public static int lengthOfLastWord2(String s) {
        List<String> values = List.of(s.split(" "));
        return values.get(values.size()-1).length();
    }

}
