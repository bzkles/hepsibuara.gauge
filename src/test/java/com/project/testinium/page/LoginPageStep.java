package com.project.testinium.page;

import com.project.testinium.util.StepBase;
import com.thoughtworks.gauge.Step;

public class LoginPageStep extends StepBase {

        @Step("<key> elementi ile kullanıcı adı <text> uyusuyor mu kontrol et")
        public void loginControl(String key, String text){
            try{
                getTextControl(key,text);
                // it will be log
                System.out.println("login Kontrolu Basarili");

            }catch (Exception e){
                //it will be log
                System.out.println("Login Kontrolu Basarisiz");
            }
        }
    }

