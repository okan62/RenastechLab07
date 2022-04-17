package Base;

import Utils.DriverUtil;
import Utils.ReadingProperties;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestBase {

    @BeforeMethod
    public void setUp(){

        DriverUtil.getDriver().manage().window().maximize();
        DriverUtil.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


}
