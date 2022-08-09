package com.TestVagrant_CodingAssesment_Wikipedia_IMDB.TestVagrant_CodingAssesment_Wikipedia_IMDB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Pommanage {
	public WebDriver driver;
	
	public WebDriver getdriver() {
		return driver;
	}
	
	public Pommanage(WebDriver dri2) {
		this.driver=dri2;
		PageFactory.initElements(driver, this);
	
	}
	
	private Imdb imdb;
	private WikipediaPage wk;
	
	public Imdb getInstanceimdb() {
		if (imdb==null) {
			imdb=new Imdb(driver);
		}
		return imdb;
	}
	
	public WikipediaPage getInstancewk() {
		if (wk==null) {
			wk=new WikipediaPage(driver);
		}
		return wk;
	}
	
	
}
