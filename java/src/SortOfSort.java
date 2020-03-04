public class SortOfSort {
    public static void sortOfSort(int[] nums) {
        //sets the smallest value for the index
        int lowestIndex= 0;

        //sets the highest value for the index
        int highestIndex = nums.length-1;

        //will be used to hold the highest value
        int max;

        //index of the highest element found
        int indexCurr;

        //counter to choose the highest element's position
        int count = 0;

        //used to swap values
        int temp;

        //Iterates over the whole array
        for(int i = 0; i < nums.length ; i++){
            //Resets the max value
            max = Integer.MIN_VALUE;
            indexCurr = i;

            //Finds the maximum value in the non-sorted section
            for(int j = lowestIndex ; j <= highestIndex; j++){
                if(nums[j] > max){
                    max = nums[j];
                    indexCurr = j;
                }
            }

            //checks the boundaries of lowestIndex and highestIndex
            if(lowestIndex < highestIndex) {
                //Moves the largest to the "end"
                if (count < 2) {
                    temp = nums[highestIndex];
                    nums[highestIndex] = max;
                    nums[indexCurr] = temp;
                    count++;
                    highestIndex--;
                }
                //Moves the largest to the "front"
                else if (count < 4) {
                    temp = nums[lowestIndex];
                    nums[lowestIndex] = max;
                    nums[indexCurr] = temp;
                    count++;
                    lowestIndex++;
                }
            }

            //Resets the counter to 0 if the first 4 positions were accommodated
            if(count == 4){
                count = 0;
            }
        }
    }
}
