package com.example.caseStudydemo;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class functionClass {
    public String baseUrl="https://www.akbank.com";
    private String price="50000";
    public int sayac=8;
    SelenideElement creditPrice=$("#t-credit-price");
    SelenideElement radioButtonOne=$(withText("SİGORTASIZ"));
    SelenideElement decreaseDueButton=$(byXpath("//a[@class=\"step-btn decrease\"]"));
    SelenideElement paymentPlanTab=$(byXpath("//div[@class=\"jspPane\"]"));
    SelenideElement lastDueInstallment=$(byXpath("//*[@id=\"content-2\"]/div/div[1]/table/tbody/tr[21]/td[1]"));
    SelenideElement costAndCostRatios=$("#accordion1");
    SelenideElement paymentPlan=$("#accordion2");
    SelenideElement calculationDetails=$(withText("Hesaplama Detayları"));

    void goUrl(){
        Selenide.open(baseUrl);
    }
    void scrollProcess(SelenideElement element){
        element.scrollIntoView(true);
    }
    void creditPriceProcess(){
        creditPrice.clear();
        creditPrice.sendKeys(price);
    }
    void Sleep() throws InterruptedException {
        Thread.sleep(3000);
    }
    void dueDateProcess(){
        for (int i = 0; i < sayac; i++) {
            actions().click(decreaseDueButton).build().perform();
        }
    }

    void Assertions(SelenideElement element){
        element.shouldBe(visible);
    }
    void clickActions(SelenideElement element){
        element.click();
    }
}
