package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItemPage {
    
    WebDriver driver;
    //Elementos de la pagina

    private By txtPrice= By.xpath("/html/body/div[5]/div/div[2]/h3");
    


    public ItemPage(WebDriver driver){
        this.driver=driver;
    }
    
    public void searchPhoneProduct(String text, WebDriver driver) {

    
        WebElement elementList = driver.findElement(By.partialLinkText(text));        
        elementList.click();
        
    }

    public String searchPhonePrice(WebDriver driver){

        WebElement priceElement = driver.findElement(txtPrice);
        return(priceElement.getText());
        
    

    }
}
