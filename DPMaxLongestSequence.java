class DPMaxLongestSequence {
    public int lengthOfLIS(int[] nums) {
        int ls_size=nums.length;
        int[] largerThenCurrent=new int[ls_size];
        for(int i=ls_size-1;i>=0;i--){
            for(int j=i;j<ls_size;j++){
                if(nums[i]<nums[j]){
                    largerThenCurrent[i]=Math.max(largerThenCurrent[i],1+largerThenCurrent[j]);
                }
            } 
        }
        int maxCount=0;
        for(int i : largerThenCurrent){
            if(i>maxCount){
                maxCount=i;
            }
        }
        return maxCount+1;
    }
}
