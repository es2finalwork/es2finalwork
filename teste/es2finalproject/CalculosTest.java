package es2finalproject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;


import org.junit.jupiter.api.Test;

class CalculosTest {
	
	
	//White-box
	
	//###############################################################################
	//###############################################################################
	//###############################################################################
	//TMB
	
	@Test
	void CalculoTMBValidos() throws ErrorException{
		Calculos c = new Calculos();
		
		// Valido Masculino
		String sexo = "Masculino";
		Double peso = 70.05;
		Double altura = 1.80;
		Integer idade = 20;
		Double resultado;
		
		resultado = 66.50 + (13.80 * peso) + (5* altura) - (6.8 * idade);
		
		assertEquals(resultado, c.TMB(sexo, peso, altura, idade), resultado);
		
		//Valido Feminino
		sexo = "Feminino";
		peso = 63.22;
		altura = 1.72;
		idade = 26;
		
		resultado = 655.1 + (9.5 * peso) + (1.8* altura) - (4.7 * idade);
		
		assertEquals(resultado, c.TMB(sexo, peso, altura, idade), resultado);
		
		
	}
	
	@Test
	void CalculoTMBInvalidosRetorno() throws ErrorException{
		Calculos c = new Calculos();
		
		// Valido Masculino
		String sexo = "Masculino";
		Double peso = 70.05;
		Double altura = 1.80;
		Integer idade = 20;
		Double resultado;
		
		resultado = 66.50 + (13.80 * peso) + (5* altura) - (6.8 * idade) + 3;
		
		Assert.assertNotEquals(c.TMB(sexo, peso, altura, idade), resultado);
		
	}
	
	@Test
	void CalculoTMBInvalidoSexo() throws ErrorException{
		Calculos c = new Calculos();
		
		String sexo = "";
		Double peso = 70.05;
		Double altura = 1.80;
		Integer idade = 20;

		assertThrows(ErrorException.class, ()-> {c.TMB(sexo, peso, altura, idade);});	
	}
	
	@Test
	void CalculoTMBInvalidoPeso() throws ErrorException{
		Calculos c = new Calculos();
		
		String sexo = "Feminino";
		Double peso = 0.00;
		Double altura = 1.80;
		Integer idade = 20;

		assertThrows(ErrorException.class, ()-> {c.TMB(sexo, peso, altura, idade);});	
	}
	
	@Test
	void CalculoTMBInvalidoAltura() throws ErrorException{
		Calculos c = new Calculos();
		
		String sexo = "Masculino";
		Double peso = 70.05;
		Double altura = 0.00;
		Integer idade = 20;

		assertThrows(ErrorException.class, ()-> {c.TMB(sexo, peso, altura, idade);});	
	}
	
	@Test
	void CalculoTMBInvalidoResultadoMinimo() throws ErrorException{
		Calculos c = new Calculos();
		
		String sexo = "Masculino";
		Double peso = 20.05;
		Double altura = 1.30;
		Integer idade = 9;

		assertThrows(ErrorException.class, ()-> {c.TMB(sexo, peso, altura, idade);});	
	}
	
	@Test
	void CalculoTMBInvalidoResultadoMaximo() throws ErrorException{
		Calculos c = new Calculos();
		
		String sexo = "Feminino";
		Double peso = 600.05;
		Double altura = 2.10;
		Integer idade = 6;

		assertThrows(ErrorException.class, ()-> {c.TMB(sexo, peso, altura, idade);});	
	}
	
	//###############################################################################
		//###############################################################################
		//###############################################################################
		//Fator Atividade
	
