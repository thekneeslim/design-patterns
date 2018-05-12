package com.my.experiments;

import com.my.experiments.model.User;
import com.my.experiments.power.Haduken;
import com.my.experiments.power.Jump;

public class StrategyPatternApplication {

    public static void main(String[] args) {
        User mario = new User("Mario", "I eat mushrooms!", 21, new Jump());

        mario.introduction();
        mario.setSuperPower(new Haduken());
        mario.executePower();
    }
}
