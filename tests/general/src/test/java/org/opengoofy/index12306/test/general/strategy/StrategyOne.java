package org.opengoofy.index12306.test.general.strategy;

import org.springframework.stereotype.Component;

/**
 * @Author : Ted
 * @create 2024/12/11 14:31 类功能:
 */
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