	@Test
	void CalculoFatorAtividadeValido() throws ErrorException{
		Calculos c = new Calculos();
		
		String fator = "Acamado";
		assertEquals(1.2, c.FatorAtividade(fator), 1.2);
		
		fator = "Acamado + móvel";
		assertEquals(1.25, c.FatorAtividade(fator), 1.25);
		
		fator = "Deambulando";
		assertEquals(1.3, c.FatorAtividade(fator), 1.3);
		
		fator = "Paciente não complicado";
		assertEquals(1, c.FatorAtividade(fator), 1);
		
		fator = "Pós operatório oncológico";
		assertEquals(1.1, c.FatorAtividade(fator), 1.1);
		
		fator = "Fratura ossos longos";
		assertEquals(1.2, c.FatorAtividade(fator), 1.2);
		
		fator = "Sepse moderada";
		assertEquals(1.3, c.FatorAtividade(fator), 1.3);
		
		fator = "Peritonite";
		assertEquals(1.4, c.FatorAtividade(fator), 1.4);
		
		fator = "Politrauma em reabilitação";
		assertEquals(1.5, c.FatorAtividade(fator), 1.5);
		
		fator = "Politrauma + Sepse";
		assertEquals(1.6, c.FatorAtividade(fator), 1.6);
		
		fator = "Queimadura 30 a 50%";
		assertEquals(1.7, c.FatorAtividade(fator), 1.7);
		
		fator = "Queimadura 50 a 70%";
		assertEquals(1.8, c.FatorAtividade(fator), 1.8);
		
		fator = "Queimadura 70 a 90%";
		assertEquals(2, c.FatorAtividade(fator), 2);
		
	}
	
	void CalculoFatorAtividadeInvalidoRetorno() throws ErrorException{
		Calculos c = new Calculos();
		
		String fator = "Acamado";
		Assert.assertNotEquals(c.FatorAtividade(fator), 1.3);
	}
	
	@Test
	void CalculoFatorAtividadeInvalido() throws ErrorException{
		Calculos c = new Calculos();
		
		String fator = "Nada";
		assertThrows(ErrorException.class, ()-> {c.FatorAtividade(fator);});	
	}
	
	//###############################################################################
			//###############################################################################
			//###############################################################################
			//Fator Termico
	
	@Test
	void CalculoFatorTermicoValido() throws ErrorException{
		Calculos c = new Calculos();
		
		Integer fator = 38;
		assertEquals(1.1, c.FatorTermico(fator), 1.1);
		
		fator = 39;
		assertEquals(1.2, c.FatorTermico(fator), 1.2);
		
		fator = 40;
		assertEquals(1.3, c.FatorTermico(fator), 1.3);
		
		fator = 41;
		assertEquals(1.4, c.FatorTermico(fator), 1.4);
	}
	
	@Test
	void CalculoFatorTermicoInvalido() throws ErrorException{
		Calculos c = new Calculos();
		
		Integer fator = 328;
		assertThrows(ErrorException.class, ()-> {c.FatorTermico(fator);});
	}
	
	@Test
	void CalculoFatorTermicoInvalidoNaoRetribuido() throws ErrorException{
		Calculos c = new Calculos();
		
		Integer fator = 41;
		Assert.assertNotEquals(12, c.FatorTermico(fator));
	}
	
	//###############################################################################
	//###############################################################################
	//###############################################################################
	//Gasto Energetico Total
	
	
	@Test
	void CalculoGastoEnergeticoTotalValido() throws ErrorException{
		Calculos c = new Calculos();
		
		Double resultado;
		Double TMB = 1000.30;
		Double FA = 1.2;
		Double FL = 1.3;
		Double FT = 1.5;
		
		resultado = TMB * FA * FL * FT;
		assertEquals(resultado, c.GastoEnergeticoTotal(TMB, FA, FL, FT), resultado);
	}
	
	@Test
	void CalculoGastoEnergeticoTotalInvalidoRetorno() throws ErrorException{
		Calculos c = new Calculos();
		
		Double resultado;
		Double TMB = 1000.30;
		Double FA = 1.2;
		Double FL = 1.3;
		Double FT = 1.5;
		
		resultado = TMB * FA * FL * FT * 50;
		Assert.assertNotEquals(resultado, c.GastoEnergeticoTotal(TMB, FA, FL, FT));
	}
	
	@Test
	void CalculoGastoEnergeticoTotalInvalidoTMB() throws ErrorException{
		Calculos c = new Calculos();
		
		Double TMB = 0.00;
		Double FA = 1.2;
		Double FL = 1.3;
		Double FT = 1.5;
		
		assertThrows(ErrorException.class, ()-> {c.GastoEnergeticoTotal(TMB, FA, FL, FT);});
		
	}
	
	@Test
	void CalculoGastoEnergeticoTotalInvalidoFA() throws ErrorException{
		Calculos c = new Calculos();
		
		Double TMB = 1000.00;
		Double FA = 0.00;
		Double FL = 1.3;
		Double FT = 1.5;
		
		assertThrows(ErrorException.class, ()-> {c.GastoEnergeticoTotal(TMB, FA, FL, FT);});
		
	}
	
