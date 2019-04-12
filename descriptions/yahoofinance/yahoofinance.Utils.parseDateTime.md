**Method:** `yahoofinance.Utils.parseDateTime(Ljava/lang/String;Ljava/lang/String;Ljava/util/TimeZone;)Ljava/util/Calendar;`
**Transformations:** `null`

| Transformations | Infection | Propagation | Testable |
|-----------------|-----------|-------------|----------|
| `null`          | Y         | Y           | A        |

# Environment

Covered by 3 test classes.

## Method

```Java

public class Utils {
    
    public static Calendar parseDateTime(String date, String time, TimeZone timeZone) {
        String datetime = date + " " + time;
        SimpleDateFormat format = new SimpleDateFormat("M/d/yyyy h:mma", Locale.US);
        
        format.setTimeZone(timeZone);
        try {
            if (Utils.isParseable(date) && Utils.isParseable(time)) {
                Calendar c = Calendar.getInstance();
                c.setTime(format.parse(datetime));
                return c;
            }
        } catch (ParseException ex) {
            log.warn("Failed to parse datetime: " + datetime);
            log.debug("Failed to parse datetime: " + datetime, ex);
        }
        return null;
    }

}

public class StockQuote {
    public Calendar getLastTradeTime(TimeZone timeZone) {
        return Utils.parseDateTime(this.lastTradeDateStr, this.lastTradeTimeStr, timeZone);
    }

    public Calendar getLastTradeTime() {
        return lastTradeTime;
    }
}

public class StockQuotesData {
    
   public StockQuote getQuote() {
        String symbol = this.getValue(QuotesProperty.Symbol);
        StockQuote quote = new StockQuote(symbol);
        
        quote.setPrice(Utils.getBigDecimal(this.getValue(QuotesProperty.LastTradePriceOnly)));
        quote.setLastTradeSize(Utils.getLong(this.getValue(QuotesProperty.LastTradeSize)));
        quote.setAsk(Utils.getBigDecimal(this.getValue(QuotesProperty.AskRealtime), this.getValue(QuotesProperty.Ask)));
        quote.setAskSize(Utils.getLong(this.getValue(QuotesProperty.AskSize)));
        quote.setBid(Utils.getBigDecimal(this.getValue(QuotesProperty.BidRealtime), this.getValue(QuotesProperty.Bid)));
        quote.setBidSize(Utils.getLong(this.getValue(QuotesProperty.BidSize)));
        quote.setOpen(Utils.getBigDecimal(this.getValue(QuotesProperty.Open)));
        quote.setPreviousClose(Utils.getBigDecimal(this.getValue(QuotesProperty.PreviousClose)));
        quote.setDayHigh(Utils.getBigDecimal(this.getValue(QuotesProperty.DaysHigh)));
        quote.setDayLow(Utils.getBigDecimal(this.getValue(QuotesProperty.DaysLow)));
        
        quote.setTimeZone(ExchangeTimeZone.getStockTimeZone(symbol));
        quote.setLastTradeDateStr(this.getValue(QuotesProperty.LastTradeDate));
        quote.setLastTradeTimeStr(this.getValue(QuotesProperty.LastTradeTime));
        quote.setLastTradeTime(Utils.parseDateTime(this.getValue(QuotesProperty.LastTradeDate), this.getValue(QuotesProperty.LastTradeTime), quote.getTimeZone()));
        
        quote.setYearHigh(Utils.getBigDecimal(this.getValue(QuotesProperty.YearHigh)));
        quote.setYearLow(Utils.getBigDecimal(this.getValue(QuotesProperty.YearLow)));
        quote.setPriceAvg50(Utils.getBigDecimal(this.getValue(QuotesProperty.FiftydayMovingAverage)));
        quote.setPriceAvg200(Utils.getBigDecimal(this.getValue(QuotesProperty.TwoHundreddayMovingAverage)));
        
        quote.setVolume(Utils.getLong(this.getValue(QuotesProperty.Volume)));
        quote.setAvgVolume(Utils.getLong(this.getValue(QuotesProperty.AverageDailyVolume)));
        
        return quote;
    }
}
```

## Test
```Java
    @Test
    public void singaporeStockQuoteTest() throws IOException {
        Stock stock = YahooFinance.get("C6L.SI");

        assertEquals("C6L.SI", stock.getSymbol());
        assertEquals("SIA", stock.getName());
        assertEquals("SGD", stock.getCurrency());
        assertEquals("SES", stock.getStockExchange());

        assertNotNull(stock.getQuote());
        assertNotNull(stock.getStats());
        assertNotNull(stock.getDividend());

        assertEquals(new BigDecimal("10.89"), stock.getQuote().getAsk());
        assertEquals(new Long(300), stock.getQuote().getLastTradeSize());
        assertEquals(new BigDecimal("10.84"), stock.getQuote().getPreviousClose());
        assertEquals(new BigDecimal("9.57"), stock.getQuote().getYearLow());

        assertEquals(new BigDecimal("0.00"), stock.getStats().getPeg());
        assertEquals(new BigDecimal("0.82"), stock.getStats().getEps());
        assertEquals(new BigDecimal("11.44"), stock.getStats().getBookValuePerShare());
        assertNull(stock.getStats().getOneYearTargetPrice());
        assertEquals(new BigDecimal("0.00"), stock.getStats().getShortRatio());

        assertEquals(7, stock.getDividend().getExDate().get(Calendar.MONTH));
        assertEquals(2, stock.getDividend().getExDate().get(Calendar.DAY_OF_MONTH));
        assertNull(stock.getDividend().getAnnualYield());
        assertNull(stock.getDividend().getAnnualYieldPercent());
    }
```

## Observations

In this case, the value of the date should not be null and therefore could be 
asserted from the test case.
The method is used only in `StockQuote` and `StockQuoteData` but related to the *last trade time* and not to other dates in the class.
The covering test classes are filled with test methods such as the one shown above. The program infection propagates to 
expressions such as `assertEquals(new BigDecimal("10.89"), stock.getQuote().getAsk());` the value of `lastTradeTime` for the`StockQuote` instance returned by `stock.getQuote()` should be non-null, but it is null in the execution of the tests under the extreme transformation. The value of the field could be observed with the result of the parameterless overload of  `getLastTradeTime`.

