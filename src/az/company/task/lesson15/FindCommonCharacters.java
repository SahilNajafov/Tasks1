package az.company.task.lesson15;

public class FindCommonCharacters {
    public static void main(String[] args) {
        String[] words = new String[]{"cool","lock","cook"};
//        for (String g:FindingCommonLetter(words)) {
//
//        }
//        System.out.print(g+" ");
        System.out.println(FindingCommonLetter(words));
    }

    public static char[] FindingCommonLetter(String[] words) {
        String a = words[0];
        String b ="";
        for (int i = 0; i < a.length(); i++) {
            int c = 0;
            for (int j = 1; j < words.length; j++) {
                if (words[j].contains(a.substring(i, i + 1))) {
                    words[j]=words[j].replaceFirst(a.substring(i, i + 1),"");
                    c++;
                }
            }
            if(c>= words.length-1) b=b.concat(a.substring(i, i + 1));
        }
        return b.toCharArray();
    }
}
