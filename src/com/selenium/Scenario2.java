package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\590445\\workspace\\SeleniumSample\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.redbus.in");
		WebElement src= driver.findElement(By.id("src"));
		src.sendKeys("Bangalore");
		src.sendKeys(Keys.ENTER);
		WebElement dest = driver.findElement(By.id("dest"));
		dest.sendKeys("Vijayawada");
		dest.sendKeys(Keys.ENTER);
		WebElement	cal = driver.findElement(By.id("onward_cal"));
		cal.click();
		Actions builder = new Actions(driver);
		
		WebElement onward_cal = driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[4]/td[6]"));
		
		builder.click(onward_cal);
		WebElement search = driver.findElement(By.id("search_btn"));
		search.click();
	}
}
