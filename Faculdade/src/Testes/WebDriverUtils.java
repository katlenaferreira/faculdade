package Testes;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class WebDriverUtils {
    WebDriver driver;
    
    public WebDriverUtils(WebDriver driver){
        this.driver = driver;    
    
    }
    
    
   
    public void takeScreenShotFullPage() throws IOException{
        File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String timeStamp = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss").format(Calendar.getInstance().getTime());
        FileUtils.copyFile(screenShotFile, new File("Aqui vai o URL do local que vc quer salvar os prints" +  timeStamp + ".png"));
}
}
