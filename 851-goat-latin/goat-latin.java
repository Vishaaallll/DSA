class Solution {

    StringBuilder sent = new StringBuilder();

    public String Latin(String word , int i){

        String s = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder();
        char ch = word.charAt(0);

        if(s.indexOf(ch) == -1){
            sb.append(word.substring(1));
            sb.append(ch);
        }else {
            sb.append(word);
        }

        sb.append("ma");
        
        for(int j = 0; j <= i ; j++){
            sb.append('a');
        }
         return sb.toString();
    }
    public String toGoatLatin(String sentence) {
        sent = new StringBuilder();

        String[] arr = sentence.split(" ");

        for(int i =0; i< arr.length; i++){
            String word = arr[i];
            sent.append(Latin(word , i));
            if(i < arr.length -1){
                sent.append(" ");
            }
        }
        return sent.toString();
    }
}