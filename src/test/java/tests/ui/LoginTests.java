package tests.ui;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends BaseTest {

    @Test
    public void verifyValidLogin() {
        LoginPage page = new LoginPage();
        page.login("tomsmith", "SuperSecretPassword!");

        String message = page.getFlashMessage();
        Assert.assertTrue(
    message.toLowerCase().contains("you logged into a secure area"),
    "Login success message should be displayed"
		);

    }
}
