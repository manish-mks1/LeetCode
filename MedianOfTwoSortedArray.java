class Solution {
    
    public int[] mergeSortedArray(int[] nums1,int[] nums2){
        int i=0,j=0,k=0;
        int arr[]= new int[nums1.length+nums2.length];
        
        while(i<nums1.length&& j<nums2.length){
            if(nums1[i]<=nums2[j])
                arr[k++]=nums1[i++];
            else
                arr[k++]=nums2[j++];
        }
        while(i<nums1.length)
            arr[k++]=nums1[i++];
        while(j<nums2.length)
            arr[k++]=nums2[j++];
        return arr;
    }
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        
        int arr[]=mergeSortedArray(nums1,nums2);
        int len=arr.length;
        if(len%2==0){
            return((double)(arr[len/2]+arr[(len-1)/2])/2);
        }
        else
            return (double)arr[len/2];
        
    }
}
public class MedianOfTwoSortedArray{
    public static void main(String[] args) {
        Solution ob=new Solution();
        int arr1[]={1,2,5};
        int arr2[]={4,6};
        double median=ob.findMedianSortedArrays(arr1,arr2);
        System.out.println(median);
    }
}