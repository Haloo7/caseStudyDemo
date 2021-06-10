package com.example.caseStudydemo;


import org.junit.jupiter.api.Test;


public class MainTest {

    private functionClass page=new functionClass();

    @Test
    void caseStudyExampleOne() throws InterruptedException {
        page.goUrl();
        page.scrollProcess(page.creditPrice);
        page.creditPriceProcess();
        page.clickActions(page.radioButtonOne);
        page.Sleep();
        page.dueDateProcess();
        page.clickActions(page.calculationDetails);
        page.Assertions(page.costAndCostRatios);
        page.clickActions(page.paymentPlan);
        page.Assertions(page.paymentPlanTab);
        page.scrollProcess(page.lastDueInstallment);
    }
}
