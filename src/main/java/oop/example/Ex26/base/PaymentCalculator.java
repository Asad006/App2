package oop.example.Ex26.base;

public class PaymentCalculator {

    public int calculateMonthsUntilPaidOff(float balance, float cardApr, float monthly_payment) {

        //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)

        double part1 = Math.log(1 + ((balance/monthly_payment) * (1 - (Math.pow((1 + cardApr/36500.0), 30)))));

        double part2 = -(1.0/30.0) ;

        double part3 = Math.log(1 + cardApr/36500.0);

        return (int) Math.ceil(part1*part2/part3);
    }
}
