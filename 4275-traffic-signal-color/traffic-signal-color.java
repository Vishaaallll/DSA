class Solution {
    public String trafficSignal(int timer) {
        return switch (timer) {
    case 0 -> "Green";
    case 30 -> "Orange";
    case Integer t when t > 30 && t <= 90 -> "Red";
    default -> "Invalid";
};
    }
}