package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyClass {

	public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://www.google.com";
		String expectedTitle = "Google";
		String actualTitle = "";
		
		driver.get(baseUrl);
		
		actualTitle = driver.getTitle();
		
		if(actualTitle != expectedTitle){
			System.out.println("Test passed!");
		}else{
			System.out.println("Test failed!");
		}

		driver.quit();
	}

}
