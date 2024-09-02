package strategies;

public class FactorialExpRecursive {


    public static void main(String[] args) {
        FactorialExpRecursive demo=new FactorialExpRecursive();
        int result=demo.factorial(4);
        System.out.println("result="+result);
    }

    /**
     * 4
     * 3 * 2 *1
     *
     * @param number
     * @return
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
