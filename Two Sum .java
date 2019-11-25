class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        int i,j;
        int size = nums.length; 
        for(i=0;i<size;i++){
          for(j=0;j<size;j++){
            if(nums[i]+nums[j] == target && i!=j){
              arr[0] = j;
              arr[1] = i;
            }
          }
        }
      
      
    return arr;
        
    }
  
}