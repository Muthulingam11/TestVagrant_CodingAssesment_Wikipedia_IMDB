package com.TestVagrant_CodingAssesment_Wikipedia_IMDB.TestVagrant_CodingAssesment_Wikipedia_IMDB_Propertyfile;

import java.io.FileNotFoundException;

public class File_Reader_Manager {
	private File_Reader_Manager() {
	
	}
	
	
	public static File_Reader_Manager getInstanceFRM() {
		File_Reader_Manager fr=new File_Reader_Manager();
		return fr;
	}
	
	public Configuration_Reader getInstanceCR() throws FileNotFoundException {
		Configuration_Reader cr=new Configuration_Reader();
		return cr;
	}
}
