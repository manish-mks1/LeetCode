class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int[] nums,int str,int end){
        while(str<end){
            int temp=nums[str];
            nums[str++]=nums[end];
            nums[end--]=temp;
        }
    }
}