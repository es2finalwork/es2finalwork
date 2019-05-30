package com.es2.trabalhofinal;

// package testReadExcel;

public class Alimentos {
    private String codigo;
    private String nome;
    private int energiakcal;
    private int energiakj;
    private float agua;
    private float proteina;
    private float gorduraTotal;
    private float HCdisponiveis;
    private float HCmono;
    private float monoDi;
    private float acidosOrg;
    private float alcool;
    private float amido;
    private float oligossacaridos;
    private float fibra;
    private float acidosGordosSaturados;
    private float acidosGordosMono;
    private float acidosGordosPoli;
    private float acidosGordosTrans;
    private float acidoLinoleico;
    private int colesterol;
    private int vitA;
    private int caroteno;
    private float vitD;
    private float Atocoferol;
    private float tiamina;
    private float riboflavina;
    private float eqNiacina;
    private float niacina;
    private float triptofano;
    private float vitB6;
    private float vitB12;
    private float vitC;
    private float folatos;
    private float cinza;
    private int na;
    private int k;
    private int ca;
    private int p;
    private int mg;
    private float fe;
    private float zn;

    public Alimentos(String codigo, String nome, int energiakcal, int energiakj, float agua, float proteina,
                     float gordura, float hcdisp, float hcmono, float monodi, float acidosOrg, float alcool, float amido,
                     float oligo, float fibra, float acidosGordosSaturados, float acidosGordosMono, float acidosGordosPoli, float acidosGordosTrans,
                     float acidoLinoleico, int colesterol, int vitA, int caroteno, float vitD, float tocoferol, float tiamina,
                     float ribo, float eqNiacina, float niacina, float triptofano, float vitB6, float vitB12, float vitC,
                     float folatos, float cinza, int na, int k, int ca, int p, int mg, float fe, float zn) {
        this.codigo = codigo;
        this.nome = nome;
        this.energiakcal = energiakcal;
        this.energiakj = energiakj;
        this.agua = agua;
        this.proteina = proteina;
        this.gorduraTotal = gordura;
        this.HCdisponiveis = hcdisp;
        this.HCmono = hcmono;
        this.monoDi = monodi;
        this.acidosOrg = acidosOrg;
        this.alcool = alcool;
        this.amido = amido;
        this.oligossacaridos = oligo;
        this.fibra = fibra;
        this.acidosGordosSaturados = acidosGordosSaturados;
        this.acidosGordosMono = acidosGordosMono;
        this.acidosGordosPoli = acidosGordosPoli;
        this.acidosGordosTrans = acidosGordosTrans;
        this.acidoLinoleico = acidoLinoleico;
        this.colesterol = colesterol;
        this.vitA = vitA;
        this.caroteno = caroteno;
        this.vitD = vitD;
        this.Atocoferol = tocoferol;
        this.tiamina = tiamina;
        this.riboflavina = ribo;
        this.eqNiacina = eqNiacina;
        this.niacina = niacina;
        this.triptofano = triptofano;
        this.vitB6 = vitB6;
        this.vitB12 = vitB12;
        this.vitC = vitC;
        this.folatos = folatos;
        this.cinza = cinza;
        this.na = na;
        this.k = k;
        this.ca = ca;
        this.p = p;
        this.mg = mg;
        this.fe = fe;
        this.zn = zn;
    }

    public String getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public int getEnergiakcal() {
        return energiakcal;
    }
    public int getEnergiakj() {
        return energiakj;
    }
    public float getAgua() {
        return agua;
    }
    public float getProteina() {
        return proteina;
    }
    public float getGordura() {
        return gorduraTotal;
    }
    public float getHcdisp() {
        return HCdisponiveis;
    }
    public float getHcmono() {
        return HCmono;
    }
    public float getMonodi() {
        return monoDi;
    }
    public float getAcidosOrg() {
        return acidosOrg;
    }
    public float getAlcool() {
        return alcool;
    }
    public float getAmido() {
        return amido;
    }
    public float getOligo() {
        return oligossacaridos;
    }
    public float getFibra() {
        return fibra;
    }
    public float getAcidosGordosSaturados(){
        return acidosGordosSaturados;
    }
    public float getAcidosGordosMono() {
        return acidosGordosMono;
    }
    public float getAcidosGordosPoli() {
        return acidosGordosPoli;
    }
    public float getAcidosGordosTrans() {
        return acidosGordosTrans;
    }
    public float getAcidoLinoleico() {
        return acidoLinoleico;
    }
    public int getColesterol() {
        return colesterol;
    }
    public int getVitA() {
        return vitA;
    }
    public int getCaroteno() {
        return caroteno;
    }
    public float getVitD() {
        return vitD;
    }
    public float getTocoferol() {
        return Atocoferol;
    }
    public float getTiamina() {
        return tiamina;
    }
    public float getRibo() {
        return riboflavina;
    }
    public float getEqNiacina() {
        return eqNiacina;
    }
    public float getNiacina() {
        return niacina;
    }
    public float getTriptofano() {
        return triptofano;
    }
    public float getVitB6() {
        return vitB6;
    }
    public float getVitB12() {
        return vitB12;
    }
    public float getVitC() {
        return vitC;
    }
    public float getFolatos() {
        return folatos;
    }
    public float getCinza() {
        return cinza;
    }
    public int getNa() {
        return na;
    }
    public int getK() {
        return k;
    }
    public int getCa() {
        return ca;
    }
    public int getP() {
        return p;
    }
    public int getMg() {
        return mg;
    }
    public float getFe() {
        return fe;
    }
    public float getZn() {
        return zn;
    }
}

