package oop.example.Ex31.base;

public class KarvonenHeartRate {
    public int calculate(int age, int restingRate, int intensity) {
       // System.out.printf("%f",(float)(((220.2 - (float)age)- (float)restingRate) * (float)intensity/100) + (float) restingRate);
        return   Math.round((float)(((220.2 - (float)age)- (float)restingRate) * (float)intensity/100) + (float) restingRate);
    }
}
