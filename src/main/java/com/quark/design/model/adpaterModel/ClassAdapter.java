package com.quark.design.model.adpaterModel;

/**
 * Created by 311198 on 2017/2/8.
 * 类适配器
 */
public class ClassAdapter extends Source implements Targetable {
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
