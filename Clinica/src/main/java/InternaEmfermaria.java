public class InternaEmfermaria implements Internacao {
    private int QtdeDias;
    public InternaEmfermaria(int QtdeDias){
        this.QtdeDias = QtdeDias;
    }
    public float contabilizarDiaria(){
        float valorDiarias = 0.0f;

		if (getQtdeDias() <= 3) {
			valorDiarias += 40.00 * getQtdeDias(); // Internação Básica
		} else if (getQtdeDias() <= 8) {
			valorDiarias += 35.00 * getQtdeDias(); // Internação Média
		} else {
			valorDiarias += 30.00 * getQtdeDias(); // Internação Grave
		}
        return valorDiarias;
			
				
			
		
    }


    public int getQtdeDias(){
        return QtdeDias;
    }
}
