package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver = new FirefoxDriver();
	
  @Test
  public void f() throws FileNotFoundException, IOException {
	  Properties p = new Properties();
		p.load( new FileInputStream("D:\\sandeep\\sandeep\\TestNGassig\\san.properties"));
		driver.get( p.getProperty( "url"));
		driver.manage().window().maximize();
	  List<WebElement> em = driver.findElements( By.id( p.getProperty( "e")));
		if(em.size()==0){
			Assert.fail( "Text field not found");
		}else{
			em.get( 0).sendKeys( p.getProperty( "ee"));
			System.out.println(p.getProperty( "ee"));
		}
		
		//Firstname
		List<WebElement> first = driver.findElements( By.name(p.getProperty( "fn")));
		if(first.size()==0){
			Assert.fail("Please enter first name");
		}else{
			first.get( 0).sendKeys( p.getProperty( "fn1"));
			System.out.println(p.getProperty( "fn1"));
		}
		
		//LastName
		List<WebElement> lastname = driver.findElements( By.name( p.getProperty( "ln")));
		if(lastname.size()==0){
			Assert.fail( "Last name field was empty");
		}else{
			lastname.get( 0).sendKeys( p.getProperty("ln1"));
			System.out.println(p.getProperty( "ln1"));
		}
		
		//username
		List<WebElement> u = driver.findElements( By.name( p.getProperty( "un")));
		if(u.size()==0){
			Assert.fail( "Usrname already exists");
		}else{
			u.get( 0).sendKeys( p.getProperty( "un1"));
			System.out.println(p.getProperty( "un1"));
		}
		//passwd
		
				List<WebElement> pwd = driver.findElements( By.name( p.getProperty( "p")));
				if(pwd.size()==0){
					Assert.fail( "Password filed is left empty");
				}else{
					pwd.get( 0).sendKeys( p.getProperty( "p1"));
					System.out.println(p.getProperty( "Pre entered password is " + "p1"));
				}
				//pass temp
				
				List<WebElement> ptemp = driver.findElements( By.name( p.getProperty( "pt")));
				if(ptemp.size()==0){
					Assert.fail( "Password filed is left empty");
				}else{
					ptemp.get( 0).sendKeys( p.getProperty( "pt1"));
					System.out.println(p.getProperty( "Temporary password is" + "pt1"));
				}
				
		
  }
}

		
		
	
	
