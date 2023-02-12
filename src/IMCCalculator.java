public class IMCCalculator {
    private double weight;
    private double height;
    private double bmi;

    public IMCCalculator(double weight, double height) {
        this.weight = weight;
        this.height = height;
        this.bmi = calculateBMI();
    }

    private double calculateBMI() {
        return weight / (height * height);
    }

    public double getBMI() {
        return bmi;
    }

    public String getWeightCategory() {
        if (bmi < 18.5) {
            return "Abaixo do peso";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Peso normal";
        } else if (bmi >= 25 && bmi < 30) {
            return "Sobrepeso";
        } else if (bmi >= 30 && bmi < 35) {
            return "Obesidade grau 1";
        } else if (bmi >= 35 && bmi < 40) {
            return "Obesidade grau 2";
        } else {
            return "ATENÇÃO - Obesidade grau 3";
        }
    }
}