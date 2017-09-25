package Testes;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	protected static WebDriver driver;
	
	@BeforeClass
	public static void setUp(){
		System.setProperty("webdriver.chrome.driver", "/***aqui vai o local do driver na sua maquina***/");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void cleanUp(){
		driver.manage().deleteAllCookies();
	}
	
	@AfterClass
	public static void tearDown() throws InterruptedException{
		
		
	}	
}