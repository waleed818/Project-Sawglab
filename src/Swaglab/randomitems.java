package Swaglab;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class randomitems {

	WebDriver driver = new EdgeDriver();

	@BeforeTest
	public void geturl() {

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
      @Test(priority = 1)
	public void loginnormaluser() {
		// String theUserName = standard_user;
		// String Pss = secret_sauce;
		// login

		// Login information that needs to be completed(Element)
		WebElement Username = driver.findElement(By.id("user-name"));
		WebElement pass = driver.findElement(By.id("password"));
		WebElement loginbutton = driver.findElement(By.id("login-button"));

		// The information that must be entered(Actions)
		Username.sendKeys("standard_user");
		pass.sendKeys("secret_sauce");
		loginbutton.click();

	}
     @Test (priority = 2,enabled = false)
	public void randomitems () {
		
    	 Random rand = new Random();
    	 
    	 int randomitem = rand.nextInt(6);
    	 int randomitem2 ;
    	 
    	 if (randomitem==5) {
    		 
    		 randomitem2= randomitem-1;
    		 
    	 }
    	 
    	 else {
    		 
    		 randomitem2= randomitem+1;
    		 
    	 }
    	 
    	 List <WebElement> addtocart = driver.findElements(By.className("btn"));
         List <WebElement> nameitem = driver.findElements(By.className("inventory_item_name"));
    	 
    	 
    	 addtocart.get(randomitem).click();
    	 addtocart.get(randomitem2).click();
    	 
         System.out.println(nameitem.get(randomitem).getText()+ "has been added" + "name items" +(randomitem));    	
    
	}
               
     
     @Test (priority = 2)
     
     public void threerandom () {
    	 
    	 Random rand = new Random();
    	 
    	 int random =  rand.nextInt(2); // راح يضيف عنصر 0 و 1 
    	 int random2 = rand.nextInt(2,4); //راح يضيف عنصر 2 او 3
    	 int random3 = rand.nextInt(4,6); // راح يضيف عنصر 4 او 5
    	 
    	
    		 
    	 
    	 
    	 
    	List <WebElement> addtocart = driver.findElements(By.className("btn"));
    	 
    	 addtocart.get(random).click();
    	 addtocart.get(random2).click();
    	 addtocart.get(random3).click();
    	 
   
 
     
 
     }








}






