class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int val:arr)
        {
            map.put(val,map.getOrDefault(val,0)+1);
        }
        HashSet<Integer> uniq=new HashSet<>();
        for(int u:map.values())
        {
            if(uniq.contains(u))
            return false;
            else
            uniq.add(u);
        }
        return true;
    }
}