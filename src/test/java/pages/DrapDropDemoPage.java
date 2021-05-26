package pages;

import core.DriverUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
//import java.awt.Point;
import java.awt.*;
import java.awt.event.InputEvent;
import java.util.List;

public class DrapDropDemoPage {
    By draggable = By.xpath("//div[@id='todrag']//span");
    By dropTo = By.id("mydropzone");

    public void drapItemsAndDropItem(String text) {
        Point newLocation = DriverUtil.findElement(dropTo).getLocation();
        List<WebElement> listElemnet = DriverUtil.findElements(draggable);
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        for (WebElement element : listElemnet) {
            if (element.getText().equals(text)) {
                Point locationCurrent = element.getLocation();
                System.out.println("HHHH: " + locationCurrent.x + "va" + locationCurrent.y);
                robot.mouseMove(locationCurrent.x+120, locationCurrent.y+120);
                DriverUtil.waitMiliseconds(10 * 1000);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseMove(newLocation.x+120, newLocation.y+120);
                DriverUtil.waitMiliseconds(10 * 1000);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                JavascriptExecutor jr = (JavascriptExecutor) DriverUtil.getWebDriver();
                System.out.println("gg:" +  jr.executeScript("return window.outerHeight"));

            }
        }

    }
}
