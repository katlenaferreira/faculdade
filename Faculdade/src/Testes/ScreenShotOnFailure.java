package Testes;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.apache.commons.io.FileUtils;
import org.junit.rules.MethodRule;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class ScreenShotOnFailure implements MethodRule {
	private WebDriver driver;


	public ScreenShotOnFailure(WebDriver driver){
		this.driver = driver;	
	}		

			public Statement apply(final Statement statement, final FrameworkMethod frameworkMethod, Object o) {
			return new Statement() {
			@Override	
			 public void evaluate() throws Throwable {
                try {
                    statement.evaluate();
                } catch (Throwable t) {
    
                    captureScreenShot(frameworkMethod.getName());
                  
                    throw t;
                }
			 }

            public void captureScreenShot(String fileName) throws IOException {
                File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                String timeStamp = new SimpleDateFormat("dd-MM-yyyy").format(Calendar.getInstance().getTime());
                File targetFile = new File("Aqui vai o local que vc quer salvar os prints" + timeStamp + ".png");
                FileUtils.copyFile(scrFile, targetFile);
            }
        };
    }
}