package week2.week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadAssign {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		//to launch the browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		//to maximize the window
		driver.manage().window().maximize();
		//Enter the user name
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login button
		Thread.sleep(3000);
		driver.findElement(By.className("decorativeSubmit")).click();
		//To click crmsfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Clicks leads tab
		driver.findElement(By.linkText("Leads")).click();
		//Click create lead
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter company name,First name, Last name 
		//Thread.sleep(5000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mahima");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Shivkumar");
		//Enter First name(Local)
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("MahLoc");
		//Enter Depart Name
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		//Enter Description, Email
		driver.findElement(By.xpath("//*[@id=\"createLeadForm_description\"]")).sendKeys("Automation Training Selenium");;
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("girijashivkumar9498@gmail.com");
		//Select state dropdown
		Select state = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		state.selectByVisibleText("New York");
		//Click create lead button
		driver.findElement(By.className("smallSubmit")).click();
		//To get the title
		String title = driver.getTitle();
		System.out.println(title);
		
		//Assignment 2 
		//Click on Edit button
		driver.findElement(By.linkText("Edit")).click();
		//clear description
		driver.findElement(By.id("updateLeadForm_description")).clear();
		//Fill important note field
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Automation Training Selenium");
		//Click update button
		driver.findElement(By.className("smallSubmit")).click();
		//To get the title
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		//Assignment 3
		//Click Duplicate button
		driver.findElement(By.linkText("Duplicate Lead")).click();
		//clear company name
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		//Enter new company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infy");
		//Clear First Name and enter new first name
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Giri");
		//Click create Lead button
		driver.findElement(By.className("smallSubmit")).click();
		//To get the title
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		
		

	}

}
