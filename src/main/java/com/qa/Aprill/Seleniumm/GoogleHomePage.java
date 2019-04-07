package com.qa.Aprill.Seleniumm;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class GoogleHomePage {
	public WebDriver driver;

	public GoogleHomePage(WebDriver driver){
		super();
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

    @FindBy(name="q")
    private WebElement textbox;
    
  
    @FindBy(css="ul.erkvQe>li:nth-child(1)")
    private WebElement listitem;
    
    @FindBy(name="btnK")
    private WebElement buttonOk;
   
    
    public boolean entertext(String textToEnter) throws InterruptedException{
    	try{
    		textbox.sendKeys(textToEnter);
    		
    		Thread.sleep(5000);
    		Reporter.log("Text Entered in textbox");
    		return true;
    		
    	}catch(ElementNotVisibleException e){
    		return false;		
    	}
    }
    
    public boolean selectListItem() throws InterruptedException{
    	try{
    		listitem.click();
    		Thread.sleep(2000);
    		Reporter.log("list item selected");
    		return true;
    	}catch(ElementNotVisibleException e){
    		return false;
    	}
    }
    
    public boolean clickSearch() throws InterruptedException{
    	try{
    		buttonOk.click();
    		Thread.sleep(5000);
    		Reporter.log("Google Search button clicked");
    		return true;
    	}catch(ElementNotVisibleException e){
    		return false;
    	}
    }

}
