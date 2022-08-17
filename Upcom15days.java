package DashBoardPac;

import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upcom15days {
	static Logger log = LogManager.getLogger(Upcom15days.class);
	@Test(priority=2)
	public void Upcommingexam15days(Method method) throws InterruptedException {
		 System.out.println("\n Welcome \n");
	     log.info("=============Automate Testing============ ");
	     Reporter.log( "=============Automate Testing Start============", true );

	     WebDriverManager.chromedriver().setup();
		    ChromeDriver driver = new ChromeDriver();
		    log.info("=============Test name============: " + method.getName());  
		    Reporter.log( "=============Test name=======:"+method.getName(), true );

		    log.info("Launching chrome browser");
		    Reporter.log("Launching chrome browser");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.get("https://sp-jain-stg-adminportal.ken42.com/\\r\\n");
			log.info("Launching the FrontEnd portal");
			Reporter.log( "Launching the FrontEnd portal", true );

			driver.manage().window().maximize();
			log.info("Maximize the Browser");
			Reporter.log( "Maximize the Browser", true );

			 driver.findElement(By.xpath("//span[.='Sign In']")).click();
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/button")).click();
	     	Thread.sleep(1000);
	         driver.findElement(By.xpath("//span[.='Exam Management']")).click();
	         Thread.sleep(1000);
	         driver.findElement(By.xpath("//span[.='Dashboard']")).click();
	         Thread.sleep(2000);
	 		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/button[1]/span[1]")).click();
	 		Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/button[2]/span[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/p/div[1]/div[3]/div[2]/div/div[2]/div")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/header[1]/div/div/button/span[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[1]/span[1]/p")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[normalize-space()='Dashboard']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/button[3]/span[1]")).click();
			Thread.sleep(2000);
	        driver.navigate().back();
	         driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div[2]/div/div[1]/div[3]/button")).click();
	         Thread.sleep(3000);
	         List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[3]/div/div[2]/div/table/tbody/tr"));
	         System.out.println("The number of Record  is from Portal on 15 days Filletr "+ row.size());
	         log.info("The number of Record  is from Portal on 15 days Filletr "+ row.size());
	         driver.get("https://workbench.developerforce.com/login.php?startUrl=%2FrestExplorer.php");
	 		log.info("Launching the WorkBench URL");
	 		Reporter.log("Launching the WorkBench URL",true);
	 		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/p[1]/select")).click();
	 		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/p[1]/select/option[2]")).click();
	 		driver.findElement(By.id("termsAccepted")).click();
	 		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[5]/div[2]/input")).click();
	 		log.info("Login to the WorkBench");
	 		Reporter.log("Login to the WorkBench",true);
	 		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]")).sendKeys(" implementations@ken42.spj.staging");
	 			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[2]")).sendKeys("Test@12345");
	 			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[3]")).click();
	 			log.info("Connect Workbench & salesforce integrate");
	 			Reporter.log("Connect Workbench & salesforce integrate",true);
	 			 WebElement l = driver.findElement(By.id("urlInput"));
	 			l.sendKeys("/services/data/v54.0");
	 			l.clear();
	 			Thread.sleep(2000);
	 			log.info("Clear the Extra API On the URI ");
	 			Reporter.log("Clear the Extra API On the URI ",true);
	 			 driver.findElement(By.xpath("/html/body/div[2]/form/input[2]")).sendKeys("/services/apexrest/ExamData/?completedIn=15");
	 			  log.info("on the api Testing Here We fillter the Exam Complete the 15 days");
	 			 Reporter.log("on the api Testing Here We fillter the Exam Complete the 15 days ",true);
	 				driver.findElement(By.xpath("/html/body/div[2]/form/input[3]")).click();
	 				
	 				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/ul/li[1]")).click();
	 				Thread.sleep(10000);
	 				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/a[3]")).click();
	 				log.info("To show the Response came from Salesforce & the record count 15");
	 				 Reporter.log("To show the Response came from Salesforce & the record count 15 ",true);
	 				log.info("======================RESPONSE FROM THE API====================");
	 				 Reporter.log("======================RESPONSE FROM THE API==================== ",true);
	 			
	                log.info("=============Completed===============");
	                Reporter.log( "=============Completed===============", true );
	                driver.close();
	}
}
