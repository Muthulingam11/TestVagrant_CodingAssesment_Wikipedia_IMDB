package com.TestVagrant_CodingAssesment_Wikipedia_IMDB.TestVagrant_CodingAssesment_Wikipedia_IMDB;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
	public static WebDriver dri;
	
	public static WebDriver getbrowser() {
		
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("incognito");
		dri=new ChromeDriver(co);
		dri.manage().window().maximize();
		return dri;
	}
	
	public static void geturl(String url) {
		dri.get(url);
	}
	
	public static void implicitwait(long wait) {
		dri.manage().timeouts().implicitlyWait(Duration.ofSeconds(wait));
	}
	
	public static void clickelement(WebElement element) {
		element.click();
	}
	
	public static String gettext(WebElement element) {
		String text = element.getText();
		return text;
	}
}
