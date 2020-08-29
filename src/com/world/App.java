package com.world;

import com.world.model.Japanese;
import com.world.model.Weirdo;

public class App {
    public static void main(String[] args) throws Exception {

        Japanese taro = new Japanese("太郎");
        Japanese hanako = new Japanese("花子");
        Weirdo x2020 = new Weirdo("X-2020");
        Weirdo x2021 = new Weirdo("X-2021");

        taro.greet();
        hanako.greet();
        x2020.greet();

        x2020.telepathy("お腹すいた");
        x2021.feel();
    }
}
