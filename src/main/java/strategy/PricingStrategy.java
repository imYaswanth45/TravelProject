package strategy;

import model.Activity;
import model.Passenger;

public interface PricingStrategy {

    Double getActivityPricing(Passenger tripPassenger, Activity activity);
}
