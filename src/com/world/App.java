package com.world;

import com.world.model.Japanese;
import com.world.model.Weirdo;

public class App {
    public static void main(String[] args) throws Exception {

        // 登場人物
        Japanese taro = new Japanese("太郎");
        Japanese hanako = new Japanese("花子");
        Weirdo x2020 = new Weirdo("X-2020");
        Weirdo x2021 = new Weirdo("X-2021");

        // あいさつ
        taro.greet();
        hanako.greet();
        x2020.greet();
        x2021.greet();

        // 太郎の発言
        taro.think("最近どう？");
        taro.tell();

        // 花子の発言
        hanako.think("元気よ");
        hanako.tell();

        // "X-2020"が思う
        x2020.telepathy("お腹すいた");
        // "X-2021"が感じる
        x2021.feel();
    }
}
