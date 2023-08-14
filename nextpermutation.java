class Solution {
    public void nextPermutation(int[] nums) {
        int pos1=-1,pos2=-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i-1]<nums[i]){
                pos1=i-1;
                break;
            }
        }
        if(pos1==-1){
            reverse(nums,0);
        }
        else{
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[pos1]){
                    pos2=i;
                    break;
                }
            }
            swap(nums,pos1,pos2);
            reverse(nums,pos1+1);
        }

    }
    public void swap(int nums[],int start,int end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
    public void reverse(int nums[],int start){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}