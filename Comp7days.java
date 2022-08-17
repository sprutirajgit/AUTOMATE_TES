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
public class Comp7days {
	static Logger log = LogManager.getLogger(Comp7days.class);
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
	         driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div[3]/div/div[1]/div[2]/div/div/div[2]/div")).click();
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[1]")).click();
	         Thread.sleep(3000);
	         driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div[3]/div/div[1]/div[3]/button")).click();
	         Thread.sleep(3000);
	         List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[3]/div/div[2]/div/table/tbody/tr"));
	         System.out.println("The number of Record  is from Portal on 7 days Filletr "+ row.size());
	         log.info("The number of Record  is from Portal on 7 days Filletr "+ row.size());
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
	 			 driver.findElement(By.xpath("/html/body/div[2]/form/input[2]")).sendKeys("/services/apexrest/ExamData/?completedIn=7");
	 			  log.info("on the api Testing Here We fillter the Exam Complete the 7 days");
	 			 Reporter.log("on the api Testing Here We fillter the Exam Complete the 7 days ",true);
	 				driver.findElement(By.xpath("/html/body/div[2]/form/input[3]")).click();
	 				
	 				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/ul/li[1]")).click();
	 				Thread.sleep(10000);
	 				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/a[3]")).click();
	 				log.info("To show the Response came from Salesforce & the record count 7");
	 				 Reporter.log("To show the Response came from Salesforce & the record count 7 ",true);
	 				log.info("======================RESPONSE FROM THE API====================");
	 				 Reporter.log("======================RESPONSE FROM THE API==================== ",true);
	 				log.info("{\r\n"
	 						+ "  \"completedExamList\": [\r\n"
	 						+ "    {\r\n"
	 						+ "      \"term\": \"2023-JAN-GMBA-Term1-Dubai\",\r\n"
	 						+ "      \"seatPlanStatus\": \"Not Created\",\r\n"
	 						+ "      \"questionPaperId\": null,\r\n"
	 						+ "      \"quesPaperStatus\": \"Not Approved\",\r\n"
	 						+ "      \"program\": \"Global MBA\",\r\n"
	 						+ "      \"invigStatus\": \"Not Assigned\",\r\n"
	 						+ "      \"id\": \"a121y000000JzIdAAK\",\r\n"
	 						+ "      \"grading\": null,\r\n"
	 						+ "      \"examType\": \"Mid-term\",\r\n"
	 						+ "      \"examMode\": null,\r\n"
	 						+ "      \"examLink\": \"Exam URL\",\r\n"
	 						+ "      \"examDate\": \"2022-08-09\",\r\n"
	 						+ "      \"examCycle\": \"Oct-22\",\r\n"
	 						+ "      \"evaluation\": null,\r\n"
	 						+ "      \"course\": \"MBAGQTT106\\t-Research Methods\",\r\n"
	 						+ "      \"batch\": \"2023\"\r\n"
	 						+ "    },\r\n"
	 						+ "    {\r\n"
	 						+ "      \"term\": \"2023-JAN-GMBA-Term2-Singapore\",\r\n"
	 						+ "      \"seatPlanStatus\": \"Not Created\",\r\n"
	 						+ "      \"questionPaperId\": null,\r\n"
	 						+ "      \"quesPaperStatus\": \"Not Approved\",\r\n"
	 						+ "      \"program\": \"Global MBA\",\r\n"
	 						+ "      \"invigStatus\": \"Not Assigned\",\r\n"
	 						+ "      \"id\": \"a121y000000JzQCAA0\",\r\n"
	 						+ "      \"grading\": null,\r\n"
	 						+ "      \"examType\": \"End-term\",\r\n"
	 						+ "      \"examMode\": null,\r\n"
	 						+ "      \"examLink\": \"Exam URL\",\r\n"
	 						+ "      \"examDate\": \"2022-08-10\",\r\n"
	 						+ "      \"examCycle\": \"Oct-22\",\r\n"
	 						+ "      \"evaluation\": null,\r\n"
	 						+ "      \"course\": \"MBAGITM211-IT Strategic Planning\",\r\n"
	 						+ "      \"batch\": \"2023\"\r\n"
	 						+ "    },\r\n"
	 						+ "    {\r\n"
	 						+ "      \"term\": \"2023-JAN-GMBA-Term2-Singapore\",\r\n"
	 						+ "      \"seatPlanStatus\": \"Not Created\",\r\n"
	 						+ "      \"questionPaperId\": null,\r\n"
	 						+ "      \"quesPaperStatus\": \"Not Approved\",\r\n"
	 						+ "      \"program\": \"Global MBA\",\r\n"
	 						+ "      \"invigStatus\": \"Not Assigned\",\r\n"
	 						+ "      \"id\": \"a121y000000JzQDAA0\",\r\n"
	 						+ "      \"grading\": null,\r\n"
	 						+ "      \"examType\": \"Mid-term\",\r\n"
	 						+ "      \"examMode\": null,\r\n"
	 						+ "      \"examLink\": \"Exam URL\",\r\n"
	 						+ "      \"examDate\": \"2022-08-11\",\r\n"
	 						+ "      \"examCycle\": \"Oct-22\",\r\n"
	 						+ "      \"evaluation\": null,\r\n"
	 						+ "      \"course\": \"MBAGITM211-IT Strategic Planning\",\r\n"
	 						+ "      \"batch\": \"2023\"\r\n"
	 						+ "    },\r\n"
	 						+ "    {\r\n"
	 						+ "      \"term\": \"2023-JAN-GMBA-Term2-Singapore\",\r\n"
	 						+ "      \"seatPlanStatus\": \"Not Created\",\r\n"
	 						+ "      \"questionPaperId\": \"a131y000001IHqpAAG\",\r\n"
	 						+ "      \"quesPaperStatus\": \"Approved\",\r\n"
	 						+ "      \"program\": \"Global MBA\",\r\n"
	 						+ "      \"invigStatus\": \"Not Assigned\",\r\n"
	 						+ "      \"id\": \"a121y000000JzNXAA0\",\r\n"
	 						+ "      \"grading\": null,\r\n"
	 						+ "      \"examType\": \"End-term\",\r\n"
	 						+ "      \"examMode\": null,\r\n"
	 						+ "      \"examLink\": \"Exam URL\",\r\n"
	 						+ "      \"examDate\": \"2022-08-12\",\r\n"
	 						+ "      \"examCycle\": \"Oct-22\",\r\n"
	 						+ "      \"evaluation\": null,\r\n"
	 						+ "      \"course\": \"MBAGLSC218-Project Management\",\r\n"
	 						+ "      \"batch\": \"2023\"\r\n"
	 						+ "    },\r\n"
	 						+ "    {\r\n"
	 						+ "      \"term\": \"2023-JAN-GMBA-Term2-Singapore\",\r\n"
	 						+ "      \"seatPlanStatus\": \"Not Created\",\r\n"
	 						+ "      \"questionPaperId\": null,\r\n"
	 						+ "      \"quesPaperStatus\": \"Not Approved\",\r\n"
	 						+ "      \"program\": \"Global MBA\",\r\n"
	 						+ "      \"invigStatus\": \"Not Assigned\",\r\n"
	 						+ "      \"id\": \"a121y000000JzNYAA0\",\r\n"
	 						+ "      \"grading\": null,\r\n"
	 						+ "      \"examType\": \"Mid-term\",\r\n"
	 						+ "      \"examMode\": null,\r\n"
	 						+ "      \"examLink\": \"Exam URL\",\r\n"
	 						+ "      \"examDate\": \"2022-08-13\",\r\n"
	 						+ "      \"examCycle\": \"Oct-22\",\r\n"
	 						+ "      \"evaluation\": null,\r\n"
	 						+ "      \"course\": \"MBAGLSC218-Project Management\",\r\n"
	 						+ "      \"batch\": \"2023\"\r\n"
	 						+ "    },\r\n"
	 						+ "    {\r\n"
	 						+ "      \"term\": \"2022-AUG-EMBA-Term2-Virtual\",\r\n"
	 						+ "      \"seatPlanStatus\": \"Not Created\",\r\n"
	 						+ "      \"questionPaperId\": null,\r\n"
	 						+ "      \"quesPaperStatus\": \"Not Approved\",\r\n"
	 						+ "      \"program\": \"Executive MBA\",\r\n"
	 						+ "      \"invigStatus\": \"Not Assigned\",\r\n"
	 						+ "      \"id\": \"a121y000000JzT1AAK\",\r\n"
	 						+ "      \"grading\": null,\r\n"
	 						+ "      \"examType\": \"End-term\",\r\n"
	 						+ "      \"examMode\": null,\r\n"
	 						+ "      \"examLink\": \"Exam URL\",\r\n"
	 						+ "      \"examDate\": \"2022-08-14\",\r\n"
	 						+ "      \"examCycle\": \"Oct-22\",\r\n"
	 						+ "      \"evaluation\": null,\r\n"
	 						+ "      \"course\": \"MBAEMKT210-Sales Management\",\r\n"
	 						+ "      \"batch\": \"2022\"\r\n"
	 						+ "    },\r\n"
	 						+ "    {\r\n"
	 						+ "      \"term\": \"2022-AUG-EMBA-Term2-Virtual\",\r\n"
	 						+ "      \"seatPlanStatus\": \"Not Created\",\r\n"
	 						+ "      \"questionPaperId\": null,\r\n"
	 						+ "      \"quesPaperStatus\": \"Not Approved\",\r\n"
	 						+ "      \"program\": \"Executive MBA\",\r\n"
	 						+ "      \"invigStatus\": \"Not Assigned\",\r\n"
	 						+ "      \"id\": \"a121y000000JzT2AAK\",\r\n"
	 						+ "      \"grading\": null,\r\n"
	 						+ "      \"examType\": \"Mid-term\",\r\n"
	 						+ "      \"examMode\": null,\r\n"
	 						+ "      \"examLink\": \"Exam URL\",\r\n"
	 						+ "      \"examDate\": \"2022-08-15\",\r\n"
	 						+ "      \"examCycle\": \"Oct-22\",\r\n"
	 						+ "      \"evaluation\": null,\r\n"
	 						+ "      \"course\": \"MBAEMKT210-Sales Management\",\r\n"
	 						+ "      \"batch\": \"2022\"\r\n"
	 						+ "    }\r\n"
	 						+ "  ]\r\n"
	 						+ "}");
	 				 log.info("=============Completed===============");
	                 Reporter.log( "=============Completed===============", true );
	 				driver.close();
	}
	
}
