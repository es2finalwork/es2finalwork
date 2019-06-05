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
                    DP.setIdade((dados[1]));
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

        File file = new File("C:/Users/Tiago Moreira/Desktop/Tiago/ESTGV 2018-19/2º Semestre/Engenharia de Software 2/es2finalwork-master/csvEscreve.csv");
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
}