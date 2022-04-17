package Lab07;

import Utils.DriverUtil;
import Utils.ReadingProperties;
import Utils.SmartBearLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Customer {
    @Test
    public void newCustomer(){
        DriverUtil.getDriver().get(ReadingProperties.getProperties("url"));
        SmartBearLogin.logIn(DriverUtil.driver);
        DriverUtil.driver.findElement(By.xpath("//a[contains(text(),'New Customer')]")).click();
        String actual=DriverUtil.driver.findElement((By.xpath("//p[contains(text(),'Add New Customer')]"))).getText();
        String expected="Add New Customer";
        if(actual.equalsIgnoreCase(expected)){
            System.out.println("You are in Add New Customer Page");
        }else
            System.out.println("Add New Customer Page Verification FAILED!!!!!");

        DriverUtil.driver.findElement(By.name("name")).sendKeys("Okan");
        DriverUtil.driver.findElement(By.xpath("//input[@value='m']")).click();
        DriverUtil.driver.findElement(By.id("dob")).sendKeys("001992-27-10");
        DriverUtil.driver.findElement(By.name("addr")).sendKeys("113 foxridge Dr");
        DriverUtil.driver.findElement(By.name("city")).sendKeys("Scarborough");
        DriverUtil.driver.findElement(By.name("state")).sendKeys("Ontario");
        DriverUtil.driver.findElement(By.name("pinno")).sendKeys("629262");
        DriverUtil.driver.findElement(By.name("telephoneno")).sendKeys("4169938765");
        DriverUtil.driver.findElement(By.name("emailid")).sendKeys("hiGuyss@gmail.com");
        DriverUtil.driver.findElement(By.name("password")).sendKeys("CemoMunzur62");
        DriverUtil.driver.findElement(By.name("sub")).click();

        String title=DriverUtil.driver.findElement(By.xpath("//p[contains(text(),'Successfully!!!')]")).getText();
        if(title.contains("Success")){
            System.out.println("Registration successful");
        }
        else
            System.out.println("Please check the information again!!!!");

    }

}
