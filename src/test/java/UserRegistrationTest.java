import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    Boolean result;
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        result = UserRegistration.isValidFirstName("Javul");

    }
    @Test
    public void givenFirstName_WhenImProper_ShouldReturnTrue() {
        try {
            UserRegistration.isValidFirstName("javul1.23j");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        result = UserRegistration.isValidLastName("Mulla");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenLastName_WhenImProper_ShouldReturnInvalidMessage() {
            try {
                    UserRegistration.isValidLastName("Mulla.1");
            }catch (UserRegistrationException e) {
                Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_LAST_NAME, e.exceptionType);
                System.out.println(e.getMessage());
            }
    }

    @Test
    public void givenProperEmailShouldReturnTrue() {
        result = UserRegistration.isValidEmail("javullmulla8@gmail.co.in");
        Assert.assertEquals(true,result);
    }

    @Test
    public void  givenImProperEmailShouldReturnInvalidMessage() {
        try {
            UserRegistration.isValidEmail("javulmulla8.gmail.co.in1");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_EMAIL, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenProperPhoneNumberShouldReturnTure() {
        result = UserRegistration.isValidPhoneNo("91 9876543210");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenimProperPhoneNumberShouldReturnInvalidMessage() {
        try {
            UserRegistration.isValidPhoneNo("89 55655668");
        }catch (UserRegistrationException e){
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PHONE_NUMBER, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenProperPassword1ShouldReturnTrue() {
        result = UserRegistration.isValidPassword1("javulmulla");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenImProperPassword1ShouldReturnInvalidMessage() {
        try {
            UserRegistration.isValidPassword1("Jl121");
        }catch (UserRegistrationException e){
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void password_IsValid_PassTest2() {
        result = UserRegistration.isValidPassword2("Javulmulla");

    }
    @Test
    public void password_IsValid_FailTest2() {
        try {
            UserRegistration.isValidPassword2("javulmulla1");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void password_IsValid_PassTest3() {
        result = UserRegistration.isValidPassword3("Javulmulla1");

    }
    @Test
    public void password_IsValid_FailTest3() {
        try {
            UserRegistration.isValidPassword3("Javulmulla");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void password_IsValid_PassTest4() {
        result = UserRegistration.isValidPassword4("Javulm@11");

    }
    @Test
    public void password_IsValid_FailTest4() {
        try {
            UserRegistration.isValidPassword4("Javul1234");
        }catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, e.exceptionType);
            System.out.println(e.getMessage());
        }
    }
}
