package ravi;

public class remove2_string {  // remove all the consecutive duplicate characters from string

    //StringBuilder → Not thread-safe because its methods are not synchronized.
    //StringBuffer → Thread-safe because its methods are synchronized.

    public static void main(String st[]){
        String str = "abbaca";
        char[] str1 = str.toCharArray();
        StringBuilder str2 = new StringBuilder();

        for(char ch:str1){
            int size = str2.length();
            if(size>0 && str2.charAt(size-1)==ch){
                str2.deleteCharAt(size-1);

            }
            else{
                str2.append(ch);
            }

        }
        System.out.println(str2);

    }
}
