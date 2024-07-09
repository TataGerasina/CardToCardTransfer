package ru.netology.web.page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.web.data.DataHelper;

import static com.codeborne.selenide.Selenide.$;

public class LoginPageV1 {

    private final SelenideElement loginField = $("[data-test-id=login] input");
    private final SelenideElement passwordField = $("[data-test-id=password] input");
    private final  SelenideElement loginButton = $("[data-test-id=action-login]");

    public VerificationPage validLogin(DataHelper.AuthInfo  info) {
        loginField.setValue(info.getLogin());
        passwordField.setValue(info.getPassword());
        loginButton.click();
        return new VerificationPage();
    }
}


    //public VerificationPage validLogin(DataHelper.AuthInfo info) {

      //  $("[data-test-id=login] input").setValue(info.getLogin());
       // $("[data-test-id=password] input").setValue(info.getPassword());
       // $("[data-test-id=action-login]").click();
      //  return new VerificationPage();
  //  }
//}
