package com.TestVagrant_CodingAssesment_Wikipedia_IMDB.TestVagrant_CodingAssesment_Wikipedia_IMDB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Imdb {
	public WebDriver driver;
	
	public WebDriver getDri2() {
		return driver;
	}

	public Imdb(WebDriver dri2) {
		this.driver=dri2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='January 7, 2022 (United States)']")
	private WebElement releasedate;
	
	public WebElement getReleasedate() {
		return releasedate;
	}
	
	@FindBy(xpath = "//a[text()='India']")
	private WebElement country;
	
	public WebElement getCountry() {
		return country;
	}
	
	

}
