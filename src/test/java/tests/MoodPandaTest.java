package tests;

import org.testng.annotations.Test;

public class MoodPandaTest extends BaseTest {

    @Test
    public void login() {
        loginPage
                .openPage()
                .login("stpuninski@gmail.com", "Poltosik_228")
                .openRateHappinessModal()
                .updateMood(10)
                .goToMyDiary();
    }
}