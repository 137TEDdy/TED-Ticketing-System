package org.opengoofy.index12306.test.general.chain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class ChainContext<T>{
  List<AbstractChainHandler> container=new ArrayList<>();
  public void handle( T requestParam){
    for (AbstractChainHandler handler : container) {
      boolean flag = handler.handle(requestParam);
      if (!flag){
        System.out.println("产品不合格");
        return;
      }
    }
    System.out.println("产品合格");

  }
  void add(AbstractChainHandler handler){
    container.add(handler);
  }

  public static void main(String[] args) {
    ChainContext context=new ChainContext();
    context.add(new PriceHandler());
    context.add(new WeightHandler());
    context.handle(new Product(50,150));
  }


}