package com.thwang.service;

import com.thwang.annotation.LogExecutionTime;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CalculateService {
  @LogExecutionTime
  public BigDecimal sum1to10() {
    int sum = 0;
    for (int i = 0; i < 10; i++) {
      sum += i + 1;
    }
    return new BigDecimal(sum);
  }
}
