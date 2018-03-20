package com.quark.design.model.iteratorModel;

/**
 * Created by 311198 on 2017/2/13.
 */
public class MyCollection implements Collection {

    public Object[] ob;

    public MyCollection(Object[] ob) {
        this.ob = ob;
    }

    public Iterator Iterator() {
        return new MyIterator(this);
    }

    public Object get(int i) {
        return ob[i];
    }

    public int size() {
        return ob.length;
    }
}
