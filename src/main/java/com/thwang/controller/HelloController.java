package com.thwang.controller;

import com.thwang.service.CalculateService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  private final CalculateService calculateService;

  public HelloController(CalculateService calculateService) {
    this.calculateService = calculateService;
  }

  @RequestMapping("/")
  public String hello() {
    return "Hello, world.";
  }

  @RequestMapping("/sum")
  public String sum() {
    return calculateService.sum1to10().toString();
  }
}
