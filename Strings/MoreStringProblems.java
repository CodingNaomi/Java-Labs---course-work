import java.util.*; //for Hashset
/**
 * Solutions to various string problems.
 * 
 */

public class MoreStringProblems
{
    // A method that creates and returns a String that contains each character that occurs
    // in the given text, so that each character is included in this result only once.
    private int x;
    public String uniqueCharacters(String text) {
        HashSet<Character> seen = new HashSet<Character> ();
        String result = "";
        for(int i = 0; i < text.length(); i++) {
            char letter=text.charAt(i);
            if (!seen.contains(letter)) {
                result += letter;
                seen.add(letter);
            }
        }
        return result;
    }

    // A method that counts how many times the pattern occurs inside the text.
    public int countOccurrences(String text, String pattern) {
        int count=0;
        if (text.length()==0) {
            count=0;
        }else{
            for (int i=0; i<text.length()-(pattern.length()-1); i++) {
                String minitxt = text.substring(i,i+pattern.length());
                if (minitxt.equals(pattern)){
                    count++;
                }
            }
        }
        return count;
    }

    // A method that creates and returns a string in which character of s has been moved left k steps, 
    // so that the characters that would “fall off” the left end are appended to the right.
    public String cyclicLeftShift(String s, int k) {
        String newstr="";
        k = k % (s.length());
        String frtstr=s.substring(0,k);
        String sndstr=s.substring(k);
        newstr=sndstr+frtstr;

        return newstr;
    }

    // A method that extracts the integer (either positive or negative) whose digits are
    // given as characters in the parameter string s.
    public int parseInt(String s) {
        int newint=0;
        boolean isNeg = false;

            if (s.charAt(0) != '-'){
                for (int i=0; i<s.length(); i++) {
                    int num=s.charAt(i)-'0';
                    newint = newint*10 + num;
                }
            }else{
                isNeg=true;
                for (int i=1; i<s.length(); i++) {
                    int num=s.charAt(i)-'0';
                    newint = newint*10 + num;
                }
            }
  
        if (isNeg){
            newint=-newint;
        }
        return newint;
    }
}

