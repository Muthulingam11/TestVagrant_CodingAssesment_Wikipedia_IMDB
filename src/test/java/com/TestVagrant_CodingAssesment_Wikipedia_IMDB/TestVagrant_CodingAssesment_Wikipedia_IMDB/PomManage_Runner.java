package com.TestVagrant_CodingAssesment_Wikipedia_IMDB.TestVagrant_CodingAssesment_Wikipedia_IMDB;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.TestVagrant_CodingAssesment_Wikipedia_IMDB.TestVagrant_CodingAssesment_Wikipedia_IMDB.BaseClass;
import com.TestVagrant_CodingAssesment_Wikipedia_IMDB.TestVagrant_CodingAssesment_Wikipedia_IMDB.Pommanage;
import com.TestVagrant_CodingAssesment_Wikipedia_IMDB.TestVagrant_CodingAssesment_Wikipedia_IMDB_Propertyfile.Configuration_Reader;
import com.TestVagrant_CodingAssesment_Wikipedia_IMDB.TestVagrant_CodingAssesment_Wikipedia_IMDB_Propertyfile.File_Reader_Manager;

public class PomManage_Runner extends BaseClass {
		public static WebDriver driver= getbrowser();
		public static Pommanage pom=new Pommanage(driver);
		
		public String gettextc;
		public String gettextd;
		public String gettext2c;
		public String gettext2d;
		
		@Test(priority = 1)
		public void getwikipedia() throws FileNotFoundException {
			String geturl1 = File_Reader_Manager.getInstanceFRM().getInstanceCR().geturl1();
			geturl(geturl1);
			gettextc = gettext(pom.getInstancewk().getCountry());
			System.out.println(gettextc);
			gettextd = gettext(pom.getInstancewk().getReleasedate());
			System.out.println(gettextd);
		}
		@Test(priority = 2)
		public void getimdb() throws FileNotFoundException {
			String geturl2 = File_Reader_Manager.getInstanceFRM().getInstanceCR().geturl2();
			geturl(geturl2);
			gettext2c = gettext(pom.getInstanceimdb().getCountry());
			System.out.println(gettext2c);
			gettext2d = gettext(pom.getInstanceimdb().getReleasedate());
			System.out.println(gettext2d);
		}
		
		@Test(priority = 3)
		public void assert1() {
			Assert.assertEquals(gettextc, gettext2c);
		}
		@Test(priority = 4)
		public void assert2() {
			Assert.assertEquals(gettextd, gettext2d);
		}
		@Test(priority = 5, enabled = true)
		public void quitbrowser() {
			driver.quit();
		}
		
		
}
