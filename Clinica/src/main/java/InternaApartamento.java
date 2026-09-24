public class InternaApartamento implements Internacao {
    private int QtdeDias;
    public InternaApartamento(int QtdeDias){
        this.QtdeDias = QtdeDias;
    }
    public float contabilizarDiaria(){
        float valorDiarias = 0.0f;

		if (getQtdeDias() <= 3) {
            valorDiarias += 100.00 * getQtdeDias(); // Internação Básica
        } else if (getQtdeDias() <= 8) {
            valorDiarias += 90.00 * getQtdeDias();  // Internação Média
        } else {
            valorDiarias += 80.00 * getQtdeDias();  // Internação Grave
        }
        return valorDiarias;
			
    }

    public int getQtdeDias(){
        return QtdeDias;
    }
}
