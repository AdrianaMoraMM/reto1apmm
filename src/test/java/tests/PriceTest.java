package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import hooks.TestBase;
import pages.InitPage;
import pages.ItemPage;


public class PriceTest extends TestBase{

    ItemPage itemProduct = new ItemPage(driver);
    InitPage initPage =new InitPage();
    

    @ParameterizedTest
    @CsvSource(value = {
        "Phones|Samsung galaxy s6| $360 *includes tox",
        "Phones|Nokia lumia 1520| $820 *includes tax",
        "Laptops|Sony vaio i5| $790 *includes tax",
        "Laptops|MacBook air| $700 *includes tax",
        "Monitors|ASUS Full HD| $230 *includes tax",
        "Monitors|Apple monitor 24| $400 *includes tax"
    }, delimiter = '|')
    public void loginTest(String type,String item, String price){

  

        initPage.clickItems(driver,type);
        itemProduct.searchPhoneProduct(item,driver);
        
        

        String value=itemProduct.searchPhonePrice(driver);
        
        assertEquals(price, value,"El precio obtenido no es el correcto");
    }
    }

