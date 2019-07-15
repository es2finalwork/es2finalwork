package es2finalproject;

public class Calculos {
	
	public double TMB(String sexo, Double peso, Double altura, Integer idade) throws ErrorException {
		double TMBtotal;
		
		if(sexo == "Masculino") {
			TMBtotal = 66.50 + (13.80 * peso) + (5 * altura) - (6.8 * idade);
		}
		
		else if (sexo == "Feminino") {
			TMBtotal = 655.1 + (9.5 * peso) + (1.8 * altura) - (4.7 * idade);
		}
		
		else {
			System.out.println("Erro! Sexo nao especificado");
			throw new ErrorException();
		}
		
		if(peso == 0 || altura == 0 || idade == 0) {
			System.out.println("Erro! Parametros de entrada para calcular TMB nao estão especificados!");
			throw new ErrorException();
		}
		
		if(TMBtotal < 450) {
			System.out.println("Erro! TMB é demasiado baixo");
			throw new ErrorException();
		}
		
		else if (TMBtotal > 6000) {
			System.out.println("Erro! TMB é demasiado alta");
			throw new ErrorException();
		}
		
		return TMBtotal;
		
	}
	
	public double FatorAtividade (String Fator) throws ErrorException {
		double FA;
		
		if(Fator == "Acamado") {
			FA = 1.2;
		}
		
		else if (Fator == "Acamado + móvel") {
			FA = 1.25;
		}
		
		else if (Fator == "Deambulando") {
			FA = 1.3;
		}
		
		else if (Fator == "Paciente não complicado") {
			FA = 1;
		}

		else if (Fator == "Pós operatório oncológico") {
			FA = 1.1;
		}
		
		else if (Fator == "Fratura ossos longos") {
			FA = 1.2;
		}
		
		else if (Fator == "Sepse moderada") {
			FA = 1.3;
		}
		
		else if (Fator == "Peritonite") {
			FA = 1.4;
		}
		
		else if (Fator == "Politrauma em reabilitação") {
			FA = 1.5;
		}
		
		else if (Fator == "Politrauma + Sepse") {
			FA = 1.6;
		}
		
		else if (Fator == "Queimadura 30 a 50%") {
			FA = 1.7;
		}
		
		else if (Fator == "Queimadura 50 a 70%") {
			FA = 1.8;
		}
		
		else if (Fator == "Queimadura 70 a 90%") {
			FA = 2;
		}
		
		else {
			System.out.println("Erro! Não existe esse fator de Atividade");
			throw new ErrorException();
		}
		
		return FA;
	}
	
	public double FatorTermico (Integer Fator) throws ErrorException {
		double FT;
		
		if(Fator == 38) {
			FT = 1.1;
		}
		
		else if (Fator == 39) {
			FT = 1.2;
		}
		
		else if (Fator == 40) {
			FT = 1.3;
		}
		
		else if (Fator == 41) {
			FT = 1.4;
		}
		
		else{
			System.out.println("Erro! Não existe esse fator de Termico");
			throw new ErrorException();
		}
		
		return FT;
		
	}
	
	public Double GastoEnergeticoTotal(Double TMB, Double FA, Double FL, Double FT) throws ErrorException{
		
		if(TMB != 0.00 && FA != 0.00 && FL != 0.00 && FT != 0.00) {
			return TMB * FA * FL * FT;
		}
		else {
			System.out.println("Erro! Valores de entrada no calculo de gasto energetico total não estão corretos!");
			throw new ErrorException();
		}
	}
	
	public Double CalculoTresSimples(Double valor1, Double valor2, Double valor3) throws ErrorException {
		if(valor1 != 0 && valor2 != 0 && valor3 != 0) {
			return (valor1 * valor3) / valor2;
		}
		else {
			System.out.println("Erro! Valores de entrada no calculo dos três simples está incorreto!");
			throw new ErrorException();
		}
	}
	
	//VCT - Valor Calorico total
	public Double CalculoVCT(Double TMB, Double Atividade) throws ErrorException{
		if(TMB != 0.00 && Atividade != 0.00) {
			return TMB * Atividade;
		}
		else {
			System.out.println("Erro! Valores de entrada no calculo do VCT não estão corretos!");
			throw new ErrorException();
		}
	}
	
	//Distribuição dos MacroNutrientes
	public Double DistribuicaoMacHC(Double vct, Double hidratos) throws ErrorException{
		if(vct != 0.00 && hidratos != 0.00) {
			return vct * hidratos;
		}
		else {
			System.out.println("Erro! Valores de entrada no calculo do Distribuição MAC de Hidratos não estão corretos!");
			throw new ErrorException();
		}
			
	}
	
	public Double DistribuicaoMacP(Double vct, Double proteina) throws ErrorException{
		if(vct != 0.00 && proteina != 0.00) {
			return vct * proteina;
		}
		else {
			System.out.println("Erro! Valores de entrada no calculo do Distribuição MAC de Proteina não estão corretos!");
			throw new ErrorException();
		}
		}
	
	public Double DistribuicaoMacG(Double vct, Double gorduras) throws ErrorException{
		if(vct != 0.00 && gorduras != 0.00) {
			return vct * gorduras;
		}
		else {
			System.out.println("Erro! Valores de entrada no calculo do Distribuição MAC de Gorduras não estão corretos!");
			throw new ErrorException();
		}
	}
}
