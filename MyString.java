public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String finaStr = "";
        for(int i = 0;i < str.length();i++){
            char c = str.charAt(i);
            if ((int)(c) < 91 && (int)(c) > 64) {
                c = (char)((int)c + 32);
            }
            finaStr += c;
        }
        return finaStr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        int index = 0;
        if (str2.length() > str1.length()) {
            return false;
        }
        while (str1.charAt(index) != str2.charAt(0) && index < str2.length()) {
            index++;
        }
        for(int i = 0;i < str2.length();i++){
            if (str1.charAt(index + i) != str2.charAt(i)) {
                return false;                
            }
        }
        return true;
    }
}
