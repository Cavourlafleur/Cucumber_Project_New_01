package Page_CavourTask;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.support.PageFactory;

public class DialogCavour extends MyMethods {
    public DialogCavour() {
        PageFactory.initElements(DriverClass.getDriver(),this);
    }


    }
