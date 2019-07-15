package es2finalproject;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HabitosAlimentares {
	public boolean caractersespeciais(String st) {
        String pattern = "[!@#$%^&*().?{}|<>_]";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(st);

        boolean resposta = false;

        if (m.find()) {
            resposta = true;
        } else {
            resposta = false;
        }
        return resposta;
    }

    public boolean conternumeros(String st) {
        String pattern = "[1234567890]";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(st);

        boolean resposta = false;

        if (m.find()) {
            resposta = true;
        }

        return resposta;
    }

    public String getNomeRefeicao() throws ErrorException {

        return nomeRefeicao;
    }

    public void setNomeRefeicao(String nomeRefeicao) throws ErrorException {
    	
    	if (nomeRefeicao.length() <= 3){
            System.out.println("Error 002: Nome de refeição não contêm o mínimo estabelecido de caracteres!");
            throw new ErrorException();
        }
        else if (nomeRefeicao.length() > 100){
            System.out.println("Error 003: Nome de refeição contêm mais que o máximo estabelecido de caracteres!");
            throw new ErrorException();
        }

        else if(caractersespeciais(nomeRefeicao)){
            System.out.println("Error 004: Nome de refeição contêm caracteres especiais!");
            throw new ErrorException();
        }
        
        else if(conternumeros(nomeRefeicao)){
            System.out.println("Error 004: Nome de refeição contêm caracteres especiais!");
            throw new ErrorException();
        }
        this.nomeRefeicao = nomeRefeicao;
    }

    public String getAlimento() throws ErrorException {

        return alimento;
    }

    public void setAlimento(String alimento) throws ErrorException {
    	
    	if (alimento.length() <= 3){
            System.out.println("Error 002: Alimento não contêm o mínimo estabelecido de caracteres!");
            throw new ErrorException();
        }
        else if (alimento.length() > 100){
            System.out.println("Error 003: Alimento contêm mais que o máximo estabelecido de caracteres!");
            throw new ErrorException();
        }
        
        else if(caractersespeciais(alimento)){
            System.out.println("Error 004: Nome de alimento contêm caracteres especiais!");
            throw new ErrorException();
        }
        
        else if(conternumeros(alimento)){
            System.out.println("Error 004: Nome de alimento contêm caracteres especiais!");
            throw new ErrorException();
        }
        
        this.alimento = alimento;
    }

    public String getHora() throws ErrorException {
        
        return hora;
    }
    

    public void setHora(String hora) throws ErrorException {
    	
    	if (hora.length() != 5) {
        	System.out.println("Error 001: Hora da refeição em formato errado!");
            throw new ErrorException();
        }
        
        else if(caractersespeciais(hora)){
            System.out.println("Error 004: hora contêm caracteres especiais!");
            throw new ErrorException();
        }
        
        String[] hm = hora.split(":");;
        
        String h = hm[0];
        String m = hm[1];
        
        int ho = Integer.parseInt(h);
        int mi = Integer.parseInt(m);
        
        if(ho > 24) {
        	System.out.println("Error: hora pode ser maior que 24!");
            throw new ErrorException();
        }
        
        if(mi > 60) {
        	System.out.println("Error: miutos não pode ser maior que 60!");
            throw new ErrorException();
        }
        
        this.hora = hora;
    }

    public Float getGramas() throws ErrorException{
        return gramas;
    }

    public void setGramas(Float gramas) throws ErrorException{
    	if(gramas < 0) {
            System.out.println("Erro 002: Gramas não podem ser zero!");
            throw new ErrorException();
        }
        else if (gramas > 1000) {
            System.out.println("Erro 003: Gramas demasiado elevadas!");
            throw new ErrorException();
        }
        this.gramas = gramas;
    }

    private String nomeRefeicao;
    private String alimento;
    private String hora;
    private Float gramas;
}
