
/**
Solutions to various string problems.
*/

public class StringProblems
{
    
    private int x;
    
    // A method that creates and returns a new string that is the same as the parameter string s but reversed.
    public String reverse (String s) {
        String newStr = "";
        for (int i=s.length()-1; i>=0; i--) {
            newStr = newStr + s.charAt(i);
        }
        return newStr.toString();
    }

    //A method that returns true if the parameter string s is a palindrome, that is, the same 
    //regardless whether it is read from left to right or from right to left.
    public boolean isPalindrome (String s) {
        int count=0;
        StringBuilder newStr = new StringBuilder(s);
        newStr.reverse();
        
        for (int i=0; i<s.length()-1; i++) {
            if (s.charAt(i)==newStr.charAt(i)){
                count++;
            }
        }
        if (count==s.length()-1) {
            return true;
        }
        return false;
    }
       
    
    //A method that creates and returns a new string so that its first and the last characters are the same as in 
    //the parameter string s, but each individual character in between is duplicated n times
       public String stretch(String s, int n) {
        int j=1;
        StringBuilder newStr = new StringBuilder();
        StringBuilder midStr = new StringBuilder();
        if(s.length() == 0) { return ""; }
        if (s.length()==1) {return s;}
        if (n==0) {
            newStr.append(s.charAt(0));
            newStr.append(s.charAt(s.length()-1));
        }else{
        
            for (int i=1; i<=s.length()-2; i++){

                while (j<=n) {
                    midStr.append(s.charAt(i));
                    j++;
                }
                j=1;

            }
            newStr.append(s.charAt(0));
            newStr.append(midStr);
            newStr.append(s.charAt(s.length()-1));
        }
        return newStr.toString();
    }

    //A method that counts how many words there are in the parameter string s. 
    //A word is defined as a maximal sequence of non-whitespace characters   
    public int countWords(String s) {
        int start = 0;
        int count = 0;
        boolean inWord = false;
        String result = "";
        for(int i = 0; i <= s.length(); i++) {
            if(i == s.length() || Character.isWhitespace(s.charAt(i))) {
                if(inWord) {
                    inWord = false;
                    count++;
                }
            }
            else {
                if(!inWord) { start = i; }
                inWord = true;
            }
        }
        return count;
    }
}

