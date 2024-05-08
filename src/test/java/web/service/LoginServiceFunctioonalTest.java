package web.service;
import org.junit.Assert;
import org.junit.Test;
import web.service.LoginService;

public class LoginServiceFunctioonalTest {

    @Test
    public void testValidLogin() {
        Assert.assertTrue(LoginService.login("deepak", "deepak_pass", "1998-01-05"));
    }

    @Test
    public void testInvalidUsername() {
        Assert.assertFalse(LoginService.login("invalid_username", "deepak_pass", "1998-01-05"));
    }

    @Test
    public void testInvalidPassword() {
        Assert.assertFalse(LoginService.login("deepak", "invalid_password", "1998-01-05"));
    }

    @Test
    public void testInvalidDateOfBirth() {
        Assert.assertFalse(LoginService.login("deep2k", "deepak_pa3ss", "1998-01-01"));
    }

    @Test
    public void testEmptyFields() {
        Assert.assertFalse(LoginService.login("", "", ""));
    }

    @Test
    public void testNullFields() {
        Assert.assertFalse(LoginService.login(null, null, null));
    }

    @Test
    public void testIncorrectDateOfBirthFormat() {
        Assert.assertFalse(LoginService.login("deepak", "deepak_pass", "01/01/1990"));
    }

    @Test
    public void testNullUsername() {
        Assert.assertFalse(LoginService.login(null, "deepak_pass", "1998-01-05"));
    }

    @Test
    public void testNullPassword() {
        Assert.assertFalse(LoginService.login("deepak", null, "1998-01-05"));
    }

    @Test
    public void testNullDateOfBirth() {
        Assert.assertFalse(LoginService.login("deepak", "deepak_pass", null));
    }

   
    @Test
    public void testDateOfBirthWithExtraCharacters() {
        Assert.assertFalse(LoginService.login("deepak", "deepak_pass", "1998-01-05 extra_characters"));
    }

    @Test
    public void testDateOfBirthWithInvalidMonth() {
        Assert.assertFalse(LoginService.login("deepak", "deepak_pass", "1998-13-05"));
    }
}
