package pages;

import core.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class LoginPage {

    By buttonLogin = By.xpath("//a[contains(@translate,'signIn')]");
    By labelEmailOrPhone = By.xpath("//label[@translate='emailOrPhone']");
    By txtUserName = By.id("UserName");
    By txtPassWord = By.id("Password");
    By selectCountry = By.xpath("//select");
    By optionCountry = By.xpath("//select/option");
    By buttonSignIn = By.xpath("//button[@translate='signIn']");


    public void login(String userName, String passWord, String country) {

//        DriverUtil.waitMiliseconds(20 * 1000);
        DriverUtil.waitElementToBeClickable(20 * 1000, buttonLogin);
        DriverUtil.click(buttonLogin);
        DriverUtil.senKey(txtUserName, userName);
        DriverUtil.senKey(txtPassWord, passWord);
//        DriverUtil.waitMiliseconds(10 * 1000);
        DriverUtil.waitElementToBeClickable(10 * 1000, selectCountry);
        DriverUtil.click(selectCountry);
        List<WebElement> elementList = DriverUtil.findElements(optionCountry);
        for (WebElement element : elementList) {
            if (element.getText().equals(country)) {
                element.click();
            }
        }
        DriverUtil.click(buttonSignIn);
        DriverUtil.waitMiliseconds(10 * 1000);
    }

    public boolean loginSuccess() {
        DriverUtil.waitForElementGetText(By.xpath("//div//li[2]//span"), 10 * 1000);
        String text = DriverUtil.getText(By.xpath("//div//li[2]//span"));
        System.out.println("hhhhhh:" + text);
        return text.equals("Bắp nhỏ");

    }

}
