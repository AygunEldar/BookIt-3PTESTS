package com.bookIt.step_definitions;

import com.bookIt.utilites.BookITUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class APIStepDefin {

    String token;
    String emailGlobal;
    String passwordGlobal;

@When("User logs in BookIT API using {string} and {String]")
    public void user_logs_in_BookIT_API_using_and(String email, String password){
    token = BookITUtils.generateToken(email,password);
    emailGlobal=email;
    passwordGlobal= password;
}

    @Then("User gets API information")
    public void user_gets_API_information() {



}

}
