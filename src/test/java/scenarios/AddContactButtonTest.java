package scenarios;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddContactButtonTest extends DriverSetup {

    @BeforeClass
    public void setUp() throws Exception {
        prepareNative();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void clickButtonTest() {
        String app_package_name = "com.example.android.contactmanager:id/";
        By add_btn = By.id(app_package_name + "addContactButton");
//        By add_btn = By.xpath("//android.widget.Button[@content-desc=\"Add Contact\"]");
//        By add_btn = By.className("android.widget.Button");
        driver.findElement(add_btn).click();
        System.out.println("Simplest Appium test done");
    }
}
