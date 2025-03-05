/* Solved Using Two Pointer Method

// Learnings -->

--> The String class is immutable in java so we use the StringBuilder class in this problem

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

/*
Intuition -->

There are numerous ways in which we can combine the given strings. We've covered a few of them in this article.

An intuitive method is to use two pointers to iterate over both strings. Assume we have two pointers, i and j, with i pointing to the first letter of word1 and j pointing to the first letter of word2. We also create an empty string result to store the outcome.

We append the letter pointed to by pointer i i.e., word1[i], and increment i by 1 to point to the next letter of word1. Because we need to add the letters in alternating order, next we append word2[j] to result. We also increase j by 1.

We continue iterating over the given strings until both are exhausted. We stop appending letters from word1 when i reaches the end of word1, and we stop appending letters from word2' when j reaches the end of word2.
 */


/*
Algorithm
Create two variables, m and n, to store the length of word1 and word2.
Create an empty string variable result to store the result of merged words.
Create two pointers, i and j to point to indices of word1 and word2. We initialize both of them to 0.
While i < m || j < n:
If i < m, it means that we have not completely traversed word1. As a result, we append word1[i] to result. We increment i to point to next index of word1.
If j < n, it means that we have not completely traversed word2. As a result, we append word2[j] to result. We increment j to point to next index of word2.
Return result.
 */