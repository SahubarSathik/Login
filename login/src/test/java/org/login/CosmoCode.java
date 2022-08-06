package org.login;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CosmoCode {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your country");
		String country = s.nextLine();
		String s1 = "//tbody/tr/td[2]/strong[contains(text(),'" + country + "')]//preceding::td[1]/input";
		System.out.println(s1);
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Method by List
		List<WebElement> countries = driver.findElements(By.xpath("//tbody/tr/td[2]"));

		for (WebElement count : countries) {
			String text = count.getText();
			if (country.equalsIgnoreCase(text)) {

				driver.findElement(
						By.xpath("//tbody/tr/td[2]/strong[contains(text(),'" + country + "')]//preceding::td[1]/input"))
						.click();

			}

		}
		// Method by normal Xpath
		driver.findElement(
				By.xpath("//tbody/tr/td[2]/strong[contains(text(),'" + country + "')]//preceding::td[1]/input"))
				.click();

	}
}
