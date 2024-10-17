class Solution {
    public int maximumSwap(int num) {
        char nums[]=Integer.toString(num).toCharArray();
        int maxInd=-1,s1=-1,s2=-1;
        int n=nums.length;
        for(int i=n-1;i>=0;i--)
        {
            if(maxInd==-1 || nums[i]>nums[maxInd])
            {
                maxInd=i;
            }
            else if(nums[i]<nums[maxInd])
            {
                s1=i;
                s2=maxInd;
            }
        }
        if(s1!=-1 && s2!=-1)
        {
            char temp=nums[s1];
            nums[s1]=nums[s2];
            nums[s2]=temp;
        }
        return Integer.parseInt(new String(nums));
    }
}