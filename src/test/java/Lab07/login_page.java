package Lab07;

import Base.TestBase;
import Utils.DriverUtil;
import Utils.ReadingProperties;
import Utils.SmartBearLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class login_page extends TestBase {
    @Test
    public void lab07(){
        DriverUtil.getDriver().get(ReadingProperties.getProperties("url"));
        WebElement present=DriverUtil.driver.findElement(By.xpath("//h2[contains(text(),'Guru99')]"));
        if(present.isDisplayed()){
            System.out.println("Guru99 Bank is Present on Login Page");
        }else
            System.out.println("Guru99 Bank is NOT present");

        SmartBearLogin.logIn(DriverUtil.driver);

    }

}
