package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SmartBearLogin {
    public static void logIn(WebDriver driver){
        DriverUtil.driver.findElement(By.name("uid")).sendKeys(ReadingProperties.getProperties("userId"));
        DriverUtil.driver.findElement(By.name("password")).sendKeys(ReadingProperties.getProperties("userPassword"));
        DriverUtil.driver.findElement(By.name("btnLogin")).click();
    }
}
