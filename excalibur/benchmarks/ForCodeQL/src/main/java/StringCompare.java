public class StringCompare {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        if (str1 != null) System.out.println("str1 not null");
        if (str1 == str2) System.out.println("str1 == str2");
        if (str1 != str2) System.out.println("str1 != str2");
        if (str1.equals(str2)) System.out.println("str1.equals(str2)");
        if (str2 == str2.substring(0, 5)) System.out.println("str2 == str2.substring(0, 5)");
    }
}

