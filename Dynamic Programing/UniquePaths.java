class UniquePaths {
    public int uniquePaths(int m, int n) {
        
        return uniquePathsDynamic(m,n,new HashMap<String,Integer>());
    }
    public int uniquePathsDynamic(int m, int n,Map<String,Integer> memo) {
        if(m>n){
            int temp=n;
            n=m;
            m=temp;
        }
        String key=m+"+"+n;
        if(memo.containsKey(key)) return memo.get(key);
        if(m==1 && n==1) return 1;
        if(m==0 || n==0) return 0;
        memo.put(key,uniquePathsDynamic(m-1,n,memo)+uniquePathsDynamic(m,n-1,memo));
        return memo.get(key);
    }
    
        
}
