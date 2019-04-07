package com.qa.Aprill.Seleniumm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Testclass {

	//WebDriver driver;
	@Test
	//public static void main(String[] args) throws InterruptedException{
	public void f1() throws InterruptedException{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseUrl = "http://google.com";
        driver.get(baseUrl);
        Thread.sleep(5000);
        GoogleHomePage testpage=new GoogleHomePage(driver);
        Assert.assertTrue(testpage.entertext("Selenium"),"Entering text to search");
        Assert.assertTrue(testpage.selectListItem(), "Selecting item from suggestions list");
        /**
         * If you select something from suggestion list, you do not need to press search button, try it manually
         */
        //Assert.assertTrue(testpage.clickSearch(), "Clicking on Google Search");
        System.out.println("Success");
        driver.close();
        }
}
