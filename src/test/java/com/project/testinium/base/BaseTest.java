package com.project.testinium.base;

import com.thoughtworks.gauge.AfterSpec;
import com.thoughtworks.gauge.BeforeSpec;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseTest {

  public static WebDriver driver;


  public String baseUrl = "https://www.hepsiburada.com/";



  @BeforeSpec
    public void setUp(){

    System.setProperty("webdriver.chromedriver.driver", "driver/chromedriver.exe");

    /*ChromeOptions options = new ChromeOptions();
    options.addArguments("start-maximized");
    options.addArguments("disable-popup-blocking"); */

    driver = new ChromeDriver();

    // setDriver(new ChromeDriver(options));
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get(baseUrl);
  }



  @AfterSpec
  public void tearDown() throws Exception{
   driver.quit();
  }


}
