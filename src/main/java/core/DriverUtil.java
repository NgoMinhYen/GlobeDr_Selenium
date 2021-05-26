package core;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class DriverUtil {


    public static WebDriver webDriver;

    public static WebDriver getWebDriver() {
        return webDriver;

    }

    public static void close() {
        getWebDriver().close();
    }

    public static void get(String s) {
        getWebDriver().get(s);
    }

    public static void getCurrentUrl() {
        getWebDriver().getCurrentUrl();
    }

    public static void getPageSource() {
        getWebDriver().getPageSource();
    }

    public static void quit() {
        getWebDriver().quit();
    }

    public static void switchTo() {
        getWebDriver().switchTo();
    }


    public static void initDriver(DriverType driverType) {
        switch (driverType) {
            case IE:
                System.setProperty("webdriver.ie.driver", "src/main/resources/IEDriverServer.exe");
                webDriver = new InternetExplorerDriver();
                break;
            case CHROME:
                System.setProperty("webdriver.chrome.driver",
                        "src/main/resources/chromedriver.exe");
                webDriver = new ChromeDriver();

                break;
            case FIRE_FOX:
                System.setProperty("webdriver.gecko.driver",
                        "src/main/resources/geckodriver.exe");
                webDriver = new FirefoxDriver();
                break;
            default:

        }
    }

    public static void maximizeWindow() {
        getWebDriver().manage().window().maximize();
    }

    public static void navigateTo(String link) {
        getWebDriver().navigate().to(link);
    }

    public static WebElement findElement(By by) {
        return getWebDriver().findElement(by);
    }

    public static List<WebElement> findElements(By by) {
        return getWebDriver().findElements(by);
    }


    public static void click(By by) {
        findElement(by).click();

    }

    public static void clear(By by) {
        findElement(by).clear();
    }


    public static Dimension getSize(By by) {
      return  findElement(by).getSize();
    }

    public static void waitMiliseconds(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void waitingTime(int time) {
        waitMiliseconds(time * 1000);
    }

    public static void implicit() {
        getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void waitInvisibilityOfElementLocated(int time, By by) {
        WebDriverWait wait = new WebDriverWait(webDriver, time * 1000);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public static void invisibilityOf(int time, WebElement element) {
        WebDriverWait wait = new WebDriverWait(webDriver, time);
        wait.until(ExpectedConditions.invisibilityOf(element));

    }

    public static void waitElementToBeClickable(int time, By by) {
        WebDriverWait wait = new WebDriverWait(webDriver, time * 1000);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void waitVisibilityOfElementLocated(int time, By by) {
        WebDriverWait wait = new WebDriverWait(webDriver, time * 1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void waitPresenceOfElementLocated(int time, By by) {
        WebDriverWait wait = new WebDriverWait(webDriver, time * 1000);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public static void senKey(By by, String s) {
        findElement(by).sendKeys(s);
    }

    public static void waitForElementNotChange(By by, int waitConditionLocator) {
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, waitConditionLocator);
        webDriverWait.until(new Function<WebDriver, Boolean>() {
            @Override
            public Boolean apply(WebDriver webDriver) {
                WebElement e = webDriver.findElement(by);
                Point oldP = e.getLocation();
                waitMiliseconds(200);
                Point newP = e.getLocation();
                return oldP.equals(newP);
            }
        });
    }

    public static void waitForElementGetText(By by, int waitConditionLocator) {
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, waitConditionLocator);
        webDriverWait.until(new Function<WebDriver, Boolean>() {
            @Override
            public Boolean apply(WebDriver webDriver) {
                WebElement e = webDriver.findElement(by);
                System.out.println("!!! " + e.getText());
                return !e.getText().isEmpty();
            }
        });
    }

    public static String getText(By by) {
        return findElement(by).getText();
    }

    public static void takeSnapShot( String filePath){

        TakesScreenshot scrShot = ((TakesScreenshot) webDriver);
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File(filePath);

        try {
            FileUtils.copyFile(SrcFile,DestFile);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
