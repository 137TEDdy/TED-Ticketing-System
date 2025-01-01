package org.opengoofy.index12306.test.general.strategy;

/**
 * @Author : Ted
 * @create 2024/12/11 14:35 类功能:
 */
public class MainMethod {

  public static void main(String[] args) {
    Factory f=new Factory();
    DiscountStrategy strategy = f.getStrategy(1);
    System.out.println(strategy.getDiscount(12.0));

  }
}
