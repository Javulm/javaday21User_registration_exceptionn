import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    String result;
    @Test
    public void firstName_IsValid_PassTest() {
        result = UserRegistration.isValidFirstName("Javul");
        Assert.assertEquals("Happy", result);
    }
    @Test
    public void firstName_IsValid_FailTest() {
        result = UserRegistration.isValidFirstName("Javul1.23j");
        Assert.assertEquals("Sad",result);
    }

    @Test
    public void lastName_IsValid_PassTest() {
        result = UserRegistration.isValidLastName("Mulla");
        Assert.assertEquals("Happy",result);
    }
    @Test
    public void lastName_IsValid_FailTest() {
        result = UserRegistration.isValidLastName("Mulla.1");
        Assert.assertEquals("Sad",result);
    }

    @Test
    public void Email_IsValid_PassTest() {
        result = UserRegistration.isValidEmail("javullmulla8@gmail.co.in");
        Assert.assertEquals("Happy",result);
    }

    @Test
    public void Email_IsValid_FailTest() {
        result = UserRegistration.isValidEmail("javulmulla8.gmail.co.in1");
        Assert.assertEquals("Sad",result);
    }

    @Test
    public void phoneNumber_isValidMobileNo() {
        result = UserRegistration.isValidPhoneNo("91 9876543210");
        Assert.assertEquals("Happy",result);
    }

    @Test
    public void phoneNumber_IsValid_FailTest() {
        result = UserRegistration.isValidPhoneNo("89 55655668");
        Assert.assertEquals("Sad",result);
    }

    @Test
    public void password_IsValid_PassTest1() {
        result = UserRegistration.isValidPassword1("javulmulla");
        Assert.assertEquals("Happy",result);
    }
    @Test
    public void password_IsValid_FailTest1() {
        result = UserRegistration.isValidPassword1("Jl121");
        Assert.assertEquals("Sad",result);
    }

    @Test
    public void password_IsValid_PassTest2() {
        result = UserRegistration.isValidPassword2("Javulmulla");
        Assert.assertEquals("Happy", result);
    }
    @Test
    public void password_IsValid_FailTest2() {
        result = UserRegistration.isValidPassword2("javulmulla1");
        Assert.assertEquals("Sad", result);
    }
    @Test
    public void password_IsValid_PassTest3() {
        result = UserRegistration.isValidPassword3("Javulmulla1");
        Assert.assertEquals("Happy", result);
    }
    @Test
    public void password_IsValid_FailTest3() {
        result = UserRegistration.isValidPassword3("Javulmulla");
        Assert.assertEquals("Sad", result);
    }
    @Test
    public void password_IsValid_PassTest4() {
        result = UserRegistration.isValidPassword4("Javulm@11");
        Assert.assertEquals("Happy", result);
    }
    @Test
    public void password_IsValid_FailTest4() {
        result = UserRegistration.isValidPassword4("Javul1234");
        Assert.assertEquals("Sad", result);
    }
}
