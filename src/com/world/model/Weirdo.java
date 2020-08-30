package com.world.model;

/**
 * 変人
 */
public class Weirdo extends Person {

  /** 思考 */
  private static String thinking;

  /**
   * コンストラクタ
   * 
   * @param name 名前
   */
  public Weirdo(String name) {
    super(name);
  }

  @Override
  public void inputLanguage() {
    // 
  }

  /**
   * テレパシーする
   * 
   * @param thinking 思考
   */
  public void telepathy(String thinking) {
    this.thinking = thinking;
    this.express("…");
  }

  /**
   * 感じる
   */
  public void feel() {
    this.express("(" + this.thinking + ")");
  }
}