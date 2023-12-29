package manager;

import model.Passenger;
import strategy.PassengerTypePricingStrategy;
import strategy.PricingStrategy;

public class StrategyMgr {
    private static volatile StrategyMgr strategyMgr = null;

    private StrategyMgr() {

    }

    public static StrategyMgr getStrategyManagerInstance() {
        if(strategyMgr == null) {
            synchronized (StrategyMgr.class) {
                if (strategyMgr == null) {
                    strategyMgr = new StrategyMgr();
                }
            }
        }
        return strategyMgr;
    }

    public PricingStrategy determinePricingStrategy(Passenger tripPassenger) {
        return new PassengerTypePricingStrategy();
    }
}
