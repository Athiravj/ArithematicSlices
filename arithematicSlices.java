class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int result=0;
        int count=0;
        for(int i=2;i<nums.length;i++){
            // for(int j=i+1;j<nums.length;j++){
            //     for(int k=j+1;k<nums.length;k++)
            //if(nums[j]-nums[i]==nums[k]-nums[j])
            
                    if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2])
                    {
                        count++;
                         result += count;
                    }
                    else{
                        count=0;
                    }
                       
                }
        return result;
    }
};