package tariq.JavaProgram;

public class program {

    public static void main(String[] args) {

        String str = "abbaca"; // aaca //ca
        char[] str1 = str.toCharArray();

        StringBuilder str2 = new StringBuilder();

        for (char ch : str1) 
        {
            int size = str2.length();
            if (size > 0 && str2.charAt(size - 1) == ch) 
                {
                    str2.deleteCharAt(size - 1);
                }   
                else 
                {
                    str2.append(ch);
                }
        }
        System.out.println(str2);
    }
}
