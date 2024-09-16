package strategies.dynamic;

public class FactorialDynamic {

    public static void main(String[] args) {
        FactorialDynamic demo=new FactorialDynamic();
        int result=demo.factorialsSum(4);
        System.out.println("result="+result);
    }

    /**
     *  uses Dynamic Programming, Divide Problem into smaller parts, store the result to avoid re-computation
     *  Calculates sum of factorial of all numbers till number, We store the result of parts/sub problems, to avoid repeat computation
     *
     *   foreg. 4,     1 + 2*1 + 3*2+ 4*3*2*1
     *
     *  (with using Dynamic Programming, time complexity will be O(n^2) and Auxiliary space will be O(1))
     *
     *  Time Complexity : O(n)  where n is the number
     *  Auxiliary Space : O(n) where n is the value of number
     *
     * @param number
     * @return sum of factorial of numbers till number
     */
    int factorialsSum(final int number) {
        int array[] = new int[number+1];
        int totalSum = 1;
        for (int i = 2; i <=number; i++) {
            int oldResult=1;
            if(array[i-1]!=0)oldResult=array[i-1];
            int factorialResult=oldResult*i;
            array[i]=factorialResult;
            totalSum = totalSum + factorialResult;
        }
        return totalSum;
    }


}
