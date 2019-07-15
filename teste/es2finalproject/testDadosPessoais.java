package es2finalproject;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class testDadosPessoais {
	//#########################################################################################
	//#########################################################################################
	//#########################################################################################
	// NOME
	 @Test
	    void getNomeValido()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        p.setNome("France");
	        assertEquals("France", p.getNome());
	    }	 
	 
	 @Test
	    void getNomenullInvalido()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setNome("");});
	    }
	 
	 @Test
	    void getNomeInvalidoNumero()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setNome("France2");});
	    }
	 
	 @Test
	    void getNomeInvalidoCaracterEspecial()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setNome("France@");});
	    }
	 
	 @Test
	    void getNomeInvalidoMinimo()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setNome("AN");});
	    }
	 
	 @Test
	    void getNomeInvalidoMaximo()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setNome("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");}); // 101 caracteres
	    }
	 
	 @Test
	    void getNomeValidoPertoLimiteSuperior()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        p.setNome("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"); //contem 99 caracteres
	        assertEquals("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", p.getNome());
	   
	    }
	 
	 @Test
	    void getNomeValidoPertoLimiteInferior()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        p.setNome("Sara");
	        assertEquals("Sara", p.getNome());
	    }
	 
	 @Test
	    void getNomeInvalidoRetorno() throws ErrorException{
		 	DadosPessoais dp = new DadosPessoais();
		 	dp.setNome("Sara");
	        String resultado = "Joana";
	        Assert.assertNotEquals(resultado, dp.getNome());
	    }
	 
		//#########################################################################################
		//#########################################################################################
		//#########################################################################################
	 	// IDADE
	 @Test
	    void getIdadeValida() throws ErrorException{
	        DadosPessoais dp = new DadosPessoais();
	        dp.setIdade(13);
	        assertEquals(13, dp.getIdade(), 13);
	    }

	 @Test
	    void getIdadeIvalida() throws ErrorException{
	        DadosPessoais dp = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {dp.setIdade(1);});
	    } 
	 
	 @Test
	    void getIdadeIvalidaPertoLimiteMaximo() throws ErrorException{
	        DadosPessoais dp = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {dp.setIdade(101);});
	    }
	 
	 @Test
	    void getIdadeIvalidaPertoLimiteMinimo() throws ErrorException{
	        DadosPessoais dp = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {dp.setIdade(2);});
	    }
	 
	 @Test
	    void getIdadeValidaPertoLimiteMinimo() throws ErrorException{
	        DadosPessoais dp = new DadosPessoais();
	        dp.setIdade(4);
	        assertEquals(4, dp.getIdade(), 4);
	    }
	 
	 @Test
	    void getIdadeValidaPertoLimiteMaximo() throws ErrorException{
	        DadosPessoais dp = new DadosPessoais();
	        dp.setIdade(89);
	        assertEquals(89, dp.getIdade(), 89);
	    }
	 
	 @Test
	    void getIdadeInvalidoRetorno() throws ErrorException{
		 	DadosPessoais dp = new DadosPessoais();
		 	dp.setIdade(35);
	        Integer resultado = 44;
	        Assert.assertNotEquals(resultado, dp.getIdade());
	    }
	 
		//#########################################################################################
		//#########################################################################################
		//#########################################################################################
	 	//ALTURA
	 @Test
	    void getAlturaValida() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        dp.setAltura(1.73f);
	        assertEquals(1.73f, dp.getAltura(), 1.73f);
	    }
	 
	 @Test
	    void getAlturaInvalida() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {dp.setAltura(13.77f);});
	    }
	 
	 @Test
	    void getAlturaInvalidaPertoLimiteMaximo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {dp.setAltura(2.51f);});
	    }
	 
	 @Test
	    void getAlturaInvalidaPertoLimiteMinimo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {dp.setAltura(0.99f);});
	    }
	 
	 @Test
	    void getAlturaValidaPertoLimiteMaximo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        dp.setAltura(2.49f);
	        assertEquals(2.49f, dp.getAltura(), 2.49f);
	    }
	 
	 @Test
	    void getAlturaValidaPertoLimiteMinimo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        dp.setAltura(1.01f);
	        assertEquals(1.01f, dp.getAltura(), 1.01f);
	    }
	 
	 @Test
	    void getAlturaInvalidoRetorno() throws ErrorException{
		 	DadosPessoais dp = new DadosPessoais();
		 	dp.setAltura(1.85f);
	        Float resultado = 1.95f;
	        Assert.assertNotEquals(resultado, dp.getAltura());
	    }
	 
	 
		//#########################################################################################
		//#########################################################################################
		//#########################################################################################
	 	//PROFISSÃO
	 @Test
	    void getProfissaoValido()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        p.setProfissao("Programador");
	        assertEquals("Programador", p.getProfissao());
	    }
	 
	 @Test
	    void getProfissaonullInvalido()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setProfissao("");});
	    }
	 
	 @Test
	    void getProfissaoInvalidoNumero()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setProfissao("Proragama2");});
	    }
	 
	 @Test
	    void getProfissaoInvalidoCaracterEspecial()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setProfissao("progr@ama");});
	    }
	 
	 @Test
	    void getProfissaoInvalidoMinimo()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setProfissao("pe");});
	    }
	 
	 @Test
	    void getProfissaoInvalidoMaximo()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setProfissao("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");}); // 101 caracteres
	    }
	 
	 @Test
	    void getProfissaoValidoPertoLimiteSuperior()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        p.setProfissao("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"); //contem 99 caracteres
	        assertEquals("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", p.getProfissao());
	    }
	 
	 @Test
	    void getProfissaoValidoPertoLimiteInferior()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        p.setProfissao("Joga");
	        assertEquals("Joga", p.getProfissao());
	    }
	 
	 @Test
	    void getProfissaoInvalidoRetorno() throws ErrorException{
		 	DadosPessoais dp = new DadosPessoais();
		 	dp.setProfissao("Programar");
	        String resultado = "Jogador";
	        Assert.assertNotEquals(resultado, dp.getProfissao());
	    }
	 
	//#########################################################################################
	//#########################################################################################
	//#########################################################################################
	//PESO
	 
	 @Test
	    void getPesoValida() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        dp.setPeso(75.02f);
	        assertEquals(75.02f, dp.getPeso(), 75.02f);
	    }
	 
	 @Test
	    void getPesoInvalida() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {dp.setPeso(600.00f);});
	    }
	 
	 @Test
	    void getPesoInvalidaPertoLimiteMaximo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {dp.setPeso(300.01f);});
	    }
	 
	 @Test
	    void getPesoInvalidaPertoLimiteMinimo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {dp.setPeso(19.99f);});
	    }
	 
	 @Test
	    void getPesoValidaPertoLimiteMaximo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        dp.setPeso(299.99f);
	        assertEquals(299.99f, dp.getPeso(), 299.99f);
	    }
	 
	 @Test
	    void getPesoValidaPertoLimiteMinimo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        dp.setPeso(20.01f);
	        assertEquals(20.01f, dp.getPeso(), 20.01f);
	    }
	 
	 @Test
	    void getPesoInvalidoRetorno() throws ErrorException{
		 	DadosPessoais dp = new DadosPessoais();
		 	dp.setPeso(66.00f);
	        Float resultado = 44.44f;
	        Assert.assertNotEquals(resultado, dp.getPeso());
	    }
	 
	//#########################################################################################
	//#########################################################################################
	//#########################################################################################
	// IMC
	 @Test
	    void getIMCValida() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        dp.setIMC(75.02f);
	        assertEquals(75.02f, dp.getIMC(), 75.02f);
	    }
	 
	 @Test
	    void getIMCInvalida() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {dp.setIMC(600.02f);});
	    }
	 
	 @Test
	    void getIMCInvalidaPertoLimiteMaximo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {dp.setIMC(300.01f);});
	    }
	 
	 @Test
	    void getIMCInvalidaPertoLimiteMinimo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {dp.setIMC(19.99f);});
	    }
	 
	 @Test
	    void getIMCValidaPertoLimiteMaximo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        dp.setIMC(299.99f);
	        assertEquals(299.99f, dp.getIMC(), 299.99f);
	    }
	 
	 @Test
	    void getIMCValidaPertoLimiteMinimo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        dp.setIMC(20.01f);
	        assertEquals(20.01f, dp.getIMC(), 20.01f);
	    }
	 
	 @Test
	    void getIMCInvalidoRetorno() throws ErrorException{
		 	DadosPessoais dp = new DadosPessoais();
		 	dp.setIMC(34.00f);
	        Float resultado = 54.44f;
	        Assert.assertNotEquals(resultado, dp.getIMC());
	    }
	//#########################################################################################
	//#########################################################################################
	//#########################################################################################
	// BODY FAT
	 
	 @Test
	    void getBodyFatValida() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        dp.setBodyFat(75.02f);
	        assertEquals(75.02f, dp.getBodyFat(), 75.02f);
	    }
	 
	 @Test
	    void getBodyFatInvalida() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {dp.setBodyFat(1.01f);});
	    }
	 
	 @Test
	    void getBodyFatInvalidaPertoLimiteMaximo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {dp.setBodyFat(90.01f);});
	    }
	 
	 @Test
	    void getBodyFatInvalidaPertoLimiteMinimo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {dp.setBodyFat(4.99f);});
	    }
	 
	 @Test
	    void getBodyFatValidaPertoLimiteMaximo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        dp.setBodyFat(89.99f);
	        assertEquals(89.99f, dp.getBodyFat(), 89.99f);
	    }
	 
	 @Test
	    void getBodyFatValidaPertoLimiteMinimo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        dp.setBodyFat(5.01f);
	        assertEquals(5.01f, dp.getBodyFat(), 5.01f);
	    }
	 
	 @Test
	    void getBodyFatInvalidoRetorno() throws ErrorException{
		 	DadosPessoais dp = new DadosPessoais();
		 	dp.setBodyFat(55.00f);
	        Float resultado = 44.44f;
	        Assert.assertNotEquals(resultado, dp.getBodyFat());
	    }
	 
	//#########################################################################################
	//#########################################################################################
	//#########################################################################################
	// GORDURAVISCERAL
	 
	 @Test
	    void getGorduraVisceralValida() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        dp.setGorduraVisceral(25.02f);
	        assertEquals(25.02f, dp.getGorduraVisceral(), 25.02f);
	    }
	 
	 @Test
	    void getGorduraVisceraltInvalida() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {dp.setGorduraVisceral(0.50f);});
	    }
	 
	 @Test
	    void getGorduraVisceraltInvalidaPertoLimiteMaximo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {dp.setGorduraVisceral(90.01f);});
	    }
	 
	 @Test
	    void getGorduraVisceralInvalidaPertoLimiteMinimo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {dp.setGorduraVisceral(0.99f);});
	    }
	 
	 @Test
	    void getGorduraVisceralValidaPertoLimiteMaximo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        dp.setGorduraVisceral(29.99f);
	        assertEquals(29.99f, dp.getGorduraVisceral(), 29.99f);
	    }
	 
	 @Test
	    void getGorduraVisceralValidaPertoLimiteMinimo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        dp.setGorduraVisceral(1.01f);
	        assertEquals(1.01f, dp.getGorduraVisceral(), 1.01f);
	    }
	 
	 @Test
	    void getGorduraVisceralInvalidoRetorno() throws ErrorException{
		 	DadosPessoais dp = new DadosPessoais();
		 	dp.setGorduraVisceral(05.00f);
	        Float resultado = 04.44f;
	        Assert.assertNotEquals(resultado, dp.getGorduraVisceral());
	    }
	 
	//#########################################################################################
	//#########################################################################################
	//#########################################################################################
	// MUSCULO
	 
	 @Test
	    void getMusculoValida() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        dp.setMusculo(75.02f);
	        assertEquals(75.02f, dp.getMusculo(), 75.02f);
	    }
	 
	 @Test
	    void getMusculoInvalida() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {dp.setMusculo(0.01f);});
	    }
	 
	 @Test
	    void getMusculoInvalidaPertoLimiteMaximo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {dp.setMusculo(90.01f);});
	    }
	 
	 @Test
	    void getMusculoInvalidaPertoLimiteMinimo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {dp.setMusculo(0.99f);});
	    }
	 
	 @Test
	    void getMusculoValidaPertoLimiteMaximo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        dp.setMusculo(89.99f);
	        assertEquals(89.99f, dp.getMusculo(), 89.99f);
	    }
	 
	 @Test
	    void getMusculoValidaPertoLimiteMinimo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        dp.setMusculo(10.01f);
	        assertEquals(10.01f, dp.getMusculo(), 10.01f);
	    }
	 
	 @Test
	    void getMusculoInvalidoRetorno() throws ErrorException{
		 	DadosPessoais dp = new DadosPessoais();
		 	dp.setMusculo(55.00f);
	        Float resultado = 54.44f;
	        Assert.assertNotEquals(resultado, dp.getMusculo());
	    }
	 
	//#########################################################################################
	//#########################################################################################
	//#########################################################################################
	// IDADE METABOLICA
	 
	 @Test
	    void getIdadeMetabolicaValida() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        dp.setIdadeMetabolica(75.02f);
	        assertEquals(75.02f, dp.getIdadeMetabolica(), 75.02f);
	    }
	 
	 @Test
	    void getIdadeMetabolicaInvalida() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {dp.setIdadeMetabolica(0.01f);});        
	    }
	 
	 @Test
	    void getIdadeMetabolicaInvalidaPertoLimiteMaximo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {dp.setIdadeMetabolica(90.01f);});
	    }
	 
	 @Test
	    void getIdadeMetabolicaInvalidaPertoLimiteMinimo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {dp.setIdadeMetabolica(2.99f);});
	    }
	 
	 @Test
	    void getIdadeMetabolicaValidaPertoLimiteMaximo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        dp.setIdadeMetabolica(89.99f);
	        assertEquals(89.99f, dp.getIdadeMetabolica(), 89.99f);
	    }
	 
	 @Test
	    void getIdadeMetabolicaValidaPertoLimiteMinimo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        dp.setIdadeMetabolica(3.01f);
	        assertEquals(3.01f, dp.getIdadeMetabolica(), 3.01f);
	    }
	 
	 @Test
	    void getIdadeMetabolicaInvalidoRetorno() throws ErrorException{
		 	DadosPessoais dp = new DadosPessoais();
		 	dp.setIdadeMetabolica(55.00f);
	        Float resultado = 54.44f;
	        Assert.assertNotEquals(resultado, dp.getIdadeMetabolica());
	    }
	 
	//#########################################################################################
	//#########################################################################################
	//#########################################################################################
	// H2OCORPO
	 
	 @Test
	    void getH2OcorpoValida() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        dp.setH2Ocorpo(75.02f);
	        assertEquals(75.02f, dp.getH2Ocorpo(), 75.02f);
	    }
	 
	 @Test
	    void getH2OcorpoInvalida() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {dp.setH2Ocorpo(0.01f);});
	    }
	 
	 @Test
	    void getH2OcorpoInvalidaPertoLimiteMaximo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {dp.setH2Ocorpo(80.01f);});
	    }
	 
	 @Test
	    void getH2OcorpoInvalidaPertoLimiteMinimo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {dp.setH2Ocorpo(19.99f);});
	    }
	 
	 @Test
	    void getH2OcorpoValidaPertoLimiteMaximo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        dp.setH2Ocorpo(79.99f);
	        assertEquals(79.99f, dp.getH2Ocorpo(), 79.99f);
	    }
	 
	 @Test
	    void getH2OcorpoValidaPertoLimiteMinimo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        dp.setH2Ocorpo(20.01f);
	        assertEquals(20.01f, dp.getH2Ocorpo(), 20.01f);
	    }
	 
	 @Test
	    void getH2OcorpoInvalidoRetorno() throws ErrorException{
		 	DadosPessoais dp = new DadosPessoais();
		 	dp.setH2Ocorpo(24.30f);
	        Float resultado = 34.44f;
	        Assert.assertNotEquals(resultado, dp.getH2Ocorpo());
	    }
	 
	//#########################################################################################
	//#########################################################################################
	//#########################################################################################
	// METABOLISMOBASAL
	 
	 @Test
	    void getMetabolismoBasal() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        dp.setMetabolismoBasal(75.02f);
	        assertEquals(75.02f, dp.getMetabolismoBasal(), 75.02f);
	    }
	 
	 @Test
	    void getMetabolismoBasalInvalida() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {dp.setMetabolismoBasal(-5.01f);});
	    }
	 
	 @Test
	    void getMetabolismoBasalInvalidaPertoLimiteMaximo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {dp.setMetabolismoBasal(1200.01f);});
	    }
	 
	 @Test
	    void getMetabolismoBasalInvalidaPertoLimiteMinimo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {dp.setMetabolismoBasal(-0.01f);});
	    }
	 
	 @Test
	    void getMetabolismoBasalValidaPertoLimiteMaximo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        dp.setMetabolismoBasal(1199.99f);
	        assertEquals(1199.99f, dp.getMetabolismoBasal(), 1199.99f);
	    }
	 
	 @Test
	    void getMetabolismoBasalPertoLimiteMinimo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        dp.setMetabolismoBasal(0.01f);
	        assertEquals(0.01f, dp.getMetabolismoBasal(), 0.01f);
	    }
	 
	 @Test
	    void getMetabolismoBasalInvalidoRetorno() throws ErrorException{
		 	DadosPessoais dp = new DadosPessoais();
		 	dp.setMetabolismoBasal(15.00f);
	        Float resultado = 14.44f;
	        Assert.assertNotEquals(resultado, dp.getMetabolismoBasal());
	    }
	 
	//#########################################################################################
	//#########################################################################################
	//#########################################################################################
	// OSSO
	 
	 @Test
	    void getOsso() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        dp.setOsso(2.02f);
	        assertEquals(2.02f, dp.getOsso(), 2.02f);
	    }
	 
	 @Test
	    void getOssoInvalida() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {dp.setOsso(-5.01f);});
	    }
	 
	 @Test
	    void getOssoInvalidaPertoLimiteMaximo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {dp.setOsso(5.01f);});
	    }
	 
	 @Test
	    void getOssoInvalidaPertoLimiteMinimo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {dp.setOsso(-0.01f);});
	    }
	 
	 @Test
	    void getOssoValidaPertoLimiteMaximo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        dp.setOsso(4.99f);
	        assertEquals(4.99f, dp.getOsso(), 4.99f);
	    }
	 
	 @Test
	    void getOssoLimiteMinimo() throws ErrorException {
	        DadosPessoais dp = new DadosPessoais();
	        dp.setOsso(0.01f);
	        assertEquals(0.01f, dp.getOsso(), 0.01f);
	    }
	 
	 @Test
	    void getOssoInvalidoRetorno() throws ErrorException{
		 	DadosPessoais dp = new DadosPessoais();
		 	dp.setOsso(3.00f);
	        Float resultado = 2.44f;
	        Assert.assertNotEquals(resultado, dp.getOsso());
	    }
	 
	 
	//#########################################################################################
	//#########################################################################################
	//#########################################################################################
	// MOTIVO DA CONSULTA
	 
	 @Test
	    void getMotivoConsultaValido()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        p.setMotivoConsulta("Emagrecimento");
	        assertEquals("Emagrecimento", p.getMotivoConsulta());
	    }
	 
	 @Test
	    void getMotivoConsultanullInvalido()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setMotivoConsulta("");});
	    }
	 
	 @Test
	    void getMotivoConsultaInvalidoNumero()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setMotivoConsulta("Emagrece25");});
	    }
	 
	 @Test
	    void getMotivoConsultaInvalidoCaracterEspecial()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setMotivoConsulta("Em@grece");});
	    }
	 
	 @Test
	    void getMotivoConsultaInvalidoMinimo()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setMotivoConsulta("pe");});
	    }
	 
	 @Test
	    void getMotivoConsultaInvalidoMaximo()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setMotivoConsulta("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");}); // 101 caracteres
	    }
	 
	 @Test
	    void getMotivoConsultaPertoLimiteSuperior()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        p.setMotivoConsulta("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"); //contem 99 caracteres
	        assertEquals("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", p.getMotivoConsulta());
	    }
	 
	 @Test
	    void getMotivoConsultaValidoPertoLimiteInferior()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        p.setMotivoConsulta("Joga");
	        assertEquals("Joga", p.getMotivoConsulta());
	    }
	 
	 @Test
	    void getMotivoConsultaInvalidoRetorno() throws ErrorException{
		 	DadosPessoais dp = new DadosPessoais();
		 	dp.setMotivoConsulta("Musculação");
	        String resultado = "Emagrece";
	        Assert.assertNotEquals(resultado, dp.getMotivoConsulta());
	    }
	 
	//#########################################################################################
	//#########################################################################################
	//#########################################################################################
	// OBJECTIVOS
	 
	 @Test
	    void getObjectivosValido()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        p.setObjectivos("Emagrecer");
	        assertEquals("Emagrecer", p.getObjectivos());
	    }
	 
	 @Test
	    void getObjectivosnullInvalido()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setObjectivos("");});
	    }
	 
	 @Test
	    void getObjectivosInvalidoNumero()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setObjectivos("Emag24");});
	    }
	 
	 @Test
	    void getObjectivosInvalidoCaracterEspecial()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setObjectivos("emagrece@");});
	    }
	 
	 @Test
	    void getObjectivosInvalidoMinimo()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setObjectivos("pe");});
	    }
	 
	 @Test
	    void getObjectivosInvalidoMaximo()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setObjectivos("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");}); // 101 caracteres
	    }
	 
	 @Test
	    void getObjectivosaPertoLimiteSuperior()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        p.setObjectivos("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"); //contem 99 caracteres
	        assertEquals("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", p.getObjectivos());
	    }
	 
	 @Test
	    void getObjectivosValidoPertoLimiteInferior()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        p.setObjectivos("Joga");
	        assertEquals("Joga", p.getObjectivos());
	    }
	 
	 @Test
	    void getObjectivosInvalidoRetorno() throws ErrorException{
		 	DadosPessoais dp = new DadosPessoais();
		 	dp.setObjectivos("Musculação");
	        String resultado = "Emagrece";
	        Assert.assertNotEquals(resultado, dp.getObjectivos());
	    }
	 
	//#########################################################################################
	//#########################################################################################
	//#########################################################################################
	// PATOLOGIAS
	 
	 @Test
	    void getPatologiasValido()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        p.setPatologias("Nenhumas");
	        assertEquals("Nenhumas", p.getPatologias());
	    }
	 
	 @Test
	    void getPatologiasnullInvalido()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setPatologias("");});
	    }
	 
	 @Test
	    void getPatologiasInvalidoNumero()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setPatologias("Nenhumas25");});
	    }
	 
	 @Test
	    void getPatologiasInvalidoCaracterEspecial()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setPatologias("Nenumas@");});
	    }
	 
	 @Test
	    void getPatologiasInvalidoMinimo()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setPatologias("p");});
	    }
	 
	 @Test
	    void getPatologiasInvalidoMaximo()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setPatologias("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");}); // 101 caracteres
	    }
	 
	 @Test
	    void getPatologiasPertoLimiteSuperior()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        p.setPatologias("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"); //contem 99 caracteres
	        assertEquals("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", p.getPatologias());
	    }
	 
	 @Test
	    void getPatologiasValidoPertoLimiteInferior()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        p.setPatologias("Joga");
	        assertEquals("Joga", p.getPatologias());
	    }
	 
	 @Test
	    void getPatologiasInvalidoRetorno() throws ErrorException{
		 	DadosPessoais dp = new DadosPessoais();
		 	dp.setPatologias("Musculação");
	        String resultado = "Emagrece";
	        Assert.assertNotEquals(resultado, dp.getPatologias());
	    }
	 
	 
	//#########################################################################################
	//#########################################################################################
	//#########################################################################################
	// MEDICAÇÃO
	 
	 @Test
	    void getMedicacaoValido()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        p.setMedicacao("Ocadil");
	        assertEquals("Ocadil", p.getMedicacao());
	    }
	 
	 @Test
	    void getMedicacaonullInvalido()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setMedicacao("");});
	    }
	
	 @Test
	    void getMedicacaoInvalidoNumero()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setMedicacao("ocadil2");});
	    }
	 
	 @Test
	    void getMedicacaoInvalidoCaracterEspecial()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setMedicacao("ocadil@");});
	    }
	 
	 @Test
	    void getMedicacaoInvalidoMinimo()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setMedicacao("pe");});
	    }
	 
	 @Test
	    void getMedicacaoInvalidoMaximo()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setMedicacao("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");}); // 101 caracteres
	    }
	 
	 @Test
	    void getMedicacaoPertoLimiteSuperior()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        p.setMedicacao("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"); //contem 99 caracteres
	        assertEquals("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", p.getMedicacao());
	    }
	 
	 @Test
	    void getMedicacaoValidoPertoLimiteInferior()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        p.setMedicacao("Joga");
	        assertEquals("Joga", p.getMedicacao());
	    }
	 
	 @Test
	    void getMedicacaoInvalidoRetorno() throws ErrorException{
		 	DadosPessoais dp = new DadosPessoais();
		 	dp.setMedicacao("Musculação");
	        String resultado = "Emagrece";
	        Assert.assertNotEquals(resultado, dp.getMedicacao());
	    }
	 
	//#########################################################################################
	//#########################################################################################
	//#########################################################################################
	// ANTECEDENTES
	 
	 @Test
	    void getAntedecentesValido()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        p.setAntedecentes("Diabetes");
	        assertEquals("Diabetes", p.getAntedecentes());
	    }
	 
	 @Test
	    void getAntedecentesnullInvalido()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setAntedecentes("");});
	    }
	 
	 @Test
	    void getAntedecentesInvalidoNumero()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setAntedecentes("Diabetes25");});
	    }
	 
	 @Test
	    void getAntedecentesInvalidoCaracterEspecial()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setAntedecentes("Diabetes!!!!");});
	    }
	 
	 @Test
	    void getAntedecentesInvalidoMinimo()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setAntedecentes("pe");});
	    }
	 
	 @Test
	    void getAntedecentesInvalidoMaximo()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setAntedecentes("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");}); // 101 caracteres
	    }
	 
	 @Test
	    void getAntedecentesPertoLimiteSuperior()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        p.setAntedecentes("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"); //contem 99 caracteres
	        assertEquals("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", p.getAntedecentes());
	    }
	 
	 @Test
	    void getAntedecentesPertoLimiteInferior()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        p.setAntedecentes("Joga");
	        assertEquals("Joga", p.getAntedecentes());
	    }
	 
	 @Test
	    void getAntedecentesInvalidoRetorno() throws ErrorException{
		 	DadosPessoais dp = new DadosPessoais();
		 	dp.setAntedecentes("Musculação");
	        String resultado = "Emagrece";
	        Assert.assertNotEquals(resultado, dp.getAntedecentes());
	    }
	 
	//#########################################################################################
	//#########################################################################################
	//#########################################################################################
	// ATIVIDADE FISICA
	 
	 @Test
	    void getAtividadeFisicaValido()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        p.setAtividadeFisica("Alguma");
	        assertEquals("Alguma", p.getAtividadeFisica());
	    }
	 
	 @Test
	    void getAtividadeFisicanullInvalido()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setAtividadeFisica("");});
	    }
	 
	 @Test
	    void getAtividadeFisicaInvalidoNumero()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setAtividadeFisica("5 vzes");});
	    }
	 
	 @Test
	    void getAtividadeFisicaInvalidoCaracterEspecial()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setAtividadeFisica("Alguma@");});
	    }
	 
	 @Test
	    void getAtividadeFisicaInvalidoMinimo()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setAtividadeFisica("pe");});
	    }
	 
	 @Test
	    void getAtividadeFisicaInvalidoMaximo()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setAtividadeFisica("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");}); // 101 caracteres
	    }
	 
	 @Test
	    void getAtividadeFisicaPertoLimiteSuperior()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        p.setAtividadeFisica("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"); //contem 99 caracteres
	        assertEquals("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", p.getAtividadeFisica());
	    }
	 
	 @Test
	    void getAtividadeFisicaPertoLimiteInferior()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        p.setAtividadeFisica("Joga");
	        assertEquals("Joga", p.getAtividadeFisica());
	    }
	 
	 @Test
	    void getAtividadeFisicaRetorno() throws ErrorException{
		 	DadosPessoais dp = new DadosPessoais();
		 	dp.setAtividadeFisica("Musculação");
	        String resultado = "Emagrece";
	        Assert.assertNotEquals(resultado, dp.getAtividadeFisica());
	    }
	 
	//#########################################################################################
	//#########################################################################################
	//#########################################################################################
	// FUNCAO INTESTINAL
	 
	 @Test
	    void getFuncaoInstestinalValido()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        p.setFuncaoInstestinal("Corretamente");
	        assertEquals("Corretamente", p.getFuncaoInstestinal());
	    }
	 
	 @Test
	    void getFuncaoInstestinalnullInvalido()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setFuncaoInstestinal("");});
	    }
	 
	 @Test
	    void getFuncaoInstestinalInvalidoNumero()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setFuncaoInstestinal("10vezes");});
	    }
	 
	 @Test
	    void getFuncaoInstestinalCaracterEspecial()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setFuncaoInstestinal("Nop@@");});
	    }
	 
	 @Test
	    void getFuncaoInstestinalInvalidoMinimo()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setFuncaoInstestinal("pe");});
	    }
	 
	 @Test
	    void getFuncaoInstestinalInvalidoMaximo()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        assertThrows(ErrorException.class, ()-> {p.setFuncaoInstestinal("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");}); // 101 caracteres
	    }
	 
	 @Test
	    void getFuncaoInstestinalPertoLimiteSuperior()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        p.setFuncaoInstestinal("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"); //contem 99 caracteres
	        assertEquals("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", p.getFuncaoInstestinal());
	    }
	 
	 @Test
	    void getFuncaoInstestinalPertoLimiteInferior()throws ErrorException{
	        DadosPessoais p = new DadosPessoais();
	        p.setFuncaoInstestinal("Joga");
	        assertEquals("Joga", p.getFuncaoInstestinal());
	    }
	 
	 @Test
	    void getFuncaoInstestinalRetorno() throws ErrorException{
		 	DadosPessoais dp = new DadosPessoais();
		 	dp.setFuncaoInstestinal("Musculação");
	        String resultado = "Emagrece";
	        Assert.assertNotEquals(resultado, dp.getFuncaoInstestinal());
	    }
	 
	//#########################################################################################
	//#########################################################################################
	//#########################################################################################
	// CONSUMO DE AGUA
		 
		 @Test
		    void getConsumoAgua() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();
		        dp.setConsumoAgua(2.02f);
		        assertEquals(2.02f, dp.getConsumoAgua(), 2.02f);
		    }
		 
		 @Test
		    void getConsumoAguaInvalida() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();
		        assertThrows(ErrorException.class, ()-> {dp.setConsumoAgua(54.01f);});
		    }
		 
		 @Test
		    void getConsumoAguaInvalidaPertoLimiteMaximo() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();
		        assertThrows(ErrorException.class, ()-> {dp.setConsumoAgua(5.01f);});
		    }
		 
		 @Test
		    void getConsumoAguaInvalidaPertoLimiteMinimo() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();
		        assertThrows(ErrorException.class, ()-> {dp.setConsumoAgua(-0.01f);});
		    }
		 
		 @Test
		    void getConsumoAguaValidaPertoLimiteMaximo() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();
		        dp.setConsumoAgua(4.99f);
		        assertEquals(4.99f, dp.getConsumoAgua(), 4.99f);
		    }
		 
		 @Test
		    void getConsumoAguaValidaLimiteMinimo() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();
		        dp.setConsumoAgua(0.01f);
		        assertEquals(0.01f, dp.getConsumoAgua(), 0.01f);
		    }
		 
		 @Test
		    void getConsumoAguaRetorno() throws ErrorException{
			 	DadosPessoais dp = new DadosPessoais();
			 	dp.setConsumoAgua(1.33f);
		        Float resultado = 1.44f;
		        Assert.assertNotEquals(resultado, dp.getConsumoAgua());
		    }
		    
		//#########################################################################################
		//#########################################################################################
		//#########################################################################################
		// COLESTROL
		 
		 @Test
		    void getColesterol() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();		        
		        dp.setColesterol(70.02f);
		        assertEquals(70.02f, dp.getColesterol(), 70.02f);
		    }
		 
		 @Test
		    void getColesterolInvalida() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();
		        assertThrows(ErrorException.class, ()-> {dp.setColesterol(5.01f);});
		    }
		 
		 @Test
		    void getColesterolInvalidaPertoLimiteMaximo() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();
		        assertThrows(ErrorException.class, ()-> {dp.setColesterol(300.01f);});
		    }
		 
		 @Test
		    void getColesterolInvalidaPertoLimiteMinimo() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();
		        assertThrows(ErrorException.class, ()-> {dp.setColesterol(49.99f);});
		    }
		 
		 @Test
		    void getColesterolValidaPertoLimiteMaximo() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();
		        dp.setColesterol(299.99f);
		        assertEquals(299.99f, dp.getColesterol(), 299.99f);
		    }
		 
		 @Test
		    void getColesterolValidaLimiteMinimo() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();
		        dp.setColesterol(50.01f);
		        assertEquals(50.01f, dp.getColesterol(), 50.01f);
		    }
		 
		 @Test
		    void getColesterolRetorno() throws ErrorException{
			 	DadosPessoais dp = new DadosPessoais();
			 	dp.setColesterol(61.33f);
		        Float resultado = 71.44f;
		        Assert.assertNotEquals(resultado, dp.getColesterol());
		    }
		 
		//#########################################################################################
		//#########################################################################################
		//#########################################################################################
		// GLICEMIA
		 
		 @Test
		    void getGlicemia() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();		        
		        dp.setGlicemia(75.02f);
		        assertEquals(75.02f, dp.getGlicemia(), 75.02f);
		    }
		 
		 @Test
		    void getGlicemiaInvalida() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();
		        assertThrows(ErrorException.class, ()-> {dp.setGlicemia(400.01f);});
		    }
		 
		 @Test
		    void getGlicemiaInvalidaPertoLimiteMaximo() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();
		        assertThrows(ErrorException.class, ()-> {dp.setGlicemia(200.01f);});
		    }
		 
		 @Test
		    void getGlicemiaInvalidaPertoLimiteMinimo() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();
		        assertThrows(ErrorException.class, ()-> {dp.setGlicemia(69.99f);});
		        
		    }
		 
		 @Test
		    void getGlicemiaValidaPertoLimiteMaximo() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();
		        dp.setGlicemia(199.99f);
		        assertEquals(199.99f, dp.getGlicemia(), 199.99f);
		    }
		 
		 @Test
		    void getGlicemiaValidaLimiteMinimo() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();
		        dp.setGlicemia(70.01f);
		        assertEquals(70.01f, dp.getGlicemia(), 70.01f);
		    }
		 
		 @Test
		    void getGlicemiaRetorno() throws ErrorException{
			 	DadosPessoais dp = new DadosPessoais();
			 	dp.setGlicemia(78.33f);
		        Float resultado = 90.44f;
		        Assert.assertNotEquals(resultado, dp.getGlicemia());
		    }
		 
		//#########################################################################################
		//#########################################################################################
		//#########################################################################################
		// UREIA
		 
		 @Test
		    void getUreia() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();		        
		        dp.setUreia(23.02f);
		        assertEquals(23.02f, dp.getUreia(), 23.02f);
		    }
		 
		 @Test
		    void getUreiaInvalida() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();
		        assertThrows(ErrorException.class, ()-> {dp.setUreia(70.01f);});
		    }
		 
		 @Test
		    void getUreiaInvalidaPertoLimiteMaximo() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();
		        assertThrows(ErrorException.class, ()-> {dp.setUreia(50.01f);});
		    }
		 
		 @Test
		    void getUreiaInvalidaPertoLimiteMinimo() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();
		        assertThrows(ErrorException.class, ()-> {dp.setUreia(4.99f);});
		    }
		 
		 @Test
		    void getUreiaValidaPertoLimiteMaximo() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();
		        dp.setUreia(49.99f);
		        assertEquals(49.99f, dp.getUreia(), 49.99f);
		    }
		 
		 @Test
		    void getUreiaValidaLimiteMinimo() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();
		        dp.setUreia(5.01f);
		        assertEquals(5.01f, dp.getUreia(), 5.01f);
		    }
		 
		 @Test
		    void getUreiaRetorno() throws ErrorException{
			 	DadosPessoais dp = new DadosPessoais();
			 	dp.setUreia(6.33f);
		        Float resultado = 7.44f;
		        Assert.assertNotEquals(resultado, dp.getUreia());
		    }
		 
		//#########################################################################################
		//#########################################################################################
		//#########################################################################################
		// CREATINA
		 
		 @Test
		    void getCreatina() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();		        
		        dp.setCreatina(1.02f);
		        assertEquals(1.02f, dp.getCreatina(), 1.02f);
		    }
		 
		 @Test
		    void getCreatinaInvalida() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();
		        assertThrows(ErrorException.class, ()-> {dp.setCreatina(70.01f);});
		    }
		 
		 @Test
		    void getCreatinaInvalidaPertoLimiteMaximo() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();
		        assertThrows(ErrorException.class, ()-> {dp.setCreatina(1.51f);});
		    }
		 
		 @Test
		    void getCreatinaInvalidaPertoLimiteMinimo() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();
		        assertThrows(ErrorException.class, ()-> {dp.setCreatina(0.5f);});
		    }
		 
		 @Test
		    void getCreatinaValidaPertoLimiteMaximo() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();
		        dp.setCreatina(1.49f);
		        assertEquals(1.49f, dp.getCreatina(), 1.49f);
		    }
		 
		 @Test
		    void getCreatinaValidaLimiteMinimo() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();
		        dp.setCreatina(0.61f);
		        assertEquals(0.61f, dp.getCreatina(), 0.61f);
		    }
		 
		 @Test
		    void getCreatinaRetorno() throws ErrorException{
			 	DadosPessoais dp = new DadosPessoais();
			 	dp.setCreatina(1.33f);
		        Float resultado = 1.44f;
		        Assert.assertNotEquals(resultado, dp.getCreatina());
		    }
		 
		//#########################################################################################
		//#########################################################################################
		//#########################################################################################
		// PROFCCREATIVA
		  
		 @Test
		    void getProfCReactiva() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();		        
		        dp.setProfCReactiva(0.45f);
		        assertEquals(0.45f, dp.getProfCReactiva(), 0.45f);
		    }
		 
		 @Test
		    void getProfCReactivaInvalida() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();
		        assertThrows(ErrorException.class, ()-> {dp.setProfCReactiva(70.01f);});
		        
		    }
		 
		 @Test
		    void getProfCReactivaInvalidaPertoLimiteMaximo() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();
		        assertThrows(ErrorException.class, ()-> {dp.setProfCReactiva(0.51f);});
		    }
		 
		 @Test
		    void getProfCReactivaInvalidaPertoLimiteMinimo() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();
		        assertThrows(ErrorException.class, ()-> {dp.setProfCReactiva(-0.01f);});
		    }
		 
		 @Test
		    void getProfCReactivaValidaPertoLimiteMaximo() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();
		        dp.setProfCReactiva(0.49f);
		        assertEquals(0.49f, dp.getProfCReactiva(), 0.49f);
		    }
		 
		 @Test
		    void getProfCReactivaValidaLimiteMinimo() throws ErrorException {
		        DadosPessoais dp = new DadosPessoais();
		        dp.setProfCReactiva(0.01f);
		        assertEquals(0.01f, dp.getProfCReactiva(), 0.01f);
		    }
		 
		 @Test
		    void getProfCReactivaRetorno() throws ErrorException{
			 	DadosPessoais dp = new DadosPessoais();
			 	dp.setProfCReactiva(0.33f);
		        Float resultado = 0.32f;
		        Assert.assertNotEquals(resultado, dp.getProfCReactiva());
		    }
	
}