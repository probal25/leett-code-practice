package ws.probal.easy.prob_28;

public class FirstOccurrence {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issip";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        int pos = 0;
        char[] haystackCharArray = haystack.toCharArray();
        char[] needleCharArray = needle.toCharArray();

        if (needleCharArray.length > haystackCharArray.length) return -1;

        for (int ptr1 = 0;  ptr1< haystackCharArray.length; ptr1++) {

            if (haystackCharArray[ptr1] == needleCharArray[pos]) {
                pos++;
            } else {
                ptr1 = ptr1 - pos;
                pos = 0;
            }

            if (pos == needleCharArray.length) return ptr1 - pos + 1;
        }
        return -1;
    }
}
