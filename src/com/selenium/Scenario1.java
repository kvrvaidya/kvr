package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scenario1 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\590445\\workspace\\SeleniumSample\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.get("www.tutorialspoint.com");
		driver.navigate().to("http://ums.lpu.in");
		WebElement ums = driver.findElement(By.linkText("https://ums.lpu.in/lpuums"));
		ums.click();
		WebElement id = driver.findElement(By.id("TextBox1"));
		id.sendKeys("11200440");
		id.sendKeys(Keys.TAB);
		WebElement pwd = driver.findElement(By.id("TextBox2"));
		pwd.sendKeys("Kvrpv@96");
		WebElement login = driver.findElement(By.id("iBtnLogin"));
		login.click();
		WebElement home = driver.findElement(By.id("ums"));
		home.click(); 
		WebElement umsnav = driver.findElement(By.linkText("UMS Navigation"));
		umsnav.click();
		WebElement logout =driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div[2]/ul/li[3]/a"));
        logout.click();
        
	}
}
