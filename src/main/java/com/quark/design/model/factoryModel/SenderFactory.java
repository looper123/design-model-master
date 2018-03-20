package com.quark.design.model.factoryModel;

import com.quark.design.model.MailSender;
import com.quark.design.model.Sender;
import com.quark.design.model.SmsSender;

/**
 * Created by 311198 on 2017/2/7.
 * 普通工厂类（单工厂）
 */
public class SenderFactory {

    public Sender produce(String type){
        if(type.equals("mail")){
            return new MailSender();
        }else if (type.equals("sms")){
            return new SmsSender();
        }else {
            return null;
        }
    }
}
