package java_programs;

public class removeConsecutiveRepeatingCharactersFromString {

    public static void main(String[] args) {

        String str = "abbaca";

        char[] str1 = str.toCharArray();

        //StringBuilder str2 = new StringBuilder();   //This is not thread safe
        
        StringBuffer str2 = new StringBuffer();     //This is thread safe
        //str2 = "";    //str2 = "ca";

        for (char ch : str1) 
        {
            int size = str2.length();   //1
            if (size > 0 && str2.charAt(size - 1) == ch)           //c == a
                {
                    str2.deleteCharAt(size - 1);
                }   
                else 
                {
                    str2.append(ch);
                }
        }
        System.out.println(str2);   //ca
    }
}
