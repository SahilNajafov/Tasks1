package az.company.task.lesson15;

public class FindCommonCharacters {
    public static void main(String[] args) {
        String[] words = new String[]{"cool", "lock", "cook"};
        for (char as : findingCommonLetter(words)) {
            System.out.println(as);
        }
//        System.out.println(findingCommonLetter(words));
    }

    public static char[] findingCommonLetter(String[] words) {
        String a = words[0];
        String b = "";
        for (int i = 0; i < a.length(); i++) {
            int c = 0;
            for (int j = 1; j < words.length; j++) {
                if (words[j].contains(a.charAt(i) + "")) {
                    words[j] = words[j].replaceFirst(a.charAt(i) + "", "");
                    c++;
                }
            }
            if (c >= words.length - 1) b = b.concat(a.charAt(i) + "");
        }
        return b.toCharArray();
    }

}
