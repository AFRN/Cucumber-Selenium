package br.com.example.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	private static WebDriver driver;
	
	private Driver(){
		
	}
	
	public static WebDriver getInstance(){
		if(driver == null){
			driver = new FirefoxDriver();
		}
		return driver;
	}
	
}
