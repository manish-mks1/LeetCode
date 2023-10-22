class Solution {
    public List<Integer> majorityElement(int[] nums) {
        boolean arr[]=new boolean[nums.length];
        List<Integer> arrlist=new ArrayList<>();
        Arrays.fill(arr,false);
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j] && arr[j]==false){
                    count++;
                    arr[j]=true;
                }
            }
            if(count>nums.length/3){
                arrlist.add(nums[i]);
            }
        }
        return arrlist;
    }
}