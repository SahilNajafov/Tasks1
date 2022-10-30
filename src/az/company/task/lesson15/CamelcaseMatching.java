package az.company.task.lesson15;

public class CamelcaseMatching {
    public static void main(String[] args) {
        String[] queries = new String[]{"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
        String pattern = "FB";

        for (String a : queries) {
            String b = "";
            for (int j = 0; j < a.length(); j++) {
                if (pattern.contains(a.substring(j, j + 1))) {
                    b = b.concat(a.substring(j, j + 1));
                }
            }
            if(b.equals(pattern)) System.out.print(true+" ");
            else System.out.print(false+" ");
        }


    }
}
