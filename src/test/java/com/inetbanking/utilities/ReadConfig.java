package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig(){  //constructor 
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception occured " + e);;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception occured " + e);;
		}
		
		
		}
	public String getSiteURL() {
		String url = pro.getProperty("siteUrl");
		return url;
	}
	
	
	public String getChromePath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}

}
