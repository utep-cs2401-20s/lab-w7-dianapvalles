public class SortOfSort {
    public static void sortOfSort(int[] nums) {
        int lowestIndex= 0;
        int highestIndex = nums.length-1;
        int max;
        int indexCurr;
        int count = 0;
        int temp;

        for(int i = 0; i < nums.length - 1 ; i++){
            max = Integer.MIN_VALUE;
            indexCurr = i;

            for(int j = lowestIndex ; j <= highestIndex; j++){
                if(nums[j] > max){
                    max = nums[j];
                    indexCurr = j;
                }
            }

            if(lowestIndex < highestIndex) {
                if (count < 2) {
                    temp = nums[highestIndex];
                    nums[highestIndex] = max;
                    nums[indexCurr] = temp;
                    count++;
                    highestIndex--;
                }
                else if (count < 4) {
                    temp = nums[lowestIndex];
                    nums[lowestIndex] = max;
                    nums[indexCurr] = temp;
                    count++;
                    lowestIndex++;
                }
            }

            if(count == 4){
                count = 0;
            }
        }
    }
}
