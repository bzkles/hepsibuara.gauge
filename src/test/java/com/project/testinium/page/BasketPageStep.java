package com.project.testinium.page;

import com.project.testinium.util.StepBase;
import com.thoughtworks.gauge.Step;

public class BasketPageStep extends StepBase {

    @Step("Css i <key> olan element ile sepetteki ürün sayısını kontrol et")
    public void sepetTutarControl(String key){

        try{
            getTextToElement(key);
            //
           System.out.println(" Sepette " + getTextToElement(key)+ " adet urun var ");
        }catch (Exception e){
            //
            System.out.println("Sepet kontrolu basarısız");
        }

    }

    /*@Step("<key> li elementteki ürünsayisi ile <key1> deki elementte yazan <text> ile mantıklı mı")
    public void sepetTutarControl(String key , String key1, String text){


            String urunsayisi = getTextToElement(key);
            String bossepettext = getTextToElement(key1);
            if(urunsayisi == '0' bossepettext== text){
                System.out.println("Bos sepet kontrolu basarili");
            }else{
                System.out.println("Sepet gostergeleri sorunlu");
            }

    }*/
}
