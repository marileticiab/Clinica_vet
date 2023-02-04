package clinica_vet;
/*//FALTA:CONECTAR COM O BANCO DE DADOS | CRIAR CONSULTA | CONTROLLER | CONECTAR COM A INTERFACE
import fakeBancoDados.FakeBancoDados;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cliente;
import modelo.Consulta;
import modelo.Funcionario;
import modelo.Medicamento;
import modelo.Pet;
import modelo.Procedimento;
import modelo.Tratamento;
import modelo.Vacina;
import modelo.Veterinario;*/

public class Clinica_Vet {
      
    /*public static Vector<Pet> cadastroPet(String cpfCliente, int verificaCasdatroSituacao){
        Scanner ent = new Scanner(System.in);
        Random x = new Random();
        int c = 2;
        Cliente dono;
        Vector <Pet> petCliente = new Vector<>();
        
        do{
            System.out.println("CADASTRO DE PET'S");
            System.out.println("Nome: ");
            String nomeP = ent.nextLine();

            System.out.println("Raça: ");
            String racaP = ent.nextLine();

            System.out.println("Gênero: ");
            String generoP = ent.nextLine();

            System.out.println("Cor: ");
            String corP = ent.nextLine();

            System.out.println("Ano de Nascimento: ");
            int ano = ent.nextInt();
           
            //indice,bound******************************
            int codP = x.nextInt(99999);
            System.out.println("Seu código é: " + codP);

            Pet newPet = new Pet(nomeP, racaP, ano, generoP, corP, codP);
            FakeBancoDados.insertPet(newPet);

            if(verificaCasdatroSituacao == 1){
                petCliente.add(newPet);
            }else{
                System.out.println("Informe o CPF do tutor: ");
                String cpfDono = ent.nextLine();
                
                if(FakeBancoDados.retornaCliente(cpfDono) == null){
                    System.out.println("Esse Cliente não existe.");
                }else{
                   FakeBancoDados.addPet(newPet, cpfDono);
                   System.out.println("CADASTRO REALIZADO COM SUCESSO!");
                   return petCliente;
                }
            }

            System.out.println("Deseja cadastrar um novo Pet? Digite 2");
            c = ent.nextInt();
            
        }while(c == 2);
        
        System.out.println("FINALIZADO!");
        return null;
    }
    
    public static void cadastroCliente(){
        Scanner ent = new Scanner(System.in);
        
        System.out.println("CADASTRO DE CLIENTES");
        System.out.println("Nome: ");
        String nomeC = ent.nextLine();
        
        System.out.println("CPF: ");
        String cpfC = ent.nextLine();
        
        System.out.println("Telefone: ");
        int telC = ent.nextInt();
        
        System.out.println("Endereço: ");
        System.out.println("Rua: ");
        String ruaC = ent.nextLine();
        System.out.println("Nº: ");
        int numC = ent.nextInt();
        System.out.println("Bairro: ");
        String bairroC = ent.nextLine();
        System.out.println("Cidade: ");
        String cidadeC = ent.nextLine();
        
        //para concluir o cadastro de um cliente, deve-se cadastrar pelo menos 1 pet
        //verificaCasdatroSituacao = 1;
        int verificaCasdatroSituacao = 1;

        Vector<Pet> pet = cadastroPet(cpfC, verificaCasdatroSituacao);
        
        //add no banco de dados
        Cliente newCliente = new Cliente(nomeC, cpfC, telC, ruaC, numC, bairroC, cidadeC, pet);
        FakeBancoDados.insertCliente(newCliente);
       
        
        
        System.out.println("CADASTRO REALIZADO COM SUCESSO!");
    }
    
    //veterinário também
    public static void cadastroFuncionario(){
        Scanner ent = new Scanner(System.in);
        
        System.out.println("CADASTRO DE FUNCIONARIOS");
        System.out.println("Nome: ");
        String nomeF = ent.nextLine();
        
        System.out.println("Telefone: ");
        int telefoneF = ent.nextInt();
        
        System.out.println("Veterinário? Digite 1. \nFuncionário? Digite 2.");
        int v = ent.nextInt();
        
        if(v == 1){
            System.out.println("VETERINÁRIO: ");
            System.out.println("CRMV: ");
            int crmvV = ent.nextInt();
            
            System.out.println("Formação: ");
            String formacaoV = ent.nextLine();
            
            Veterinario newVeterinario = new Veterinario(crmvV, formacaoV, nomeF, telefoneF);
            FakeBancoDados.insertVeterinario(newVeterinario);
            System.out.println("CADASTRO REALIZADO COM SUCESSO!");
            
        }else if(v == 2){
            System.out.println("CPF: ");
            String cpfF = ent.nextLine();
             
            System.out.println("Função: ");
            String funcaoF = ent.nextLine();
            
            Funcionario newFuncionario = new Funcionario(nomeF, cpfF, funcaoF, telefoneF);
            FakeBancoDados.insertFuncioanrio(newFuncionario);
            System.out.println("CADASTRO REALIZADO COM SUCESSO!");
        }
       
    }
    
    public static void cadastroMedicamento(){
        Scanner ent = new Scanner(System.in);
        Random z = new Random();
        
        System.out.println("Cadastro de Medicamentos: ");
        System.out.println("Nome: ");
        String nomeM = ent.nextLine();
        
        System.out.println("Quantidade: ");
        int quantM = ent.nextInt();
        
        System.out.println("Origem: ");
        String origemM = ent.nextLine();
        
        //skip
        
        System.out.println("Fabricação: ");
        String fabricacaoM = ent.nextLine();
        
        System.out.println("Validade: ");
        String validadeM = ent.nextLine();
        
        System.out.println("Uso: ");
        String usoM = ent.nextLine();
        
        System.out.println("Efeito: ");
        String efeitoM = ent.nextLine();
        
        System.out.println("Valor: ");
        double valorM = ent.nextDouble();
        //indice,bound******************************
        int codigoM = z.nextInt(99999);
        System.out.println("Código: " + codigoM);
        
        Medicamento newMedicamento = new Medicamento(nomeM, validadeM, fabricacaoM, origemM, codigoM, valorM, usoM, efeitoM, quantM);
        FakeBancoDados.insertMedicamento(newMedicamento);
        System.out.println("CADASTRO REALIZADO COM SUCESSO!");
    }
    
    public static void cadastroTratamento(){
        Scanner ent = new Scanner(System.in);
        Random z = new Random();
        
        System.out.println("Cadastro de Tratamentos: ");
        System.out.println("Nome: ");
        String nomeT = ent.nextLine();
        
        System.out.println("Tipo: ");
        String tipoT = ent.nextLine();
        
        System.out.println("Descrição: ");
        String descricaoT = ent.nextLine();
        
        //indice,bound******************************
        int codigoT = z.nextInt(999);
        System.out.println("Código: " + codigoT);
        
        Tratamento newTratamento = new Tratamento(nomeT, descricaoT, tipoT, codigoT);
        FakeBancoDados.insertTratamento(newTratamento);
        System.out.println("CADASTRO REALIZADO COM SUCESSO!");
    }
    
    public static void cadastroVacina(){
        Scanner ent = new Scanner(System.in);
        Random z = new Random();
        
        System.out.println("Cadastro de Vacinas: ");
        System.out.println("Nome: ");
        String nomeV = ent.nextLine();
        
        System.out.println("Origem: ");
        String origemV = ent.nextLine();
        
        System.out.println("Fabricação: ");
        String fabricacaoV = ent.nextLine();
        
        System.out.println("Validade: ");
        String validadeV = ent.nextLine();
        
        System.out.println("Descrição: ");
        String descricaoV = ent.nextLine();
        
        System.out.println("Quantidade: ");
        int quantV = ent.nextInt();
        
        int codigoV = z.nextInt(999);
        System.out.println("Código: " + codigoV);
        
        Vacina newVacina = new Vacina(nomeV, fabricacaoV, validadeV, codigoV, origemV, descricaoV, quantV);
        FakeBancoDados.insertVacina(newVacina);
        System.out.println("CADASTRO REALIZADO COM SUCESSO!");
    }
    
    public static void agendamento(){
        Scanner ent = new Scanner(System.in);
        
        System.out.println("AGENDAMENTO: ");
        
        System.out.println("CPF Tutor: ");
        String cpftt = ent.nextLine();
        
        Cliente clienteA = FakeBancoDados.retornaCliente(cpftt);
        
        System.out.println("Código Pet: ");
        int codp = ent.nextInt();
        
        Pet petA = FakeBancoDados.retornaPet(codp);
        
        System.out.println("CRMV Veterinário: ");
        int crmv = ent.nextInt();
        
        Veterinario vetA = FakeBancoDados.retornaVeterinario(crmv);
        
        System.out.println("Data: ");
        String dia = ent.nextLine();
        System.out.print(" / ");
        String mes = ent.nextLine();
        System.out.print(" / ");
        String ano = ent.nextLine();
        
        SimpleDateFormat formatoData = 
                new SimpleDateFormat("dd/MM/yyyy");
        
        String dataS = dia + "/" + mes + "/ " + ano;
        
        //tratando a exceção*********************************DATE
        /*try {
            Date data = formatoData.parse(dataS);
        } catch (ParseException ex) {
            Logger.getLogger(Clinica_Vet.class.getName()).log(Level.SEVERE, null, ex);
        }*/
       
       
       /* System.out.println("Horário: ");
        String hora = ent.nextLine();
        System.out.print(" : ");
        String minuto = ent.nextLine();
        
        String horario = hora + ":" + minuto;
        
        System.out.println("1 - Consulta | 2 - Procedimento");
        int x = ent.nextInt();
        
        if(x == 1){
            marcarConsulta(clienteA, petA, vetA, dataS, horario);
        }else if(x == 2){
            marcarProcedimento(clienteA, petA, vetA, dataS, horario);
        }
        
        
       /* //achando pet
        if(FakeBancoDados.retornaPet(codigo) == null){
            System.out.println("Pet sem cadastro!");
        }else{
            petConsulta = FakeBancoDados.retornaPet(codigo);
            
            System.out.println("Dados Pet: ");
            System.out.println("Nome: " + petConsulta.getNomePet());
            System.out.println("Raça: " + petConsulta.getRacaPet());
        }*/
    /*}*/
    
