package strategies;

public class FactorialExpRecursive {


    public static void main(String[] args) {
        FactorialExpRecursive demo=new FactorialExpRecursive();
        int result=demo.factorial(4);
        System.out.println("result="+result);
    }

    /**
     * Time Complexity : O(n)
     * Auxiliary Space  : O(n) since for every recursion new stack frame will be created
     *
     * @param number, input for which factorial has to be calculated
     * @return result, factorial of number
     */
    int factorial(int number) {
        int result = 1;
        System.out.println("number="+number);
        if (number > 0) {
            result = number * factorial(number - 1);
            System.out.println("result="+result);
        }

        return result;

    }

}
