package org.opengoofy.index12306.test.general.strategy;

import org.springframework.stereotype.Component;


@Component
public class StrategyTwo implements DiscountStrategy{

  @Override
  public double getDiscount(double num) {
    return num*0.9;
  }
  @Override
  public String mark() {
    return "2";
  }
}