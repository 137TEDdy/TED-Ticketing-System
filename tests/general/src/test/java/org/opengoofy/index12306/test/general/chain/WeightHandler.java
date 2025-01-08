package org.opengoofy.index12306.test.general.chain;

/**
 *
 */
public class WeightHandler implements AbstractChainHandler{

  @Override
  public boolean handle(Object requestParam) {
    Product p=(Product) requestParam;
    if(p.weight<100){
      System.out.println("产品重量不合格");
      return false;
    }else{
      System.out.println("产品重量合格");
      return true;
    }
  }
}
