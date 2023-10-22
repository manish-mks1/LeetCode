class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows==1){
            res.add(Arrays.asList(1));
            return res;
        }
        
        if(numRows==2){
            res.add(Arrays.asList(1));
            res.add(Arrays.asList(1, 1));
            return res;
        }
        
        res.add(Arrays.asList(1));
        res.add(Arrays.asList(1, 1));
        for (int i = 2; i < numRows; i++) {
            List<Integer> list = res.get(i - 1);
            int[] arr = new int[i + 1];
            Arrays.fill(arr, 1);
            for (int j = 1; j < i; j++) {
                arr[j] = list.get(j - 1) + list.get(j);
            }
            // res.add(Arrays.asList(arr));
            List<Integer> rowList = new ArrayList<>();
            for (int num : arr) {
                rowList.add(num);
            }
            res.add(rowList);

        }

        return res;
    }
}
