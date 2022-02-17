package prob4;

import java.util.List;

/**
 *
 * Implement a method with the following signature and return type:
 *  public int countWords(List<String> words, char c, char d, int len)
 * which counts the number of words in the input list words that have length equal to len, that
 * contain the character c, and that do not contain the character d. Create a solution like the "Good"
 * solution in lesson8.lecture.filter – a Good solution creates a lambda expression each time values are
 * passed into countWords.
 *
 */

public class Good {

    public int countWords(List<String> words, char c, char d, int len){
        return (int)words.stream()
                .filter(word -> word.length()==len)
                .map(word -> word.contains(String.valueOf(c)) && !word.contains(String.valueOf(d)))
                .count();

    }

    public static void main(String[] args) {
        Good good = new Good();

        System.out.println(String.format("Friends with names that has n and no d and name length=4"
                + good.countWords(Folks.friends, 'n','d',4)));
    }
}
