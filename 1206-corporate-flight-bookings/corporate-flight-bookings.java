class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
    
        int [] answer = new int[n];
        for(int [] arr : bookings){
                int i = arr[0] , j = arr[1] , seat = arr[2] ;
                while(i <= j){
                    answer[i-1] +=seat;
                    i++;
                }
        }
        return answer;
    }
}