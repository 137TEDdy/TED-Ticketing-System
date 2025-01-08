package org.opengoofy.index12306.test.general.chain;

/**
 */
public class PriceHandler implements AbstractChainHandler {
  @Override
  public boolean handle(Object requestParam) {
    Product p=(Product) requestParam;
    if(p.price>100){
      System.out.println("产品价格不合格");
      return false;
    }else{
      System.out.println("产品价格合格");
      return true;
    }
  }
}
