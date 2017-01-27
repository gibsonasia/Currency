package com.example.asiagibson.currency;

/**
 * Created by asiagibson on 1/27/17.
 */

public class RateData {
    private String base;

    private Rates rates;

    private String date;

    public String getBase ()
    {
        return base;
    }

    public void setBase (String base)
    {
        this.base = base;
    }

    public Rates getRates ()
    {
        return rates;
    }

    public void setRates (Rates rates)
    {
        this.rates = rates;
    }

    public String getDate ()
    {
        return date;
    }

    public void setDate (String date)
    {
        this.date = date;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [base = "+base+", rates = "+rates+", date = "+date+"]";
    }
}
