package QuestionPaper;

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
public class QuestionPaperFilterByTerm {
	static Logger log = LogManager.getLogger(QuestionPaperFilterByTerm.class);
	@Test(priority=2)
	public void QuestionPapers(Method method) throws InterruptedException {
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
	         driver.findElement(By.xpath("//span[.='Question Paper']")).click();
	         
	         Thread.sleep(3000);
	         List<WebElement> row = driver.findElements(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div[2]/div//table//tbody/tr"));
	         System.out.println("The number of record from Question paper Which Status Was Approved  "+ row.size());
	         log.info("The number of record from Question paper Which Status Was Approved "+ row.size());
	         Reporter.log("The number of record from Question paper Which Status Was Approved "+ row.size(),true);
	         
	         driver.get("https://workbench.developerforce.com/login.php?startUrl=%2FrestExplorer.php");
		 		log.info("Launching the WorkBench URL");
		 		Reporter.log("Launching the WorkBench URL",true);
		 		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/p[1]/select")).click();
		 		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/p[1]/select/option[2]")).click();
		 		driver.findElement(By.id("termsAccepted")).click();
		 		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[5]/div[2]/input")).click();
		 		log.info("Login to the WorkBench");
		 		Reporter.log("Login to the WorkBench",true);
		 		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]")).sendKeys("implementations@ken42.spj.staging");
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
		 			
		 			 driver.findElement(By.xpath("/html/body/div[2]/form/input[2]")).sendKeys("/services/apexrest/QuestionPaper/?term=2022-JAN-BBA-Term2-Singapore");
		 			  log.info("on the api Testing Here We fillter The Question paper Course");
		 			 Reporter.log("on the api Testing Here We fillter The Question paper Course  ",true);
		 				driver.findElement(By.xpath("/html/body/div[2]/form/input[3]")).click();
		 			   
		 				
		 				Thread.sleep(3000);
		 				log.info("To show the Response came from Salesforce & the record count 3");
		 				 Reporter.log("To show the Response came from Salesforce & the record count 3 ",true);
		 				log.info("======================RESPONSE FROM THE API====================");
		 				 Reporter.log("======================RESPONSE FROM THE API==================== ",true);
		 				 log.info("[\r\n"
		 				 		+ "  {\r\n"
		 				 		+ "    \"url\": \"https://ken426--staging.my.salesforce.com/a131y0000008GluAAE\",\r\n"
		 				 		+ "    \"term\": \"2022-JAN-BBA-Term2-Singapore\",\r\n"
		 				 		+ "    \"status\": \"Approved\",\r\n"
		 				 		+ "    \"setTwoStatus\": \"Under review\",\r\n"
		 				 		+ "    \"setOneStatus\": \"Under review\",\r\n"
		 				 		+ "    \"id\": \"a131y0000008GluAAE\",\r\n"
		 				 		+ "    \"facultyEmail\": \"anand.rathi@ken42.com\",\r\n"
		 				 		+ "    \"faculty\": \"Anand Rathi\",\r\n"
		 				 		+ "    \"examCycle\": \"Oct-22\",\r\n"
		 				 		+ "    \"courseName\": \"BBAECO103-Macroeconomics\",\r\n"
		 				 		+ "    \"batch\": \"2022\"\r\n"
		 				 		+ "  },\r\n"
		 				 		+ "  {\r\n"
		 				 		+ "    \"url\": \"https://ken426--staging.my.salesforce.com/a131y000001IHcrAAG\",\r\n"
		 				 		+ "    \"term\": \"2022-JAN-BBA-Term2-Singapore\",\r\n"
		 				 		+ "    \"status\": \"Request Sent\",\r\n"
		 				 		+ "    \"setTwoStatus\": \"Under review\",\r\n"
		 				 		+ "    \"setOneStatus\": \"Under review\",\r\n"
		 				 		+ "    \"id\": \"a131y000001IHcrAAG\",\r\n"
		 				 		+ "    \"facultyEmail\": \"mantraraj@turbostart.co\",\r\n"
		 				 		+ "    \"faculty\": \"Jasprit Bumrah\",\r\n"
		 				 		+ "    \"examCycle\": \"Oct-22\",\r\n"
		 				 		+ "    \"courseName\": \"BBAECO103-Macroeconomics\",\r\n"
		 				 		+ "    \"batch\": \"2022\"\r\n"
		 				 		+ "  },\r\n"
		 				 		+ "  {\r\n"
		 				 		+ "    \"url\": \"https://ken426--staging.my.salesforce.com/a131y000001IHcmAAG\",\r\n"
		 				 		+ "    \"term\": \"2022-JAN-BBA-Term2-Singapore\",\r\n"
		 				 		+ "    \"status\": \"Request Sent\",\r\n"
		 				 		+ "    \"setTwoStatus\": \"Request Sent\",\r\n"
		 				 		+ "    \"setOneStatus\": \"Request Sent\",\r\n"
		 				 		+ "    \"id\": \"a131y000001IHcmAAG\",\r\n"
		 				 		+ "    \"facultyEmail\": \"mantraraj@turbostart.co\",\r\n"
		 				 		+ "    \"faculty\": \"Jasprit Bumrah\",\r\n"
		 				 		+ "    \"examCycle\": \"Oct-22\",\r\n"
		 				 		+ "    \"courseName\": \"BBAENT307-Commercialisation Strategy\",\r\n"
		 				 		+ "    \"batch\": \"2023\"\r\n"
		 				 		+ "  }\r\n"
		 				 		+ "]");
		 				log.info("=============Completed===============");
		                Reporter.log( "=============Completed===============", true );
		                driver.close();
 
}
}
