class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int wordpos=0;
        String arr[]=sentence.split(" ");

       for(int i=0;i<arr.length;i++)
       {
        if(arr[i].startsWith(searchWord))
        {
            wordpos=i+1;
            return wordpos;
        }
       }
       return -1;
    }
}