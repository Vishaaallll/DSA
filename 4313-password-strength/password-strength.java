class Solution {
    public int passwordStrength(String password) {
        Set<Character> set = new HashSet<>();
        Set<Character> set1 = new HashSet<>();
        set1.add('!');
        set1.add('@');
        set1.add('#');
        set1.add('$');
        for( char c : password.toCharArray()){
            set.add(c);
        }
        int total = 0;
        for(char c : set){

            if(c  >= 'a' &&  c <= 'z'  ){
                total += 1;
            }
            if(c >= 'A'  && c <= 'Z' ){
                total += 2;
            }
            if( c >= '0'  && c <= '9'){
                total += 3;
            }
            if(set1.contains(c)){
                total += 5;
            }
        }
        return total;
    }
}