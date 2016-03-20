package com.tempcon.converter;

/**
 * Created by suhas on 3/20/16.
 */
public class TemperatureConverter {

    public static float fahrenheitToCelsius(float fahrenheit){
        return ((fahrenheit - 32) * 5 / 9);
    }

    public static float celsiusToFahrenheit(float celsius){
        return (((celsius * 9)/5) + 32);
    }
}
