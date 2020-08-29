package com.world.constant;

public class Word {

  private Word() {
    // privateコンストラクタでインスタンス生成を抑止
  }

  /** 挨拶 - おはよう */
  public static final String GREETING_MORNING = "good_morning";
  /** 挨拶 - こんにちは */
  public static final String GREETING_DAYTIME = "hello";
  /** 挨拶 - こんばんは */
  public static final String GREETING_EVENING = "good_evening";
  /** 挨拶 - おやすみ */
  public static final String GREETING_NIGHT = "good_night";

}