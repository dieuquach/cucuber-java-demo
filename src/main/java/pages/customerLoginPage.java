package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class customerLoginPage {
    private WebDriver driver;
    @FindBy (xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div[1]/button")
    WebElement cusLogButton;

    @FindBy (id = "userSelect")
    WebElement userSelect;

    @FindBy (xpath = "/html/body/div[3]/div/div[2]/div/form/button")
    WebElement loginBtn;

    @FindBy (xpath = "/html/body/div[3]/div/div[2]/div/div[1]/strong/span")
    WebElement account;

    //ManageDepWithd==========================
    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[3]/button[2]")
    WebElement depositTopBtn;

    @FindBy (xpath = "/html/body/div[3]/div/div[2]/div/div[4]/div/form/div/input")
    WebElement amount;

    @FindBy (xpath = "/html/body/div[3]/div/div[2]/div/div[4]/div/form/button")
    WebElement depositBottomBtn;

    @FindBy (xpath = "/html/body/div[3]/div/div[2]/div/div[4]/div/span")
    WebElement amountLabel;

    @FindBy (xpath = "/html/body/div[3]/div/div[2]/div/div[3]/button[1]")
    WebElement transactionBtn;

    @FindBy (xpath = "/html/body/div[3]/div/div[2]/div/div[1]/button[1]")
    WebElement backBtn;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[3]/button[3]")
    WebElement WithdTopBtn;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[4]/div/form/button")
    WebElement WithdBottomBtn;

    @FindBy (xpath = "/html/body/div[3]/div/div[1]/button[2]")
    WebElement logOutBtn;

    @FindBy (xpath = "/html/body/div[3]/div/div[1]/button[1]")
    WebElement homeBtn;

    public customerLoginPage(WebDriver driver) {
        this.driver = driver;

        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public void clickCusLogBtn() throws InterruptedException {
        Thread.sleep(3000);
        cusLogButton.click();
    }

    public void chooseYourName(String userSelect){
        List<WebElement> listCustomerYourName = driver.findElements(By.tagName("option"));
        //duyet tung option trong list
        for(WebElement e : listCustomerYourName){
            if (e.getText().equalsIgnoreCase(userSelect)){
                e.click();
                break;
            }
        }
    }

    public void clickLogBtn() throws InterruptedException {
        Thread.sleep(3000);
        loginBtn.click();
    }

    public void checkAccount() throws InterruptedException {
        Thread.sleep(3000);
        if (account.getText().equalsIgnoreCase("Harry Potter")){
            System.out.println("Test Account Pass!");
        }
        else {
            System.out.println("Test Account Fail!");
        }
    }

    //CheckManageDepWithd=============
    public void clickDepTopBtn() throws InterruptedException {
        Thread.sleep(3000);
        depositTopBtn.click();
    }

    public void inputAmountDep(String numberDep) throws InterruptedException {
        Thread.sleep(3000);
        amount.sendKeys(numberDep);
    }

    public void clickDepBottomBtn() throws InterruptedException {
        Thread.sleep(3000);
        depositBottomBtn.click();
    }

    public void checkInputAmountDep() throws InterruptedException {
        Thread.sleep(3000);
        if (amountLabel.getText().equalsIgnoreCase("Deposit Successful")){
            System.out.println("Test Input Deposit Pass!");
        }
        else {
            System.out.println("Test Input Deposit Fail!");
        }
    }

    public void clickWithdTopBtn() throws InterruptedException {
        Thread.sleep(3000);
        WithdTopBtn.click();
    }

    public void inputAmountWithd(String numberWithd) throws InterruptedException {
        Thread.sleep(3000);
        amount.sendKeys(numberWithd);
    }

    public void clickWithdBottomBtn() throws InterruptedException {
        Thread.sleep(3000);
        WithdBottomBtn.click();
    }

    public void checkInputAmountWithd() throws InterruptedException {
        Thread.sleep(3000);
        if (amountLabel.getText().equalsIgnoreCase("Transaction successful")){
            System.out.println("Test Input Transaction Pass!");
        }
        else {
            System.out.println("Test Input Transaction Fail!");
        }
    }

    public void clickTransactionBtn() throws InterruptedException {
        Thread.sleep(3000);
        transactionBtn.click();
    }

    public void verify_Deposit_Transaction(){

    }

    public void verify_Withdraw_Transaction(){

    }

    public void clickBackBtn() throws InterruptedException {
        Thread.sleep(3000);
        backBtn.click();
    }

    public void clickLogOutBtn() throws InterruptedException {
        Thread.sleep(3000);
        logOutBtn.click();
    }

    public void clickHomeBtn() throws InterruptedException {
        Thread.sleep(3000);
        homeBtn.click();
    }


}
