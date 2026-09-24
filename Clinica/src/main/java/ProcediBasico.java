public class ProcediBasico implements Procedimento {
    float valorTotalProcedimentos = 0.00f;
	int qtdeProcedimentosBasicos = 0;
	int qtdeProcedimentosComuns = 0;
	int qtdeProcedimentosAvancados = 0;
    
    public double ContabilizarProc(){
        qtdeProcedimentosBasicos++;
		valorTotalProcedimentos += 50.00;
        return valorTotalProcedimentos;
    }
}
