package es2finalproject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DadosPessoais {
	 public String getNome() throws ErrorException{

	        return Nome;
	}

	public void setNome(String nome) throws ErrorException{
		
		if (nome.length() < 3){
            System.out.println("Error: Nome n�o cont�m o m�nimo estabelecido de caracteres!");
            throw new ErrorException();
        }
        else if (nome.length() > 100){
            System.out.println("Error: Nome cont�m mais que o m�ximo estabelecido de caracteres!");
            throw new ErrorException();
        }
        else if(conternumeros(nome)){
            System.out.println("Error: Nome cont�m numeros!");
            throw new ErrorException();
        }

        else if(caractersespeciais(nome)){
            System.out.println("Error: Nome cont�m caracteres especiais!");
            throw new ErrorException();
        }

        Nome = nome;
	}

	public Integer getIdade() throws ErrorException {

        return Idade;
    }

    public void setIdade(Integer idade) throws ErrorException {
        if(idade < 3){
            System.out.println("Error: Idade n�o cont�m o valor m�nimo v�lido estabelecido!");
            throw new ErrorException();
        }
        else if (idade > 100){
            System.out.println("Error: Idade cont�m mais do que o valor m�ximo estabelecido!");
            throw new ErrorException();
        }

        Idade = idade;
    }

    public Float getAltura() throws ErrorException {

        return Altura;
    }

    public void setAltura(Float altura) throws ErrorException {
        if(altura < 1.00f){
            System.out.println("Error: Altura n�o cont�m o valor m�nimo v�lido estabelecido!");
            throw new ErrorException();
        }
        else if (altura > 2.50f){
            System.out.println("Error: Altura cont�m mais do que o valor m�ximo estabelecido!");
            throw new ErrorException();
        }

        Altura = altura;
    }

    public String getProfissao() throws ErrorException{

        return Profissao;
    }

    public void setProfissao(String profissao) throws ErrorException{
        if (profissao.length() < 3){
            System.out.println("Error: Profissao n�o cont�m o m�nimo estabelecido de caracteres!");
            throw new ErrorException();
        }
       
        else if (profissao.length() > 100){
            System.out.println("Error: Profissao cont�m mais que o m�ximo estabelecido de caracteres!");
            throw new ErrorException();
        }

        else if(conternumeros(profissao)){
            System.out.println("Error: Profissao cont�m numeros!");
            throw new ErrorException();
        }

        else if(caractersespeciais(profissao)){
            System.out.println("Error: Profissao cont�m caracteres especiais!");
            throw new ErrorException();
        }

        Profissao = profissao;
    }

    public Float getPeso() throws ErrorException {

        return Peso;
    }

    public void setPeso(Float peso) throws ErrorException {
        if(peso < 20.00f){
            System.out.println("Error: Peso n�o cont�m o valor m�nimo v�lido estabelecido!");
            throw new ErrorException();
        }
        else if (peso > 300.00f){
            System.out.println("Error: Peso cont�m mais do que o valor m�ximo estabelecido!");
            throw new ErrorException();
        }
        
        Peso = peso;
    }

    public Float getIMC() throws ErrorException {

        return IMC;
    }

    public void setIMC(Float imc) throws ErrorException{
        if(imc < 20){
            System.out.println("Error: IMC n�o cont�m o valor m�nimo v�lido estabelecido!");
            throw new ErrorException();
        }
        else if (imc > 300){
            System.out.println("Error: IMC cont�m mais do que o valor m�ximo estabelecido!");
            throw new ErrorException();
        }

        this.IMC = imc;
    }

    public Float getBodyFat() throws ErrorException{
        
        return BodyFat;
    }

    public void setBodyFat(Float bodyFat) throws ErrorException{
        if(bodyFat < 5.00f){
            System.out.println("Error: BodyFat n�o cont�m o valor m�nimo v�lido estabelecido!");
            throw new ErrorException();
        }
        else if (bodyFat > 90.00f){
            System.out.println("Error: BodyFat cont�m mais do que o valor m�ximo estabelecido!");
            throw new ErrorException();
        }

        BodyFat = bodyFat;
    }

    public Float getGorduraVisceral() throws ErrorException{

        return GorduraVisceral;
    }

    public void setGorduraVisceral(Float gorduraVisceral) throws ErrorException{
    	 if(gorduraVisceral < 1.00f){
             System.out.println("Error: Musculo n�o cont�m o valor m�nimo v�lido estabelecido!");
             throw new ErrorException();
         }
         else if (gorduraVisceral > 90.00f){
             System.out.println("Error: Musculo cont�m mais do que o valor m�ximo estabelecido!");
             throw new ErrorException();
         }
        GorduraVisceral = gorduraVisceral;
    }

    public Float getMusculo() throws ErrorException{

        return Musculo;
    }

    public void setMusculo(Float musculo) throws ErrorException{
        if(musculo < 10.00f){
            System.out.println("Error: Musculo n�o cont�m o valor m�nimo v�lido estabelecido!");
            throw new ErrorException();
        }
        else if (musculo > 90.00f){
            System.out.println("Error: Musculo cont�m mais do que o valor m�ximo estabelecido!");
            throw new ErrorException();
        }

        Musculo = musculo;
    }

    public Float getIdadeMetabolica() throws ErrorException{

        return IdadeMetabolica;
    }

    public void setIdadeMetabolica(Float idadeMetabolica) throws ErrorException{
        if(idadeMetabolica < 3){
            System.out.println("Error 032 : IdadeMetabolica n�o cont�m o valor m�nimo v�lido estabelecido!");
            throw new ErrorException();
        }
        else if (idadeMetabolica > 90){
            System.out.println("Error 033 : IdadeMetabolica cont�m mais do que o valor m�ximo estabelecido!");
            throw new ErrorException();
        }

        IdadeMetabolica = idadeMetabolica;
    }

    public Float getH2Ocorpo() throws ErrorException{
    	
        return H2Ocorpo;
    }

    public void setH2Ocorpo(Float h2Ocorpo) throws ErrorException{
        if(h2Ocorpo < 20.00f){
            System.out.println("Error 035 : H2Ocorpo n�o cont�m o valor m�nimo v�lido estabelecido!");
            throw new ErrorException();
        }
        else if (h2Ocorpo > 80.00f){
            System.out.println("Error 036 : H2Ocorpo cont�m mais do que o valor m�ximo estabelecido!");
            throw new ErrorException();
        }

        H2Ocorpo = h2Ocorpo;
    }

    public Float getMetabolismoBasal() throws ErrorException{

        return MetabolismoBasal;
    }

    public void setMetabolismoBasal(Float metabolismoBasal) throws ErrorException{
        if(metabolismoBasal <= 0.00f){
            System.out.println("Error 038 : MetabolismoBasal n�o cont�m o valor m�nimo v�lido estabelecido!");
            throw new ErrorException();
        }
        else if (metabolismoBasal > 1200.00f){
            System.out.println("Error 039 : MetabolismoBasal cont�m mais do que o valor m�ximo estabelecido!");
            throw new ErrorException();
        }

        MetabolismoBasal = metabolismoBasal;
    }

    public Float getOsso() throws ErrorException{
    	
        return Osso;
    }

    public void setOsso(Float osso) throws ErrorException{
        if(osso <= 0.00f){
            System.out.println("Error 041 : Percentagem ossia n�o cont�m o valor m�nimo v�lido estabelecido!");
            throw new ErrorException();
        }
        else if (osso > 5.00f){
            System.out.println("Error 042 : Percentagem ossia cont�m mais do que o valor m�ximo estabelecido!");
            throw new ErrorException();
        }

        Osso = osso;
    }

    public String getMotivoConsulta() throws ErrorException{

        return MotivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) throws ErrorException{
    	if (motivoConsulta.length() < 3){
            System.out.println("Error 045: Motivo da Consulta n�o cont�m o m�nimo estabelecido de caracteres!");
            throw new ErrorException();
        }
        else if (motivoConsulta.length() > 100){
            System.out.println("Error 046: Motivo da Consulta cont�m mais que o m�ximo estabelecido de caracteres!");
            throw new ErrorException();
        }

        else if(conternumeros(motivoConsulta)){
            System.out.println("Error 047: Motivo da Consulta cont�m numeros!");
            throw new ErrorException();
        }

        else if(caractersespeciais(motivoConsulta)){
            System.out.println("Error 048: Motivo da Consulta cont�m caracteres especiais!");
            throw new ErrorException();
        }
        MotivoConsulta = motivoConsulta;
    }

    public String getObjectivos() throws ErrorException{

        return Objectivos;
    }

    public void setObjectivos(String objectivos) throws ErrorException{
    	
    	if (objectivos.length() < 3){
            System.out.println("Error 050: Motivo da Consulta n�o cont�m o m�nimo estabelecido de caracteres!");
            throw new ErrorException();
        }
        else if (objectivos.length() > 100){
            System.out.println("Error 051: Motivo da Consulta cont�m mais que o m�ximo estabelecido de caracteres!");
            throw new ErrorException();
        }

        else if(conternumeros(objectivos)){
            System.out.println("Error 052: Motivo da Consulta cont�m numeros!");
            throw new ErrorException();
        }

        else if(caractersespeciais(objectivos)){
            System.out.println("Error 053: Motivo da Consulta cont�m caracteres especiais!");
            throw new ErrorException();
        }

        Objectivos = objectivos;
    }

    public String getPatologias() throws ErrorException{
 
        return Patologias;
    }

    public void setPatologias(String patologias) throws ErrorException{
    	
    	if (patologias.length() < 3){
            System.out.println("Error 055: Patologias n�o cont�m o m�nimo estabelecido de caracteres!");
            throw new ErrorException();
        }
        else if (patologias.length() > 100){
            System.out.println("Error 056: Patologias cont�m mais que o m�ximo estabelecido de caracteres!");
            throw new ErrorException();
        }

        else if(conternumeros(patologias)){
            System.out.println("Error 057: Patologias cont�m numeros!");
            throw new ErrorException();
        }

        else if(caractersespeciais(patologias)){
            System.out.println("Error 058: Patologias cont�m caracteres especiais!");
            throw new ErrorException();
        }
        Patologias = patologias;
    }

    public String getMedicacao() throws ErrorException{

        return Medicacao;
    }

    public void setMedicacao(String medicacao) throws ErrorException{
    	
    	if (medicacao.length() < 3){
            System.out.println("Error 060: Medicacao n�o cont�m o m�nimo estabelecido de caracteres!");
            throw new ErrorException();
        }
        else if (medicacao.length() > 100){
            System.out.println("Error 061: Medicacao cont�m mais que o m�ximo estabelecido de caracteres!");
            throw new ErrorException();
        }

        else if(conternumeros(medicacao)){
            System.out.println("Error 062: Medicacao cont�m numeros!");
            throw new ErrorException();
        }

        else if(caractersespeciais(medicacao)){
            System.out.println("Error 063: Medicacao cont�m caracteres especiais!");
            throw new ErrorException();
        }

        Medicacao = medicacao;
    }

    public String getAntedecentes() throws ErrorException{

        return Antedecentes;
    }

    public void setAntedecentes(String antedecentes) throws ErrorException{
    	
    	if (antedecentes.length() < 3){
            System.out.println("Error 065: Antedecentes n�o cont�m o m�nimo estabelecido de caracteres!");
            throw new ErrorException();
        }
        else if (antedecentes.length() > 100){
            System.out.println("Error 066: Antedecentes cont�m mais que o m�ximo estabelecido de caracteres!");
            throw new ErrorException();
        }

        else if(conternumeros(antedecentes)){
            System.out.println("Error 067: Antedecentes cont�m numeros!");
            throw new ErrorException();
        }

        else if(caractersespeciais(antedecentes)){
            System.out.println("Error 068: Antedecentes cont�m caracteres especiais!");
            throw new ErrorException();
        }

        Antedecentes = antedecentes;
    }

    public String getAtividadeFisica() throws ErrorException{

        return AtividadeFisica;
    }

    public void setAtividadeFisica(String atividadeFisica) throws ErrorException{
    	
    	if (atividadeFisica.length() < 3){
            System.out.println("Error 070: Atividade Fisica n�o cont�m o m�nimo estabelecido de caracteres!");
            throw new ErrorException();
        }
        else if (atividadeFisica.length() > 100){
            System.out.println("Error 071: Atividade Fisica cont�m mais que o m�ximo estabelecido de caracteres!");
            throw new ErrorException();
        }

        else if(conternumeros(atividadeFisica)){
            System.out.println("Error 072: Atividade Fisica cont�m numeros!");
            throw new ErrorException();
        }

        else if(caractersespeciais(atividadeFisica)){
            System.out.println("Error 073: Atividade Fisica cont�m caracteres especiais!");
            throw new ErrorException();
        }

        AtividadeFisica = atividadeFisica;
    }

    public String getFuncaoInstestinal() throws ErrorException{

        return FuncaoInstestinal;
    }

    public void setFuncaoInstestinal(String funcaoInstestinal) throws ErrorException{
    	
    	if (funcaoInstestinal.length() < 3){
            System.out.println("Error 075: Atividade Fisica n�o cont�m o m�nimo estabelecido de caracteres!");
            throw new ErrorException();
        }
        else if (funcaoInstestinal.length() > 100){
            System.out.println("Error 076: Atividade Fisica cont�m mais que o m�ximo estabelecido de caracteres!");
            throw new ErrorException();
        }

        else if(conternumeros(funcaoInstestinal)){
            System.out.println("Error 077: Atividade Fisica cont�m numeros!");
            throw new ErrorException();
        }

        else if(caractersespeciais(funcaoInstestinal)){
            System.out.println("Error 078: Atividade Fisica cont�m caracteres especiais!");
            throw new ErrorException();
        }

        FuncaoInstestinal = funcaoInstestinal;
    }

    public Float getConsumoAgua() throws ErrorException{

        return ConsumoAgua;
    }

    public void setConsumoAgua(Float consumoAgua) throws ErrorException{
        if(consumoAgua <= 0.00f){
            System.out.println("Error 079 : Consumo de agua n�o cont�m o valor m�nimo v�lido estabelecido!");
            throw new ErrorException();
        }
        else if (consumoAgua > 5.00f){
            System.out.println("Error 080 : Consumo de agua cont�m mais do que o valor m�ximo estabelecido!");
            throw new ErrorException();
        }
        
        ConsumoAgua = consumoAgua;
    }

    public Float getColesterol() throws ErrorException{

        return Colesterol;
    }

    public void setColesterol(Float colesterol) throws ErrorException{
        if(colesterol <= 50.00f){
            System.out.println("Error 082 : Colesterol n�o cont�m o valor m�nimo v�lido estabelecido!");
            throw new ErrorException();
        }
        else if (colesterol > 300.00f){
            System.out.println("Error 083 : Colesterol cont�m mais do que o valor m�ximo estabelecido!");
            throw new ErrorException();
        }
        
        Colesterol = colesterol;
    }

    public Float getGlicemia() throws ErrorException{

        return Glicemia;
    }

    public void setGlicemia(Float glicemia) throws ErrorException{
        if(glicemia <= 70.00f){
            System.out.println("Error 085 : Glicemia n�o cont�m o valor m�nimo v�lido estabelecido!");
            throw new ErrorException();
        }
        else if (glicemia > 200.00f){
            System.out.println("Error 086 : Glicemia cont�m mais do que o valor m�ximo estabelecido!");
            throw new ErrorException();
        }

        Glicemia = glicemia;
    }

    public float getUreia() throws ErrorException{

        return Ureia;
    }

    public void setUreia(Float ureia) throws ErrorException{
        if(ureia <= 5.00f){
            System.out.println("Error 088 : Ureia n�o cont�m o valor m�nimo v�lido estabelecido!");
            throw new ErrorException();
        }
        else if (ureia > 50.00f){
            System.out.println("Error 089 : Ureia cont�m mais do que o valor m�ximo estabelecido!");
            throw new ErrorException();
        }

        Ureia = ureia;
    }

    public Float getCreatina() throws ErrorException{
        
        return Creatina;
    }

    public void setCreatina(Float creatina) throws ErrorException{
        if(creatina <= 0.60f){
            System.out.println("Error 091 : Creatinina n�o cont�m o valor m�nimo v�lido estabelecido!");
            throw new ErrorException();
        }
        else if (creatina > 1.50f){
            System.out.println("Error 092 : Creatinina cont�m mais do que o valor m�ximo estabelecido!");
            throw new ErrorException();
        }

        Creatina = creatina;
    }

    public float getProfCReactiva() throws ErrorException{

        return ProfCReactiva;
    }

    public void setProfCReactiva(Float profCReactiva) throws ErrorException{
        if(profCReactiva <= 0.00f){
            System.out.println("Error 094 : ProfCReactiva n�o cont�m o valor m�nimo v�lido estabelecido!");
            throw new ErrorException();
        }
        else if (profCReactiva > 0.50f){
            System.out.println("Error 095 : ProfCReactiva cont�m mais do que o valor m�ximo estabelecido!");
            throw new ErrorException();
        }

        ProfCReactiva = profCReactiva;
    }

	private String Nome;
	    private Integer Idade;
	    private Float Altura;
	    private String Profissao;
	    private String MotivoConsulta;
	    private String Objectivos;
	    private String Patologias;
	    private String Medicacao;
	    private String Antedecentes;
	    private String AtividadeFisica;
	    private String FuncaoInstestinal;
	    private Float ConsumoAgua;
	    private Float Colesterol;
	    private Float Glicemia;
	    private Float Ureia;
	    private Float Creatina;
	    private Float ProfCReactiva;
	    private Float Peso;
	    private Float IMC;
	    private Float BodyFat;
	    private Float GorduraVisceral;
	    private Float Musculo;
	    private Float IdadeMetabolica;
	    private Float H2Ocorpo;
	    private Float MetabolismoBasal;
	    private Float Osso;

	    public boolean caractersespeciais(String st){
	        String pattern = "[!@#$%^&*().?:{}|<>_]";
	        Pattern r = Pattern.compile(pattern);
	        Matcher m = r.matcher(st);

	        boolean resposta = false;

	        if (m.find( )) {
	            resposta = true;
	        }else {
	            resposta = false;
	        }
	        return resposta;
	    }

	    public boolean conternumeros(String st){
	        String pattern = "[1234567890]";
	        Pattern r = Pattern.compile(pattern);
	        Matcher m = r.matcher(st);

	        boolean resposta = false;

	        if (m.find( )) {
	            resposta = true;
	        }

	        return resposta;
	    }

}
