package com.neusoft.timertask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class TimerTask {
  
 
  
  public void test()
  {
     System.out.println("job 开始执行");
  } 
}
