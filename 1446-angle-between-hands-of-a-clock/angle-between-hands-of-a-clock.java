class Solution {
    public double angleClock(int hour, int minutes) {
        double res =Math.abs(( 11.0 / 2.0 *minutes) - (30.0 *( hour % 12)));
        return Math.min(res , 360.0 - res); 

    }
}