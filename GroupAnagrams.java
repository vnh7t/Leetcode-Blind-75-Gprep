class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ans=new HashMap<String,List<String>>();
        
    for(int i=0;i<strs.length;i++){
        String fre=Arrays.toString(frequencyCalculater(strs[i]));
        if(!ans.containsKey(fre)){
            ans.put(fre,new ArrayList<String>());
            ans.get(fre).add(strs[i]);
        }else{
            ans.get(fre).add(strs[i]);
        }
    }
        
        return new ArrayList(ans.values());
    }
    
   public int[] frequencyCalculater(String token){
        int[] fre=new int[26];
        for(int i=0;i<token.length();i++){
            fre[token.charAt(i)-'a']++;
        }
       return fre;
   }
}
