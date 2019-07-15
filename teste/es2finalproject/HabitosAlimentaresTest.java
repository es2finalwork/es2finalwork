package es2finalproject;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class HabitosAlimentaresTest {

	//##########################################################################
		//##########################################################################
		//##########################################################################
		//NOME

		 @Test
		    void getNomeValido()throws ErrorException{
		        HabitosAlimentares ha = new HabitosAlimentares();
		        ha.setNomeRefeicao("Almoço");
		        assertEquals("Almoço", ha.getNomeRefeicao());
		    }	 
		 
		 @Test
		    void getNomenullInvalido()throws ErrorException{
			 	HabitosAlimentares ha = new HabitosAlimentares();
		        assertThrows(ErrorException.class, ()-> {ha.setNomeRefeicao("");});
		    }
		 
		 @Test
		    void getNomenullInvalidoNumero()throws ErrorException{
			 	HabitosAlimentares ha = new HabitosAlimentares();
		        assertThrows(ErrorException.class, ()-> {ha.setNomeRefeicao("Leite12");});
		    }
		
		 @Test
		    void getNomeInvalidoCaracterEspecial()throws ErrorException{
			 	HabitosAlimentares ha = new HabitosAlimentares();
			 	assertThrows(ErrorException.class, ()-> {ha.setNomeRefeicao("lac@");});
		    }
		 
		 @Test
		    void getNomeInvalidoMinimo()throws ErrorException{
			 	HabitosAlimentares ha = new HabitosAlimentares();
			 	assertThrows(ErrorException.class, ()-> {ha.setNomeRefeicao("ba");});
		    }
		 
		 @Test
		    void getNomeInvalidoMaximo()throws ErrorException{
			 HabitosAlimentares ha = new HabitosAlimentares();
			 	assertThrows(ErrorException.class, ()-> {ha.setNomeRefeicao("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");}); // 101 caracteres
		    }
		 
		 @Test
		    void getNomeValidoPertoLimiteSuperior()throws ErrorException{
			 HabitosAlimentares ha = new HabitosAlimentares();
		        ha.setNomeRefeicao("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"); //contem 99 caracteres
		        assertEquals("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", ha.getNomeRefeicao());
		    }
		 
		 @Test
		    void getNomeValidoPertoLimiteInferior()throws ErrorException{
			 HabitosAlimentares ha = new HabitosAlimentares();
		        ha.setNomeRefeicao("bara");
		        assertEquals("bara", ha.getNomeRefeicao());
		    }
		 
		 @Test
		    void getNomeRefeicaoInvalidoRetorno() throws ErrorException{
			 	HabitosAlimentares ha = new HabitosAlimentares();
			 	ha.setNomeRefeicao("Almoço");
		        String resultado = "jantar";
		        Assert.assertNotEquals(resultado, ha.getNomeRefeicao());
		    }

		 
	//##########################################################################
		//##########################################################################
		//##########################################################################
		//ALIMENTO

		 @Test
		    void getAlimentoValido()throws ErrorException{
		        HabitosAlimentares ha = new HabitosAlimentares();
		        ha.setAlimento("Frango");
		        assertEquals("Frango", ha.getAlimento());
		    }	 
		 
		 @Test
		    void getAlimentonullInvalido()throws ErrorException{
			 	HabitosAlimentares ha = new HabitosAlimentares();
		        assertThrows(ErrorException.class, ()-> {ha.setAlimento("");});
		    }
		
		 @Test
		    void getAlimentoInvalidoCaracterEspecial()throws ErrorException{
			 	HabitosAlimentares ha = new HabitosAlimentares();
			 	assertThrows(ErrorException.class, ()-> {ha.setAlimento("banan@");});
		    }
		 
		 @Test
		    void getAlimentoInvalidoNumero()throws ErrorException{
			 	HabitosAlimentares ha = new HabitosAlimentares();
			 	assertThrows(ErrorException.class, ()-> {ha.setAlimento("banan32");});
		    }
		 
		 @Test
		    void getAlimentoInvalidoMinimo()throws ErrorException{
			 	HabitosAlimentares ha = new HabitosAlimentares();
			 	assertThrows(ErrorException.class, ()-> {ha.setAlimento("ba");});
		    }
		 
		 @Test
		    void getAlimentoInvalidoMaximo()throws ErrorException{
			 HabitosAlimentares ha = new HabitosAlimentares();
			 	assertThrows(ErrorException.class, ()-> {ha.setAlimento("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");}); // 101 caracteres
		    }
		 
		 @Test
		    void getAlimentoValidoPertoLimiteSuperior()throws ErrorException{
			 HabitosAlimentares ha = new HabitosAlimentares();
		        ha.setAlimento("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"); //contem 99 caracteres
		        assertEquals("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", ha.getAlimento());
		    }
		 
		 @Test
		    void getAlimentoValidoPertoLimiteInferior()throws ErrorException{
			 HabitosAlimentares ha = new HabitosAlimentares();
		        ha.setAlimento("bara");
		        assertEquals("bara", ha.getAlimento());
		    }
		 
		 @Test
		    void getAlimentoInvalidoRetorno() throws ErrorException{
			 	HabitosAlimentares ha = new HabitosAlimentares();
			 	ha.setAlimento("Frango");
		        String resultado = "Perna";
		        Assert.assertNotEquals(resultado, ha.getAlimento());
		    }
		 
//##########################################################################
	//##########################################################################
	//##########################################################################
	//HORA

	 @Test
	    void getHoraValido()throws ErrorException{
	        HabitosAlimentares ha = new HabitosAlimentares();
	        ha.setHora("14:00");
	        assertEquals("14:00", ha.getHora());
	    }
	 
	 
	 @Test
	    void getHoranullInvalido()throws ErrorException{
		 	HabitosAlimentares ha = new HabitosAlimentares();
	        assertThrows(ErrorException.class, ()-> {ha.setHora("");});
	    }
	
	 @Test
	    void getHoraInvalidoCaracterEspecial()throws ErrorException{
		 	HabitosAlimentares ha = new HabitosAlimentares();
		 	assertThrows(ErrorException.class, ()-> {ha.setHora("13:3@");});
	    }
	 
	 @Test
	    void getHoraInvalidoMinimo()throws ErrorException{
		 	HabitosAlimentares ha = new HabitosAlimentares();
		 	assertThrows(ErrorException.class, ()-> {ha.setHora("15:3");});
	    }
	 
	 @Test
	    void getHoraInvalidoMaximo()throws ErrorException{
		 HabitosAlimentares ha = new HabitosAlimentares();
		 	assertThrows(ErrorException.class, ()-> {ha.setHora("15:332");});
	    }
	 
	 @Test
	    void getHoraInvalidoHoraMaximo()throws ErrorException{
		 HabitosAlimentares ha = new HabitosAlimentares();
		 	assertThrows(ErrorException.class, ()-> {ha.setHora("33:40");});
	    }
	 
	 @Test
	    void getHoraInvalidoHoraMinimo()throws ErrorException{
		 HabitosAlimentares ha = new HabitosAlimentares();
		 	assertThrows(ErrorException.class, ()-> {ha.setHora("0:40");});
	    }
	 
	 @Test
	    void getHoraInvalidoMinutosMaximo()throws ErrorException{
		 HabitosAlimentares ha = new HabitosAlimentares();
		 	assertThrows(ErrorException.class, ()-> {ha.setHora("15:99");});
	    }
	 
	 @Test
	    void getHoraInvalidoMinutosMinimo()throws ErrorException{
		 HabitosAlimentares ha = new HabitosAlimentares();
		 	assertThrows(ErrorException.class, ()-> {ha.setHora("15:-01");});
	    }
	 
	 @Test
	    void getHoraInvalidoRetorno() throws ErrorException{
		 	HabitosAlimentares ha = new HabitosAlimentares();
		 	ha.setHora("15:00");
	        String resultado = "14:33";
	        Assert.assertNotEquals(resultado, ha.getHora());
	    }
	 
	 	//##########################################################################
		//##########################################################################
		//##########################################################################
		//GRAMAS

			 @Test
			    void getGramasValida() throws ErrorException{
				 	HabitosAlimentares ha = new HabitosAlimentares();
				 	ha.setGramas(13.00f);
			        assertEquals(13.00f, ha.getGramas(), 13.00f);
			    }

			 @Test
			    void getGramasInvalida() throws ErrorException{
				 	HabitosAlimentares ha = new HabitosAlimentares();
				 	assertThrows(ErrorException.class, ()-> {ha.setGramas(-1.00f);});
			    } 
			 
			 @Test
			    void getGramasInvalidaPertoLimiteMaximo() throws ErrorException{
				 	HabitosAlimentares ha = new HabitosAlimentares();
				 	assertThrows(ErrorException.class, ()-> {ha.setGramas(1001.01f);});
			    }
			 
			 @Test
			    void getGramasInvalidaPertoLimiteMinimo() throws ErrorException{
				 	HabitosAlimentares ha = new HabitosAlimentares();
				 	assertThrows(ErrorException.class, ()-> {ha.setGramas(-0.01f);});
			    }
			 
			 @Test
			    void getGramasValidaPertoLimiteMinimo() throws ErrorException{
				 	HabitosAlimentares ha = new HabitosAlimentares();
				 	ha.setGramas(0.01f);
			        assertEquals(0.01f, ha.getGramas(), 0.01f);
			    }
			 
			 @Test
			    void getGramasValidaPertoLimiteMaximo() throws ErrorException{
				 	HabitosAlimentares ha = new HabitosAlimentares();
			        ha.setGramas(999.99f);
			        assertEquals(999.99f, ha.getGramas(), 999.99f);
			    }
			 
			 @Test
			    void getGramasInvalidoRetorno() throws ErrorException{
				 	HabitosAlimentares ha = new HabitosAlimentares();
				 	ha.setGramas(33.33f);
			        Float resultado = 45.00f;
			        Assert.assertNotEquals(resultado, ha.getGramas());
			    }

}
