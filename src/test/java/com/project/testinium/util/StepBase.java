package com.project.testinium.util;

import com.thoughtworks.gauge.Step;

public class StepBase extends HelperMethods{

    @Step("<second> saniye bekle")
    public void waitElement(int second) throws InterruptedException{
        Thread.sleep(second + 10000);
    }

    @Step("Css <key> elementinin üzerine gel")
    public void hover1(String key){
        hoverToElement(key);
    }

    @Step("Css <key> elementine tıkla")
    public void clickelement(String key){
        clickToElement(key);
    }


    @Step("Css <key> elementini bul ve <text> değerini yaz")
    public void sendkey(String key, String text){
        sendToKeys(key,text);
    }

}

