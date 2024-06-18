package com.wilmer.currencyconverter.conections;

import java.util.Map;

public record ValuesMoney(String base_code, Map<String, Double>conversion_rates) {
    //tipe of values for converter
}
