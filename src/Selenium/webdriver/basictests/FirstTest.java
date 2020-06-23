package Selenium.webdriver.basictests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.chrome.*;
public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
 //    System.setProperty("webdriver.firefox.marionette", " E:\\folder\\geckodriver-v0.26.0-win64\\geckodriver.exe");
     System.setProperty("webdriver.chrome.driver", " E:\\folder\\chromedriver_win32\\chromedriver.exe");
// Initialize browser
    //  WebDriver driver=new FirefoxDriver();
      WebDriver driver=new ChromeDriver();
// Open facebook
     driver.get("http://www.facebook.com");
 
// Maximize browser
 
driver.manage().window().maximize();
 
}
}
 