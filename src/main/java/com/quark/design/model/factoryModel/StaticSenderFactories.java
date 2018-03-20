package com.quark.design.model.factoryModel;


import com.quark.design.model.MailSender;
import com.quark.design.model.Sender;
import com.quark.design.model.SmsSender;

/**
 * Created by 311198 on 2017/2/7.
 */
public class StaticSenderFactories {

    public static Sender mailSender(){
        return new MailSender();
    }

    public  static Sender smsSender(){
        return new SmsSender();
    }
}