   /* private static void marcarConsulta(Cliente tutot, Pet pet, Veterinario vet, String data, String horario) {
       
        Scanner ent = new Scanner(System.in);
        Random z = new Random();
        
        System.out.println("CONSULTA");
        
        //indice,bound******************************
        int codCs = z.nextInt(1000, 10000);
        System.out.println("Código da consulta: " + codCs);
        
        double valorPadraoC = 70.0;
        System.out.println("O valor padrão da consulta é de R$" + valorPadraoC);
        
        Consulta novaConsulta = new Consulta(codCs, horario, tutot, data, vet, pet, valorPadraoC);
        
        System.out.println("CONSULTA REALIZADA COM SUCESSO");
        
        FakeBancoDados.insertConsulta(novaConsulta);
        //imprimir dados***********
        
    }
    
    private static void marcarProcedimento(Cliente tutot, Pet pet, Veterinario vet, String data, String horario) {
       
        Scanner ent = new Scanner(System.in);
        Random z = new Random();
        
        System.out.println("PROCEDIMENTO");
        
        System.out.println("Tipo: ");
        String tipoP = ent.nextLine();
        
        System.out.println("Descrição: ");
        String descricaoP = ent.nextLine();
        
        //indice,bound******************************
        int codP = z.nextInt(1000, 10000);
        System.out.println("Código do procedimento: " + codP);
        
        double valorP = 100.0;
        System.out.println("Valor: " + valorP);
        //CALCULA VALOR *****
        
        Procedimento novoProcedimento = new Procedimento(codP, tipoP, descricaoP, horario, tutot, data, vet, pet, valorP);
        FakeBancoDados.insertProcedimento(novoProcedimento);
        //imprimir dados***********
        
    }
    
    private static void emiteIndClinica(Veterinario vetI, Pet petI, String tipo){
        
        System.out.println("INDICAÇÃO CLÍNICA");
        
        System.out.println("Veterinário: " + vetI.getNomeVet());
        
        System.out.println("Pet: " + petI.getNomePet() + "|" + petI.getCodPet());
        
        System.out.println("Tipo: " + tipo);
        
        if(tipo.equalsIgnoreCase("Vacina")){
            
        }else if(tipo.equalsIgnoreCase("Medicamento")){
            
        }else if(tipo.equalsIgnoreCase("Tratamento")){
            
        }
        
    }*/
    
