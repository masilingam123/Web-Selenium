package com.qa.steps;

import com.qa.base.Base;
import com.qa.page.Page;
import io.cucumber.java.en.*;

public class Steps extends Base {
    @Given("initiate browser")
    public void initiate_browser() {
       initbrowser();
    }
    @When("navigate to website")
    public void navigate_to_website() {
        navigate("https://eqaroloflow.co.za/wp/my-account/");
    }
    @When("enter username and password hit login button")
    public void enter_username_and_password_hit_login_button() {
 sendkeys(Page.usernamebtn,"TestUser");
sendkeys(Page.passwordbtn,"Tester5027#");
        click(Page.loginbtn);
    }
    @Then("got to shop page")
    public void got_to_shop_page() {
        click(Page.shopbtn);
    }
    @Then("got to technonlogy page")
    public void gotToTechnonlogyPage() {
        click(Page.technologtbtn);
    }
    @Then("add the ipad in card")
    public void add_the_ipad_in_card() {
        click(Page.addtocartbtn);
    }
    @Then("check out")
    public void check_out() throws InterruptedException {
        click(Page.proceedchckoutbtn);
        Thread.sleep(5000);
    }
    @Then("place the order")
    public void place_the_order() throws InterruptedException {
        click(Page.placeorder);
        Thread.sleep(5000);
    }
    @Then("print the order number")
    public void print_the_order_number() {
        gettext(Page.odernumber);

    }


}
