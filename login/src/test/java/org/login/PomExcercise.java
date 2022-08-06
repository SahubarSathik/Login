package org.login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;





public class PomExcercise extends BaseClass {
	
	
	@FindBy(id = "email")
	public static WebElement username;
	@FindBy(id = "pass")
	public static WebElement password;
	@FindBy(name = "login")
	public static WebElement button;

	@Test
	private void login() {
	
		
		getDriver("chrome");
		launch("https://demoqa.com/registration/");
		
		PageFactory.initElements(driver, this);
		
		textSend(username, "abc@gmail.com");
		textSend(password, "231356");
		buttonClick(button);
		
	}
	
	
	
	
}
