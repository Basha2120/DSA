class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();

        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }

PriorityQueue<Map.Entry<Integer,Integer>> heap=new PriorityQueue<>((a,b) -> Integer.compare(b.getValue(),a.getValue()));
        for(Map.Entry<Integer,Integer> val:map.entrySet())
        {
            heap.offer(val);
        }
        int res[]=new int[k];
        for(int i=0;i<k;i++)
        {
            res[i]=Objects.requireNonNull(heap.poll()).getKey();
        }
        return res;
    }
}