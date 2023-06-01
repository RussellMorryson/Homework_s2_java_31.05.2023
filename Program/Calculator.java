package Program;

class Calculator {
    protected String synbol;
    protected double number1;
    protected double number2;

    protected void setSynbol(String synbol) {
        this.synbol = synbol;
    }
    protected String getSynbol() {
        return synbol;
    }

    protected void setNumber1(double number1) {
        this.number1 = number1;
    }
    protected double getNumber1() {
        return number1;
    }

    protected void setNumber2(double number2) {
        this.number2 = number2;
    }
    protected double getNumber2() {
        return number2;
    }

    protected double operation() {
        switch(synbol) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                return number1 / number2;
            default:
                System.out.println("Введен некорректный символ");
                return 0;
        }
    }
}