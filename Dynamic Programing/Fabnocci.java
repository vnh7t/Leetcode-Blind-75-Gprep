class Fabnocci{
    public int fib(int n) {
        return dynamicFib(n,new HashMap<Integer,Integer>());
    }
    int dynamicFib(int n,Map<Integer,Integer> memo){
        if(memo.containsKey(n)) return memo.get(n);
        if(n==0) return n;
        if(n==1 || n==2) return 1;
        memo.put(n,dynamicFib(n-1,memo)+dynamicFib(n-2,memo));
        return memo.get(n);
    }
}