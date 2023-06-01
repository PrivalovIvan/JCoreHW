package ru.gb.jcore.sample;

import ru.gb.jcore.regular.*;

public class Main {
    public static void main(String[] args) {
        int res = OtherClass.add(2, 2);
        System.out.println(Decorate.decorate(res));
        res = OtherClass.div(2, 2);
        System.out.println(Decorate.decorate(res));
        res = OtherClass.mult(2, 2);
        System.out.println(Decorate.decorate(res));
        res = OtherClass.sub(2, 2);
        System.out.println(Decorate.decorate(res));
    }

}
