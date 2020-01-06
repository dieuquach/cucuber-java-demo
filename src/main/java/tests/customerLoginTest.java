package tests;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.customerLoginPage;
import runner.TestRunner;

public class customerLoginTest {
    customerLoginPage cusLoginPage;

    @When("^I click Customer Login button$")
    public void clickCusLogBtn() throws InterruptedException {
        cusLoginPage = new customerLoginPage(TestRunner.driver);
        Thread.sleep(3000);
        cusLoginPage.clickCusLogBtn();
    }

    @When("^I select (.*) in the YourName label$")
    public void select_Customer_Name(String userSelect) throws InterruptedException {
        cusLoginPage = new customerLoginPage(TestRunner.driver);
        Thread.sleep(3000);
        cusLoginPage.chooseYourName(userSelect);
    }

    @When("^I click Login button$")
    public void clickLogBtn() throws InterruptedException {
        cusLoginPage = new customerLoginPage(TestRunner.driver);
        Thread.sleep(3000);
        cusLoginPage.clickLogBtn();
    }

    @Then("^I verify Harry Potter is already selected in the YourName label")
    public void verify_CusLog() throws InterruptedException {
        Thread.sleep(3000);
        cusLoginPage.checkAccount();
    }

    //CheckManageDepWithd======================
    @When("^I click DepositTop button$")
    public void clickDepTopBtn() throws InterruptedException {
        Thread.sleep(3000);
        cusLoginPage.clickDepTopBtn();
    }

    @When("^I type Amount to be Deposited as (.*)$")
    public void inputAmountDep(String numberDep) throws InterruptedException {
        Thread.sleep(3000);
        cusLoginPage.inputAmountDep(numberDep);
    }

    @When("^I click DepositBottom button$")
    public void clickDepBottomBtn() throws InterruptedException {
        Thread.sleep(3000);
        cusLoginPage.clickDepBottomBtn();
    }

    @Then("^I verify Deposit Successful")
    public void verify_Deposit() throws InterruptedException {
        Thread.sleep(3000);
        cusLoginPage.checkInputAmountDep();
    }

    @When("^I click WithdrawTop button$")
    public void clickWithdTopBtn() throws InterruptedException {
        Thread.sleep(3000);
        cusLoginPage.clickWithdTopBtn();
    }

    @When("^I type Amount to be Withdrawn as (.*)$")
    public void inputAmountWithd(String numberWithd) throws InterruptedException {
        Thread.sleep(3000);
        cusLoginPage.inputAmountWithd(numberWithd);
    }

    @When("^I click WithdrawBottom button$")
    public void clickWithdBottomBtn() throws InterruptedException {
        Thread.sleep(3000);
        cusLoginPage.clickWithdBottomBtn();
    }

    @Then("^I verify Withdraw successful")
    public void verify_Withdraw() throws InterruptedException {
        Thread.sleep(3000);
        cusLoginPage.checkInputAmountWithd();
    }

    @When("^I click Transaction button$")
    public void clickTransBtn() throws InterruptedException {
        Thread.sleep(3000);
        cusLoginPage.clickTransactionBtn();
    }

    @Then("^I verify all of information of Deposit display at Transaction page")
    public void verify_Dep_Tran() throws InterruptedException {
        Thread.sleep(3000);
        cusLoginPage.verify_Deposit_Transaction();
    }

    @Then("^I verify all of information of Withdraw display at Transaction page")
    public void verify_Withd_Tran() throws InterruptedException {
        Thread.sleep(3000);
        cusLoginPage.verify_Withdraw_Transaction();
    }

    @When("^I click Back button$")
    public void clickBackBtn() throws InterruptedException {
        Thread.sleep(3000);
        cusLoginPage.clickBackBtn();
    }

    @When("^I click Logout button$")
    public void clickLogOutBtn() throws InterruptedException {
        Thread.sleep(3000);
        cusLoginPage.clickLogOutBtn();
    }

    @When("^I click Home Button$")
    public void clickHomeBtn() throws InterruptedException {

    }

}
