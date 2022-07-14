package SmokeTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class SecondTest {

	 WebDriver driver= null;
     @Before
     public void beforeTest(){
        // System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
         //driver= new ChromeDriver();
    	 driver= new HtmlUnitDriver();
     }

     @After
     public  void afterTesr(){
         System.out.println("After test");

     }

     @Test
     public void test1(){
         driver.get("https://www.selenium.dev/downloads/");
       driver.findElement(By.xpath("//a[text()='Travel The World']")).getText().equals("Travel The World");
        driver.close();
     }
  
     @Test
	public void test2() {
		 driver.get("https://blazedemo.com/");
		 driver.close();
		
	}
	
	
}
