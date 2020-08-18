import java.util.ArrayList;

public class WordScramble {
    public static void main (String[] args){
        String word = "aeioOa";
        System.out.println(translate(word));
    }
    public static String translate(String word){
        //Go over the input string and check for a e i o u
        //if any of this is found, put the letter in an empty array by the order of receiving
        //while a character is located, delete that character
        //after all the characters has been visited, a smaller string will be obtained
        //append the vowels stored in the vowels array one by one at the deleted version string
        //return that string as a final answer

        ArrayList<Character> vowels = new ArrayList<Character>();
        //int stringLength = word.length();
        //go over the string char by char
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == 'a' || word.charAt(i) == 'A'){
                vowels.add(word.charAt(i));
                word = RemoveChar(word,i);
                i = 0;

            }else if(word.charAt(i) == 'e' || word.charAt(i) == 'E'){
                vowels.add(word.charAt(i));
                word = RemoveChar(word,i);
                i = 0;

            }else if(word.charAt(i) == 'i' || word.charAt(i) == 'I'){
                vowels.add(word.charAt(i));
                word = RemoveChar(word,i);
                i = 0;

            }else if(word.charAt(i) == 'o' || word.charAt(i) == 'O'){
                vowels.add(word.charAt(i));
                word = RemoveChar(word,i);
                i = 0;

            }else if(word.charAt(i) == 'u' || word.charAt(i) == 'U'){
                vowels.add(word.charAt(i));
                word = RemoveChar(word,i);
                i = 0;
            }
        }
        //go into the array list stored the vowels and append it at the end of the String
        for(int k = 0; k < vowels.size(); k++){
            word += vowels.get(k);
        }
        return word;
    }

    public static String RemoveChar(String str, int pos){
        return str.substring(0,pos) + str.substring(pos + 1);
    }
}