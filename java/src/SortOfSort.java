public class SortOfSort {

    public static void sortOfSort(int[] nums){
        int count = 0;
        int indexSmallest = 0;
        int max = Integer.MIN_VALUE;

        for(int i  = nums.length-1; i >= 0; i++){

            for(int j = 0; j < nums.length-1; j++){
                if(count >= 2){
                    count = 0;
                }

                if(nums[i] > max){
                    max = nums[i];
                }
            }

            if(count < 2){
                nums[i] = max;
                count++;
            }
            else{
                nums[indexSmallest] = max;
                indexSmallest++;
            }

            max = Integer.MIN_VALUE;

        }
    }
}
