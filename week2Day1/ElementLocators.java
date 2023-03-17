package week2.week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ElementLocators {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		//to launch the browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		//to maximize the window
		driver.manage().window().maximize();
		//Enter the user name
		// 2types are there - 1sttype
//		WebElement element = driver.findElement(By.id("username"));
//		element.sendKeys("DemoCSR");
		//2nd type //ctrl+2, L -> to assign to a variable
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login button
		Thread.sleep(3000);
		driver.findElement(By.className("decorativeSubmit")).click();
		//To get the title
		String title = driver.getTitle();
		System.out.println(title);
		//To click crmsfa link
		driver.findElement(By.partialLinkText("CRM")).click();
		//Enter user name, password and click login button 
		driver.findElement(By.name("USERNAME")).sendKeys("DemoCSR");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("loginButton")).click();
		//Clicks leads tab
		driver.findElement(By.linkText("Leads")).click();
		//Click create lead
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter company name,First name, LAst name 
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Girija");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Shivkumar");
		//Click create lead button
		driver.findElement(By.id("ext-gen592")).click();
	}

}
