package com.qa.page;

import org.openqa.selenium.By;

public class Page {

    public static By usernamebtn = By.id("username");
    public static By passwordbtn = By.id("password");
    public static By loginbtn = By.xpath("//*[contains(text(),'Log in')]");
    public static By shopbtn = By.xpath("//span[contains(text(),'Shop')]");
    public static By technologtbtn = By.xpath("//*[contains(text(),'Technology ')]");
    public static By ipad = By.xpath("//*[contains(text(),'Apple iPad 8th Gen WiFi Cellular 32GB')]");
    public static By addtocartbtn = By.xpath("(//*[contains(text(),'Add to cart')])[1]");
    public static By proceedchckoutbtn = By.xpath("//*[contains(text(),'Proceed to checkout')]");
    public static By placeorder = By.xpath("(//button[@type='submit'])[2]");
    public static By odernumber = By.xpath("//*[@id='post-54']/div/div/div/ul/li[1]/strong");

}
