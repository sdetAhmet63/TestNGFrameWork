package com.techproed.tests;
import com.techproed.pages.GooglePage;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.Driver;
import com.techproed.utilities.TestBaseFinal;
import org.testng.Assert;
import org.testng.annotations.Test;
public class GoogleGmailTest extends TestBaseFinal {
    @Test
    public void gmailTest() throws InterruptedException {
        extentTest = extentReports.createTest("Gmail Test" , "Gmail.com'a Google üzerinden erişim testi");
        extentTest.info("Google.com'a gidiyoruz.");
        Driver.getDriver().get(ConfigurationReader.getProperty("google_link"));
        extentTest.info("GooglePage'den nesne üretiyoruz.");
        GooglePage googlePage = new GooglePage();
        extentTest.info("gmailLinki webelementine tıklıyoruz.");
        googlePage.gmailLinki.click();
        extentTest.info("3 saniye bekliyoruz.");
        Thread.sleep(3000);
        extentTest.info("Assert işlemi yap.");
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Gmail"));
        extentTest.pass("Testimiz PASSED !");
    }
}