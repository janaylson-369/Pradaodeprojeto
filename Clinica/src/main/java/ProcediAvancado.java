public class ProcediAvancado implements Procedimento {
    float valorTotalProcedimentos = 0.00f;
    int qtdeProcedimentosBasicos = 0;
    int qtdeProcedimentosComuns = 0;
    int qtdeProcedimentosAvancados = 0;
    
    public double ContabilizarProc(){
        qtdeProcedimentosAvancados++;
		valorTotalProcedimentos += 500.00;
        return valorTotalProcedimentos;
    }
}
