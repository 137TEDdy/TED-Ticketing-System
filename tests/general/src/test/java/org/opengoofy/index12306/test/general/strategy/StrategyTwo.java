package org.opengoofy.index12306.test.general.strategy;

import org.springframework.stereotype.Component;

/**
 * @Author : Ted
 * @create 2024/12/11 14:32 类功能:
 */
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