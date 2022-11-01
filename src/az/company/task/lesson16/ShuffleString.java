package az.company.task.lesson16;

public class ShuffleString {
    public static void main(String[] args) {
        String s ="codeleet";
        int[] indices = new int[]{4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,indices));
    }
    public static String restoreString(String s, int[] indices) {
        String lastForm = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < indices.length; j++) {
                if(indices[j]==i){
                    lastForm=lastForm.concat(s.charAt(j)+"");
                }
            }
        }
        return lastForm;
    }
}
