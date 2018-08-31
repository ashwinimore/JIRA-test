package gov.healthit.oncprojectracking.jiraaqa;

import java.io.File;
import java.util.concurrent.TimeUnit;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MailFlushQueue {
    private WebDriver driver;
    private String baseUrl;
    private String username = System.getProperty("username");
    private String password = System.getProperty("password");
    private String filePath = System.getProperty("filePath");

    public MailFlushQueue() {

        if (username.equals(null)) {
            throw new IllegalArgumentException("Missing value for username!");
           }
        if (password.equals(null)) {
            throw new IllegalArgumentException("Missing value for password!");
           }
        
            String tempDirectory = System.getProperty("user.dir") + File.separator + "chromedriver_win32";
            filePath = tempDirectory;        
    }

    @Test
    public void systemMailQueue() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", (filePath + File.separator + "chromedriver.exe"));
        WebDriver driver = new ChromeDriver();

        baseUrl = "https://oncprojectracking.healthit.gov/";
        driver.get(baseUrl + "support/secure/admin/MailQueueAdmin!default.jspa");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  
        driver.findElement(By.id("login-form-username")).sendKeys(username);

        driver.findElement(By.id("login-form-password")).sendKeys(password);

        driver.findElement(By.id("login-form-submit")).click();

        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/section/table[1]/tbody/tr[3]/td/div/a")).click();
        System.out.println("test worked!");

        driver.quit();
    }

}
