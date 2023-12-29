package strategy;

import model.Activity;
import model.Passenger;

public class PassengerTypePricingStrategy implements PricingStrategy{

    @Override
    public Double getActivityPricing(Passenger tripPassenger, Activity activity) {

        switch (tripPassenger.getPassengerType()) {
            case GOLD:
                return activity.getCost()*(0.9);
            case PREMIUM:
                return 0.0;
            case STANDARD:
            default:
                return activity.getCost();
        }
    }
}
