package org.opengoofy.index12306.test.general.strategy;

/**
 * @Author : Ted
 * @create 2024/12/11 14:31 类功能:
 */
public interface DiscountStrategy {
  double getDiscount(double num);
  String mark();
}
