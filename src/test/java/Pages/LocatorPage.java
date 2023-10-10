package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocatorPage extends Parent {
    public LocatorPage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(linkText = "Register")
    public WebElement RegisterClick;
    @FindBy(id = "customer.firstName")
    public WebElement firisName;
    @FindBy(id = "customer.lastName")
    public WebElement lastName;
    @FindBy(id = "customer.address.street")
    public WebElement Address;
    @FindBy(id = "customer.address.city")
    public WebElement City;
    @FindBy(id = "customer.address.state")
    public WebElement State;
    @FindBy(id = "customer.address.zipCode")
    public WebElement Zip_Code;
    @FindBy(id = "customer.phoneNumber")
    public WebElement phone;
    @FindBy(id = "customer.ssn")
    public WebElement SSN;
    @FindBy(id = "customer.username")
    public WebElement userName;
    @FindBy(id = "customer.password")
    public WebElement userPassword;

    @FindBy(id = "repeatedPassword")
    public WebElement repetPassword;
    @FindBy(css = "input[value='Log In']")
    public WebElement btnRegister;
    @FindBy(id = "rightPanel")
    public WebElement rightPanel;
    @FindBy(linkText = "An internal error has occurred and has been logged.")
    public WebElement error;
    @FindBy(css = "input[name='username']")
    public WebElement logUserName;
    @FindBy(css = "input[name='password']")
    public WebElement logUserPass;
    @FindBy(css = "input[value='Log In']")
    public WebElement logBtn;
    @FindBy(linkText = "Log Out")
    public WebElement succesly;
    @FindBy(xpath = "//h1[contains(text(),'Bill Payment Complete')]")
    public WebElement paymentSuccesly;
    @FindBy(xpath = "//a[contains(text(),'Bill Pay')]")
    public WebElement billPay;
    @FindBy(css = "input[name='payee.name']")
    public WebElement payName;
    @FindBy(css = "input[name='payee.phoneNumber']")
    public WebElement payPhoneNum;
    @FindBy(css = "input[name='payee.accountNumber']")
    public WebElement payAccountNum;
    @FindBy(css = "input[name='verifyAccount']")
    public WebElement verifyAccount;
    @FindBy(css = "input[name='amount']")
    public WebElement amount;
    @FindBy(css = "input[value='Send Payment']")
    public WebElement btnSendPayment;
    @FindBy(css = "input[name='payee.address.street']")
    public WebElement payAdders;
    @FindBy(css = "input[name='payee.address.city']")
    public WebElement payCity;
    @FindBy(css = "input[name='payee.address.state']")
    public WebElement payState;
    @FindBy(css = "input[name='payee.address.zipCode']")
    public WebElement payCode;
    @FindBy(xpath = "//a[contains(text(),'Open New Account')]")
    public WebElement openNewAcc;
    @FindBy(id = "type")
    public WebElement typeAcc;
    @FindBy(css = "input[type='submit']")
    public WebElement openNewAccBtn;
    @FindBy(xpath = "//h1[contains(text(),'Account Opened!')]")
    public WebElement newAccountSucc;

    @FindBy(xpath = "//a[contains(text(),'Accounts Overview')]")
    public WebElement accountOverview;

    @FindBy(xpath = " //h1[contains(text(),'Accounts Overview')]")
    public WebElement overviewSucc;
    @FindBy(xpath = " //a[contains(text(),'13455')]")
    public WebElement accountNum;
    @FindBy(xpath = " //h1[contains(text(),'Account Details')]")
    public WebElement accountDetailsSucc;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "openNewAcc":
                return this.openNewAcc;
            case "typeAcc":
                return this.typeAcc;
            case "openNewAccBtn":
                return this.openNewAccBtn;
            case "newAccountSucc":
                return this.newAccountSucc;
            case "RegisterClick":
                return this.RegisterClick;
            case "firisName":
                return this.firisName;
            case "lastName":
                return this.lastName;
            case "Address":
                return this.Address;
            case "City":
                return this.City;
            case "State":
                return this.State;
            case "Zip_Code":
                return this.Zip_Code;
            case "phone":
                return this.phone;
            case "SSN":
                return this.SSN;
            case "userName":
                return this.userName;
            case "userPassword":
                return this.userPassword;
            case "repetPassword":
                return this.repetPassword;
            case "btnRegister":
                return this.btnRegister;
            case "rightPanel":
                return this.rightPanel;
            case "error":
                return this.error;
            case "logUserName":
                return this.logUserName;
            case "logUserPass":
                return this.logUserPass;
            case "logBtn":
                return this.logBtn;
            case "succesly":
                return this.succesly;
            case "billPay":
                return this.billPay;
            case "payName":
                return this.payName;
            case "payPhoneNum":
                return this.payPhoneNum;
            case "payAccountNum":
                return this.payAccountNum;
            case "verifyAccount":
                return this.verifyAccount;
            case "amount":
                return this.amount;
            case "btnSendPayment":
                return this.btnSendPayment;
            case "payAdders":
                return this.payAdders;
            case "payCity":
                return this.payCity;
            case "payState":
                return this.payState;
            case "payCode":
                return this.payCode;
            case "paymentSuccesly":
                return this.paymentSuccesly;
            case "accountOverview":return this.accountOverview;
            case "overviewSucc":return this.overviewSucc;
            case "accountNum":return this.accountNum;
            case "accountDetailsSucc": return this.accountDetailsSucc;
        }
        return null;
    }

}
