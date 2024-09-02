package strategies.divideconquer;

public class BinarySearchExp {

    public static void main(String[] args) {
        int input[]={10,20,30,40,50,60,70,80,90,100,110};
        int searchFor=80;
        BinarySearchExp demo=new BinarySearchExp();
        int result=demo.search(input,searchFor);
        System.out.println("element found at index="+result);
    }

    /**
     *
     *  uses binary search
     *
     *  Time Complexity O(Log n with base 2)
     *
     * @param inputArray  array of numbers
     * @param searchFor element to be searched
     * @return index of found element or -1 if not found
     */

    int  search(int inputArray[],int searchFor){
        int lowIndex=0,highIndex=inputArray.length-1;
        while(lowIndex<=highIndex){
            int midIndex=(lowIndex+highIndex)/2;
            System.out.println("midindex="+midIndex );
            if(inputArray[midIndex]==searchFor){
                return midIndex;
            }
            if(inputArray[midIndex]<searchFor){
                lowIndex=midIndex;
                continue;
            }

            highIndex=midIndex;

        }

        return -1;
    }
}
