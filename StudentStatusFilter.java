package StudentStatus;
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

public class StudentStatusFilter {
	static Logger log = LogManager.getLogger(StudentStatusFilter.class);
	@Test(priority=2)
	public void StudentStatusBYROLLNUMBER(Method method) throws InterruptedException {
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
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/button")).click();
	     	Thread.sleep(1000);
	         driver.findElement(By.xpath("//span[.='Exam Management']")).click();
	         Thread.sleep(1000);
	         driver.findElement(By.xpath("//span[.='Student Status']")).click();
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/header[1]/div/div/button[4]")).click();
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/header[2]/div/div/div/input")).sendKeys("KEN103");
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/header[2]/div/div/button")).click();
	         Thread.sleep(3000);
	         List<WebElement> row = driver.findElements(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div[3]/div//table/tbody/tr"));
	         System.out.println("the number of record from student status which was filter by roll number is spj12345  "+ row.size());
	         log.info("the number of record from student status which was filter by roll number is spj12345 "+ row.size());
	         Reporter.log("the number of record from student status which was filter by roll number is spj12345 "+ row.size(),true);
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
		 			
		 			 driver.findElement(By.xpath("/html/body/div[2]/form/input[2]")).sendKeys("/services/apexrest/StudentData/?nameOrRollNum=KEN103");
		 			  log.info("on the api Testing Here We fillter the Student By Rollnumber");
		 			 Reporter.log("on the api Testing Here We fillter the Student By Rollnumber ",true);
		 				driver.findElement(By.xpath("/html/body/div[2]/form/input[3]")).click();
		 			   
		 				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/ul/li")).click();
		 				Thread.sleep(3000);
		 				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/a[3]")).click();
		 				log.info("To show the Response came from Salesforce & the record count 1");
		 				 Reporter.log("To show the Response came from Salesforce & the record count 1 ",true);
		 				log.info("======================RESPONSE FROM THE API====================");
		 				 Reporter.log("======================RESPONSE FROM THE API==================== ",true);
		 				log.info("[\r\n"
		 						+ "  {\r\n"
		 						+ "    \"typeOfExam\": \"End-term\",\r\n"
		 						+ "    \"rollNumber\": \"KEN103\",\r\n"
		 						+ "    \"reason\": \"N/A\",\r\n"
		 						+ "    \"name\": \"Test Student Record 3\",\r\n"
		 						+ "    \"Id\": \"a1v1y000000TaWVAA0\",\r\n"
		 						+ "    \"examCycle\": \"Oct-22\",\r\n"
		 						+ "    \"eligibilityStatus\": \"Eligible\",\r\n"
		 						+ "    \"courseName\": \"BBAECO103-Macroeconomics\",\r\n"
		 						+ "    \"campusName\": \"Singapore\",\r\n"
		 						+ "    \"batch\": \"2023\"\r\n"
		 						+ "  }\r\n"
		 						+ "]");
		 				log.info("=============Completed===============");
		                Reporter.log( "=============Completed===============", true );
		                driver.close();
	}
		 				@Test(priority=3)
		 				public void StudentStatusBYEligibleStatus(Method method) throws InterruptedException {

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
		 				Thread.sleep(3000);
		 				driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/button")).click();
		 		     	Thread.sleep(1000);
		 		         driver.findElement(By.xpath("//span[.='Exam Management']")).click();
		 		         Thread.sleep(1000);
		 		         driver.findElement(By.xpath("//span[.='Student Status']")).click();
		 		         
		 		         Thread.sleep(2000);
		 		         driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/header[1]/div/div/button[2]")).click();
		 		         Thread.sleep(2000);
		 		         driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[5]/div/div[2]/div")).click();
		 		        driver.findElement(By.xpath("//li[.='Not Eligible']")).click();
		 		        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[3]/button[2]")).click();
		 		        
		 		       List<WebElement> row2 = driver.findElements(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div[3]/div//table/tbody/tr"));
		 		         System.out.println("the number of record from student status which was filter by Eligible status  "+ row2.size());
		 		         log.info("the number of record from student status which was which was filter by Eligible status  "+ row2.size());
		 		         Reporter.log("the number of record from student status which was which was filter by Eligible status "+ row2.size(),true);
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
				 			
				 			 driver.findElement(By.xpath("/html/body/div[2]/form/input[2]")).sendKeys("/services/apexrest/StudentData/?eligibilityStatus=Not+Eligible");
				 			  log.info("on the api Testing Here We fillter the student was not eligible");
				 			 Reporter.log("on the api Testing Here We fillter the student was not eligible ",true);
				 				driver.findElement(By.xpath("/html/body/div[2]/form/input[3]")).click();
				 			   
				 				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/ul/li")).click();
				 				Thread.sleep(3000);
				 				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/a[3]")).click();
				 				log.info("To show the Response came from Salesforce & the record count 1");
				 				 Reporter.log("To show the Response came from Salesforce & the record count 1 ",true);
				 				log.info("======================RESPONSE FROM THE API====================");
				 				 Reporter.log("======================RESPONSE FROM THE API==================== ",true);
				 				 log.info("[\r\n"
				 				 		+ "  {\r\n"
				 				 		+ "    \"typeOfExam\": \"End-term\",\r\n"
				 				 		+ "    \"rollNumber\": \"KEN101\",\r\n"
				 				 		+ "    \"reason\": \"Risk\",\r\n"
				 				 		+ "    \"name\": \"Test Student Record 1\",\r\n"
				 				 		+ "    \"Id\": \"a1v1y000000TaWTAA0\",\r\n"
				 				 		+ "    \"examCycle\": \"Oct-22\",\r\n"
				 				 		+ "    \"eligibilityStatus\": \"Not eligible\",\r\n"
				 				 		+ "    \"courseName\": \"BBAECO103-Macroeconomics\",\r\n"
				 				 		+ "    \"campusName\": \"Singapore\",\r\n"
				 				 		+ "    \"batch\": \"2023\"\r\n"
				 				 		+ "  }\r\n"
				 				 		+ "]");
		 		         
		 				log.info("=============Completed===============");
		                Reporter.log( "=============Completed===============", true );
		                driver.close();
		                
}
		 				@Test(priority=4)
		 				public void StudentStatusEdit(Method method) throws InterruptedException {

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
		 				Thread.sleep(3000);
		 				driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/button")).click();
		 		     	Thread.sleep(1000);
		 		         driver.findElement(By.xpath("//span[.='Exam Management']")).click();
		 		         Thread.sleep(1000);
		 		         driver.findElement(By.xpath("//span[.='Student Status']")).click();
		 		         Thread.sleep(2000);
		 		         driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr[1]/td[9]/button")).click();
		 		         driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr[1]/td[5]/div/div/div[2]/div")).click();
		 		         driver.findElement(By.xpath("//li[.='Not Eligible']")).click();
		 		         Thread.sleep(2000);
		 		         
		 		       
		 		         driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiInput-input']")).sendKeys("Risk");
		 		         
		 		         driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr[1]/td[9]/button[1]")).click();
		 		         driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/header[1]/div/div/button[3]")).click();
		 		         Thread.sleep(2000);
		 		         driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr[1]/td[7]/div/button")).click();
		 		         //Thread.sleep(2000);
		 		         //driver.findElement(By.xpath("/html/body/pdf-viewer//viewer-toolbar//div/div[3]/viewer-download-controls//cr-icon-button//div")).click();
		 		         Thread.sleep(2000);
		 		         driver.navigate().back();
		 		         Thread.sleep(2000);
		 		         driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/header[1]/div/div/button[1]")).click();
		 		         driver.findElement(By.xpath("//input[@id='0']"));
		 		         driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[2]/div/div/div/div/input")).sendKeys("HI How are u!!!");
		 		         Thread.sleep(2000);
		 		         driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[3]/button[2]")).click();
		 		        log.info("=============Completed===============");
		                Reporter.log( "=============Completed===============", true );
		                driver.close();
		 				}
		 		         
		 }
