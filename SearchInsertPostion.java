class Solution {
    int BinarySearch(int[] arr,int l,int r,int t){
        int m=(l+r)/2;
        if(l>r)
            return l;
        else if(arr[m]==t)
            return m;
        else if(arr[m]>t)
            return BinarySearch(arr,l,m-1,t);
        else 
            return BinarySearch(arr,m+1,r,t);
    }
    public int searchInsert(int[] nums, int target) {
        return BinarySearch(nums,0,nums.length-1,target);
        
    }
}