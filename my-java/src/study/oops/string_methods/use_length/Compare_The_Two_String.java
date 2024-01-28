package study.oops.string_methods.use_length;

public class Compare_The_Two_String {
    public static void main(String[] args) {
        String s1 = "vickyy";
        String s2 = "ramesh";
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1 == n2) {
            System.out.println("the two string are equal :"+ n1 );
        }else{
            System.out.println("the two string are not equal");
        }
    }
}
