public class ProcediComum implements Procedimento {
    float valorTotalProcedimentos = 0.00f;
	int qtdeProcedimentosComuns = 0;
	
    public double ContabilizarProc(){
        qtdeProcedimentosComuns++;
        valorTotalProcedimentos += 150.00;
        return valorTotalProcedimentos;  
    }
    
}
