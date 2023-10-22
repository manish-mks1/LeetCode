class Solution {
    public ArrayList<Integer> Nlowest(int[] nums){
        ArrayList<Integer> al=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<nums.length;i++){
            while(!stack.empty() && nums[stack.peek()]>=nums[i]){
                stack.pop();
            }
            if(stack.empty()){
                al.add(-1);
            }
            else
                al.add(stack.peek());
            stack.push(i);
        }
        return al;
    }
    public ArrayList<Integer> NHighest(int[] nums){
        ArrayList<Integer> al=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            while(!stack.empty() && nums[stack.peek()]>=nums[i]){
                stack.pop();
            }
            if(stack.empty()){
                al.add(nums.length);
            }
            else
                al.add(stack.peek());
            stack.push(i);
        }
        return al;
    }
    public int maximumScore(int[] nums, int k) {
        
        int max=0;
        ArrayList<Integer> lowerAL=Nlowest(nums);
        ArrayList<Integer> higherAL=NHighest(nums);

//         for(int i=0;i<nums.length;i++){
//             int l=i,h=i;
//             while(l>-1){
//                 if(nums[i]<=nums[l]){
//                     l--;
//                 }else{
//                     break;
//                 }
//             }
//             while(h<nums.length){
//                 if(nums[i]<=nums[h])
//                     h++;
//                 else
//                     break;
//             }
//             if(l+1<=k && h-1>=k)
//             max=Math.max(max,nums[i]*((h-1)-(l+1)+1));
//             System.out.println(l+", "+h);
            
//         }
        for(int i:lowerAL){
            System.out.println(i);
        }
        for(int i:higherAL){
            System.out.println(i);
        }
        Collections.reverse(higherAL);
        for(int i=0;i<nums.length;i++){
            int l=lowerAL.get(i);
            int h=higherAL.get(i);
            if(l+1<=k && h-1>=k)
            max=Math.max(max,nums[i]*(h-l-1));

        }
        
        return max;
    }
}