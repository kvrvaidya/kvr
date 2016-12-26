package com.selenium;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepDefinition {
	protected WebDriver driver;

	@Before
	public void navigate() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\590445\\workspace\\SeleniumSample\\lib\\chromedriver.exe");

	}

	@Given("^user is on home page$")
	public void onHomePage() {
		System.out.println("User on home page");
		driver = new ChromeDriver();
		driver.navigate().to("http://ums.lpu.in");
	}

	@When("^User enters User Id and password and selects landing page$")
	public void login() {
		WebElement ums = driver.findElement(By.linkText("https://ums.lpu.in/lpuums"));
		ums.click();
		WebElement id = driver.findElement(By.id("TextBox1"));
		id.sendKeys("11200440");
		id.sendKeys(Keys.TAB);
		WebElement pwd = driver.findElement(By.id("TextBox2"));
		pwd.sendKeys("Kvrpv@96");
		WebElement login = driver.findElement(By.id("iBtnLogin"));
		login.click();
	}
	 @After
	    public void closeBrowser() {
	        driver.quit();
	 }
}
