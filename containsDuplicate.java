
// Method 1 (by Sorting)

class Solution {
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++){
                if (nums[i] == nums[i+1]){
                    return true;
                }
        }
        return false;
    }
}








// Method 2 (by HashSet)

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int i : nums){
            if(set.contains(i))return true;
            set.add(i);
        }
        return false;
    }
}



// Method 3 (by HashMap)

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i],1);
        }
        return false;
    }
}