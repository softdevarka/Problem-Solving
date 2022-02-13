class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        arr.add(new ArrayList<Integer>());

        for(int x:nums){
            int n = arr.size();
            for(int i=0;i<n;i++){
                ArrayList<Integer> r = new ArrayList<>(arr.get(i));
                r.add(x);
                arr.add(r);
            }
        }

        return arr;
    }
}