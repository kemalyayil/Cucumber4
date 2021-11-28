//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KielLoginPage extends BasePage {
    @FindBy(
            name = "email"
    )
    public WebElement emailKutusu;
    @FindBy(
            name = "sifre"
    )
    public WebElement sifreKutusu;

    public KielLoginPage() {
    }
}
