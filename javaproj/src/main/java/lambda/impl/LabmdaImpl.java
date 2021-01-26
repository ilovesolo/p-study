package lambda.impl;

import lambda.interf.InterFaceVoid1param;
import lambda.interf.InterfaceReturn1param;

import java.util.Optional;
import java.util.function.Consumer;

public class LabmdaImpl {
    public static void main(String[] args) {
        InterFaceVoid1param ifvp = new InterFaceVoid1param() {
            @Override
            public void plus(int a) {
                System.out.println("a = " + a);
            }
        };
        ifvp.plus(10);

        InterFaceVoid1param ifvp1 = x -> System.out.println("x = " + x);
        ifvp1.plus(5);

        InterfaceReturn1param ifvp2 = x -> change(x);
        System.out.println("ifvp2 = " + ifvp2.plus(55));

        // 方法的引用
        InterfaceReturn1param ifvp3 = LabmdaImpl::change;
        System.out.println("ifvp3 = " + ifvp3.plus(11));
    }

    private static int change(int a) {
        return a * 3;
    }
}
