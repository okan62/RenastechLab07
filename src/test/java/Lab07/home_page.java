package Lab07;

import Utils.DriverUtil;
import Utils.ReadingProperties;
import Utils.SmartBearLogin;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class home_page {
    @BeforeMethod
    public void runlogin(){

    }
    @Test
    public void home(){
        DriverUtil.getDriver().get(ReadingProperties.getProperties("url"));
        SmartBearLogin.logIn(DriverUtil.driver);
      String text= DriverUtil.driver.findElement(By.xpath("//td[contains(text(),'Manger')]")).getText();
      String expectedText="Manger Id : mngr392385";
      if(text.equals(expectedText)){
          System.out.println("Home page verification has been SUCCESSFULLY PASSED!!!!");
      }
      else
          System.out.println("HomePage verification FAILED!!!!!");
    }
}
