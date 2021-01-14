
/**

Solutions to various problems involving loops.
 */

public class MoreLoopProblems
{
    // instance variables 
    private int a;
    private int b;

    //A method that counts how many times the character ch appears in the string s, and returns that count.
    public int count(String s, char ch){
        int sum = 0;
        for (int i=0; i<= s.length()-1; i++){
            if (s.charAt(i) == ch){
                sum++;
            }

        }
        return sum;

    }

    //A method that, given a positive integer n, returns the integer constructed by writing its digits twice in a row.
    public long duplicateDigits(long n) {
        long num=n;
        long sum=1;
        long result=0;
        while (num>0){
            num=num/10;
            sum=sum *10;
        }
        result=n*sum + n;
        return result;

    }
    
    //Fizzbuzz
    public String fizzBuzz(int start, int end){
        StringBuilder result = new StringBuilder();
        if (end>start){

            for (int i=start; i<=end; i++){

                if (i%5==0 && i%3==0){
                    result.append("fizzbuzz");
                    if(i<end) {
                        result.append(", ");
                    }
                }else{
                    if (i%3==0){
                        result.append("fizz");
                        if(i<end) {
                            result.append(", ");
                        }
                    }else{
                        if (i%5==0) {
                            result.append("buzz");
                            if(i<end) {
                                result.append(", ");
                            }

                        }else{

                            result.append(i);
                            if(i<end) {
                                result.append(", ");
                            }
                        }

                    }

                }
            }
        }else{

            if (end==start){

                for (int i=start; i<=end; i++){

                    if (i%5==0 && i%3==0){
                        result.append("fizzbuzz");

                    }else{
                        if (i%3==0){
                            result.append("fizz");

                        }else{
                            if (i%5==0) {
                                result.append("buzz");

                            }else{
                                result.append(i);
                            }
                        }
                    }
                }

            }

        }
        return result.toString();
    }

    //A method that returns the number of steps that are needed to reach 1 when starting from n.  
    //If verbose is true, this method should also output the sequence on the console as it is generated. 
    public int collatz(int n, boolean verbose){
        int steps=0;     
        while (n>1){
            if (n%2!=0){
                n=3*n+1;
                System.out.print(n);
                steps++;
            }else{

                n=n/2;
                System.out.print(n);
                steps++;
            }
        }
        if (verbose==true){
            return steps;

        }

        return steps;
    }

}

