class Solution {

    public List<Integer> firstRow(){
       
            List<Integer> al = new ArrayList<>();
            al.add(1);
            return al;
     
    }
    public List<Integer> normalRow(int n){
        int val = 1;
        List<Integer> al = new ArrayList<>();
        al.add(1);
        int num=n;
        int den=1;
        for(int i=1;i<=n;i++){
            val = val*num/den;
            al.add(val);
            num--;
            den++;
        }
        return al;
    }
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> result = new ArrayList<>();
       for(int i=0;i<numRows;i++){
          List<Integer> a ;
          if(i==0){
             a = firstRow();
          }
          else{
            a = normalRow(i);
          }
          result.add(a);
       }

       return result;
    }
}