class Solution {
    public void sortColors(int[] nums) {
//         if (nums.length == 0 || nums.length == 1) return;
        
//         int start = 0;
//         int end = nums.length-1;
//         int index = 0;
            
//             while(index <= end && start < end){
//                 if(nums[index] == 0){
//                     nums[index] = nums[start];
//                     nums[start] = 0;
//                     start ++;
//                     index++;
//                 }
//                 else if(nums[index] == 2){
//                     nums[index] = nums[end];
//                     nums[end] = 2;
//                     end--;
//                 }
//                 else{
//                     index++;
//                 }
//             }
        
//     }
// }
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        int temp;
        while (mid <= high){
            switch (nums[mid]){
                case 0:{
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low += 1; //low++
                    mid += 1; //mid++
                    break;
                }
                case 1:
                    mid += 1; //mid++
                    break;
                    
                case 2:
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high -= 1; //high--
                    break;
            }
        }
    }
}

//Three Pointer method (Dutch National Flag Algorithm)....