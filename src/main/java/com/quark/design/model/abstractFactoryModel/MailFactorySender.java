package com.quark.design.model.abstractFactoryModel;


import com.quark.design.model.MailSender;
import com.quark.design.model.Sender;

/**
 * Created by 311198 on 2017/2/7.
 * 抽象工厂类
 */
public class MailFactorySender  implements Provider {

    public Sender produce() {
        return new MailSender();
    }
}
