public class PrintSubstring {
    public static void printSubstring(String str, StringBuilder sbr,int index) {
        if (str.length() == index) {
            System.out.println(sbr.toString());
            return;
        }
        sbr.append(str.charAt(index));
        printSubstring(str, sbr,index+1);
        sbr.deleteCharAt(sbr.length() - 1);
        printSubstring(str, sbr,index+1);
    }

    public static void main(String[] args) {
        String str = "abcd";
        StringBuilder sbr = new StringBuilder();
        printSubstring(str, sbr,0);    
    }
}
