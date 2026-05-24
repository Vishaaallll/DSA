class Solution {
    public int passwordStrength(String password) {
        Set<Character> set = new HashSet<>();
        
        for( char c : password.toCharArray()){
            set.add(c);
        }
        int total = 0;
        for(char c : set){

            if(c  >= 'a' &&  c <= 'z'  ){
                total += 1;
            }
            else  if(c >= 'A'  && c <= 'Z' ){
                total += 2;
            }
           else if( c >= '0'  && c <= '9'){
                total += 3;
            }
            else{
                total += 5;
            }
        }
        return total;
    }
}