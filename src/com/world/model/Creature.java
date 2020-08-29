package com.world.model;

/**
 * 生物
 */
public class Creature {

  /** 名前 */
  protected String name;

  /**
   * コンストラクタ
   * 
   * @param name 名前
   */
  public Creature(String name) {
    this.name = name;
  }

  /**
   * 表現する
   * 
   * @param expression 表現
   */
  protected void express(String expression) {
    System.out.println(this.name + " : " + expression);
  }
}