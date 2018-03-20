package com.quark.design.model.VisitorModel;

/**
 * Created by 311198 on 2017/2/14.
 */
public class MySubject implements Subject {

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getSubject() {
        return "love";
    }
}
