public class StringManipulate 
{
    public static void main(String[] args) 
    {
        String str1 = new String("Hello");
        String str2 = new String("World");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        int length = str1.length();
        System.out.println("Length of str1: " + length);
        String str3 = str1 + " " + str2;
        System.out.println("Concatenated String: " + str3);
        char ch = str1.charAt(1);
        System.out.println("Character at index 1 in str1: " + ch);
        boolean isEqual = str1.equals(str2);
        System.out.println("str1 equals str2? " + isEqual);
        int comparison = str1.compareTo(str2);
        System.out.println("Lexicographical comparison of str1 and str2: " + comparison);
        int index = str3.indexOf("World");
        System.out.println("Index of 'World' in str3: " + index);
        String upperStr = str1.toUpperCase();
        String replacedStr = str3.replace("World", "Java");
        System.out.println("Uppercase str1: " + upperStr);
        System.out.println("Replaced str3: " + replacedStr);
        int num = 123;
        String numStr = String.valueOf(num);
        System.out.println("String representation of integer 123: " + numStr);
    }
}

