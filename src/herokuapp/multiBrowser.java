package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multiBrowser {
    static String browser = "Chrome";
    static WebDriver driver;
    static String baseurl = "http://the-internet.herokuapp.com/login";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else if (browser.equalsIgnoreCase("FireFox")){
            driver = new FirefoxDriver();
        }else {
            System.out.println("Wrong browser name");
        }

        driver.get(baseurl);
        //get the title of the page
        System.out.println("Page title : " + driver.getTitle());
        //Print the current url
        System.out.println("Current URL : "+ driver.getCurrentUrl());
        //print the page source
        System.out.println("Page source : " + driver.getPageSource());
        //enter the email to email field
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        //enter the password to password field
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        //close the browser
        //driver.close();

    }
}
