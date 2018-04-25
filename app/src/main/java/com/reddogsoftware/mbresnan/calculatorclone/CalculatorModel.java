package com.reddogsoftware.mbresnan.calculatorclone;

public class CalculatorModel {
    private Double accumulator;
    private String inputValue;

    public CalculatorModel() {}

    public Double getAccumulator() {
        return accumulator;
    }

    public void setAccumulator(Double accumulator) {
        this.accumulator = accumulator;
    }

    public String getInputValue() {
        return inputValue;
    }

    public void setInputValue(String inputValue) {
        this.inputValue = inputValue;
    }

    public void concatInput(String input) {
        this.inputValue = this.inputValue + input;
    }
}
