package gov.healthit.oncprojectracking.jiraaqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
    
    
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\amore\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        String title =driver.getTitle();
        System.out.println(title);
        
        driver.quit();
    }
    
    
  
}
