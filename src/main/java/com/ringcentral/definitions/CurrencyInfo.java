package com.ringcentral.definitions;


public class CurrencyInfo {
    /**
     * Internal identifier of a currency
     */
    public String id;
    /**
     * Official code of a currency
     */
    public String code;
    /**
     * Official name of a currency
     */
    public String name;
    /**
     * Graphic symbol of a currency
     */
    public String symbol;
    /**
     * Minor graphic symbol of a currency
     */
    public String minorSymbol;

    public CurrencyInfo id(String id) {
        this.id = id;
        return this;
    }

    public CurrencyInfo code(String code) {
        this.code = code;
        return this;
    }

    public CurrencyInfo name(String name) {
        this.name = name;
        return this;
    }

    public CurrencyInfo symbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public CurrencyInfo minorSymbol(String minorSymbol) {
        this.minorSymbol = minorSymbol;
        return this;
    }

}
