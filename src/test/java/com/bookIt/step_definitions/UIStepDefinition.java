package com.bookIt.step_definitions;

import com.bookIt.pages.SelfPage;
import com.bookIt.pages.SignInPage;
import com.bookIt.utilites.ConfigurationReader;
import com.bookIt.utilites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UIStepDefinition {

    public  static String UIName;
    public static String UIRole;
    public static String UICampus;
    public static String UITeam;
    public static String UIBatch;

    SignInPage signInPage =new SignInPage();
    SelfPage selfPage = new SelfPage();

    @Given("user logs in with {string} and {string}")
    public void user_logs_in_with_and(String string, String string2) {
        Driver.get().get(ConfigurationReader.get("url"));

        signInPage.email.sendKeys(email);
        signInPage.password.sendKeys(password);
        signInPage.signInButton.click();
    }

    @When("user navigates to mySelf page")
    public void user_navigates_to_mySelf_page() throws InterruptedException {

        selfPage.goToSelf();
        Thread.sleep(3000);
    }

    @Then("user gets UI info")
    public void user_gets_UI_info() {

UIName = selfPage.name.getText();
UIBatch = selfPage.batch.getText();
UITeam = selfPage.team.getText();
UICampus = selfPage.campus.getText();
UIRole = selfPage.role.getText();

    }

}
