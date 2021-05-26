package pages;

import core.DriverUtil;
import org.openqa.selenium.By;

import java.io.IOException;

public class AskDoctorPage {
    By buttonAskDoctor = By.xpath("//a[@href='/askdoctor']");
    By buttonCreatNewQuestion = By.xpath("//button[@translate='createNewQuestion']");
    By txtHeight = By.xpath("//label[@translate='height']/preceding-sibling::input");
    By txtWeight = By.xpath("//label[@translate='weight']/preceding-sibling::input");
    By avatar = By.xpath("//p[@translate='isThisQuestionFor']//following-sibling::div/div[1]");
    By inputQuestion = By.xpath("//p[@translate='question']/following-sibling::div/textarea");
    By buttonCreate = By.xpath("//button[@translate='create']");
    By buttonAddPicture = By.xpath("//div[@class='btn-file pull-left']");
    By buttonComment = By.xpath("//button[contains(@class,'btn-comment')]");
    public void creatQuestionAskDoctor(String height, String weight, String question) {
        DriverUtil.waitMiliseconds(10 * 1000);
        DriverUtil.click(buttonAskDoctor);
        DriverUtil.waitForElementGetText(By.xpath("//div[@class='scroll-height']/div"), 10 * 1000);
        DriverUtil.click(buttonCreatNewQuestion);

        DriverUtil.waitElementToBeClickable(10 * 1000, avatar);
        DriverUtil.click(txtHeight);
        DriverUtil.clear(txtHeight);
        DriverUtil.senKey(txtHeight, height);
        DriverUtil.clear(txtWeight);
        DriverUtil.senKey(txtWeight, weight);
        DriverUtil.senKey(inputQuestion,question);
        DriverUtil.click(buttonCreate);
    }
    public void addPictureForQuestion(){
        DriverUtil.waitMiliseconds(10*1000);
        DriverUtil.click(buttonAddPicture);
        try {
            Runtime.getRuntime().exec("D:\\SourceCode\\addPicture_AskDoctor.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
        DriverUtil.waitMiliseconds(10*1000);
        DriverUtil.click(buttonComment);
    }

}
