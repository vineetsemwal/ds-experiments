package strategies;

public class FactorialExpIterative {


    public static void main(String[] args) {
        FactorialExpIterative demo=new FactorialExpIterative();
        int result=demo.factorial(4);
        System.out.println("result="+result);
    }

    /**
     * 4
     * 3 * 2 *1
     *
     * @param number
     * @return factorial result
     */
    int factorial(int number) {
        int result = 1;
        System.out.println("number="+number);
        for (int i=number;i>0;i--){
            result=result*i;
        }
        return result;

    }

}
