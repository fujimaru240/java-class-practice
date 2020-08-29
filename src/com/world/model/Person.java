package com.world.model;

import com.world.constant.Word;
import com.world.utils.TimeUtil;
import com.world.words.Language;

/**
 * 人間
 */
public abstract class Person extends Creature {
  /** 表現 睡眠 */
  private static final String EXPRESSION_SLEEP = "Zzz..";

  protected Language lang;
  protected String message;

  /**
   * コンストラクタ
   * 
   * @param name 名前
   */
  public Person(String name) {
    super(name);
    this.initialize();
  }

  /**
   * 初期化する.
   */
  public void initialize() {
    this.lang = new Language();

    inputLanguage();
  }

  /**
   * 言語をインプットする
   */
  public abstract void inputLanguage();

  /**
   * 挨拶する
   */
  public void greet() {
    switch (TimeUtil.getCurrentTimeFrame()) {
      case Morning:
        this.express(this.lang.getGreeting(Word.GREETING_MORNING));
        break;
      case Daytime:
        this.express(this.lang.getGreeting(Word.GREETING_DAYTIME));
        break;
      case Evening:
        this.express(this.lang.getGreeting(Word.GREETING_EVENING));
        break;
      case Night:
        this.express(this.lang.getGreeting(Word.GREETING_NIGHT));    
        break;
      default:
        this.express(EXPRESSION_SLEEP);
        break;
    }
  }

  /**
   * 思う
   * 
   * @param thinking 思考
   */
  public void think(String thinking) {
    this.message = thinking;
  }

  /**
   * 伝える
   */
  public void tell() {
    switch (TimeUtil.getCurrentTimeFrame()) {
      case Night:
      case SleepTime:
        this.express(EXPRESSION_SLEEP);
        break;
      default:
        this.express(this.message);
        break;
    }
  }
}