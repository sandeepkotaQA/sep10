package tests;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest1 {
	WebDriver driver;

  @Test
 
	  public void test() throws BiffException, IOException {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			File fi = new File("D:\\sandeep\\sandeep\\TestNGassig\\MonsterExcelFile.xls");
			Workbook w = Workbook.getWorkbook( fi);
			Sheet sh = w.getSheet( 1);
			
			
			int rows = sh.getRows();
		    System.out.println(sh.getColumns());
		    System.out.println(sh.getRows());
			
				for(int row = 1;row < rows;row++) 
			{
					int col = 0;
					driver.get(sh.getCell(col, row).getContents());
					
					List<WebElement> email = driver.findElements(By.id("email"));
					
					if(email.size()==0){
						Assert.fail("Email field is missing");
					}else{
						System.out.println("Email field is present");
					}
					email.get(0).sendKeys(sh.getCell(++col, row).getContents());
					System.out.println("Entered email is" + sh.getCell(col, row).getContents());
					
			
					
					
					
				//First name 
					List<WebElement> firstname = driver.findElements(By.name("firstName"));
					if(firstname.size()==0){
						Assert.fail("First name field is missing");
					}else{
						System.out.println("First name field is present");
					}
					firstname.get(0).sendKeys(sh.getCell(++col, row).getContents());
					System.out.println("Entered First name is " + sh.getCell(col, row).getContents());
					
					
					
					List<WebElement> lname =  driver.findElements(By.name("lastName"));
					
					if(lname.size()==0){
						
						Assert.fail("Text field not found");
					
					}else{
						System.out.println("Last name field is present");
					}
					lname.get(0).sendKeys( sh.getCell(++col, row).getContents());
					System.out.println("Entered last name is" + sh.getCell(col, row).getContents());
					
					
					List<WebElement> usern =  driver.findElements(By.name("userName"));
					
					if(usern.size()==0){
						
						Assert.fail("User name field not found");
					
					}else{
						
						System.out.println("User name field is present");
					}
					
					usern.get(0).sendKeys( sh.getCell(++col, row).getContents());
					System.out.println("Entered username is" + sh.getCell(col, row).getContents());
					
					
					
					
					List<WebElement> pwd =  driver.findElements(By.name("passwd"));
					
					if(pwd.size()==0){
						
						Assert.fail("Password field not found");
					
					}else{
						
						System.out.println("PW field is present");
					}
					pwd.get(0).sendKeys("Entered password is" + sh.getCell(++col, row).getContents() );
					
					
					List<WebElement> passwd2 =  driver.findElements(By.name("passwd_temp"));
					
					if(passwd2.size()==0){
						
						Assert.fail("Password field not found");
					
					}else{
						System.out.println("Password field is present");
					}
						passwd2.get(0).sendKeys(sh.getCell(++col, row).getContents() );
						System.out.println("entered temporary password is" + sh.getCell(++col, row).getContents());
					
					
						//Nationality
					driver.findElement( By.id( "nationalityButton")).click();
					List<WebElement> nationality = driver.findElement( By.className( "selectionMenu")).findElements( By.tagName( "a"));
				     if(nationality.size()==0){
						Assert.fail("No elements Found In Nationality");
					}else{
					System.out.println(nationality.size());
					}	
					
					Random rr = new Random();
					int i = rr.nextInt(nationality.size());
					System.out.println( "Selected Nationality is" + nationality.get(i).getText());
					nationality.get(i).click();
					
					
					//Location
					driver.findElement( By.id( "currentlocButton")).click();
					List<WebElement> location = driver.findElement( By.id( "currentlocSelectionMenu")).findElements( By.tagName( "a"));
					if(location.size()==0){
						Assert.fail("No elements Found In Location");
					}else{
					System.out.println(location.size());
					}
						
						Random ll = new Random();
						int j = ll.nextInt(location.size());
						System.out.println( "Selected location is " + location.get(j).getText());
						location.get(j).click();
						
						driver.findElement( By.id( "mobile2")).sendKeys( "9000888281");
						
						//Gender
						
						List<WebElement> gender = driver.findElement( By.id( "gender_border")).findElements( By.tagName( "input"));
						
						if(gender.size()==0){
							Assert.fail("No elements Found In Location");
						}else{
						System.out.println(gender.size());
						}
							
							Random gg = new Random();
							int k = gg.nextInt(gender.size());
							System.out.println( "Selected gender is " + gender.get(k).getAttribute( "value"));
							gender.get(k).click();
						
				//JobType
							driver.findElement( By.id( "jobTypeButton")).click();
							List<WebElement> jobtype = driver.findElement(By.id("divjobType")).findElements(By.cssSelector("div.heading_4"));
			                 //System.out.println( jobtype.size());
							if(jobtype.size()==0){
								Assert.fail("No elements Found In Location");
							}else{
							System.out.println(jobtype.size());
							}
							
							Random jj = new Random();
							
							int l = jj.nextInt(jobtype.size());
							System.out.println( "Selected jobtype is " + jobtype.get(l).getText());
							jobtype.get(l).click();
							
				//years 1st box
							driver.findElement( By.id( "exp_in_yearsButton")).click();
							List<WebElement> years = driver.findElement(By.id("exp_in_yearsSelectionMenu")).findElements(By.cssSelector("a.txt_black.heading_4"));
							if(years.size()==0){
								Assert.fail("No elements Found In year");
							}else
							{
							System.out.println(years.size());
							}
			                //System.out.println( years.size());
							
							Random kk = new Random();
							int m = kk.nextInt(years.size());
							System.out.println( "Total experience in years " + years.get(m).getText());
							years.get(m).click();
							
						   //Months
							driver.findElement( By.id( "exp_in_monthsButton")).click();
							List<WebElement> months = driver.findElement(By.id("exp_in_monthsSelectionMenu")).findElements(By.cssSelector("a.txt_black.heading_4"));
			                //System.out.println( months.size());
							if(months.size()==0){
								Assert.fail("No elements Found In months");
							}else
							{
							//System.out.println(months.size());
							}	
							
							Random  aa = new Random();
							
							int o = aa.nextInt(months.size());
							System.out.println( "Total experience in months " + months.get(o).getText());
							months.get(o).click();
							
							
							List<WebElement> industry = driver.findElement(By.id("industrySelectionMenu")).findElements(By.tagName("tr"));
							driver.findElement(By.xpath(".//*[@id='industryButton']/span/button")).click();
							if(industry.size()==0){
								Assert.fail("No elements Found In industry");
							}else
							{
							System.out.println( "Total number of elements in industry" +"=="+  industry.size());
							}	
							
							Random f = new Random();
							int b = f.nextInt(industry.size());
							System.out.println("Randomly selected industry is : " +  b  + " - " +  industry.get(b).getText() );
							industry.get(b).click();
							
							driver.findElement(By.id("catButton")).click();
							List<WebElement> function = driver.findElement(By.id("catSelectionMenu")).findElements(By.tagName("td"));
							
							if(function.size()==0){
								Assert.fail("No elements Found In function");
							}else
							{
							System.out.println("Total number of elements in function tab are " +"==" + function.size());
							}	
							
							
							Random g = new Random();
							int e = g.nextInt(function.size());
							
							System.out.println("Randomly selected function is : " +  e  + " - " +  function.get(e).getText() );
							function.get(e).click();
							
							driver.findElement(By.id("keySkills")).sendKeys(sh.getCell(++col, row).getContents());
							
							//Upload your recent resume by clicking on upload button
							
							//driver.findElement(By.xpath("html/body/form/table/tbody/tr/td/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[23]/td[2]/input")).sendKeys(sh.getCell(++col, row).getContents());
						    //driver.findElement(By.id("wordresume")).sendKeys(sh.getCell(++col, row).getContents());
						    System.out.println("===============================================================================");
						    System.out.println("===============================================================================");
						    System.out.println("===============================================================================");
						    System.out.println("===============================================================================");
							
							
							
							
						
			}
  }
}
