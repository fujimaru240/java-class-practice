package com.world.words;

import java.util.HashMap;
import java.util.Map;

/**
 * 言語
 */
public class Language {
  
  /** あいさつ */
  public Map<String, String> greeting;

  /**
   * コンストラクタ
   */
  public Language() {
    this.greeting = new HashMap<>();
  }

  public String getGreeting(String pattern) {
    String word = this.greeting.get(pattern);
    if (word == null) {
      return "…";
    }
    return word;
  }
}