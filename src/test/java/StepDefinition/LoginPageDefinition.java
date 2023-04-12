package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
public class LoginPageDefinition {
    @Steps
    StepLoginPage loginPage;
    @Steps
    StepDashboardPage dashPage;

    /*@Steps
     StepForgetPasswordPage forgetpasswordPage;*/
    @Given("User is on Home page")
    public void openApplication() {
        loginPage.open();
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Page is opened");
    }

    @When("User enters username as {string}")
    public void enterUsername(String userName) {
        System.out.println("Enter Username");
        loginPage.inputUserName(userName);
    }

    @When("User enters password as {string}")
    public void enterPassword (String passWord) {
        loginPage.inputPassword(passWord);

        loginPage.clickLogin();
    }

    @Then("User should be able to login successfully")
    public void clickOnLoginButton()
    {
        dashPage.loginVerify();
    }


    @Given("User is on Home page1")
    public void openApplication1() {
        loginPage.open();
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Page is opened");
    }

    @When("User enters username {string}")
    public void enterUsername1(String userName) {
        System.out.println("admin");
        loginPage.inputUserName(userName);
    }
    @And("User enters password {string}")
    public void enterPassword1(String password) {
        loginPage.inputPassword(password);

        loginPage.clickLogin();
    System.out.println("admin");
    }
    @Then("User should not be able to login successfully")
    public void clickOnLoginButton1() {
        System.out.println("Invalid");
    }
    @Given("User is on Home page2")
    public void openApplication2() {
        loginPage.open();
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Page is opened");
    }
    @When("User enters username as2 {string}")
    public void enterUsername2(String userName) {
        System.out.println("admin");
        loginPage.inputUserName(userName);
    }
    @And("User enters password as2 {string}")
    public void enterPassword2(String password) {
        loginPage.inputPassword(password);

        loginPage.clickLogin();
        System.out.println("admin123");
    }
    @Given("User is on Home page3")
    public void openApplication3() {
        loginPage.open();
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Page is opened");
    }
    @When("User enters username as3 {string}")
    public void enterUsername3(String userName) {
        System.out.println("admin");
        loginPage.inputUserName(userName);
    }
    @And("User enters password as3 {string}")
    public void enterPassword3(String passWord) {
        loginPage.inputPassword(passWord);

        loginPage.clickLogin();
        System.out.println("admin123");
    }
    @Given("Username is on Home page4")
    public void openApplication4() {
        loginPage.open();
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Page is opened");
    }
    @When("User enters username as4 {string}")
    public void enterUsername4(String userName) {
        System.out.println(" ");
        loginPage.inputUserName(userName);
    }
    @And("User enters password as4 {string}")
    public void enterPassword4(String passWord) {
        loginPage.inputPassword(passWord);

        loginPage.clickLogin();
        System.out.println(" ");
    }
}



