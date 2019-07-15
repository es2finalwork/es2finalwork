package es2finalproject;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class AlimentosTest {
	
	//##########################################################################
	//##########################################################################
	//##########################################################################
	//CODIGO

	 @Test
	    void getCodigoValido()throws ErrorException{
	        Alimentos a = new Alimentos();
	        a.setCodigo(1);
	        assertEquals(1, a.getCodigo(), 1);
	    }
	 
	 @Test
	    void getCodigoInalido()throws ErrorException{
	        Alimentos a = new Alimentos();
	        assertThrows(ErrorException.class, ()-> {a.setCodigo(-43);});
	    }	  
	 
	 @Test
	    void getCodigoInvalidoMinimo()throws ErrorException{
		 	Alimentos a = new Alimentos();
	        assertThrows(ErrorException.class, ()-> {a.setCodigo(-1);});
	    }
	 
	 @Test
	    void getCodigoInvalidoMaximo()throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setCodigo(101);});
	    }
	 
	 @Test
	    void getCodigoValidoPertoLimiteSuperior()throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	 a.setCodigo(99);
		     assertEquals(99, a.getCodigo(), 99);
	    }
	 
	 @Test
	    void getCodigoValidoPertoLimiteInferior()throws ErrorException{
		 Alimentos a = new Alimentos();
	        a.setCodigo(1);
	        assertEquals(1, a.getCodigo(), 1);
	    }
	 
	 @Test
	    void getCodigoInvalidoRetorno()throws ErrorException{
		 Alimentos a = new Alimentos();
	        a.setCodigo(1);
	        Integer resultado = 2;
	        Assert.assertNotEquals(resultado, a.getCodigo());
	    }
	 
	 
	//##########################################################################
	//##########################################################################
	//##########################################################################
	//NOME

	 @Test
	    void getNomeValido()throws ErrorException{
	        Alimentos a = new Alimentos();
	        a.setNome("Frango");
	        assertEquals("Frango", a.getNome());
	    }	 
	 
	 @Test
	    void getNomenullInvalido()throws ErrorException{
		 	Alimentos a = new Alimentos();
	        assertThrows(ErrorException.class, ()-> {a.setNome("");});
	    }
	
	 @Test
	    void getNomeInvalidoCaracterEspecial()throws ErrorException{
		 	Alimentos a = new Alimentos();
	        assertThrows(ErrorException.class, ()-> {a.setNome("banan@");});
	    }
	 
	 @Test
	    void getNomeInvalidoMinimo()throws ErrorException{
		 	Alimentos a = new Alimentos();
	        assertThrows(ErrorException.class, ()-> {a.setNome("ba");});
	    }
	 
	 @Test
	    void getNomeInvalidoNumeros()throws ErrorException{
		 	Alimentos a = new Alimentos();
	        assertThrows(ErrorException.class, ()-> {a.setNome("bann43");});
	    }
	 
	 @Test
	    void getNomeInvalidoMaximo()throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setNome("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");}); // 101 caracteres
	    }
	 
	 @Test
	    void getNomeValidoPertoLimiteSuperior()throws ErrorException{
		 	Alimentos a = new Alimentos();
	        a.setNome("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"); //contem 99 caracteres
	        assertEquals("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", a.getNome());
	    }
	 
	 @Test
	    void getNomeValidoPertoLimiteInferior()throws ErrorException{
		 	Alimentos a = new Alimentos();
	        a.setNome("bara");
	        assertEquals("bara", a.getNome());
	    }
	 
	 @Test
	    void getNomeInvalidoRetorno()throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setNome("bara");
	        String resultado = "franca";
	        Assert.assertNotEquals(resultado, a.getNome());
	    }
	 
	//##########################################################################
	//##########################################################################
	//##########################################################################
	//ENERGIAKCAL

	 @Test
	    void getEnergiakcalValida() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setEnergiakcal(13);
	        assertEquals(13, a.getEnergiakcal(), 13);
	    }

	 @Test
	    void getEnergiakcalIvalida() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setEnergiakcal(-1);});
	    } 
	 
	 @Test
	    void getEnergiakcalIvalidaPertoLimiteMaximo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setEnergiakcal(10001);});
	    }
	 
	 @Test
	    void getEnergiakcalIvalidaPertoLimiteMinimo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setEnergiakcal(-1);});
	    }
	 
	 @Test
	    void getEnergiakcalValidaPertoLimiteMinimo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setEnergiakcal(1);
	        assertEquals(1, a.getEnergiakcal(), 1);
	    }
	 
	 @Test
	    void getEnergiakcalValidaPertoLimiteMaximo() throws ErrorException{
		 	Alimentos a = new Alimentos();
	        a.setEnergiakcal(999);
	        assertEquals(999, a.getEnergiakcal(), 999);
	    }
	 
	 @Test
	    void getEnergiakcalInvalidoRetorno()throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setEnergiakcal(222);
	        Integer resultado = 555;
	        Assert.assertNotEquals(resultado, a.getEnergiakcal());
	    }
	
	//##########################################################################
	//##########################################################################
	//##########################################################################
	//ENERGIAKJ

	 @Test
	    void getEnergiakjValida() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setEnergiakj(13);
	        assertEquals(13, a.getEnergiakj(), 13);
	    }

	 @Test
	    void getEnergiakjIvalida() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setEnergiakj(2220);});
	    } 
	 
	 @Test
	    void getEnergiakjIvalidaPertoLimiteMaximo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setEnergiakj(1001);});
	    }
	 
	 @Test
	    void getEnergiakjIvalidaPertoLimiteMinimo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setEnergiakj(-1);});
	    }
	 
	 @Test
	    void getEnergiakjValidaPertoLimiteMinimo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setEnergiakj(1);
	        assertEquals(1, a.getEnergiakj(), 1);
	    }
	 
	 @Test
	    void getEnergiakjValidaPertoLimiteMaximo() throws ErrorException{
		 	Alimentos a = new Alimentos();
	        a.setEnergiakj(999);
	        assertEquals(999, a.getEnergiakj(), 999);
	    }
	 
	 @Test
	    void getEnergiakjInvalidoRetorno()throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setEnergiakj(222);
	        Integer resultado = 555;
	        Assert.assertNotEquals(resultado, a.getEnergiakj());
	    }

		//##########################################################################
		//##########################################################################
		//##########################################################################
		//AGUA

	 @Test
	    void getAguaValida() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setAgua(13.00f);
	        assertEquals(13.00f, a.getAgua(), 13.00f);
	    }

	 @Test
	    void getAguaIvalida() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setAgua(-1.00f);});
	    } 
	 
	 @Test
	    void getAguaIvalidaPertoLimiteMaximo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setAgua(15.01f);});
	    }
	 
	 @Test
	    void getAguaIvalidaPertoLimiteMinimo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setAgua(-0.01f);});
	    }
	 
	 @Test
	    void getAguaValidaPertoLimiteMinimo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setAgua(0.01f);
	        assertEquals(0.01f, a.getAgua(), 0.01f);
	    }
	 
	 @Test
	    void getAguaValidaPertoLimiteMaximo() throws ErrorException{
		 	Alimentos a = new Alimentos();
	        a.setAgua(14.99f);
	        assertEquals(14.99f, a.getAgua(), 14.99f);
	    }
	 
	 @Test
	    void getAguaInvalidoRetorno()throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setAgua(13.00f);
	        Float resultado = 10.00f;
	        Assert.assertNotEquals(resultado, a.getAgua());
	    }

	//##########################################################################
	//##########################################################################
	//##########################################################################
	//PROTEINA
	 
	 @Test
	    void getProteinaValida() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setProteina(13.00f);
	        assertEquals(13.00f, a.getProteina(), 13.00f);
	    }

	 @Test
	    void getProteinaIvalida() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setProteina(-1.00f);});
	    } 
	 
	 @Test
	    void getProteinaIvalidaPertoLimiteMaximo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setProteina(1001.01f);});
	    }
	 
	 @Test
	    void getProteinaIvalidaPertoLimiteMinimo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setProteina(-0.01f);});
	    }
	 
	 @Test
	    void getProteinaValidaPertoLimiteMinimo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setProteina(0.01f);
	        assertEquals(0.01f, a.getProteina(), 0.01f);
	    }
	 
	 @Test
	    void getProteinaValidaPertoLimiteMaximo() throws ErrorException{
		 	Alimentos a = new Alimentos();
	        a.setProteina(999.99f);
	        assertEquals(999.99f, a.getProteina(), 999.99f);
	    }
	 
	 @Test
	    void getProteinaInvalidoRetorno()throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setProteina(13.00f);
	        Float resultado = 10.00f;
	        Assert.assertNotEquals(resultado, a.getProteina());
	    }


	//##########################################################################
	//##########################################################################
	//##########################################################################
	//GORDURA TOTAL
	 
	 @Test
	    void getGorduraTotalValida() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setGorduraTotal(13.00f);
	        assertEquals(13.00f, a.getGorduraTotal(), 13.00f);
	    }

	 @Test
	    void getGorduraTotalIvalida() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setGorduraTotal(-1.00f);});
	    } 
	 
	 @Test
	    void getGorduraTotalIvalidaPertoLimiteMaximo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setGorduraTotal(1001.01f);});
	    }
	 
	 @Test
	    void getGorduraTotalIvalidaPertoLimiteMinimo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setGorduraTotal(-0.01f);});
	    }
	 
	 @Test
	    void getGorduraTotalValidaPertoLimiteMinimo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setGorduraTotal(0.01f);
	        assertEquals(0.01f, a.getGorduraTotal(), 0.01f);
	    }
	 
	 @Test
	    void getGorduraTotalValidaPertoLimiteMaximo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setGorduraTotal(999.99f);
	        assertEquals(999.99f, a.getGorduraTotal(), 999.99f);
	    }
	 
	 @Test
	    void getGorduraTotalInvalidoRetorno()throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setGorduraTotal(13.00f);
	        Float resultado = 10.00f;
	        Assert.assertNotEquals(resultado, a.getGorduraTotal());
	    }
	 
	//##########################################################################
	//##########################################################################
	//##########################################################################
	//HIDRATOS
	 
	 @Test
	    void getHCdisponiveisValida() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setHCdisponiveis(13.00f);
	        assertEquals(13.00f, a.getHCdisponiveis(), 13.00f);
	    }

	 @Test
	    void getGHCdisponiveisIvalida() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setHCdisponiveis(-1.00f);});
	    } 
	 
	 @Test
	    void getHCdisponiveisIvalidaPertoLimiteMaximo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setHCdisponiveis(1001.01f);});
	    }
	 
	 @Test
	    void getHCdisponiveisIvalidaPertoLimiteMinimo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setHCdisponiveis(-0.01f);});
	    }
	 
	 @Test
	    void getHCdisponiveisValidaPertoLimiteMinimo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setHCdisponiveis(0.01f);
	        assertEquals(0.01f, a.getHCdisponiveis(), 0.01f);
	    }
	 
	 @Test
	    void getHCdisponiveisValidaPertoLimiteMaximo() throws ErrorException{
		 	Alimentos a = new Alimentos();
	        a.setHCdisponiveis(999.99f);
	        assertEquals(999.99f, a.getHCdisponiveis(), 999.99f);
	    }
	 
	 @Test
	    void getGHCdisponiveisInvalidoRetorno()throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setHCdisponiveis(13.00f);
	        Float resultado = 10.00f;
	        Assert.assertNotEquals(resultado, a.getHCdisponiveis());
	    }

	//##########################################################################
	//##########################################################################
	//##########################################################################
	//HIDRATOS MONO
	 
	 @Test
	    void getHCmonoValida() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setHCmono(13.00f);
	        assertEquals(13.00f, a.getHCmono(), 13.00f);
	    }

	 @Test
	    void getHCmonoIvalida() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setHCmono(-1.00f);});
	    } 
	 
	 @Test
	    void getHCmonoIvalidaPertoLimiteMaximo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setHCmono(1001.01f);});
	    }
	 
	 @Test
	    void getHCmonoIvalidaPertoLimiteMinimo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setHCmono(-0.01f);});
	    }
	 
	 @Test
	    void getHCmonoValidaPertoLimiteMinimo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setHCmono(0.01f);
	        assertEquals(0.01f, a.getHCmono(), 0.01f);
	    }
	 
	 @Test
	    void getHCmonoValidaPertoLimiteMaximo() throws ErrorException{
		 	Alimentos a = new Alimentos();
	        a.setHCmono(999.99f);
	        assertEquals(999.99f, a.getHCmono(), 999.99f);
	    }
	 
	 @Test
	    void getHCmonoInvalidoRetorno()throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setHCmono(13.00f);
	        Float resultado = 10.00f;
	        Assert.assertNotEquals(resultado, a.getHCmono());
	    }
	 
	//##########################################################################
	//##########################################################################
	//##########################################################################
	//HIDRATOS MONO DISSACARDIOS

	 @Test
	    void getMonoDiValida() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setMonoDi(13.00f);
	        assertEquals(13.00f, a.getMonoDi(), 13.00f);
	    }

	 @Test
	    void getMonoDiIvalida() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setMonoDi(-1.00f);});
	    } 
	 
	 @Test
	    void getMonoDiIvalidaPertoLimiteMaximo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setMonoDi(1001.01f);});
	    }
	 
	 @Test
	    void getMonoDiIvalidaPertoLimiteMinimo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setMonoDi(-0.01f);});
	    }
	 
	 @Test
	    void getMonoDiValidaPertoLimiteMinimo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setMonoDi(0.01f);
	        assertEquals(0.01f, a.getMonoDi(), 0.01f);
	    }
	 
	 @Test
	    void getMonoDiValidaPertoLimiteMaximo() throws ErrorException{
		 	Alimentos a = new Alimentos();
	        a.setMonoDi(999.99f);
	        assertEquals(999.99f, a.getMonoDi(), 999.99f);
	    }
	 
	 @Test
	    void getMonoDiInvalidoRetorno()throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setMonoDi(13.00f);
	        Float resultado = 10.00f;
	        Assert.assertNotEquals(resultado, a.getMonoDi());
	    }
	 
	//##########################################################################
	//##########################################################################
	//##########################################################################
	//ÁCIDOS ORGANICOS

	 @Test
	    void getAcidosOrgValida() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setAcidosOrg(13.00f);
	        assertEquals(13.00f, a.getAcidosOrg(), 13.00f);
	    }

	 @Test
	    void getAcidosOrgIvalida() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setAcidosOrg(-1.00f);});
	    } 
	 
	 @Test
	    void getAcidosOrgIvalidaPertoLimiteMaximo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setAcidosOrg(1001.01f);});
	    }
	 
	 @Test
	    void getAcidosOrgIvalidaPertoLimiteMinimo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setAcidosOrg(-0.01f);});
	    }
	 
	 @Test
	    void getAcidosOrgValidaPertoLimiteMinimo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setAcidosOrg(0.01f);
	        assertEquals(0.01f, a.getAcidosOrg(), 0.01f);
	    }
	 
	 @Test
	    void getAcidosOrgValidaPertoLimiteMaximo() throws ErrorException{
		 	Alimentos a = new Alimentos();
	        a.setAcidosOrg(999.99f);
	        assertEquals(999.99f, a.getAcidosOrg(), 999.99f);
	    }
	 
	 @Test
	    void getAcidosOrgInvalidoRetorno()throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setAcidosOrg(13.00f);
	        Float resultado = 10.00f;
	        Assert.assertNotEquals(resultado, a.getAcidosOrg());
	    }
	 
	//##########################################################################
	//##########################################################################
	//##########################################################################
	//ÁCOOL
	 
	 @Test
	    void getAlcoolValida() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setAlcool(13.00f);
	        assertEquals(13.00f, a.getAlcool(), 13.00f);
	    }

	 @Test
	    void getAlcoolIvalida() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setAlcool(-1.00f);});
	    } 
	 
	 @Test
	    void getAlcoolIvalidaPertoLimiteMaximo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setAlcool(1001.01f);});
	    }
	 
	 @Test
	    void getAlcoolIvalidaPertoLimiteMinimo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setAlcool(-0.01f);});
	    }
	 
	 @Test
	    void getAlcoolValidaPertoLimiteMinimo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setAlcool(0.01f);
	        assertEquals(0.01f, a.getAlcool(), 0.01f);
	    }
	 
	 @Test
	    void getAlcoolValidaPertoLimiteMaximo() throws ErrorException{
		 	Alimentos a = new Alimentos();
	        a.setAlcool(999.99f);
	        assertEquals(999.99f, a.getAlcool(), 999.99f);
	    }
	 
	 @Test
	    void getAlcoolInvalidoRetorno()throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setAlcool(13.00f);
	        Float resultado = 10.00f;
	        Assert.assertNotEquals(resultado, a.getAlcool());
	    }
	 
	//##########################################################################
	//##########################################################################
	//##########################################################################
	//ÁMIDO


	 @Test
	    void getAmidoValida() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setAmido(13.00f);
	        assertEquals(13.00f, a.getAmido(), 13.00f);
	    }

	 @Test
	    void getAmidoIvalida() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setAmido(-1.00f);});
	    } 
	 
	 @Test
	    void getAmidoIvalidaPertoLimiteMaximo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setAmido(1001.01f);});
	    }
	 
	 @Test
	    void getAmidoIvalidaPertoLimiteMinimo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setAmido(-0.01f);});
	    }
	 
	 @Test
	    void getAmidoValidaPertoLimiteMinimo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setAmido(0.01f);
	        assertEquals(0.01f, a.getAmido(), 0.01f);
	    }
	 
	 @Test
	    void getAmidoValidaPertoLimiteMaximo() throws ErrorException{
		 	Alimentos a = new Alimentos();
	        a.setAmido(999.99f);
	        assertEquals(999.99f, a.getAmido(), 999.99f);
	    }
	 
	 @Test
	    void getAmidoInvalidoRetorno()throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setAmido(13.00f);
	        Float resultado = 10.00f;
	        Assert.assertNotEquals(resultado, a.getAmido());
	    }
	 
	//##########################################################################
	//##########################################################################
	//##########################################################################
	//Oligossacarídeo

	 @Test
	    void getOligossacaridosValida() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setOligossacaridos(13.00f);
	        assertEquals(13.00f, a.getOligossacaridos(), 13.00f);
	    }

	 @Test
	    void getOligossacaridosIvalida() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setOligossacaridos(-1.00f);});
	    } 
	 
	 @Test
	    void getOligossacaridosIvalidaPertoLimiteMaximo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setOligossacaridos(1001.01f);});
	    }
	 
	 @Test
	    void getOligossacaridosIvalidaPertoLimiteMinimo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setOligossacaridos(-0.01f);});
	    }
	 
	 @Test
	    void getOligossacaridosValidaPertoLimiteMinimo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setOligossacaridos(0.01f);
	        assertEquals(0.01f, a.getOligossacaridos(), 0.01f);
	    }
	 
	 @Test
	    void getOligossacaridosValidaPertoLimiteMaximo() throws ErrorException{
		 	Alimentos a = new Alimentos();
	        a.setOligossacaridos(999.99f);
	        assertEquals(999.99f, a.getOligossacaridos(), 999.99f);
	    }
	 
	 @Test
	    void getOligossacaridosInvalidoRetorno()throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setOligossacaridos(13.00f);
	        Float resultado = 10.00f;
	        Assert.assertNotEquals(resultado, a.getOligossacaridos());
	    }
	 
	//##########################################################################
	//##########################################################################
	//##########################################################################
	//FIBRA

	 @Test
	    void getFibraValida() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setFibra(13.00f);
	        assertEquals(13.00f, a.getFibra(), 13.00f);
	    }

	 @Test
	    void getFibraIvalida() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setFibra(-1.00f);});
	    } 
	 
	 @Test
	    void getFibraIvalidaPertoLimiteMaximo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setFibra(1001.01f);});
	    }
	 
	 @Test
	    void getvIvalidaPertoLimiteMinimo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setFibra(-0.01f);});
	    }
	 
	 @Test
	    void getFibraValidaPertoLimiteMinimo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setFibra(0.01f);
	        assertEquals(0.01f, a.getFibra(), 0.01f);
	    }
	 
	 @Test
	    void getFibraValidaPertoLimiteMaximo() throws ErrorException{
		 	Alimentos a = new Alimentos();
	        a.setFibra(999.99f);
	        assertEquals(999.99f, a.getFibra(), 999.99f);
	    }
	 
	 @Test
	    void getFibraInvalidoRetorno()throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setFibra(13.00f);
	        Float resultado = 10.00f;
	        Assert.assertNotEquals(resultado, a.getFibra());
	    }
	 
	//##########################################################################
	//##########################################################################
	//##########################################################################
	//ACIDOS GORDOS SATURADOS

	 @Test
	    void getAcidosGordosSaturadosValida() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setAcidosGordosSaturados(13.00f);
	        assertEquals(13.00f, a.getAcidosGordosSaturados(), 13.00f);
	    }

	 @Test
	    void getAcidosGordosSaturadosIvalida() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setAcidosGordosSaturados(-1.00f);});
	    } 
	 
	 @Test
	    void getAcidosGordosSaturadosIvalidaPertoLimiteMaximo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setAcidosGordosSaturados(1001.01f);});
	    }
	 
	 @Test
	    void getAcidosGordosSaturadosIvalidaPertoLimiteMinimo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setAcidosGordosSaturados(-0.01f);});
	    }
	 
	 @Test
	    void getAcidosGordosSaturadosValidaPertoLimiteMinimo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setAcidosGordosSaturados(0.01f);
	        assertEquals(0.01f, a.getAcidosGordosSaturados(), 0.01f);
	    }
	 
	 @Test
	    void getAcidosGordosSaturadosValidaPertoLimiteMaximo() throws ErrorException{
		 	Alimentos a = new Alimentos();
	        a.setAcidosGordosSaturados(999.99f);
	        assertEquals(999.99f, a.getAcidosGordosSaturados(), 999.99f);
	    }
	 
	 @Test
	    void getAcidosGordosSaturadosInvalidoRetorno()throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setAcidosGordosSaturados(13.00f);
	        Float resultado = 10.00f;
	        Assert.assertNotEquals(resultado, a.getAcidosGordosSaturados());
	    }
	 
	//##########################################################################
	//##########################################################################
	//##########################################################################
	//ACIDOS GORDOS MONO

	 @Test
	    void getAcidosGordosMonoValida() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setAcidosGordosMono(13.00f);
	        assertEquals(13.00f, a.getAcidosGordosMono(), 13.00f);
	    }

	 @Test
	    void getAcidosGordosMonoIvalida() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setAcidosGordosMono(-1.00f);});
	    } 
	 
	 @Test
	    void getAcidosGordosMonoIvalidaPertoLimiteMaximo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setAcidosGordosMono(1001.01f);});
	    }
	 
	 @Test
	    void getAcidosGordosMonoIvalidaPertoLimiteMinimo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setAcidosGordosMono(-0.01f);});
	    }
	 
	 @Test
	    void getAcidosGordosMonoValidaPertoLimiteMinimo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setAcidosGordosMono(0.01f);
	        assertEquals(0.01f, a.getAcidosGordosMono(), 0.01f);
	    }
	 
	 @Test
	    void getAAcidosGordosMonoValidaPertoLimiteMaximo() throws ErrorException{
		 	Alimentos a = new Alimentos();
	        a.setAcidosGordosMono(999.99f);
	        assertEquals(999.99f, a.getAcidosGordosMono(), 999.99f);
	    }
	 
	 @Test
	    void getAcidosGordosMonoInvalidoRetorno()throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setAcidosGordosMono(13.00f);
	        Float resultado = 10.00f;
	        Assert.assertNotEquals(resultado, a.getAcidosGordosMono());
	    }
	 
	 
	//##########################################################################
	//##########################################################################
	//##########################################################################
	//ACIDOS GORDOS POLI

	 @Test
	    void getAcidosGordosPoliValida() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setAcidosGordosPoli(13.00f);
	        assertEquals(13.00f, a.getAcidosGordosPoli(), 13.00f);
	    }

	 @Test
	    void getAcidosGordosPoliIvalida() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setAcidosGordosPoli(-1.00f);});
	    } 
	 
	 @Test
	    void getAcidosGordosPoliIvalidaPertoLimiteMaximo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setAcidosGordosPoli(1001.01f);});
	    }
	 
	 @Test
	    void getAcidosGordosPoliIvalidaPertoLimiteMinimo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	assertThrows(ErrorException.class, ()-> {a.setAcidosGordosPoli(-0.01f);});
	    }
	 
	 @Test
	    void getAcidosGordosPoliValidaPertoLimiteMinimo() throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setAcidosGordosPoli(0.01f);
	        assertEquals(0.01f, a.getAcidosGordosPoli(), 0.01f);
	    }
	 
	 @Test
	    void getAcidosGordosPoliValidaPertoLimiteMaximo() throws ErrorException{
		 	Alimentos a = new Alimentos();
	        a.setAcidosGordosPoli(999.99f);
	        assertEquals(999.99f, a.getAcidosGordosPoli(), 999.99f);
	    }
	 
	 @Test
	    void getAcidosGordosPoliInvalidoRetorno()throws ErrorException{
		 	Alimentos a = new Alimentos();
		 	a.setAcidosGordosPoli(13.00f);
	        Float resultado = 10.00f;
	        Assert.assertNotEquals(resultado, a.getAcidosGordosPoli());
	    }
	 
	 
	 
		//##########################################################################
		//##########################################################################
		//##########################################################################
		//ACIDOS GORDOS TRANS

		 @Test
		    void getAcidosGordosTransValida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setAcidosGordosTrans(13.00f);
		        assertEquals(13.00f, a.getAcidosGordosTrans(), 13.00f);
		    }

		 @Test
		    void getAcidosGordosTransIvalida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setAcidosGordosTrans(-1.00f);});
		    } 
		 
		 @Test
		    void getAcidosGordosTransIvalidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setAcidosGordosTrans(1001.01f);});
		    }
		 
		 @Test
		    void getAcidosGordosTransIvalidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setAcidosGordosTrans(-0.01f);});
		    }
		 
		 @Test
		    void getAcidosGordosTransValidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setAcidosGordosTrans(0.01f);
		        assertEquals(0.01f, a.getAcidosGordosTrans(), 0.01f);
		    }
		 
		 @Test
		    void getAcidosGordosTransValidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
		        a.setAcidosGordosTrans(999.99f);
		        assertEquals(999.99f, a.getAcidosGordosTrans(), 999.99f);
		    }
		 
		 @Test
		    void getAcidosGordosTransInvalidoRetorno()throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setAcidosGordosTrans(13.00f);
		        Float resultado = 10.00f;
		        Assert.assertNotEquals(resultado, a.getAcidosGordosTrans());
		    }

		//##########################################################################
		//##########################################################################
		//##########################################################################
		//ACIDOS LINOLEICO

			 @Test
			    void getAcidoLinoleicoValida() throws ErrorException{
				 	Alimentos a = new Alimentos();
				 	a.setAcidoLinoleico(13.00f);
			        assertEquals(13.00f, a.getAcidoLinoleico(), 13.00f);
			    }

			 @Test
			    void getAcidoLinoleicoIvalida() throws ErrorException{
				 	Alimentos a = new Alimentos();
				 	assertThrows(ErrorException.class, ()-> {a.setAcidoLinoleico(-1.00f);});
			    } 
			 
			 @Test
			    void getAcidoLinoleicoIvalidaPertoLimiteMaximo() throws ErrorException{
				 	Alimentos a = new Alimentos();
				 	assertThrows(ErrorException.class, ()-> {a.setAcidoLinoleico(1001.01f);});
			    }
			 
			 @Test
			    void getAcidoLinoleicoIvalidaPertoLimiteMinimo() throws ErrorException{
				 	Alimentos a = new Alimentos();
				 	assertThrows(ErrorException.class, ()-> {a.setAcidoLinoleico(-0.01f);});
			    }
			 
			 @Test
			    void getAcidoLinoleicoValidaPertoLimiteMinimo() throws ErrorException{
				 	Alimentos a = new Alimentos();
				 	a.setAcidoLinoleico(0.01f);
			        assertEquals(0.01f, a.getAcidoLinoleico(), 0.01f);
			    }
			 
			 @Test
			    void getAcidoLinoleicoValidaPertoLimiteMaximo() throws ErrorException{
				 	Alimentos a = new Alimentos();
			        a.setAcidoLinoleico(999.99f);
			        assertEquals(999.99f, a.getAcidoLinoleico(), 999.99f);
			    }
			 
			 
			 @Test
			    void getAcidoLinoleicoInvalidoRetorno()throws ErrorException{
				 	Alimentos a = new Alimentos();
				 	a.setAcidoLinoleico(13.00f);
			        Float resultado = 10.00f;
			        Assert.assertNotEquals(resultado, a.getAcidoLinoleico());
			    }
	
	    //##########################################################################
		//##########################################################################
		//##########################################################################
		//COLESTROL

		 @Test
		    void getColesterolValida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setColesterol(13.00f);
		        assertEquals(13.00f, a.getColesterol(), 13.00f);
		    }

		 @Test
		    void getColesterolIvalida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setColesterol(-1.00f);});
		    } 
		 
		 @Test
		    void getColesterolIvalidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setColesterol(1001.01f);});
		    }
		 
		 @Test
		    void getColesterolIvalidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setColesterol(-0.01f);});
		    }
		 
		 @Test
		    void getColesterolValidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setColesterol(0.01f);
		        assertEquals(0.01f, a.getColesterol(), 0.01f);
		    }
		 
		 @Test
		    void getColesterolValidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
		        a.setColesterol(999.99f);
		        assertEquals(999.99f, a.getColesterol(), 999.99f);
		    }
		 
		 
		 @Test
		    void getColesterolInvalidoRetorno()throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setColesterol(13.00f);
		        Float resultado = 10.00f;
		        Assert.assertNotEquals(resultado, a.getColesterol());
		    }
	
		
		 //##########################################################################
		//##########################################################################
		//##########################################################################
		//VITAMINA A

		 @Test
		    void getVitAValida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setVitA(13.00f);
		        assertEquals(13.00f, a.getVitA(), 13.00f);
		    }

		 @Test
		    void getVitAIvalida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setVitA(-1.00f);});
		    } 
		 
		 @Test
		    void getVitAIvalidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setVitA(1001.01f);});
		    }
		 
		 @Test
		    void getVitAIvalidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setVitA(-0.01f);});
		    }
		 
		 @Test
		    void getVitAValidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setVitA(0.01f);
		        assertEquals(0.01f, a.getVitA(), 0.01f);
		    }
		 
		 @Test
		    void getVitAValidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
		        a.setVitA(999.99f);
		        assertEquals(999.99f, a.getVitA(), 999.99f);
		    }
		 
		 @Test
		    void getVitAInvalidoRetorno()throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setVitA(13.00f);
		        Float resultado = 10.00f;
		        Assert.assertNotEquals(resultado, a.getVitA());
		    }
	

	//##########################################################################
		//##########################################################################
		//##########################################################################
		//CAROTENO

		 @Test
		    void getCarotenoValida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setCaroteno(13.00f);
		        assertEquals(13.00f, a.getCaroteno(), 13.00f);
		    }

		 @Test
		    void getCarotenoIvalida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setCaroteno(-1.00f);});
		    } 
		 
		 @Test
		    void getCarotenoIvalidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setCaroteno(1001.01f);});
		    }
		 
		 @Test
		    void getCarotenoIvalidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setCaroteno(-0.01f);});
		    }
		 
		 @Test
		    void getCarotenoValidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setCaroteno(0.01f);
		        assertEquals(0.01f, a.getCaroteno(), 0.01f);
		    }
		 
		 @Test
		    void getCarotenoValidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
		        a.setCaroteno(999.99f);
		        assertEquals(999.99f, a.getCaroteno(), 999.99f);
		    }
		 
		 @Test
		    void getCarotenoInvalidoRetorno()throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setCaroteno(13.00f);
		        Float resultado = 10.00f;
		        Assert.assertNotEquals(resultado, a.getCaroteno());
		    }

	//##########################################################################
		//##########################################################################
		//##########################################################################
		//CAROTENO

		 @Test
		    void getVitDValida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setVitD(13.00f);
		        assertEquals(13.00f, a.getVitD(), 13.00f);
		    }

		 @Test
		    void getVitDIvalida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setVitD(-1.00f);});
		    } 
		 
		 @Test
		    void getVitDIvalidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setVitD(1001.01f);});
		    }
		 
		 @Test
		    void getVitDIvalidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setVitD(-0.01f);});
		    }
		 
		 @Test
		    void getVitDValidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setVitD(0.01f);
		        assertEquals(0.01f, a.getVitD(), 0.01f);
		    }
		 
		 @Test
		    void getVitDValidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
		        a.setVitD(999.99f);
		        assertEquals(999.99f, a.getVitD(), 999.99f);
		    }
		 
		 @Test
		    void getVitDInvalidoRetorno()throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setVitD(13.00f);
		        Float resultado = 10.00f;
		        Assert.assertNotEquals(resultado, a.getVitD());
		    }


	//##########################################################################
		//##########################################################################
		//##########################################################################
		//ACOTOFEROL

		 @Test
		    void getAtocoferolValida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setAtocoferol(13.00f);
		        assertEquals(13.00f, a.getAtocoferol(), 13.00f);
		    }

		 @Test
		    void getAtocoferolIvalida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setAtocoferol(-1.00f);});
		    } 
		 
		 @Test
		    void getAtocoferolIvalidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setAtocoferol(1001.01f);});
		    }
		 
		 @Test
		    void getAtocoferolIvalidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setAtocoferol(-0.01f);});
		    }
		 
		 @Test
		    void getAtocoferolValidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setAtocoferol(0.01f);
		        assertEquals(0.01f, a.getAtocoferol(), 0.01f);
		    }
		 
		 @Test
		    void getAtocoferolValidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
		        a.setAtocoferol(999.99f);
		        assertEquals(999.99f, a.getAtocoferol(), 999.99f);
		    }
		 
		 @Test
		    void getAtocoferolInvalidoRetorno()throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setAtocoferol(13.00f);
		        Float resultado = 10.00f;
		        Assert.assertNotEquals(resultado, a.getAtocoferol());
		    }
		 
	//##########################################################################
		//##########################################################################
		//##########################################################################
		//TIAMINA

		 @Test
		    void getTiaminaValida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setTiamina(13.00f);
		        assertEquals(13.00f, a.getTiamina(), 13.00f);
		    }

		 @Test
		    void getTiaminaIvalida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setTiamina(-1.00f);});
		    } 
		 
		 @Test
		    void getTiaminaIvalidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setTiamina(1001.01f);});
		    }
		 
		 @Test
		    void getTiaminaIvalidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setTiamina(-0.01f);});
		    }
		 
		 @Test
		    void getTiaminaValidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setTiamina(0.01f);
		        assertEquals(0.01f, a.getTiamina(), 0.01f);
		    }
		 
		 @Test
		    void getTiaminaValidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
		        a.setTiamina(999.99f);
		        assertEquals(999.99f, a.getTiamina(), 999.99f);
		    }
		 
		 @Test
		    void getTiaminaInvalidoRetorno()throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setTiamina(13.00f);
		        Float resultado = 10.00f;
		        Assert.assertNotEquals(resultado, a.getTiamina());
		    }
		 
	//##########################################################################
		//##########################################################################
		//##########################################################################
		//RIBOFLAVINA

		 @Test
		    void getRiboflavinaValida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setRiboflavina(13.00f);
		        assertEquals(13.00f, a.getRiboflavina(), 13.00f);
		    }

		 @Test
		    void getRiboflavinaIvalida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setRiboflavina(-1.00f);});
		    } 
		 
		 @Test
		    void getRiboflavinaIvalidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setRiboflavina(1001.01f);});
		    }
		 
		 @Test
		    void getRiboflavinaIvalidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setRiboflavina(-0.01f);});
		    }
		 
		 @Test
		    void getRiboflavinaValidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setRiboflavina(0.01f);
		        assertEquals(0.01f, a.getRiboflavina(), 0.01f);
		    }
		 
		 @Test
		    void getRiboflavinaaValidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
		        a.setRiboflavina(999.99f);
		        assertEquals(999.99f, a.getRiboflavina(), 999.99f);
		    }
		 
		 @Test
		    void getRiboflavinaInvalidoRetorno()throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setRiboflavina(13.00f);
		        Float resultado = 10.00f;
		        Assert.assertNotEquals(resultado, a.getRiboflavina());
		    }

	//##########################################################################
		//##########################################################################
		//##########################################################################
		//EqNiacina

		 @Test
		    void getREqNiacinaValida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setEqNiacina(13.00f);
		        assertEquals(13.00f, a.getEqNiacina(), 13.00f);
		    }

		 @Test
		    void getEqNiacinaIvalida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setEqNiacina(-1.00f);});
		    } 
		 
		 @Test
		    void getEqNiacinaIvalidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setEqNiacina(1001.01f);});
		    }
		 
		 @Test
		    void getEqNiacinaIvalidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setEqNiacina(-0.01f);});
		    }
		 
		 @Test
		    void getEqNiacinaValidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setEqNiacina(0.01f);
		        assertEquals(0.01f, a.getEqNiacina(), 0.01f);
		    }
		 
		 @Test
		    void getREqNiacinaValidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
		        a.setEqNiacina(999.99f);
		        assertEquals(999.99f, a.getEqNiacina(), 999.99f);
		    }
		 
		 @Test
		    void getREqNiacinaInvalidoRetorno()throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setEqNiacina(13.00f);
		        Float resultado = 10.00f;
		        Assert.assertNotEquals(resultado, a.getEqNiacina());
		    }
		 
	//##########################################################################
		//##########################################################################
		//##########################################################################
		//Niacina

		 @Test
		    void getNiacinaValida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setNiacina(13.00f);
		        assertEquals(13.00f, a.getNiacina(), 13.00f);
		    }

		 @Test
		    void getNiacinaIvalida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setNiacina(-1.00f);});
		    } 
		 
		 @Test
		    void getNiacinaIvalidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setNiacina(1001.01f);});
		    }
		 
		 @Test
		    void getNiacinaIvalidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setNiacina(-0.01f);});
		    }
		 
		 @Test
		    void getNiacinaValidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setNiacina(0.01f);
		        assertEquals(0.01f, a.getNiacina(), 0.01f);
		    }
		 
		 @Test
		    void getNiacinaValidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
		        a.setNiacina(999.99f);
		        assertEquals(999.99f, a.getNiacina(), 999.99f);
		    }
		 
		 @Test
		    void getNiacinaInvalidoRetorno()throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setNiacina(13.00f);
		        Float resultado = 10.00f;
		        Assert.assertNotEquals(resultado, a.getNiacina());
		    }

		//##########################################################################
			//##########################################################################
			//##########################################################################
			//Niacina

			 @Test
			    void getTriptofanoValida() throws ErrorException{
				 	Alimentos a = new Alimentos();
				 	a.setTriptofano(13.00f);
			        assertEquals(13.00f, a.getTriptofano(), 13.00f);
			    }

			 @Test
			    void getTriptofanoIvalida() throws ErrorException{
				 	Alimentos a = new Alimentos();
				 	assertThrows(ErrorException.class, ()-> {a.setTriptofano(-1.00f);});
			    } 
			 
			 @Test
			    void getTriptofanoIvalidaPertoLimiteMaximo() throws ErrorException{
				 	Alimentos a = new Alimentos();
				 	assertThrows(ErrorException.class, ()-> {a.setTriptofano(1001.01f);});
			    }
			 
			 @Test
			    void getTriptofanoIvalidaPertoLimiteMinimo() throws ErrorException{
				 	Alimentos a = new Alimentos();
				 	assertThrows(ErrorException.class, ()-> {a.setTriptofano(-0.01f);});
			    }
			 
			 @Test
			    void getTriptofanoValidaPertoLimiteMinimo() throws ErrorException{
				 	Alimentos a = new Alimentos();
				 	a.setTriptofano(0.01f);
			        assertEquals(0.01f, a.getTriptofano(), 0.01f);
			    }
			 
			 @Test
			    void getTriptofanoValidaPertoLimiteMaximo() throws ErrorException{
				 	Alimentos a = new Alimentos();
			        a.setTriptofano(999.99f);
			        assertEquals(999.99f, a.getTriptofano(), 999.99f);
			    }
			 
			 @Test
			    void getTriptofanoInvalidoRetorno()throws ErrorException{
				 	Alimentos a = new Alimentos();
				 	a.setTriptofano(13.00f);
			        Float resultado = 10.00f;
			        Assert.assertNotEquals(resultado, a.getTriptofano());
			    }
			 
			 
			 
		//##########################################################################
			//##########################################################################
			//##########################################################################
			//VitB6

			 @Test
			    void getVitB6Valida() throws ErrorException{
				 	Alimentos a = new Alimentos();
				 	a.setVitB6(13.00f);
			        assertEquals(13.00f, a.getVitB6(), 13.00f);
			    }

			 @Test
			    void getVitB6Ivalida() throws ErrorException{
				 	Alimentos a = new Alimentos();
				 	assertThrows(ErrorException.class, ()-> {a.setVitB6(-1.00f);});
			    } 
			 
			 @Test
			    void getVitB6IvalidaPertoLimiteMaximo() throws ErrorException{
				 	Alimentos a = new Alimentos();
				 	assertThrows(ErrorException.class, ()-> {a.setVitB6(1001.01f);});
			    }
			 
			 @Test
			    void getVitB6IvalidaPertoLimiteMinimo() throws ErrorException{
				 	Alimentos a = new Alimentos();
				 	assertThrows(ErrorException.class, ()-> {a.setVitB6(-0.01f);});
			    }
			 
			 @Test
			    void getVitB6ValidaPertoLimiteMinimo() throws ErrorException{
				 	Alimentos a = new Alimentos();
				 	a.setVitB6(0.01f);
			        assertEquals(0.01f, a.getVitB6(), 0.01f);
			    }
			 
			 @Test
			    void getVitB6ValidaPertoLimiteMaximo() throws ErrorException{
				 	Alimentos a = new Alimentos();
			        a.setVitB6(999.99f);
			        assertEquals(999.99f, a.getVitB6(), 999.99f);
			    }
			 
			 @Test
			    void getVitB6InvalidoRetorno()throws ErrorException{
				 	Alimentos a = new Alimentos();
				 	a.setVitB6(13.00f);
			        Float resultado = 10.00f;
			        Assert.assertNotEquals(resultado, a.getVitB6());
			    }

		//##########################################################################
			//##########################################################################
			//##########################################################################
			//VitB12

			 @Test
			    void getVitB12Valida() throws ErrorException{
				 	Alimentos a = new Alimentos();
				 	a.setVitB12(13.00f);
			        assertEquals(13.00f, a.getVitB12(), 13.00f);
			    }

			 @Test
			    void getVitB12Ivalida() throws ErrorException{
				 	Alimentos a = new Alimentos();
				 	assertThrows(ErrorException.class, ()-> {a.setVitB12(-1.00f);});
			    } 
			 
			 @Test
			    void getVitB12IvalidaPertoLimiteMaximo() throws ErrorException{
				 	Alimentos a = new Alimentos();
				 	assertThrows(ErrorException.class, ()-> {a.setVitB12(1001.01f);});
			    }
			 
			 @Test
			    void getVitB12IvalidaPertoLimiteMinimo() throws ErrorException{
				 	Alimentos a = new Alimentos();
				 	assertThrows(ErrorException.class, ()-> {a.setVitB12(-0.01f);});
			    }
			 
			 @Test
			    void getVitB12ValidaPertoLimiteMinimo() throws ErrorException{
				 	Alimentos a = new Alimentos();
				 	a.setVitB12(0.01f);
			        assertEquals(0.01f, a.getVitB12(), 0.01f);
			    }
			 
			 @Test
			    void getVitB12ValidaPertoLimiteMaximo() throws ErrorException{
				 	Alimentos a = new Alimentos();
			        a.setVitB12(999.99f);
			        assertEquals(999.99f, a.getVitB12(), 999.99f);
			    }
			 
			 @Test
			    void getVitB12InvalidoRetorno() throws ErrorException{
				 	Alimentos a = new Alimentos();
				 	a.setVitB12(13.00f);
			        Float resultado = 10.00f;
			        Assert.assertNotEquals(resultado, a.getVitB12());
			    }
			 
	//##########################################################################
		//##########################################################################
		//##########################################################################
		//VitC

		 @Test
		    void getVitCValida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setVitC(13.00f);
		        assertEquals(13.00f, a.getVitC(), 13.00f);
		    }

		 @Test
		    void getVitCIvalida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setVitC(-1.00f);});
		    } 
		 
		 @Test
		    void getVitCIvalidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setVitC(1001.01f);});
		    }
		 
		 @Test
		    void getVitCIvalidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setVitC(-0.01f);});
		    }
		 
		 @Test
		    void getVitCValidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setVitC(0.01f);
		        assertEquals(0.01f, a.getVitC(), 0.01f);
		    }
		 
		 @Test
		    void getVitCValidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
		        a.setVitC(999.99f);
		        assertEquals(999.99f, a.getVitC(), 999.99f);
		    }
		 
		 @Test
		    void getVitCInvalidoRetorno() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setVitC(13.00f);
		        Float resultado = 10.00f;
		        Assert.assertNotEquals(resultado, a.getVitC());
		    }

	//##########################################################################
		//##########################################################################
		//##########################################################################
		//Folatos

		 @Test
		    void getFolatosValida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setFolatos(13.00f);
		        assertEquals(13.00f, a.getFolatos(), 13.00f);
		    }

		 @Test
		    void getFolatosIvalida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setFolatos(-1.00f);});
		    } 
		 
		 @Test
		    void getFolatosIvalidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setFolatos(1001.01f);});
		    }
		 
		 @Test
		    void getFolatosIvalidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setFolatos(-0.01f);});
		    }
		 
		 @Test
		    void getFolatosValidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setFolatos(0.01f);
		        assertEquals(0.01f, a.getFolatos(), 0.01f);
		    }
		 
		 @Test
		    void getFolatosValidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
		        a.setFolatos(999.99f);
		        assertEquals(999.99f, a.getFolatos(), 999.99f);
		    }
		 
		 @Test
		    void getFolatosInvalidoRetorno() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setFolatos(13.00f);
		        Float resultado = 10.00f;
		        Assert.assertNotEquals(resultado, a.getFolatos());
		    }

	//##########################################################################
		//##########################################################################
		//##########################################################################
		//Cinza

		 @Test
		    void getCinzaValida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setCinza(13.00f);
		        assertEquals(13.00f, a.getCinza(), 13.00f);
		    }

		 @Test
		    void getCinzaIvalida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setCinza(-1.00f);});
		    } 
		 
		 @Test
		    void getCinzaIvalidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setCinza(1001.01f);});
		    }
		 
		 @Test
		    void getCinzaIvalidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setCinza(-0.01f);});
		    }
		 
		 @Test
		    void getCinzaValidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setCinza(0.01f);
		        assertEquals(0.01f, a.getCinza(), 0.01f);
		    }
		 
		 @Test
		    void getCinzaValidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
		        a.setCinza(999.99f);
		        assertEquals(999.99f, a.getCinza(), 999.99f);
		    }
		 
		 @Test
		    void getCinzaInvalidoRetorno() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setCinza(13.00f);
		        Float resultado = 10.00f;
		        Assert.assertNotEquals(resultado, a.getCinza());
		    }

	//##########################################################################
		//##########################################################################
		//##########################################################################
		//Sódio

		 @Test
		    void getNaValida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setNa(13.00f);
		        assertEquals(13.00f, a.getNa(), 13.00f);
		    }

		 @Test
		    void getNaIvalida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setNa(-1.00f);});
		    } 
		 
		 @Test
		    void getNaIvalidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setNa(1001.01f);});
		    }
		 
		 @Test
		    void getNaIvalidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setNa(-0.01f);});
		    }
		 
		 @Test
		    void getNaValidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setNa(0.01f);
		        assertEquals(0.01f, a.getNa(), 0.01f);
		    }
		 
		 @Test
		    void getNaValidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
		        a.setNa(999.99f);
		        assertEquals(999.99f, a.getNa(), 999.99f);
		    }
		 
		 @Test
		    void getNaInvalidoRetorno() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setNa(13.00f);
		        Float resultado = 10.00f;
		        Assert.assertNotEquals(resultado, a.getNa());
		    }

	//##########################################################################
		//##########################################################################
		//##########################################################################
		//Potássio

		 @Test
		    void getKValida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setK(13.00f);
		        assertEquals(13.00f, a.getK(), 13.00f);
		    }

		 @Test
		    void getKIvalida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setK(-1.00f);});
		    } 
		 
		 @Test
		    void getKIvalidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setK(1001.01f);});
		    }
		 
		 @Test
		    void getKIvalidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setK(-0.01f);});
		    }
		 
		 @Test
		    void getKValidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setK(0.01f);
		        assertEquals(0.01f, a.getK(), 0.01f);
		    }
		 
		 @Test
		    void getKValidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
		        a.setK(999.99f);
		        assertEquals(999.99f, a.getK(), 999.99f);
		    }
		 
		 @Test
		    void getKInvalidoRetorno() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setK(13.00f);
		        Float resultado = 10.00f;
		        Assert.assertNotEquals(resultado, a.getK());
		    }

		//##########################################################################
		//##########################################################################
		//##########################################################################
		//Cálcio

		 @Test
		    void getCaValida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setCa(13.00f);
		        assertEquals(13.00f, a.getCa(), 13.00f);
		    }

		 @Test
		    void getCaIvalida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setCa(-1.00f);});
		    } 
		 
		 @Test
		    void getCaIvalidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setCa(1001.01f);});
		    }
		 
		 @Test
		    void getCaIvalidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setCa(-0.01f);});
		    }
		 
		 @Test
		    void getCaValidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setCa(0.01f);
		        assertEquals(0.01f, a.getCa(), 0.01f);
		    }
		 
		 @Test
		    void getCaValidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
		        a.setCa(999.99f);
		        assertEquals(999.99f, a.getCa(), 999.99f);
		    }
		 
		 @Test
		    void getCaInvalidoRetorno() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setCa(13.00f);
		        Float resultado = 10.00f;
		        Assert.assertNotEquals(resultado, a.getCa());
		    }

		 

	//##########################################################################
		//##########################################################################
		//##########################################################################
		//Fósforo

		 @Test
		    void getPValida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setP(13.00f);
		        assertEquals(13.00f, a.getP(), 13.00f);
		    }

		 @Test
		    void getPIvalida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setP(-1.00f);});
		    } 
		 
		 @Test
		    void getPIvalidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setP(1001.01f);});
		    }
		 
		 @Test
		    void getPIvalidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setP(-0.01f);});
		    }
		 
		 @Test
		    void getPValidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setP(0.01f);
		        assertEquals(0.01f, a.getP(), 0.01f);
		    }
		 
		 @Test
		    void getPValidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
		        a.setP(999.99f);
		        assertEquals(999.99f, a.getP(), 999.99f);
		    }
		 
		 @Test
		    void getPInvalidoRetorno() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setP(13.00f);
		        Float resultado = 10.00f;
		        Assert.assertNotEquals(resultado, a.getP());
		    }

	//##########################################################################
		//##########################################################################
		//##########################################################################
		//MAGNESIO

		 @Test
		    void getMgValida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setMg(13.00f);
		        assertEquals(13.00f, a.getMg(), 13.00f);
		    }

		 @Test
		    void getMgIvalida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setMg(-1.00f);});
		    } 
		 
		 @Test
		    void getMgIvalidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setMg(1001.01f);});
		    }
		 
		 @Test
		    void getMgIvalidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setMg(-0.01f);});
		    }
		 
		 @Test
		    void getMgValidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setMg(0.01f);
		        assertEquals(0.01f, a.getMg(), 0.01f);
		    }
		 
		 @Test
		    void getMgValidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
		        a.setMg(999.99f);
		        assertEquals(999.99f, a.getMg(), 999.99f);
		    }
		 
		 @Test
		    void getMgInvalidoRetorno() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setMg(13.00f);
		        Float resultado = 10.00f;
		        Assert.assertNotEquals(resultado, a.getMg());
		    }

	//##########################################################################
		//##########################################################################
		//##########################################################################
		//FERRO

		 @Test
		    void getFeValida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setFe(13.00f);
		        assertEquals(13.00f, a.getFe(), 13.00f);
		    }

		 @Test
		    void getFeIvalida() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setFe(-1.00f);});
		    } 
		 
		 @Test
		    void getFeIvalidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setFe(1001.01f);});
		    }
		 
		 @Test
		    void getFeIvalidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	assertThrows(ErrorException.class, ()-> {a.setFe(-0.01f);});
		    }
		 
		 @Test
		    void getFeValidaPertoLimiteMinimo() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setFe(0.01f);
		        assertEquals(0.01f, a.getFe(), 0.01f);
		    }
		 
		 @Test
		    void getFeValidaPertoLimiteMaximo() throws ErrorException{
			 	Alimentos a = new Alimentos();
		        a.setFe(999.99f);
		        assertEquals(999.99f, a.getFe(), 999.99f);
		    }
		 
		 @Test
		    void getFeInvalidoRetorno() throws ErrorException{
			 	Alimentos a = new Alimentos();
			 	a.setFe(13.00f);
		        Float resultado = 10.00f;
		        Assert.assertNotEquals(resultado, a.getFe());
		    }

		//##########################################################################
			//##########################################################################
			//##########################################################################
			//ZINCO

			 @Test
			    void getZnValida() throws ErrorException{
				 	Alimentos a = new Alimentos();
				 	a.setZn(13.00f);
			        assertEquals(13.00f, a.getZn(), 13.00f);
			    }

			 @Test
			    void getZnIvalida() throws ErrorException{
				 	Alimentos a = new Alimentos();
				 	assertThrows(ErrorException.class, ()-> {a.setZn(-1.00f);});
			    } 
			 
			 @Test
			    void getZnIvalidaPertoLimiteMaximo() throws ErrorException{
				 	Alimentos a = new Alimentos();
				 	assertThrows(ErrorException.class, ()-> {a.setZn(1001.01f);});
			    }
			 
			 @Test
			    void getZnIvalidaPertoLimiteMinimo() throws ErrorException{
				 	Alimentos a = new Alimentos();
				 	assertThrows(ErrorException.class, ()-> {a.setZn(-0.01f);});
			    }
			 
			 @Test
			    void getZnValidaPertoLimiteMinimo() throws ErrorException{
				 	Alimentos a = new Alimentos();
				 	a.setZn(0.01f);
			        assertEquals(0.01f, a.getZn(), 0.01f);
			    }
			 
			 @Test
			    void getZnValidaPertoLimiteMaximo() throws ErrorException{
				 	Alimentos a = new Alimentos();
			        a.setZn(999.99f);
			        assertEquals(999.99f, a.getZn(), 999.99f);
			    }
			 
			 @Test
			    void getZeInvalidoRetorno() throws ErrorException{
				 	Alimentos a = new Alimentos();
				 	a.setZn(13.00f);
			        Float resultado = 10.00f;
			        Assert.assertNotEquals(resultado, a.getZn());
			    }

}
