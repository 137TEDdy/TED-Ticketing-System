package org.opengoofy.index12306.test.general.chain;

import org.springframework.core.Ordered;

/**
 *
 */
public interface AbstractChainHandler<T> {

  /**
   * 执行责任链逻辑
   * @param requestParam 责任链执行入参
   */
  boolean handle(T requestParam);

}
