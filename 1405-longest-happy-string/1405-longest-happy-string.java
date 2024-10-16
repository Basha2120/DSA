class Solution {
    public String longestDiverseString(int a, int b, int c) {
       int curA=0,curB=0,curC=0;
       int maxlen=a+b+c;
       int i=0;
       StringBuilder happy=new StringBuilder();
       while(i<(maxlen))
       {
        if(curA!=2 && a>=b && a>=c  || a>0 && (curB==2 || curC==2))
        {
            happy.append('a');
            curA++;
            curB=0;
            curC=0;
            a--;
        }
        else if(curB!=2 && b>=a && b>=c  || b>0 && (curA==2 || curC==2))
        {
            happy.append('b');
            curB++;
            curA=0;
            curC=0;
            b--;
        }
        else if(curC!=2 && c>=a && c>=b  || c>0 && (curA==2 || curB==2))
        {
            happy.append('c');
            curC++;
            curA=0;
            curB=0;
            c=c-1;
        }
        i++;
       } 
       return happy.toString();
    }
}