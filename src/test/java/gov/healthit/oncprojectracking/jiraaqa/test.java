package gov.healthit.oncprojectracking.jiraaqa;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\amore\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        String title =driver.getTitle();
        System.out.println(title);
        
        driver.quit();
    }
    
    @Test
    public void test() {
        System.out.println("Not yet implemented");
    }

}
