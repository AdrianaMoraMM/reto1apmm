package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InitPage {
    
    public InitPage() {
        //TODO Auto-generated constructor stub
    }

    public void clickItems(WebDriver driver,String items) {
       
        
        WebElement phoneButton = driver.findElement(By.xpath("//a[text()='"+items+"']"));
        phoneButton.click();
    }
}
