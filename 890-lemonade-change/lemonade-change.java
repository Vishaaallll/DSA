class Solution {
    public boolean lemonadeChange(int[] arr) {
        if(arr[0] != 5) return false;
        int NumberofBillFive = 0;
        int NumberofBillTen = 0;
       
        for(int i =0; i<arr.length; i++){
            if(arr[i] == 5){
              
                NumberofBillFive ++;
            } else if( arr[i] == 10){
                if(NumberofBillFive > 0){
                    NumberofBillTen++;
                    NumberofBillFive--;
                   
                }else return false;
            } else {
                if(NumberofBillTen >= 1 && NumberofBillFive >= 1){
                   NumberofBillFive--;
                   NumberofBillTen--;
                 
                } else if(NumberofBillFive >= 3){
                    NumberofBillFive -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}