	@Test
	void CalculoGastoEnergeticoTotalInvalidoFL() throws ErrorException{
		Calculos c = new Calculos();
		
		Double TMB = 1000.00;
		Double FA = 1.2;
		Double FL = 0.00;
		Double FT = 1.5;
		
		assertThrows(ErrorException.class, ()-> {c.GastoEnergeticoTotal(TMB, FA, FL, FT);});
		
	}
	
	@Test
	void CalculoGastoEnergeticoTotalInvalidoFT() throws ErrorException{
		Calculos c = new Calculos();
		
		Double TMB = 1000.00;
		Double FA = 1.2;
		Double FL = 1.3;
		Double FT = 0.00;
		
		assertThrows(ErrorException.class, ()-> {c.GastoEnergeticoTotal(TMB, FA, FL, FT);});
		
	}
	
	//###############################################################################
		//###############################################################################
		//###############################################################################
		//Regra três simples
	
	@Test
	void CalculoTresSimplesValido() throws ErrorException{
		Calculos c = new Calculos();
		Double valor1 = 100.00; 
		Double valor2 = 50.00; 
		Double valor3 = 300.00;
		Double resultado;
		
		resultado = (valor1 * valor3) / valor2;
		assertEquals(resultado, c.CalculoTresSimples(valor1, valor2, valor3), resultado);
	}
	
	@Test
	void CalculoTresSimplesInvalidoRetorno() throws ErrorException{
		Calculos c = new Calculos();
		Double valor1 = 100.00; 
		Double valor2 = 50.00; 
		Double valor3 = 300.00;
		Double resultado;
		
		resultado = (valor1 * valor3) / valor2 * 30;
		Assert.assertNotEquals(resultado, c.CalculoTresSimples(valor1, valor2, valor3));
	}
	
	@Test
	void CalculoTresSimplesInvalidoValor1() throws ErrorException{
		Calculos c = new Calculos();
		Double valor1 = 0.00;
		Double valor2 = 50.00; 
		Double valor3 = 300.00;
		
		assertThrows(ErrorException.class, ()-> {c.CalculoTresSimples(valor1, valor2, valor3);});
	}
	
	@Test
	void CalculoTresSimplesInvalidoValor2() throws ErrorException{
		Calculos c = new Calculos();
		Double valor1 = 30.00;
		Double valor2 = 0.00; 
		Double valor3 = 300.00;
		
		assertThrows(ErrorException.class, ()-> {c.CalculoTresSimples(valor1, valor2, valor3);});
	}
	
	@Test
	void CalculoTresSimplesInvalidoValor3() throws ErrorException{
		Calculos c = new Calculos();
		Double valor1 = 30.00;
		Double valor2 = 50.00; 
		Double valor3 = 0.00;
		
		assertThrows(ErrorException.class, ()-> {c.CalculoTresSimples(valor1, valor2, valor3);});
	}
	
	//###############################################################################
		//###############################################################################
		//###############################################################################
		//VCT
	
	@Test
	void CalculoVCTValido() throws ErrorException{
		Calculos c = new Calculos();
		Double TMB = 1300.00;
		Double Atividade = 1.3;
		Double resultado;
		
		resultado = TMB * Atividade;
		assertEquals(resultado, c.CalculoVCT(TMB, Atividade), resultado);
		
	}
	
	@Test
	void CalculoVCTInvalido() throws ErrorException{
		Calculos c = new Calculos();
		Double TMB = 1300.00;
		Double Atividade = 1.3;
		Double resultado;
		
		resultado = TMB * Atividade * 19;
		Assert.assertNotEquals(resultado, c.CalculoVCT(TMB, Atividade));
	}
	
	@Test
	void CalculoVCTInvalidoTMB() throws ErrorException{
		Calculos c = new Calculos();
		Double TMB = 0.00;
		Double Atividade = 1.3;
		assertThrows(ErrorException.class, ()-> {c.CalculoVCT(TMB, Atividade);});
	}
	
	@Test
	void CalculoVCTInvalidoAtividade() throws ErrorException{
		Calculos c = new Calculos();
		Double TMB = 1110.00;
		Double Atividade = 0.00;
		assertThrows(ErrorException.class, ()-> {c.CalculoVCT(TMB, Atividade);});
	}
	
