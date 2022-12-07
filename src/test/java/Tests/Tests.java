package Tests;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends BaseTests {
    String Option = "Price: High to Low";

    @Test
    public void FirstTestCase() {
        HomePage.ClickOnHamburgerMenu();
        HomePage.SelectTvAppliances();
        pages.Televisions Televisions = HomePage.SelectTelevisions();
        pages.SamsungTvs SamsungTvs = Televisions.Filter_With_Samsung_Brand();
        SamsungTvs.SortHighToLow(Option);
        pages.SecondHighestPricedTv SecondTv = SamsungTvs.GetAllAvailableTvs();
        Assert.assertTrue(SecondTv.AboutThisItemSection().isDisplayed());
        Assert.assertTrue(SecondTv.GetSectionInfoText().contains("About this item"));
        System.out.println(SecondTv.GetSectionInfoText());
    }

}