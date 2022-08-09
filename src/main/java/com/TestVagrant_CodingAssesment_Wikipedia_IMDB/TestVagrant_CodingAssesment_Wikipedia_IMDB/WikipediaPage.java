package com.TestVagrant_CodingAssesment_Wikipedia_IMDB.TestVagrant_CodingAssesment_Wikipedia_IMDB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaPage {
	public WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WikipediaPage(WebDriver dri2) {
		this.driver=dri2;
		PageFactory.initElements(driver, this);
	
	}

	@FindBy(xpath="(//div[@class='plainlist'])[4] ")
	private WebElement releasedate;
	
	public WebElement getReleasedate() {
		return releasedate;
	}
	
	@FindBy(xpath = "(//td)[13]")
	private WebElement country;
	
	public WebElement getCountry() {
		return country;
	}
	
	

}
