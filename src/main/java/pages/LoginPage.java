package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WaitUtils;

public class LoginPage extends BasePage {

    @FindBy(id = "username")
    private WebElement usernameTxt;

    @FindBy(id = "password")
    private WebElement passwordTxt;

    @FindBy(css = "button[type='submit']")
    private WebElement loginBtn;

    @FindBy(id = "flash")
    private WebElement flashMessage;

    // ---------------------------
    // Login action
    // ---------------------------
    public void login(String username, String password) {
        WaitUtils.waitForVisible(usernameTxt);

        usernameTxt.clear();
        usernameTxt.sendKeys(username);

        passwordTxt.clear();
        passwordTxt.sendKeys(password);

        loginBtn.click();
    }

    // ---------------------------
    // Read flash success / error message
    // ---------------------------
    public String getFlashMessage() {
        String msg = flashMessage.getText();
        return msg.replace("\n", "").trim();
    }
}
