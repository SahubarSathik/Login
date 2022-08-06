package org.login;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WindowHandling {

	@Test
	private void size() {

		String s = "Sa12hu3bar&%sa*&th7K";
		char[] ch = s.toCharArray();
		String output = "";
		String rev = "";

		for (int i = 0; i < ch.length; i++) {
			if (Character.isAlphabetic(ch[i])) {
				output = output + ch[i];
			}
		}
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

		// else if (Character.isDigit(ch[i])) {
		// num = num + ch[i];
		//
		// } else {
		// spl = spl + ch[i];
		// }
	}
	/*
	 * System.out.println(alpha); System.out.println(num); System.out.println(spl);
	 */

//	WebDriver driver = new ChromeDriver();driver.get("https://www.amazon.in/");driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Andriod Tv",Keys.ENTER);driver.findElement(By.xpath("")).click();
//	String parentWindowId = driver.getWindowHandle();System.out.println(parentWindowId);
//	Set<String> allWindowsId = driver.getWindowHandles();for(
//	String string:allWindowsId)
//	{
//		if (!string.equals(parentWindowId)) {
//			driver.switchTo().window(string);
//
//		}
//	}
//
//	String title = driver.getTitle();if(title.contains("samsung"))
//	{
//		System.out.println("found the right window");
//	}
//
//	Assert.assertEquals("samsung",title,"found the right window");

	// driver.findElement(By.xpath("//span[contains(text(),'Kodak 80 cm (32
	// inches)')]")).click();
//	driver.findElement(By.xpath("//span[contains(text(),'Acer 80 cm (32 inches)')]")).click();driver.findElement(By.xpath("//span[contains(text(),'Mi 80 cm (32 inches)')]")).click();driver.findElement(By.xpath("//span[contains(text(),'Redmi 80 cm (32 inches)')]")).click();
//	Set<String> allWindowsId = driver.getWindowHandles();
//
//	ArrayList<String> list = new ArrayList<String>(allWindowsId);driver.switchTo().window(list.get(1));
//
//	String stWindow = driver.getWindowHandle();System.out.println(stWindow);driver.close();
//
//	driver.switchTo().window(list.get(2));System.out.println(driver.getWindowHandle());driver.close();
//
//	driver.switchTo().window(list.get(3));System.out.println(driver.getWindowHandle());driver.close();
//
//	driver.quit();

//}

}
