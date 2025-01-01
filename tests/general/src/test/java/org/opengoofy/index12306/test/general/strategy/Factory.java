package org.opengoofy.index12306.test.general.strategy;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Author : Ted
 * @create 2024/12/11 14:29 类功能:
 */

@Component
public class Factory implements InitializingBean {
  @Autowired
  private ApplicationContext applicationContext;
  static final Map<String,DiscountStrategy> map=new HashMap<>();
//  public Factory(){
//    map.put(1,new StrategyOne());
//    map.put(2,new StrategyTwo());
//  }

  public DiscountStrategy getStrategy(int type){
    return map.get(type);
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    Map<String, DiscountStrategy> beanMap = applicationContext.getBeansOfType(DiscountStrategy.class);
    beanMap.forEach((key,val)->map.put(val.mark(),val));
  }
}
