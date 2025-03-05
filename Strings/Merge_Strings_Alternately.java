public class Merge_Strings_Alternately {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "Xyz";

        StringBuilder string = new StringBuilder();

        int i = 0 ;

        while (i < word1.length() || i < word2.length())
        {
            if (i < word1.length()){
                string.append(word1.charAt(i));
            }
            if (i < word2.length()){
                string.append(word2.charAt(i));
            }
            i++;
        }
            System.out.println(string.toString());



    }
}
