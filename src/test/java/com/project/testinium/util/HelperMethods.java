package com.project.testinium.util;

import com.project.testinium.base.BaseTest;
import com.sun.xml.internal.messaging.saaj.util.transform.EfficientStreamingTransformer;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;
import java.util.Random;

public class HelperMethods extends BaseTest {

    public  WebElement findToElement(String key) {

        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(key)));
        WebElement element = driver.findElement(By.cssSelector(key));

        return element;
    }


    public void hoverToElement(String key){

        Actions actions = new Actions(driver);
        actions.moveToElement(findToElement(key)).build().perform();

    }

    public void clickToElement(String key){
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(findToElement(key)));
        findToElement(key).click();
    }

    public void sendToKeys(String key, String text){
        findToElement(key).sendKeys(text);
    }

    public String getTextToElement(String key){

        String elementText= "";

            elementText =findToElement(key).getText();
            return elementText;

    }

    public void getTextControl(String key, String text) {

        try {
            Assert.assertEquals("Elementin Texti Doğru..",getTextToElement(key), text);
        } catch (Exception e) {
            {
              Assert.fail("Element ve Text Uyuşmuyor");

            }
        }
    }

    public List<WebElement> findToElements(String key){

        List<WebElement> elements = driver.findElements(By.cssSelector(key));
        return elements;
    }


  /*  public void  randomClickElement(String key) {

       List<WebElement> elements = findToElements(key);
         Random r = new Random();
         int i =0;
        int  i = r.nextInt(elements.size());
         elements.get(i).click();
    }*/
}
