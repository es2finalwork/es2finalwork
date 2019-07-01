import com.es2.trabalhofinal.Alimentos;
import com.es2.trabalhofinal.DadosPessoais;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import com.opencsv.CSVWriter;
import java.io.FileWriter;


public class CSVClass {

        public void readCSV() throws FileNotFoundException {

            String csvFile = "C:/Users/cfili/Desktop/ES2Work/csvExperimental.csv";
            BufferedReader br = null;
            String line = "";
            String cvsSplitBy = ",";

            try {
                DadosPessoais DP = new DadosPessoais();
                String[] dados;

                br = new BufferedReader(new FileReader(csvFile));
                while ((line = br.readLine()) != null) {

                    // use comma as separator
                    dados = line.split(cvsSplitBy);

                    System.out.println("Dados Pessoais [Nome= " + dados[0] + " , Idade=" + dados[1] +
                            " , Altura=" + dados[2] + " , Profissão=" + dados[3] + " , Motivo da Consulta=" + dados[4] +
                            " , Objectivos=" + dados[5] + " , Patologias=" + dados[6] +
                            " , Medicação=" + dados[7] + " , Antecedentes Familiares=" + dados[8] +
                            " , Atividade Física=" + dados[9] + " , Função Intestinal=" + dados[10] +
                            " , Consumo de Água=" + dados[11] + " , Colestrol=" + dados[12] + " , Glicémia=" + dados[13] +
                            " , Ureia=" + dados[14] + " , Crealivinha=" + dados[15] + " , Prof. C Creativa=" + dados[16] + "]");

                    DP.setNome(dados[0]);
                    DP.setIdade(dados[1]);
                    DP.setAltura(Float.parseFloat(dados[2]));
                    DP.setProfissao(dados[3]);
                    DP.setMotivoConsulta(dados[4]);
                    DP.setObjectivos(dados[5]);
                    DP.setPatologias(dados[6]);
                    DP.setMedicacao(dados[7]);
                    DP.setAntedecentes(dados[8]);
                    DP.setAtividadeFisica(dados[9]);
                    DP.setFuncaoInstestinal(dados[10]);
                    DP.setConsumoAgua(dados[11]);
                    DP.setColesterol(dados[12]);
                    DP.setGlicémia(dados[13]);
                    DP.setVreia(dados[14]);
                    DP.setEreativiha(dados[15]);
                    DP.setProfCReactiva(dados[16]);
                }



            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (br != null) {
                    try {
                        br.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }


        }

    public void writeCSV() {

        // first create file object for file placed at location
        // specified by filepath

        System.out.println("Estou no Write File CSV");

        File file = new File("C:/Users/cfili/Desktop/ES2Work/csvEscreve.csv");
        try {
            // create FileWriter object with file as parameter
            FileWriter outputfile = new FileWriter(file);

            // create CSVWriter object filewriter object as parameter
            CSVWriter writer = new CSVWriter(outputfile);

            // adding header to csv
            String[] header = { "Name", "Class", "Marks" };
            writer.writeNext(header);

            // add data to csv
            String[] data1 = { "Aman", "10", "620" };
            writer.writeNext(data1);
            String[] data2 = { "Suraj", "10", "630" };
            writer.writeNext(data2);

            // closing writer connection
            writer.close();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void readCSValimentos_frango() throws FileNotFoundException{
        String csvFile = "C:/Users/cfili/Desktop/ES2Work/csvAlimentos_frango.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            Alimentos al = new Alimentos();
            String[] dados;

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {


                // use comma as separator
                dados = line.split(cvsSplitBy);


/*
                System.out.println("Alimentos [Código= " + dados[0] + " , Produto=" + dados[1] +
                        " , Energia Kcal=" + dados[2] + " , Energia KJ=" + dados[3] + " , Água=" + dados[4] +
                        " , Proteína=" + dados[5] + " , Gordura Total=" + dados[6] +
                        " , Total HC disponíveis=" + dados[7] + " , Total HC expresso em monossacáridos=" + dados[8] +
                        " , Mono + dissacáridos=" + dados[9] + " , Ácidos orgânicos=" + dados[10] +
                        " , Álcool=" + dados[11] + " , Amido=" + dados[12] + " , Oligossacáridos=" + dados[13] +
                        " , Fibra alimentar=" + dados[14] + " , Ácidos gordos saturados=" + dados[15] + " , Ácidos gordos monoinsaturados=" + dados[16] +
                        " , Ácidos gordos polinsaturados=" + dados[17] + " , Ácidos gordos trans=" + dados[18] + " , Ácido linoleico=" + dados[19] +
                        " , Colesterol=" + dados[20] +  " , Vit A total=" + dados[21] + " , Caroteno=" + dados[22] + " , vit. D=" + dados[23] +
                        " , a-tocoferol=" + dados[24] + " , Tiamina=" + dados[25] + " , Riboflavina=" + dados[26] + " , Equivalentes de niacina=" + dados[27] +
                        " , Niacina=" + dados[28] + " , Triptofano/60=" + dados[29] + " , Vit. B12=" + dados[30] + " , vit. C=" + dados[31] +
                        " , vit B6=" + dados[32] + " , Folatos=" + dados[33] + " , Cinza=" + dados[34] + " , Na=" + dados[35] +
                        " , K=" + dados[36] + " , Ca=" + dados[37] + " , P=" + dados[38] + " , Mg=" + dados[39] + " , Fe=" + dados[40] + " , Zn=" + dados[41] +"]");
*/

                al.setCodigo(dados[0]);
                al.setNome(dados[1]);
                al.setEnergiakcal(Integer.parseInt(dados[2]));
                al.setEnergiakj(Integer.parseInt(dados[3]));
                al.setAgua(Float.parseFloat(dados[4]));
                al.setProteina(Float.parseFloat(dados[5]));
                al.setGorduraTotal(Float.parseFloat(dados[6]));
                al.setHCdisponiveis(Float.parseFloat(dados[7]));
                al.setHCmono(Float.parseFloat(dados[8]));
                al.setMonoDi(Float.parseFloat(dados[9]));
                al.setAcidosOrg(Float.parseFloat(dados[10]));
                al.setAlcool(Float.parseFloat(dados[11]));
                al.setAmido(Float.parseFloat(dados[12]));
                al.setOligossacaridos(Float.parseFloat(dados[13]));
                al.setFibra(Float.parseFloat(dados[14]));
                al.setAcidosGordosSaturados(Float.parseFloat(dados[15]));
                al.setAcidosGordosMono(Float.parseFloat(dados[16]));
                al.setAcidosGordosPoli(Float.parseFloat(dados[17]));
                al.setAcidosGordosTrans(Float.parseFloat(dados[18]));
                al.setAcidoLinoleico(Float.parseFloat(dados[19]));
                al.setColesterol(Float.parseFloat(dados[20]));
                al.setVitA(Float.parseFloat(dados[21]));
                al.setCaroteno(Float.parseFloat(dados[22]));
                al.setVitD(Float.parseFloat(dados[23]));
                al.setAtocoferol(Float.parseFloat(dados[24]));
                al.setTiamina(Float.parseFloat(dados[25]));
                al.setRiboflavina(Float.parseFloat(dados[26]));
                al.setEqNiacina(Float.parseFloat(dados[27]));
                al.setNiacina(Float.parseFloat(dados[28]));
                al.setTriptofano(Float.parseFloat(dados[29]));
                al.setVitB6(Float.parseFloat(dados[30]));
                al.setVitB12(Float.parseFloat(dados[31]));
                al.setVitC(Float.parseFloat(dados[32]));
                al.setFolatos(Float.parseFloat(dados[33]));
                al.setCinza(Float.parseFloat(dados[34]));
                al.setNa(Float.parseFloat(dados[35]));
                al.setK(Float.parseFloat(dados[36]));
                al.setCa(Float.parseFloat(dados[37]));
                al.setP(Float.parseFloat(dados[38]));
                al.setMg(Float.parseFloat(dados[39]));
                al.setFe(Float.parseFloat(dados[40]));
                al.setZn(Float.parseFloat(dados[41]));


                System.out.println(dados[0] + " " + dados[1]);
                //System.out.println(line);

            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public void readCSValimentos_massa() throws FileNotFoundException{
        String csvFile = "C:/Users/cfili/Desktop/ES2Work/csvAlimentos_massa.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            Alimentos al = new Alimentos();
            String[] dados;

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {


                // use comma as separator
                dados = line.split(cvsSplitBy);

                al.setCodigo(dados[0]);
                al.setNome(dados[1]);
                al.setEnergiakcal(Integer.parseInt(dados[2]));
                al.setEnergiakj(Integer.parseInt(dados[3]));
                al.setAgua(Float.parseFloat(dados[4]));
                al.setProteina(Float.parseFloat(dados[5]));
                al.setGorduraTotal(Float.parseFloat(dados[6]));
                al.setHCdisponiveis(Float.parseFloat(dados[7]));
                al.setHCmono(Float.parseFloat(dados[8]));
                al.setMonoDi(Float.parseFloat(dados[9]));
                al.setAcidosOrg(Float.parseFloat(dados[10]));
                al.setAlcool(Float.parseFloat(dados[11]));
                al.setAmido(Float.parseFloat(dados[12]));
                al.setOligossacaridos(Float.parseFloat(dados[13]));
                al.setFibra(Float.parseFloat(dados[14]));
                al.setAcidosGordosSaturados(Float.parseFloat(dados[15]));
                al.setAcidosGordosMono(Float.parseFloat(dados[16]));
                al.setAcidosGordosPoli(Float.parseFloat(dados[17]));
                al.setAcidosGordosTrans(Float.parseFloat(dados[18]));
                al.setAcidoLinoleico(Float.parseFloat(dados[19]));
                al.setColesterol(Float.parseFloat(dados[20]));
                al.setVitA(Float.parseFloat(dados[21]));
                al.setCaroteno(Float.parseFloat(dados[22]));
                al.setVitD(Float.parseFloat(dados[23]));
                al.setAtocoferol(Float.parseFloat(dados[24]));
                al.setTiamina(Float.parseFloat(dados[25]));
                al.setRiboflavina(Float.parseFloat(dados[26]));
                al.setEqNiacina(Float.parseFloat(dados[27]));
                al.setNiacina(Float.parseFloat(dados[28]));
                al.setTriptofano(Float.parseFloat(dados[29]));
                al.setVitB6(Float.parseFloat(dados[30]));
                al.setVitB12(Float.parseFloat(dados[31]));
                al.setVitC(Float.parseFloat(dados[32]));
                al.setFolatos(Float.parseFloat(dados[33]));
                al.setCinza(Float.parseFloat(dados[34]));
                al.setNa(Float.parseFloat(dados[35]));
                al.setK(Float.parseFloat(dados[36]));
                al.setCa(Float.parseFloat(dados[37]));
                al.setP(Float.parseFloat(dados[38]));
                al.setMg(Float.parseFloat(dados[39]));
                al.setFe(Float.parseFloat(dados[40]));
                al.setZn(Float.parseFloat(dados[41]));


                System.out.println(dados[0] + " " + dados[1]);
                //System.out.println(line);

            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void readCSValimentos_amendoim() throws FileNotFoundException{
        String csvFile = "C:/Users/cfili/Desktop/ES2Work/csvAlimentos_amendoim.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            Alimentos al = new Alimentos();
            String[] dados;

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {


                // use comma as separator
                dados = line.split(cvsSplitBy);

                al.setCodigo(dados[0]);
                al.setNome(dados[1]);
                al.setEnergiakcal(Integer.parseInt(dados[2]));
                al.setEnergiakj(Integer.parseInt(dados[3]));
                al.setAgua(Float.parseFloat(dados[4]));
                al.setProteina(Float.parseFloat(dados[5]));
                al.setGorduraTotal(Float.parseFloat(dados[6]));
                al.setHCdisponiveis(Float.parseFloat(dados[7]));
                al.setHCmono(Float.parseFloat(dados[8]));
                al.setMonoDi(Float.parseFloat(dados[9]));
                al.setAcidosOrg(Float.parseFloat(dados[10]));
                al.setAlcool(Float.parseFloat(dados[11]));
                al.setAmido(Float.parseFloat(dados[12]));
                al.setOligossacaridos(Float.parseFloat(dados[13]));
                al.setFibra(Float.parseFloat(dados[14]));
                al.setAcidosGordosSaturados(Float.parseFloat(dados[15]));
                al.setAcidosGordosMono(Float.parseFloat(dados[16]));
                al.setAcidosGordosPoli(Float.parseFloat(dados[17]));
                al.setAcidosGordosTrans(Float.parseFloat(dados[18]));
                al.setAcidoLinoleico(Float.parseFloat(dados[19]));
                al.setColesterol(Float.parseFloat(dados[20]));
                al.setVitA(Float.parseFloat(dados[21]));
                al.setCaroteno(Float.parseFloat(dados[22]));
                al.setVitD(Float.parseFloat(dados[23]));
                al.setAtocoferol(Float.parseFloat(dados[24]));
                al.setTiamina(Float.parseFloat(dados[25]));
                al.setRiboflavina(Float.parseFloat(dados[26]));
                al.setEqNiacina(Float.parseFloat(dados[27]));
                al.setNiacina(Float.parseFloat(dados[28]));
                al.setTriptofano(Float.parseFloat(dados[29]));
                al.setVitB6(Float.parseFloat(dados[30]));
                al.setVitB12(Float.parseFloat(dados[31]));
                al.setVitC(Float.parseFloat(dados[32]));
                al.setFolatos(Float.parseFloat(dados[33]));
                al.setCinza(Float.parseFloat(dados[34]));
                al.setNa(Float.parseFloat(dados[35]));
                al.setK(Float.parseFloat(dados[36]));
                al.setCa(Float.parseFloat(dados[37]));
                al.setP(Float.parseFloat(dados[38]));
                al.setMg(Float.parseFloat(dados[39]));
                al.setFe(Float.parseFloat(dados[40]));
                al.setZn(Float.parseFloat(dados[41]));


                System.out.println(dados[0] + " " + dados[1]);
                //System.out.println(line);

            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void readCSValimentos_maca() throws FileNotFoundException{
        String csvFile = "C:/Users/cfili/Desktop/ES2Work/csvAlimentos_maça.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            Alimentos al = new Alimentos();
            String[] dados;

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {


                // use comma as separator
                dados = line.split(cvsSplitBy);

                al.setCodigo(dados[0]);
                al.setNome(dados[1]);
                al.setEnergiakcal(Integer.parseInt(dados[2]));
                al.setEnergiakj(Integer.parseInt(dados[3]));
                al.setAgua(Float.parseFloat(dados[4]));
                al.setProteina(Float.parseFloat(dados[5]));
                al.setGorduraTotal(Float.parseFloat(dados[6]));
                al.setHCdisponiveis(Float.parseFloat(dados[7]));
                al.setHCmono(Float.parseFloat(dados[8]));
                al.setMonoDi(Float.parseFloat(dados[9]));
                al.setAcidosOrg(Float.parseFloat(dados[10]));
                al.setAlcool(Float.parseFloat(dados[11]));
                al.setAmido(Float.parseFloat(dados[12]));
                al.setOligossacaridos(Float.parseFloat(dados[13]));
                al.setFibra(Float.parseFloat(dados[14]));
                al.setAcidosGordosSaturados(Float.parseFloat(dados[15]));
                al.setAcidosGordosMono(Float.parseFloat(dados[16]));
                al.setAcidosGordosPoli(Float.parseFloat(dados[17]));
                al.setAcidosGordosTrans(Float.parseFloat(dados[18]));
                al.setAcidoLinoleico(Float.parseFloat(dados[19]));
                al.setColesterol(Float.parseFloat(dados[20]));
                al.setVitA(Float.parseFloat(dados[21]));
                al.setCaroteno(Float.parseFloat(dados[22]));
                al.setVitD(Float.parseFloat(dados[23]));
                al.setAtocoferol(Float.parseFloat(dados[24]));
                al.setTiamina(Float.parseFloat(dados[25]));
                al.setRiboflavina(Float.parseFloat(dados[26]));
                al.setEqNiacina(Float.parseFloat(dados[27]));
                al.setNiacina(Float.parseFloat(dados[28]));
                al.setTriptofano(Float.parseFloat(dados[29]));
                al.setVitB6(Float.parseFloat(dados[30]));
                al.setVitB12(Float.parseFloat(dados[31]));
                al.setVitC(Float.parseFloat(dados[32]));
                al.setFolatos(Float.parseFloat(dados[33]));
                al.setCinza(Float.parseFloat(dados[34]));
                al.setNa(Float.parseFloat(dados[35]));
                al.setK(Float.parseFloat(dados[36]));
                al.setCa(Float.parseFloat(dados[37]));
                al.setP(Float.parseFloat(dados[38]));
                al.setMg(Float.parseFloat(dados[39]));
                al.setFe(Float.parseFloat(dados[40]));
                al.setZn(Float.parseFloat(dados[41]));


                System.out.println(dados[0] + " " + dados[1]);
                //System.out.println(line);

            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void readCSValimentos_aveia() throws FileNotFoundException{
        String csvFile = "C:/Users/cfili/Desktop/ES2Work/csvAlimentos_aveia.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            Alimentos al = new Alimentos();
            String[] dados;

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {


                // use comma as separator
                dados = line.split(cvsSplitBy);


                al.setCodigo(dados[0]);
                al.setNome(dados[1]);
                al.setEnergiakcal(Integer.parseInt(dados[2]));
                al.setEnergiakj(Integer.parseInt(dados[3]));
                al.setAgua(Float.parseFloat(dados[4]));
                al.setProteina(Float.parseFloat(dados[5]));
                al.setGorduraTotal(Float.parseFloat(dados[6]));
                al.setHCdisponiveis(Float.parseFloat(dados[7]));
                al.setHCmono(Float.parseFloat(dados[8]));
                al.setMonoDi(Float.parseFloat(dados[9]));
                al.setAcidosOrg(Float.parseFloat(dados[10]));
                al.setAlcool(Float.parseFloat(dados[11]));
                al.setAmido(Float.parseFloat(dados[12]));
                al.setOligossacaridos(Float.parseFloat(dados[13]));
                al.setFibra(Float.parseFloat(dados[14]));
                al.setAcidosGordosSaturados(Float.parseFloat(dados[15]));
                al.setAcidosGordosMono(Float.parseFloat(dados[16]));
                al.setAcidosGordosPoli(Float.parseFloat(dados[17]));
                al.setAcidosGordosTrans(Float.parseFloat(dados[18]));
                al.setAcidoLinoleico(Float.parseFloat(dados[19]));
                al.setColesterol(Float.parseFloat(dados[20]));
                al.setVitA(Float.parseFloat(dados[21]));
                al.setCaroteno(Float.parseFloat(dados[22]));
                al.setVitD(Float.parseFloat(dados[23]));
                al.setAtocoferol(Float.parseFloat(dados[24]));
                al.setTiamina(Float.parseFloat(dados[25]));
                al.setRiboflavina(Float.parseFloat(dados[26]));
                al.setEqNiacina(Float.parseFloat(dados[27]));
                al.setNiacina(Float.parseFloat(dados[28]));
                al.setTriptofano(Float.parseFloat(dados[29]));
                al.setVitB6(Float.parseFloat(dados[30]));
                al.setVitB12(Float.parseFloat(dados[31]));
                al.setVitC(Float.parseFloat(dados[32]));
                al.setFolatos(Float.parseFloat(dados[33]));
                al.setCinza(Float.parseFloat(dados[34]));
                al.setNa(Float.parseFloat(dados[35]));
                al.setK(Float.parseFloat(dados[36]));
                al.setCa(Float.parseFloat(dados[37]));
                al.setP(Float.parseFloat(dados[38]));
                al.setMg(Float.parseFloat(dados[39]));
                al.setFe(Float.parseFloat(dados[40]));
                al.setZn(Float.parseFloat(dados[41]));


                System.out.println(dados[0] + " " + dados[1]);
                //System.out.println(line);

            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    }

