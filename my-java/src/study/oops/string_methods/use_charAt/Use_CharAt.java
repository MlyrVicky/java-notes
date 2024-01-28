package study.oops.string_methods.use_charAt;

public class Use_CharAt {
    public static void main(String[] args) {
       /* String s = "vicky";
        char c = s.charAt(0);
        System.out.println(c);
*/


         String str = "GeeksforGeeks";
        int len = str.length();
        System.out.println(len);
        for (int i = 0; i < len; i++) {

            System.out.println(str.charAt(i) + " " + i);
        }
        // First Element
        System.out.println("First Element: "
                + str.charAt(0));

        // Last Element
        System.out.println("First Element: "
                + str.charAt(len - 2));

    }
}

