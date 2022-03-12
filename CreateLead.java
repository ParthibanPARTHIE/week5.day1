package week5.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
	@Test
	public void createLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("parthi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("e");
		driver.findElement(By.name("submitButton")).click();
		
	}
	

}
