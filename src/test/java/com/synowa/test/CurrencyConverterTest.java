package com.synowa.test;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class CurrencyConverterTest {
    @Test
    public void testConvertToPln() {
        String targetCurrency = "PLN";
        BigDecimal eurAmount = new BigDecimal("42");
        BigDecimal expectedResult = new BigDecimal("186.93");

        CurrencyConverter converter = new CurrencyConverter();
        BigDecimal actualResult = converter.execute(targetCurrency, eurAmount);

        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testInvalidCurrency() {
        String targetCurrency = "OLA";
        BigDecimal eurAmount = new BigDecimal("42");
        BigDecimal expectedResult = null;

        CurrencyConverter converter = new CurrencyConverter();
        BigDecimal actualResult = converter.execute(targetCurrency, eurAmount);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
