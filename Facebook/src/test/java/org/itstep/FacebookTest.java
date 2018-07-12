package org.itstep;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.ImmutableBiMap.Builder;

public class FacebookTest {
	private static WebDriver driver;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://uk-ua.facebook.com/");
    }
	@Test
	public void test() {
		driver.findElement(By.id("u_0_j")).sendKeys("Nastya");
		driver.findElement(By.id("u_0_l")).sendKeys("Lunova");
		driver.findElement(By.id("u_0_o")).sendKeys("0934263341");
		driver.findElement(By.id("u_0_v")).sendKeys("123456");
		
		Select select1 = new Select(driver.findElement(By.id("day")));
		select1.selectByValue("23");
		
		Select select2 = new Select(driver.findElement(By.id("month")));
		select2.selectByValue("7");
		
		Select select3 = new Select(driver.findElement(By.id("year")));
		select3.selectByValue("1995");
		
		WebElement sex = driver.findElement(By.id("u_0_9"));
		if (!sex.isEnabled()) {
			sex.click();
		}
		
		/*JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("code js");*/
		
		/*Builder builder = new Builder();//mouse
		builder.build();*/
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//driver.quit();
	}

	
}
