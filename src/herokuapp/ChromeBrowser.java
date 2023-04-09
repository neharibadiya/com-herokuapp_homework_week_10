package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseurl = "http://the-internet.herokuapp.com/login";
        //launch the crome browser
        WebDriver driver = new ChromeDriver();
        //open url into browser
        driver.get(baseurl);
        //maximize the browser
        driver.manage().window().maximize();
        //print the title of the page
        System.out.println("page title : " + driver.getTitle());
        //print current url
        System.out.println("Current URL : " + driver.getCurrentUrl());
        //print the page source
        System.out.println("Page source : " + driver.getPageSource());
        //find the email field element
        WebElement emailField = driver.findElement(By.id("username"));
        //enter the email to email field
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        //enter the password to password field
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        //close the browser
        //driver.close();
    }


}
