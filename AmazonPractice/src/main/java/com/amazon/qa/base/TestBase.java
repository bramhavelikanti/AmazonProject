package com.amazon.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.amazon.qa.util.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
public	static WebDriver driver;
public	static Properties prop;
	
	public TestBase() throws IOException {
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\velik\\git\\automation\\AmazonProject\\AmazonPractice\\src\\main\\java\\com\\amazon\\qa\\properties\\config.properties");
		prop.load(ip);
	}
	 public static void browserSetUp() {
		 String browsername = prop.getProperty("browser");
		 if(browsername.equals("chrome")) 
		 {
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		 }
		 else {
			 System.out.println("we do not support this browser");
		 }
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(TestUtil.IMPLI_Wait ,TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(TestUtil.PL_Timeout ,TimeUnit.SECONDS);
		 driver.get(prop.getProperty("url"));
	 }

}
