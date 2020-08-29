package com.world.model;

import com.world.constant.Word;

/**
 * 日本人
 */
public class Japanese extends Person {

  /**
   * コンストラクタ
   * 
   * @param name 名前
   */
  public Japanese(String name) {
    super(name);
  }

  @Override
  public void inputLanguage() {
    this.lang.greeting.put(Word.GREETING_MORNING, "おはよう");
    this.lang.greeting.put(Word.GREETING_DAYTIME, "こんにちわ");
    this.lang.greeting.put(Word.GREETING_EVENING, "こんばんわ");
    this.lang.greeting.put(Word.GREETING_NIGHT, "おやすみ");
  }
}