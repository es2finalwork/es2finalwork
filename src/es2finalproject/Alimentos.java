package es2finalproject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;;

public class Alimentos {


	public boolean caractersespeciais(String st) {
        String pattern = "[!@#$%^&*().?:{}|<>_]";
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



    public Integer getCodigo() throws ErrorException  {

        return codigo;
    }

    public void setCodigo(Integer codigo) throws ErrorException  {
    	
    	if (codigo <= 0){
            System.out.println("Error 002: Codigo n�o cont�m o m�nimo estabelecido de caracteres!");
            throw new ErrorException();
        }
        else if (codigo > 100){
            System.out.println("Error 003: Codigo cont�m mais que o m�ximo estabelecido de caracteres!");
            throw new ErrorException();
        }
        this.codigo = codigo;
    }

    public String getNome() throws ErrorException  {

        return nome;
    }

    public void setNome(String nome) throws ErrorException  {
        if(nome == ""){
            System.out.println("Error 001: Nome encontra-se vazio!");
            throw new ErrorException();
        }
        else if (nome.length() < 3){
            System.out.println("Error 002: Nome n�o cont�m o m�nimo estabelecido de caracteres!");
            throw new ErrorException();
        }
        else if (nome.length() > 100){
            System.out.println("Error 003: Nome cont�m mais que o m�ximo estabelecido de caracteres!");
            throw new ErrorException();
        }

        else if(conternumeros(nome)) {
            System.out.println("Error 004: Nome cont�m n�meros!");
            throw new ErrorException();
        }
        else if(caractersespeciais(nome)){
            System.out.println("Error 004: Nome cont�m caracteres especiais!");
            throw new ErrorException();
        }
        this.nome = nome;
    }

    public Integer getEnergiakcal() throws ErrorException  {

        return energiakcal;
    }

    public void setEnergiakcal(Integer energiakcal) throws ErrorException  {
    	
    	if(energiakcal < 0) {
            System.out.println("Erro 002: Calorias s�o negativas!");
            throw new ErrorException();
        }
        else if (energiakcal > 1000) {
            System.out.println("Erro 003: as Calorias s�o demasiado elevadas!");
            throw new ErrorException();
        }
        
        this.energiakcal = energiakcal;
    }

    public Integer getEnergiakj() throws ErrorException  {

        return energiakj;
    }

    public void setEnergiakj(Integer energiakj) throws ErrorException  {
    	
    	if(energiakj < 0) {
            System.out.println("Erro 002: as Calorias s�o negativas!");
            throw new ErrorException();
        }
        else if (energiakj > 1000) {
            System.out.println("Erro 003: as Calorias s�o demasiado elevadas!");
            throw new ErrorException();
        }
    	
        this.energiakj = energiakj;
    }

    public Float getAgua()  throws ErrorException {
    	
        return agua;
    }

    public void setAgua(Float agua) throws ErrorException  {
    	if(agua <= 0.00f) {
            System.out.println("Erro 002: Sem consumo de �gua!");
            throw new ErrorException();
        }
        else if (agua > 15.00f) {
            System.out.println("Erro 003: Consumo de �gua demasiado elevado!");
            throw new ErrorException();
        }

        this.agua = agua;
    }

    public Float getProteina() throws ErrorException  {

        return proteina;
    }

    public void setProteina(Float proteina) throws ErrorException  {
    	
    	if(proteina < 0.00f) {
            System.out.println("Erro 002: Quantidade de Proteina n�o podem ser zero!");
            throw new ErrorException();
        }
        else if (proteina > 1000.00f) {
            System.out.println("Erro 003: Quantidade de Proteina demasiado elevada!");
            throw new ErrorException();
        }

        this.proteina = proteina;
    }

    public Float getGorduraTotal() throws ErrorException  {
    	
        return gorduraTotal;
    }

    public void setGorduraTotal(Float gorduraTotal) throws ErrorException  {
    	
    	if(gorduraTotal < 0.00f){
            System.out.println("Error 002: Quantidade de Gordura encontra-se vazio!");
            throw new ErrorException();
        }
        else if (gorduraTotal > 1000.00f){
            System.out.println("Error 003: Quantidade de gordura demasiado elevada!");
            throw new ErrorException();
        }
        this.gorduraTotal = gorduraTotal;
    }

    public Float getHCdisponiveis() throws ErrorException  {
        return HCdisponiveis;
    }

    public void setHCdisponiveis(Float HCdisponiveis) throws ErrorException  {
    	
    	if(HCdisponiveis < 0.00f){
            System.out.println("Error 002: Hidratos n�o podem ser negativos!");
            throw new ErrorException();
        }
        else if (HCdisponiveis > 1000.00f){
            System.out.println("Error 003: Hidratos demasiado elevados!");
            throw new ErrorException();
        }
    	
        this.HCdisponiveis = HCdisponiveis;
    }

    public Float getHCmono() throws ErrorException  {

        return HCmono;
    }

    public void setHCmono(Float HCmono) throws ErrorException  {

    	if(HCmono < 0.00f){
            System.out.println("Error 002: Hidratos Mono n�o podem ser negativos!");
            throw new ErrorException();
        }
        else if (HCmono > 1000.00f){
            System.out.println("Error 003: Hidratos Mono demasiado elevados!");
            throw new ErrorException();
        }

        this.HCmono = HCmono;
    }

    public Float getMonoDi() throws ErrorException  {

        return monoDi;
    }

    public void setMonoDi(Float monoDi) throws ErrorException  {
    	
    	if(monoDi < 0.00f){
            System.out.println("Error 002: Hidratos Mono+dissac�ridos n�o podem ser negativos!");
            throw new ErrorException();
        }
        else if (monoDi > 1000.00f){
            System.out.println("Error 003: Hidratos Mono+dissac�ridos demasiado elevados!");
            throw new ErrorException();
        }

        this.monoDi = monoDi;
    }

    public Float getAcidosOrg() throws ErrorException  {
    	
        return acidosOrg;
    }

    public void setAcidosOrg(Float acidosOrg) throws ErrorException  {
    	
    	if(acidosOrg < 0.00f){
            System.out.println("Error 002: �cidos Org�nicos n�o podem ser negativos!");
            throw new ErrorException();
        }
        else if (acidosOrg > 1000.00f){
            System.out.println("Error 003: �cidos Org�nicos demasiado elevados!");
            throw new ErrorException();
        }
    	
        this.acidosOrg = acidosOrg;
    }

    public Float getAlcool() throws ErrorException  {

        return alcool;
    }

    public void setAlcool(Float alcool) throws ErrorException  {
    	
    	if(alcool < 0.00f){
            System.out.println("Error 002: N�veis de Alcool n�o podem ser negativos!");
            throw new ErrorException();
        }
        else if (alcool > 1000.00f){
            System.out.println("Error 003:  N�veis de Alcool demasiados elevados!");
            throw new ErrorException();
        }
    	
        this.alcool = alcool;
    }

    public Float getAmido() throws ErrorException  {
    	
        return amido;
    }

    public void setAmido(Float amido) throws ErrorException {
    	
    	if(amido < 0.00f){
            System.out.println("Error 002: Amido n�o pode ser negativo!");
            throw new ErrorException();
        }
        else if (amido > 1000.00f){
            System.out.println("Error 003:  Amido demasiado elevado!");
            throw new ErrorException();
        }

        this.amido = amido;
    }

    public Float getOligossacaridos()  throws ErrorException {

        return oligossacaridos;
    }

    public void setOligossacaridos(Float oligossacaridos) throws ErrorException  {
    	
    	if(oligossacaridos < 0.00f){
            System.out.println("Error 002: Oligossacar�deo n�o pode ser negativo!");
            throw new ErrorException();
        }
        else if (oligossacaridos > 1000.00f){
            System.out.println("Error 003:  Oligossacar�deo demasiado elevado!");
            throw new ErrorException();
        }
    	
        this.oligossacaridos = oligossacaridos;
    }

    public Float getFibra() throws ErrorException  {

        return fibra;
    }

    public void setFibra(Float fibra) throws ErrorException  {
    	
    	if(fibra < 0.00f){
            System.out.println("Error 002: Fibra n�o pode ser negativa!");
            throw new ErrorException();
        }
        else if (fibra > 1000.00f){
            System.out.println("Error 003:  Fibra demasiado elevada!");
            throw new ErrorException();
        }
        this.fibra = fibra;
    }

    public Float getAcidosGordosSaturados()  throws ErrorException {    	    	    	
        return acidosGordosSaturados;
    }

    public void setAcidosGordosSaturados(Float acidosGordosSaturados) throws ErrorException  {
    	
    	if(acidosGordosSaturados < 0.00f){
            System.out.println("Error 002: �cidos Gordos Saturados n�o pode ser negativos!");
            throw new ErrorException();
        }
        else if (acidosGordosSaturados > 1000.00f){
            System.out.println("Error 003: �cidos Gordos Saturados demasiado elevados!");
            throw new ErrorException();
        }
    	
    	
        this.acidosGordosSaturados = acidosGordosSaturados;
    }

    public Float getAcidosGordosMono() throws ErrorException  {

        return acidosGordosMono;
    }

    public void setAcidosGordosMono(Float acidosGordosMono) throws ErrorException {
    	
    	if(acidosGordosMono < 0.00f){
            System.out.println("Error 002: �cidos Gordos Mono n�o pode ser negativos!");
            throw new ErrorException();
        }
        else if (acidosGordosMono > 1000.00f){
            System.out.println("Error 003: �cidos Gordos Mono demasiado elevados!");
            throw new ErrorException();
        }

        this.acidosGordosMono = acidosGordosMono;
    }

    public Float getAcidosGordosPoli() throws ErrorException {
    	
        return acidosGordosPoli;
    }

    public void setAcidosGordosPoli(Float acidosGordosPoli) throws ErrorException  {
    	
    	if(acidosGordosPoli < 0.00f){
            System.out.println("Error 002: �cidos Gordos Poli n�o pode ser negativos!");
            throw new ErrorException();
        }
        else if (acidosGordosPoli > 1000.00f){
            System.out.println("Error 003: �cidos Gordos Poli demasiado elevados!");
            throw new ErrorException();
        }
    	
        this.acidosGordosPoli = acidosGordosPoli;
    }

    public Float getAcidosGordosTrans() throws ErrorException  {
        return acidosGordosTrans;
    }

    public void setAcidosGordosTrans(Float acidosGordosTrans) throws ErrorException  {
    	
    	if(acidosGordosTrans < 0.00f){
            System.out.println("Error 002: �cidos Gordos Trans n�o pode ser negativos!");
            throw new ErrorException();
        }
        else if (acidosGordosTrans > 1000.00f){
            System.out.println("Error 003: �cidos Gordos Trans demasiado elevados!");
            throw new ErrorException();
        }
    	
        this.acidosGordosTrans = acidosGordosTrans;
    }

    public Float getAcidoLinoleico() throws ErrorException  {

        return acidoLinoleico;
    }

    public void setAcidoLinoleico(Float acidoLinoleico) throws ErrorException  {
    	
    	if(acidoLinoleico < 0.00f){
            System.out.println("Error 002: �cidos Linoleicos n�o pode ser negativos!");
            throw new ErrorException();
        }
        else if (acidoLinoleico > 1000.00f){
            System.out.println("Error 003: �cidos Linoleicos demasiado elevados!");
            throw new ErrorException();
        }
    	
        this.acidoLinoleico = acidoLinoleico;
    }

    public Float getColesterol() throws ErrorException  {

        return colesterol;
    }

    public void setColesterol(Float colesterol) throws ErrorException  {
    	
    	if(colesterol <= 0.00f){
            System.out.println("Error 002: Colesterol  n�o pode ser negativo!");
            throw new ErrorException();
        }
        else if (colesterol > 1000.00f){
            System.out.println("Error 003: Colesterol demasiado elevado!");
            throw new ErrorException();
        }

        this.colesterol = colesterol;
    }

    public Float getVitA() throws ErrorException  {
    	
        return vitA;
    }

    public void setVitA(Float vitA) throws ErrorException  {
    	if(vitA < 0.00f){
            System.out.println("Error 002: Vitamina A n�o pode ser negativa!");
            throw new ErrorException();
        }
        else if (vitA > 1000.00f){
            System.out.println("Error 003: Vitamina A demasiado elevada!");
            throw new ErrorException();
        }
    	
    	
        this.vitA = vitA;
    }

    public Float getCaroteno() throws ErrorException  {
    	
        return caroteno;
    }

    public void setCaroteno(Float caroteno) throws ErrorException  {
    	
    	if(caroteno < 0.00f){
            System.out.println("Error 002: Caroteno n�o pode ser negativa!");
            throw new ErrorException();
        }
        else if (caroteno > 1000.00f){
            System.out.println("Error 003: Caroteno demasiado elevada!");
            throw new ErrorException();
        }
    	
        this.caroteno = caroteno;
    }

    public Float getVitD() throws ErrorException  {
        return vitD;
    }

    public void setVitD(Float vitD) throws ErrorException  {
    	
    	if(vitD < 0.00f){
            System.out.println("Error 002: Vitamina D n�o pode ser negativa!");
            throw new ErrorException();
        }
        else if (vitD > 1000.00f){
            System.out.println("Error 003: Vitamina D demasiado elevada!");
            throw new ErrorException();
        }
    	
    	
        this.vitD = vitD;
    }

    public Float getAtocoferol() throws ErrorException  {

        return atocoferol;
    }

    public void setAtocoferol(Float atocoferol) throws ErrorException {
    	
    	if(atocoferol < 0.00f){
            System.out.println("Error 002: Atocoferol n�o pode ser negativa!");
            throw new ErrorException();
        }
        else if (atocoferol > 1000.00f){
            System.out.println("Error 003: Atocoferol demasiado elevada!");
            throw new ErrorException();
        }
    	
    	
        this.atocoferol = atocoferol;
    }

    public Float getTiamina() throws ErrorException {

        return tiamina;
    }

    public void setTiamina(Float tiamina) throws ErrorException {
    	
    	if(tiamina < 0.00f){
            System.out.println("Error 002: Tiamina n�o pode ser negativa!");
            throw new ErrorException();
        }
        else if (tiamina > 1000.00f){
            System.out.println("Error 003: Tiamina demasiado elevada!");
            throw new ErrorException();
        }
    	
    	
        this.tiamina = tiamina;
    }

    public Float getRiboflavina() throws ErrorException {
        return riboflavina;
    }

    public void setRiboflavina(Float riboflavina) throws ErrorException {
    	
    	if(riboflavina < 0.00f){
            System.out.println("Error 002: Riboflavina n�o pode ser negativa!");
            throw new ErrorException();
        }
        else if (riboflavina > 1000.00f){
            System.out.println("Error 003: Riboflavina demasiado elevada!");
            throw new ErrorException();
        }

        this.riboflavina = riboflavina;
    }

    public Float getEqNiacina() throws ErrorException {
	
        return eqNiacina;
    }

    public void setEqNiacina(Float eqNiacina) throws ErrorException {
    	if(eqNiacina < 0.00f){
            System.out.println("Error 002: EqNiacina n�o pode ser negativa!");
            throw new ErrorException();
        }
        else if (eqNiacina > 1000.00f){
            System.out.println("Error 003: EqNiacina demasiado elevada!");
            throw new ErrorException();
        }
    	
    	
        this.eqNiacina = eqNiacina;
    }

    public Float getNiacina() throws ErrorException {

        return niacina;
    }

    public void setNiacina(Float niacina) throws ErrorException {

    	if(niacina < 0.00f){
            System.out.println("Error 002: Niacina n�o pode ser negativa!");
            throw new ErrorException();
        }
        else if (niacina > 1000.00f){
            System.out.println("Error 003: Niacina demasiado elevada!");
            throw new ErrorException();
        }

        this.niacina = niacina;
    }

    public Float getTriptofano() throws ErrorException {

        return triptofano;
    }

    public void setTriptofano(Float triptofano) throws ErrorException {
    	
    	if(triptofano < 0.00f){
            System.out.println("Error 002: Triptofano n�o pode ser negativa!");
            throw new ErrorException();
        }
        else if (triptofano > 1000.00f){
            System.out.println("Error 003: Triptofano demasiado elevada!");
            throw new ErrorException();
        }

        this.triptofano = triptofano;
    }

    public Float getVitB6() throws ErrorException {
 	
        return vitB6;
    }

    public void setVitB6(Float vitB6) throws ErrorException {
    	
    	if(vitB6 < 0.00f){
            System.out.println("Error 002: Vitamina B6 n�o pode ser negativa!");
            throw new ErrorException();
        }
        else if (vitB6 > 1000.00f){
            System.out.println("Error 003: Vitamina B6 demasiado elevada!");
            throw new ErrorException();
        }
        
        
        this.vitB6 = vitB6;
    }

    public Float getVitB12() throws ErrorException {
	
        return vitB12;
    }

    public void setVitB12(Float vitB12) throws ErrorException {
    	
    	if(vitB12 < 0.00f){
            System.out.println("Error 002: Vitamina B12 n�o pode ser negativa!");
            throw new ErrorException();
        }
        else if (vitB12 > 1000.00f){
            System.out.println("Error 003: Vitamina B12 demasiado elevada!");
            throw new ErrorException();
        }
        
        
        this.vitB12 = vitB12;
    }

    public Float getVitC() throws ErrorException {

        return vitC;
    }

    public void setVitC(Float vitC) throws ErrorException {
    	
    	if(vitC < 0.00f){
            System.out.println("Error 002: Vitamina C n�o pode ser negativa!");
            throw new ErrorException();
        }
        else if (vitC > 1000.00f){
            System.out.println("Error 003: Vitamina C demasiado elevada!");
            throw new ErrorException();
        }

        this.vitC = vitC;
    }

    public Float getFolatos() throws ErrorException {

        return folatos;
    }

    public void setFolatos(Float folatos) throws ErrorException {
    	
    	if(folatos < 0.00f){
            System.out.println("Error 002: Folatos n�o pode ser negativa!");
            throw new ErrorException();
        }
        else if (folatos > 1000.00f){
            System.out.println("Error 003: Folatos demasiado elevada!");
            throw new ErrorException();
        }

        this.folatos = folatos;
    }

    public Float getCinza() throws ErrorException {

        return cinza;
    }

    public void setCinza(Float cinza) throws ErrorException {
    	
    	if(cinza < 0.00f){
            System.out.println("Error 002: Cinza n�o pode ser negativa!");
            throw new ErrorException();
        }
        else if (cinza > 1000.00f){
            System.out.println("Error 003: Cinza demasiado elevada!");
            throw new ErrorException();
        }

        this.cinza = cinza;
    }

    public Float getNa() throws ErrorException {
      return na;
    }

    public void setNa(Float na) throws ErrorException {
    	
    	if(na < 0.00f){
            System.out.println("Error 002: S�dio n�o pode ser negativo!");
            throw new ErrorException();
        }
        else if (na > 1000.00f){
            System.out.println("Error 003: S�dio demasiado elevado!");
            throw new ErrorException();
        }

        this.na = na;
    }

    public Float getK() throws ErrorException {

        return k;
    }

    public void setK(Float k) throws ErrorException {
    	
    	if(k < 0.00f){
            System.out.println("Error 002: Pot�ssio n�o pode ser negativo!");
            throw new ErrorException();
        }
        else if (k > 1000.00f){
            System.out.println("Error 003: Pot�ssio demasiado elevado!");
            throw new ErrorException();
        }

        this.k = k;
    }

    public Float getCa() throws ErrorException {
    		
        return ca;
    }

    public void setCa(Float ca) throws ErrorException {
    	
    	if(ca < 0.00f){
            System.out.println("Error 002: C�lcio n�o pode ser negativo!");
            throw new ErrorException();
        }
        else if (ca > 1000.00f){
            System.out.println("Error 003: C�lcio demasiado elevado!");
            throw new ErrorException();
        }

        this.ca = ca;
    }

    public Float getP() throws ErrorException {

        return p;
    }

    public void setP(Float p) throws ErrorException {
    	
    	if(p < 0.00f){
            System.out.println("Error 002: F�sforo n�o pode ser negativo!");
            throw new ErrorException();
        }
        else if (p > 1000){
            System.out.println("Error 003: F�sforo demasiado elevado!");
            throw new ErrorException();
        }

        this.p = p;
    }

    public Float getMg() throws ErrorException {

        return mg;
    }

    public void setMg(Float mg) throws ErrorException {
    	
    	if(mg < 0.00f){
            System.out.println("Error 002: Magn�sio n�o pode ser negativo!");
            throw new ErrorException();
        }
        else if (mg > 1000.00f){
            System.out.println("Error 003: Magn�sio demasiado elevado!");
            throw new ErrorException();
        }

        this.mg = mg;
    }

    public Float getFe() throws ErrorException {
    	
        return fe;
    }

    public void setFe(Float fe) throws ErrorException {
    	
    	if(fe < 0.00f){
            System.out.println("Error 002: Ferro n�o pode ser negativo!");
            throw new ErrorException();
        }
        else if (fe > 1000.00f){
            System.out.println("Error 003: Ferro demasiado elevado!");
            throw new ErrorException();
        }

        this.fe = fe;
    }

    public Float getZn() throws ErrorException {

        return zn;
    }

    public void setZn(Float zn) throws ErrorException {

        if(zn < 0.00f){
            System.out.println("Error 002: Zinco n�o pode ser negativo!");
            throw new ErrorException();
        }
        else if (zn > 1000.00f){
            System.out.println("Error 003: Zinco demasiado elevado!");
            throw new ErrorException();
        }

        this.zn = zn;
    }

    private String nome;
    private Integer codigo;
    private Integer energiakcal;
    private Integer energiakj;
    private Float agua;
    private Float proteina;
    private Float gorduraTotal;
    private Float HCdisponiveis;
    private Float HCmono;
    private Float monoDi;
    private Float acidosOrg;
    private Float alcool;
    private Float amido;
    private Float oligossacaridos;
    private Float fibra;
    private Float acidosGordosSaturados;
    private Float acidosGordosMono;
    private Float acidosGordosPoli;
    private Float acidosGordosTrans;
    private Float acidoLinoleico;
    private Float colesterol;
    private Float vitA;
    private Float caroteno;
    private Float vitD;
    private Float atocoferol;
    private Float tiamina;
    private Float riboflavina;
    private Float eqNiacina;
    private Float niacina;
    private Float triptofano;
    private Float vitB6;
    private Float vitB12;
    private Float vitC;
    private Float folatos;
    private Float cinza;
    private Float na;
    private Float k;
    private Float ca;
    private Float p;
    private Float mg;
    private Float fe;
    private Float zn;

}
