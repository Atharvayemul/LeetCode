/* Solved Using Two Pointer Method

// Learnings -->

1) StringBuilder is a class which provides many methods on strings which String class do not provide

2) Instead of word[i] in java --> word.charAt(i) function is used to access the index value in string.

3) toString() function can be used to convert anything into the string

 */


public class Merge_Strings_Alternately {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "Xyz";

        StringBuilder string = new StringBuilder();

        int i = 0 ;
        int j = 0 ;

        while (i < word1.length() || j < word2.length())
        {
            if (i < word1.length()){
                string.append(word1.charAt(i));
                i++;
            }
            if (j < word2.length()){
                string.append(word2.charAt(j));
                j++;
            }
        }
            System.out.println(string.toString());



    }
}
