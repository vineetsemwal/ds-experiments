package strategies.divideconquer;

public class BinarySearch {


    int  search(int inputArray[],int searchFor){
        int lowIndex=0,highIndex=inputArray.length-1;
        while(lowIndex>=highIndex){
            int midIndex=(lowIndex+highIndex)/2;
            if(inputArray[midIndex]==searchFor){
                return midIndex;
            }
            if(inputArray[midIndex]<searchFor){
                lowIndex=midIndex;
                continue;
            }

            highIndex=midIndex;


        }
    }
}
