package web.service;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginServiceTest {
    
    private void sleep(long sec) {
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void testLoginSuccess() {
        System.setProperty(
                "webdriver.chrome.driver", 
                "/Users/deepak/Downloads/chromedriver-mac-arm64 3/chromedriver");
        
        WebDriver driver = new ChromeDriver();        
        System.out.println("Driver info: " + driver);
        
        // Full path where login.html is located.
        // You can click on html file and copy the path shown in your browser.
        //
        // Provide the URL where the login.html page is hosted
        String baseUrl = "file:///Users/deepak/Documents/Software%20Testing/8.1P-resources/pages/login.html";
        driver.get(baseUrl); // navigate to the URL
        
        // Wait for the page to load
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        
        // Find username element
        WebElement ele = driver.findElement(By.id("username"));
        ele.clear();
        ele.sendKeys("deepak");
        
        // Find password element
        ele = driver.findElement(By.id("passwd"));
        ele.clear();
        ele.sendKeys("deepak_pass");
        
        
     // Find date element
        ele = driver.findElement(By.id("dob"));
        ele.clear();
        ele.sendKeys("05-01-1998");
        
        // Find Submit button and click on button.
        ele = driver.findElement(By.cssSelector("[type=submit]"));
        ele.click();
        
        // Wait for the page to fully load after submission
        wait.until(ExpectedConditions.titleIs("success"));
        
        // Get the title of the page
        String title = driver.getTitle();
        System.out.println("Title: " + title);
        
        // Assert the title
        Assert.assertEquals("success", title);
        
        sleep(10);
        
        driver.close();
    }
    
    
    @Test
    public void testInvalidPass() {
        System.setProperty(
                "webdriver.chrome.driver", 
                "/Users/deepak/Downloads/chromedriver-mac-arm64 3/chromedriver");
        
        WebDriver driver = new ChromeDriver();        
        System.out.println("Driver info: " + driver);
        
        // Full path where login.html is located.
        // You can click on html file and copy the path shown in your browser.
        //
        // Provide the URL where the login.html page is hosted
        String baseUrl = "file:///Users/deepak/Documents/Software%20Testing/8.1P-resources/pages/login.html";
        driver.get(baseUrl); // navigate to the URL
        
        // Wait for the page to load
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        
        // Find username element
        WebElement ele = driver.findElement(By.id("username"));
        ele.clear();
        ele.sendKeys("deepak");
        
        // Find password element
        ele = driver.findElement(By.id("passwd"));
        ele.clear();
        ele.sendKeys("deepak_pa23ss");
        
        
     // Find date element
        ele = driver.findElement(By.id("dob"));
        ele.clear();
        ele.sendKeys("05-01-1998");
        
        // Find Submit button and click on button.
        ele = driver.findElement(By.cssSelector("[type=submit]"));
        ele.click();
        
        // Wait for the page to fully load after submission
        wait.until(ExpectedConditions.titleIs("fail"));
        
        // Get the title of the page
        String title = driver.getTitle();
        System.out.println("Title: " + title);
        
        // Assert the title
        Assert.assertEquals("fail", title);
        
        driver.close();
    }
    

    @Test
    public void testnullfields() {
        System.setProperty(
                "webdriver.chrome.driver", 
                "/Users/deepak/Downloads/chromedriver-mac-arm64 3/chromedriver");
        
        WebDriver driver = new ChromeDriver();        
        System.out.println("Driver info: " + driver);
        
        // Full path where login.html is located.
        // You can click on html file and copy the path shown in your browser.
        //
        // Provide the URL where the login.html page is hosted
        String baseUrl = "file:///Users/deepak/Documents/Software%20Testing/8.1P-resources/pages/login.html";
        driver.get(baseUrl); // navigate to the URL
        
        // Wait for the page to load
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        
        // Find username element
        WebElement ele = driver.findElement(By.id("username"));
        ele.clear();
        ele.sendKeys("");
        
        // Find password element
        ele = driver.findElement(By.id("passwd"));
        ele.clear();
        ele.sendKeys("");
        
        
     // Find date element
        ele = driver.findElement(By.id("dob"));
        ele.clear();
        ele.sendKeys("");
        
        // Find Submit button and click on button.
        ele = driver.findElement(By.cssSelector("[type=submit]"));
        ele.click();
        
        // Wait for the page to fully load after submission
        wait.until(ExpectedConditions.titleIs("fail"));
        
        // Get the title of the page
        String title = driver.getTitle();
        System.out.println("Title: " + title);
        
        // Assert the title
        Assert.assertEquals("fail", title);
        
        driver.close();
    }
    
    

    @Test
    public void testInvaliduser() {
        System.setProperty(
                "webdriver.chrome.driver", 
                "/Users/deepak/Downloads/chromedriver-mac-arm64 3/chromedriver");
        
        WebDriver driver = new ChromeDriver();        
        System.out.println("Driver info: " + driver);
        
        // Full path where login.html is located.
        // You can click on html file and copy the path shown in your browser.
        //
        // Provide the URL where the login.html page is hosted
        String baseUrl = "file:///Users/deepak/Documents/Software%20Testing/8.1P-resources/pages/login.html";
        driver.get(baseUrl); // navigate to the URL
        
        // Wait for the page to load
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        
        // Find username element
        WebElement ele = driver.findElement(By.id("username"));
        ele.clear();
        ele.sendKeys("dep3");
        
        // Find password element
        ele = driver.findElement(By.id("passwd"));
        ele.clear();
        ele.sendKeys("deepak_pass");
        
        
     // Find date element
        ele = driver.findElement(By.id("dob"));
        ele.clear();
        ele.sendKeys("05-01-1998");
        
        // Find Submit button and click on button.
        ele = driver.findElement(By.cssSelector("[type=submit]"));
        ele.click();
        
        // Wait for the page to fully load after submission
        wait.until(ExpectedConditions.titleIs("fail"));
        
        // Get the title of the page
        String title = driver.getTitle();
        System.out.println("Title: " + title);
        
        // Assert the title
        Assert.assertEquals("fail", title);
        
        driver.close();
    }
    
    
    @Test
    public void testInvalidDob() {
        System.setProperty(
                "webdriver.chrome.driver", 
                "/Users/deepak/Downloads/chromedriver-mac-arm64 3/chromedriver");
        
        WebDriver driver = new ChromeDriver();        
        System.out.println("Driver info: " + driver);
        
        // Full path where login.html is located.
        // You can click on html file and copy the path shown in your browser.
        //
        // Provide the URL where the login.html page is hosted
        String baseUrl = "file:///Users/deepak/Documents/Software%20Testing/8.1P-resources/pages/login.html";
        driver.get(baseUrl); // navigate to the URL
        
        // Wait for the page to load
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        
        // Find username element
        WebElement ele = driver.findElement(By.id("username"));
        ele.clear();
        ele.sendKeys("dep3");
        
        // Find password element
        ele = driver.findElement(By.id("passwd"));
        ele.clear();
        ele.sendKeys("deepak_pass");
        
        
     // Find date element
        ele = driver.findElement(By.id("dob"));
        ele.clear();
        ele.sendKeys("05-01-2000");
        
        // Find Submit button and click on button.
        ele = driver.findElement(By.cssSelector("[type=submit]"));
        ele.click();
        
        // Wait for the page to fully load after submission
        wait.until(ExpectedConditions.titleIs("fail"));
        
        // Get the title of the page
        String title = driver.getTitle();
        System.out.println("Title: " + title);
        
        // Assert the title
        Assert.assertEquals("fail", title);
        
        driver.close();
    }
    
    @Test
    public void testEmptyFields() {
        System.setProperty(
                "webdriver.chrome.driver", 
                "/Users/deepak/Downloads/chromedriver-mac-arm64 3/chromedriver");

        WebDriver driver = new ChromeDriver();        
        System.out.println("Driver info: " + driver);

        // Full path where login.html is located.
        // You can click on html file and copy the path shown in your browser.
        //
        // Provide the URL where the login.html page is hosted
        String baseUrl = "file:///Users/deepak/Documents/Software%20Testing/8.1P-resources/pages/login.html";
        driver.get(baseUrl); // navigate to the URL

        // Wait for the page to load
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));

        // Find username element
        WebElement ele = driver.findElement(By.id("username"));
        ele.clear();

        // Find password element
        ele = driver.findElement(By.id("passwd"));
        ele.clear();

        // Find date element
        ele = driver.findElement(By.id("dob"));
        ele.clear();

        // Find Submit button and click on button.
        ele = driver.findElement(By.cssSelector("[type=submit]"));
        ele.click();

        // Wait for the page to fully load after submission
        wait.until(ExpectedConditions.titleIs("fail"));

        // Get the title of the page
        String title = driver.getTitle();
        System.out.println("Title: " + title);

        // Assert the title
        Assert.assertEquals("fail", title);

        driver.close();
    }

    
}
