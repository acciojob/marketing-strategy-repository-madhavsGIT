package com.driver;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MarketingStrategyManager {
    private List<MarketingStrategy> strategies;

    public MarketingStrategyManager() {
        this.strategies = new ArrayList<>();
    }

    public void createStrategy(MarketingStrategy strategy) {
    	//your code goes here
        strategies.add(strategy);
    }

    public MarketingStrategy getStrategyByName(String name) {
    	//your code goes here

        for(MarketingStrategy strategy : strategies) {
            if(strategy.getName().equals(name)){
                return strategy;

            }
        }

        return null;
    }

    public void updateStrategy(MarketingStrategy updatedStrategy) {
    	//your code goes here
        for (int i = 0; i < strategies.size(); i++) {
            if (strategies.get(i).getName().equals(updatedStrategy.getName())) {
                strategies.set(i, updatedStrategy);
                return;
            }
        }


    }

    public void deleteStrategy(String name) {
    	//your code goes here
        MarketingStrategy ans = null;
        for(MarketingStrategy strategy : strategies) {
            if(strategy.getName().equals(name)){
                ans = strategy;
               break;
            }
        }
        strategies.remove(ans);

    }

    public List<MarketingStrategy> getStrategiesInBudgetRange(double minBudget, double maxBudget) {
    	//your code goes here
        return strategies.stream()
                .filter(strategy -> strategy.getBudget() >= minBudget && strategy.getBudget() <= maxBudget)
                .collect(Collectors.toList());
    }

    public List<MarketingStrategy> getAllStrategies() {
    	//your code goes here

        return new ArrayList<>(strategies);
    }
}