	//###############################################################################
	//###############################################################################
	//###############################################################################
	//Macro Hidratos
	
	
	@Test
	void CalculoDistribuicaoMacHCValido() throws ErrorException{
		Calculos c = new Calculos();
		Double vct = 33.33;
		Double hidratos = 55.55;
		Double resultado;
		
		resultado = vct * hidratos;
		assertEquals(resultado, c.DistribuicaoMacHC(vct, hidratos), resultado);
		
	}
	
	@Test
	void CalculoDistribuicaoMacHCInvalidoRetorno() throws ErrorException{
		Calculos c = new Calculos();
		Double vct = 1300.33;
		Double hidratos = 1.55;
		Double resultado;
		
		resultado = vct * hidratos * 19;
		Assert.assertNotEquals(resultado, c.DistribuicaoMacHC(vct, hidratos));
	}
	
	@Test
	void CalculoDistribuicaoMacHCInvalidoVCT() throws ErrorException{
		Calculos c = new Calculos();
		Double vct = 0.00;
		Double hidratos = 1.3;
		assertThrows(ErrorException.class, ()-> {c.DistribuicaoMacHC(vct, hidratos);});
	}
	
	@Test
	void CalculoDistribuicaoMacHCInvalidoHidratos() throws ErrorException{
		Calculos c = new Calculos();
		Double vct = 13.0;
		Double hidratos = 0.00;
		assertThrows(ErrorException.class, ()-> {c.DistribuicaoMacHC(vct, hidratos);});
	}
	
	//###############################################################################
		//###############################################################################
		//###############################################################################
		//Macro Proteina
	
	@Test
	void CalculoDistribuicaoMacPValido() throws ErrorException{
		Calculos c = new Calculos();
		Double vct = 33.33;
		Double proteina = 55.55;
		Double resultado;
		
		resultado = vct * proteina;
		assertEquals(resultado, c.DistribuicaoMacP(vct, proteina), resultado);
		
	}
	
	@Test
	void CalculoDistribuicaoMacPInvalidoRetorno() throws ErrorException{
		Calculos c = new Calculos();
		Double vct = 1300.00;
		Double proteina = 1.3;
		Double resultado;
		
		resultado = vct * proteina * 19;
		Assert.assertNotEquals(resultado, c.DistribuicaoMacP(vct, proteina));
	}
	
	@Test
	void CalculoDistribuicaoMacPInvalidoVCT() throws ErrorException{
		Calculos c = new Calculos();
		Double vct = 0.00;
		Double proteina = 1.3;
		assertThrows(ErrorException.class, ()-> {c.DistribuicaoMacP(vct, proteina);});
	}
	
	@Test
	void CalculoDistribuicaoMacPInvalidoProteina() throws ErrorException{
		Calculos c = new Calculos();
		Double vct = 1300.0;
		Double proteina = 0.00;
		assertThrows(ErrorException.class, ()-> {c.DistribuicaoMacP(vct, proteina);});
	}
	
	//###############################################################################
	//###############################################################################
	//###############################################################################
	//Macro Gorduras
	
	@Test
	void CalculoDistribuicaoMacGValido() throws ErrorException{
		Calculos c = new Calculos();
		Double vct = 33.33;
		Double gorduras = 55.55;
		Double resultado;
		
		resultado = vct * gorduras;
		assertEquals(resultado, c.DistribuicaoMacHC(vct, gorduras), resultado);
		
	}
	
	@Test
	void CalculoDistribuicaoMacGInvalidoRetorno() throws ErrorException{
		Calculos c = new Calculos();
		Double vct = 1300.00;
		Double gorduras = 1.3;
		Double resultado;
		
		resultado = vct * gorduras * 19;
		Assert.assertNotEquals(resultado, c.DistribuicaoMacG(vct, gorduras));
	}
	
	@Test
	void CalculoDistribuicaoMacGInvalidoVCT() throws ErrorException{
		Calculos c = new Calculos();
		Double vct = 0.00;
		Double gorduras = 1.3;
		assertThrows(ErrorException.class, ()-> {c.DistribuicaoMacG(vct, gorduras);});
	}
	
	@Test
	void CalculoDistribuicaoMacGInvalidoGorduras() throws ErrorException{
		Calculos c = new Calculos();
		Double vct = 133.00;
		Double gorduras = 0.00;
		assertThrows(ErrorException.class, ()-> {c.DistribuicaoMacG(vct, gorduras);});
	}
	
}
