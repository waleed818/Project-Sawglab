package Swaglab;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Waleedtest {
	
	WebDriver driver = new EdgeDriver();

	@BeforeTest
	public void url () {
	
		
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//find url 
       
		driver.get("https://www.saucedemo.com/");
	
		
	}
	
	@Test (priority = 1)
	public void loginnormaluser () {
		//String theUserName = standard_user;
		//String Pss = secret_sauce;
		//login
		
		//Login information that needs to be completed(Element)
		WebElement Username = driver.findElement(By.id("user-name")); 
		WebElement pass = driver.findElement(By.id("password"));
		WebElement loginbutton = driver.findElement(By.id("login-button"));
		
		//The information that must be entered(Actions)
		Username.sendKeys("standard_user");
		pass.sendKeys("secret_sauce");
		loginbutton.click();
		
		// add item
		
		//The selected item
		WebElement additem = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		
		// click the item
		additem.click();
		
	}
	
	
	@Test (priority = 2)
	
	public void Checkout () {
		
		//Payment Process Steps
		
		//click the cart bottom 
    WebElement cartbottom =  driver.findElement(By.className("shopping_cart_link")) ;
     cartbottom .click(); 
     
	//driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
        
		// click to the checkoutbottom 
        WebElement checkoutbottom = driver.findElement(By.id("checkout")) ;
        checkoutbottom.click();
        
        //data need to be completed  to checkout (Element)
        WebElement firstname = driver.findElement(By.id("first-name")) ;
        WebElement lastname = driver.findElement(By.id("last-name"));
        WebElement postalcode = driver.findElement(By.id("postal-code"));
        WebElement continuebottom = driver.findElement(By.id("continue")) ;
        
        
        // The entered data
        firstname.sendKeys("waleed");
        lastname.sendKeys("nasser");
        postalcode.sendKeys("2000");
        continuebottom.click();
		
        //Click the finishbottom 
        WebElement finishbottom = driver.findElement(By.id("finish"));
        finishbottom.click();
		
        //click the Backhomecbotton
        WebElement Backhome = driver.findElement(By.id("back-to-products"));
        Backhome.click();
       
	}	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


