package com.tw;

public class MultiplicationTable {
    public String create(int start, int end) {
        return null;
    }

    public Boolean isValid(int start, int end) {
        return isInRange(start) && isInRange(end) && isStartNotBiggerThanEnd(start, end);
    }

    public Boolean isInRange(int number) {
        return number>=1 && number<=1000;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {

        return start<=end;
    }

    public String generateTable(int start, int end) {
        String combineLine = new String();
        for(int i=start; i<=end; i++){
            combineLine = combineLine + generateSingleExpression(i, end) + System.lineSeparator();
        }
        return combineLine.trim();
    }

    public String generateLine(int start, int row) {
        String expressionLine = new String();
        for(int i=start; i<=row; i++){
            expressionLine = expressionLine + generateSingleExpression(i, row) + "  ";
        }
        return expressionLine.trim();
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        String expression = new String();
        int product = multiplicand * multiplier;
        expression = multiplicand + "*" + multiplier + "=" + product;
        return expression;
    }
}
