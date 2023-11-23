package tugas;


public class calculator {
    // Atribut
    private double value1;
    private double value2;

    // Metode untuk mengatur dan mendapatkan value1
    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    // Metode untuk mengatur dan mendapatkan value2
    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    // Metode untuk menetapkan nama proyek
    public void setNameProject() {
        System.out.println("Calculator Project");
    }

    // Metode untuk menetapkan catatan proyek
    public void setNoteProject(String note) {
        System.out.println("Note: " + note);
    }

    // Metode untuk melakukan penjumlahan
    public double add(double val1, double val2) {
        return val1 + val2;
    }

    // Metode untuk melakukan pengurangan
    public double subtract(double val1, double val2) {
        return val1 - val2;
    }

    // Metode untuk melakukan perkalian
    public double multiplication(double val1, double val2) {
        return val1 * val2;
    }

    // Metode untuk melakukan pembagian
    public double division(double val1, double val2) {
        if (val2 == 0) {
            System.out.println("Error: Division by zero");
            return Double.NaN; // NaN (Not-a-Number) untuk mengindikasikan kesalahan
        }
        return val1 / val2;
    }

    public static void main(String[] args) {
        calculator calculator = new calculator();
        calculator.setNameProject();
        calculator.setNoteProject("This is a simple calculator program.");

        calculator.setValue1(10.0);
        calculator.setValue2(5.0);

        System.out.println("Value 1: " + calculator.getValue1());
        System.out.println("Value 2: " + calculator.getValue2());

        System.out.println("Addition: " + calculator.add(calculator.getValue1(), calculator.getValue2()));
        System.out.println("Subtraction: " + calculator.subtract(calculator.getValue1(), calculator.getValue2()));
        System.out.println("Multiplication: " + calculator.multiplication(calculator.getValue1(), calculator.getValue2()));
        System.out.println("Division: " + calculator.division(calculator.getValue1(), calculator.getValue2()));
    }
}