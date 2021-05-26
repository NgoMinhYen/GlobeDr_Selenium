package core;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.testng.*;

public class Listener implements ITestListener {


    @Override
    public void onFinish(ITestContext context) {
        System.out.println("onFinish");
        System.out.println("ll:"+ context.getHost() + context.getName());
        // not implemented
    }

    @Override
    public void onStart(ITestContext arg0) {
        System.out.println("onStart" );
    }


    @Override
    public void onTestSuccess(ITestResult arg0) {
        System.out.println("kkk:"+ arg0.getStatus());
    }
    @Override
    public void onTestFailure(ITestResult arg0) {
        System.out.println("onTestFailure"+ arg0.getStatus());
        DriverUtil.waitMiliseconds(2*1000);
        DriverUtil.takeSnapShot("D://test.jpg");
    }
    @Override
    public void onTestStart(ITestResult arg0) {
        System.out.println("onTestStart");
    }
    @Override
    public void onTestSkipped(ITestResult arg0) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        System.out.println("onTestFailedButWithinSuccessPercentage"+ arg0.getStatus());
    }

}
