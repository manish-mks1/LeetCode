class Solution {
    public int majorityElement(int[] nums){
        boolean visited[]=new boolean[nums.length];
        Arrays.fill(visited,false);
        int maxcount=1,ele=0;
        int i=0;
        while (i<nums.length){
            if(visited[i]==true)
                continue;
            int max=1;
            for(int j=i+1;j<nums.length;j++){
                if(visited[j]==true)
                    continue;
                if(nums[j]==nums[i]){
                    max++;
                    visited[j]=true;
                }
            }
            if(maxcount<max){
                maxcount=max;
                ele=nums[i];
            }
            i++;
        }
        return ele; 
    }
}