package com.example.pcamacho.ejercicioadapter;

/**
 * Created by UTNG on 18/09/2017.
 */

public class TurkeyAdapter implements Duck {
    Turkey turkey;//pavo
    public TurkeyAdapter(Turkey turkey){
        this.turkey=turkey;
    }

    @Override
    public String quack() {
        return turkey.gobble();
    }

    @Override
    public String fly() {
        return turkey.fly();
    }
}
