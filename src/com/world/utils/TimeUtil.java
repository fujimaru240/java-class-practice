package com.world.utils;

import java.time.LocalDateTime;
import java.time.LocalTime;

import com.world.status.TimeFrame;

public class TimeUtil {

  public static TimeFrame getCurrentTimeFrame() {
    LocalTime currentTime = LocalDateTime.now().toLocalTime();
    
    if (isTimeZoneOf(currentTime, 5, 9)) {
      return TimeFrame.Morning;
    } else if (isTimeZoneOf(currentTime, 10, 16)) {
      return TimeFrame.Daytime;
    } else if (isTimeZoneOf(currentTime, 17, 20)) {
      return TimeFrame.Evening;
    } else if (isTimeZoneOf(currentTime, 21, 23)) {
      return TimeFrame.Night;
    }
    return TimeFrame.SleepTime;
  }

  private static boolean isTimeZoneOf(LocalTime target, int fromH, int toH) {
    if (target.isAfter(LocalTime.of(fromH, 0)) && 
        target.isBefore(LocalTime.of(toH, 59))) {
      return true;
    }
    return false;
  }
}