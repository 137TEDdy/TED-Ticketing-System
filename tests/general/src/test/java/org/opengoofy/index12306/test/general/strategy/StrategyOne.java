package org.opengoofy.index12306.test.general.strategy;

import org.springframework.stereotype.Component;

@Component
public class StrategyOne implements DiscountStrategy{

  @Override
  public double getDiscount(double num) {
    return num*0.95;
  }

  @Override
  public String mark() {
    return "1";
  }
}
