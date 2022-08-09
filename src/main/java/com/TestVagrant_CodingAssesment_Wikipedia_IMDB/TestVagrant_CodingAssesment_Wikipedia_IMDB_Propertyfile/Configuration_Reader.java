package com.TestVagrant_CodingAssesment_Wikipedia_IMDB.TestVagrant_CodingAssesment_Wikipedia_IMDB_Propertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties prof;
	
	public Configuration_Reader() throws FileNotFoundException {
		File f=new File("C:\\Users\\Muthu\\eclipse-workspace\\TestVagrant_CodingAssesment_Wikipedia_IMDB\\Configuration.properties");
		FileInputStream fis=new FileInputStream(f);
		prof=new Properties();
		try {
			prof.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String geturl1() {
		String url1 = prof.getProperty("URL1");
		return url1;
	}
	
	public String geturl2() {
		String url2 = prof.getProperty("URL2");
		return url2;
	}

}
