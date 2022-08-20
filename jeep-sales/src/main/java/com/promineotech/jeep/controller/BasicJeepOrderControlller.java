package com.promineotech.jeep.controller;

import org.springframework.web.bind.annotation.RestController;
import com.promineotech.jeep.entity.Order;
import com.promineotech.jeep.entity.OrderRequest;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class BasicJeepOrderControlller implements JeepOrderController {

  @Override
  public Order createOrder(OrderRequest orderRequest) {
    log.info("Order = {}", orderRequest);
    return null;
  }

}
