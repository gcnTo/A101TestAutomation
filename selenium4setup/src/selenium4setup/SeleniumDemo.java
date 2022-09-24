package selenium4setup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Togrul\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.a101.com.tr/?utm_campaign=yillik-kullan%C4%B1m_branding&utm_medium=cpc&utm_source=google&utm_content=search&utm_term=yillik&gclid=Cj0KCQjw1bqZBhDXARIsANTjCPLvyMTQX36T-mhSWpLt62KCI1SBDcsUhJj_HXhaMH_4YupQXiqzUtAaAiFoEALw_wcB");
		driver.manage().window().maximize();
		
		System.out.println("Phase 1");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")));
		driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
		
		System.out.println("Phase 2");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]")));
			driver.findElement(By.xpath("/html[1]/body[1]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]")).click();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("Phase 3");
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Kadın İç Giyim")));
		driver.findElement(By.linkText("Kadın İç Giyim")).click();
		
		System.out.println("Phase 4");
		System.out.println(driver.getCurrentUrl());
		
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Dizaltı Çorap")));
		driver.findElement(By.linkText("Dizaltı Çorap")).click();
		driver.findElement(By.id("attributes_integration_colourSİYAH")).click();
		
		System.out.println("Phase 5");
		// check for org.openqa.selenium.StaleElementReferenceException
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[contains(text(),'Penti Kadın Dizaltı Pantolon Çorabı 2'li Siyah')]")));
			driver.findElement(By.xpath("//h3[contains(text(),'Penti Kadın Dizaltı Pantolon Çorabı 2'li Siyah')]")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Cought exception");
			e.printStackTrace();
		} finally {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/section[1]/section[4]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[2]/article[1]/div[1]/a[1]/figure[1]/img[1]")));
			driver.findElement(By.xpath("/html[1]/body[1]/section[1]/section[4]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[2]/article[1]/div[1]/a[1]/figure[1]/img[1]")).click();
		}

		
		System.out.println("Phase 6");
		// HERE
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getCurrentUrl().contains("siyah"));
		while (driver.getCurrentUrl().contains("siyah") == false) {
			driver.navigate().back();
			System.out.println(driver.getCurrentUrl());
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/section[1]/section[4]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[2]/article[1]/div[1]/a[1]/figure[1]/img[1]")));
			driver.findElement(By.xpath("/html[1]/body[1]/section[1]/section[4]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[2]/article[1]/div[1]/a[1]/figure[1]/img[1]")).click();
			
		}
		
		
		System.out.println("Phase 7");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/section[1]/section[3]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/button[1]")));
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/section[3]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/button[1]")).click();

		System.out.println("Phase 8");
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sepeti Görüntüle")));
		driver.findElement(By.linkText("Sepeti Görüntüle")).click();
		
		System.out.println("Phase 9");
		wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Sepeti Onay")));
		driver.findElement(By.partialLinkText("Sepeti Onay")).click();
		
		System.out.println("Phase 10");
		wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("ÜYE OLMADAN DEVAM ")));
		driver.findElement(By.partialLinkText("ÜYE OLMADAN DEVAM ")).click();
		
		System.out.println("Phase 11");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")));
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("test@test.org");
		
		System.out.println("Phase 12");
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]")).sendKeys(Keys.RETURN);
		
		System.out.println("Phase 13");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[2]/li[1]/a[1]")));
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[2]/li[1]/a[1]")).click();
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/label[1]/input[1]"))
		.sendKeys("lorem", Keys.TAB
				 ,"lorem", Keys.TAB
				 ,"lorem", Keys.TAB
				 ,"5315315315");
		
		System.out.println("Phase 14");
		WebElement ddown = driver.findElement(By.name("city"));
		Select select = new Select(ddown); 
		select.selectByVisibleText("BİTLİS");
		
		System.out.println("Phase 15");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[7]/label[1]/textarea[1]")));
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[7]/label[1]/textarea[1]")).sendKeys("6 Trujillo Court, Sparks,nv, 89431  United States");
		
		System.out.println("Phase 16");
		wait.until(ExpectedConditions.elementToBeClickable(By.name("township")));
		WebElement ddown2 = driver.findElement(By.name("township"));
		Select select2 = new Select(ddown2); 
		select2.selectByVisibleText("ADİLCEVAZ");
		
		System.out.println("Phase 17");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[7]/label[1]/textarea[1]")));
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[7]/label[1]/textarea[1]")).sendKeys(" Lorem / Lorem", Keys.TAB);
		
		System.out.println("Phase 18");
		wait.until(ExpectedConditions.elementToBeClickable(By.name("district")));
		WebElement ddown3 = driver.findElement(By.name("district"));
		Select select3 = new Select(ddown3); 
		// SELÇUKLU MAH YILDIZKÖY KÖYÜ
		select3.selectByVisibleText("SELÇUKLU MAH");
		
		System.out.println("Phase 19");
		driver.findElement(By.xpath("//button[contains(text(),'KAYDET')]")).click();
		
		System.out.println("Phase 20");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Sendeo')]")));
		driver.findElement(By.xpath("//span[contains(text(),'Sendeo')]")).click();
		
		System.out.println("Phase 21");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Kaydet ve Devam Et')]")));
		driver.findElement(By.xpath("//button[contains(text(),'Kaydet ve Devam Et')]")).click();
		
		System.out.println("Phase 22");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/section[1]/section[1]/div[1]/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[6]/div[1]/label[1]/input[1]")));
		driver.findElement(By.xpath("//body[1]/section[1]/section[1]/div[1]/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[6]/div[1]/label[1]/input[1]"))
		.sendKeys("SELÇUK YÖNTEM", Keys.TAB, "5570236164224619", "1111222233334444");
		
		System.out.println("Phase 23");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/section[1]/section[1]/div[1]/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[6]/div[3]/div[2]/select[1]")));
		WebElement ddown4 = driver.findElement(By.xpath("//body/section[1]/section[1]/div[1]/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[6]/div[3]/div[2]/select[1]"));
		Select select4 = new Select(ddown4); 
		select4.selectByValue("1");
		
		System.out.println("Phase 24");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/section[1]/section[1]/div[1]/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[6]/div[3]/div[3]/select[1]")));
		WebElement ddown5 = driver.findElement(By.xpath("//body/section[1]/section[1]/div[1]/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[6]/div[3]/div[3]/select[1]"));
		Select select5 = new Select(ddown5); 
		select5.selectByValue("2029");
		
		System.out.println("Phase 25");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/section[1]/section[1]/div[1]/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[6]/div[4]/label[1]/input[1]")));
		driver.findElement(By.xpath("//body/section[1]/section[1]/div[1]/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[6]/div[4]/label[1]/input[1]")).sendKeys("955");
		
		System.out.println("Phase 26");
		WebElement fin = driver.findElement(By.cssSelector("#agrement2"));
		action.moveToElement(fin, 0, 20).click().perform();
		
		System.out.println("Phase 27");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/section[1]/section[1]/div[1]/div[3]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[6]/button[1]/span[2]")));
		driver.findElement(By.xpath("//body/section[1]/section[1]/div[1]/div[3]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[6]/button[1]/span[2]")).click();
		
	}

}
