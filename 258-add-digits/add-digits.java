class Solution {
    public int addingDigit(int num) {
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    public int addDigits(int num) {
        if(num < 10 ) return num;
        while(num >= 10){
            num = addingDigit(num);
        }
        return num;
    }
}