    public static void main(String[] args) {
        
       /* //inicializando banco de dados
        FakeBancoDados.selectAllClientes();
        FakeBancoDados.selectAllFuncionarios();
        FakeBancoDados.selectAllPets();
        FakeBancoDados.selectAllVeterinarios();
        FakeBancoDados.selectAllMedicamentos();
        FakeBancoDados.selectAllVacina();
        FakeBancoDados.selectAllTratamento();
        FakeBancoDados.selectAllConsulta();
        FakeBancoDados.selectAllProcedimento();
        
        //menu
        Scanner entrada = new Scanner(System.in);
        int opcao;
        
        do{
            
            System.out.println("MENU CLÍNICA VETERINÁRIA: ");
            System.out.println("1 - Cadastro Pet"
                    + "\n2 - Cadastro Cliente"
                    + "\n3 - Cadastro Funcionário"
                    + "\n4 - Cadastro Medicamento"
                    + "\n5 - Cadastro Vacina"
                    + "\n6 - Cadastro Tratamento"
                    + "\n7 - Agendamentos"
                    + "\n8 - Sair");
            
            opcao = entrada.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("Informe o cpf do Cliente: ");
                    String cpf = entrada.nextLine();
                    cadastroPet(cpf, 0);
                    break;
                case 2:
                    cadastroCliente();
                    break;
                case 3:
                    cadastroFuncionario();
                    break;
                case 4:
                    cadastroMedicamento();
                    break;
                case 5:
                    cadastroVacina();
                    break;
                case 6:
                    cadastroTratamento();
                    break;
                case 7:
                    agendamento();
                case 8:
                    System.out.println("Encerrando o sistema");
                    break;
                //inválido
                default:
                    System.out.println("Opção inválida!!!\n\n");    
            }
            
        }while(opcao != 8);
    }*/
}
}
