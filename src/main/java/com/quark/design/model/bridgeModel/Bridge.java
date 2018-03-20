package com.quark.design.model.bridgeModel;

/**
 * Created by 311198 on 2017/2/9.
 * 桥接模式  桥接类 获取resourceable实例
 * 将抽象化与实现化解耦，使得二者可以独立变化，
 * 像我们常用的JDBC桥DriverManager一样，JDBC进行连接数据库的时候，
 * 在各个数据库之间进行切换，基本不需要动太多的代码，甚至丝毫不用动，
 * 原因就是JDBC提供统一接口，
 * 每个数据库提供各自的实现，用一个叫做数据库驱动的程序来桥接就行了
 */
public class Bridge  {

    private Resourceable resourceable;

    public  void resourceable(){
        resourceable.method();
    }

    public Resourceable getResourceable() {
        return resourceable;
    }

    public void setResourceable(Resourceable resourceable) {
        this.resourceable = resourceable;
    }
}
