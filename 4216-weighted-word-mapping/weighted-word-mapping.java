class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        Character [] arr = {'z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n', 'm', 'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a'};
        StringBuilder sb = new StringBuilder();
        for(String s1 : words){
            int sum =0;
            for(int i =0 ; i< s1.length(); i++){
                char c = s1.charAt(i);
                sum += weights[c -'a'];
            }
            sb.append(arr[sum%26]);
        }
        return sb.toString();
    }
}