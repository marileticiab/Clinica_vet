package modelo;

import java.util.Vector;

public class Pet {
   
    private String nomePet;
    private String racaPet;
    private int ano;//
    private String genero;
    private String cor;
    private int codPet;//
    private String cpfTutor;
    private Vector<Vacina> cartaoVacina = new Vector<>();
    private Vector<Receita> receitasPet = new Vector<>();
    private Vector<Procedimento> procedimentosPet = new Vector<>();
    private Vector<Consulta> consultasPet = new Vector<>();

    //para cadastro
    public Pet(String nomePet, String racaPet, int ano, String genero, String cor, int codPet, String cpfTutor) {
        this.nomePet = nomePet;
        this.racaPet = racaPet;
        this.ano = ano;
        this.genero = genero;
        this.cor = cor;
        this.codPet = codPet;
        this.cpfTutor = cpfTutor;
    }
    
    //pedido pela classe DAO
    public Pet() {
        
    }
    
    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public String getRacaPet() {
        return racaPet;
    }

    public void setRacaPet(String racaPet) {
        this.racaPet = racaPet;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCodPet() {
        return codPet;
    }

    public void setCodPet(int codPet) {
        this.codPet = codPet;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCpfTutor() {
        return cpfTutor;
    }

    public void setCpfTutor(String cpfTutor) {
        this.cpfTutor = cpfTutor;
    }

    public Pet(int codPet) {
        this.codPet = codPet;
    }

    public Vector<Vacina> getCartaoVacina() {
        return cartaoVacina;
    }

    public void setCartaoVacina(Vector<Vacina> cartaoVacina) {
        this.cartaoVacina = cartaoVacina;
    }

    public Vector<Receita> getReceitasPet() {
        return receitasPet;
    }

    public void setReceitasPet(Vector<Receita> receitasPet) {
        this.receitasPet = receitasPet;
    }

    public Vector<Procedimento> getProcedimentosPet() {
        return procedimentosPet;
    }

    public void setProcedimentosPet(Vector<Procedimento> procedimentosPet) {
        this.procedimentosPet = procedimentosPet;
    }

    public Vector<Consulta> getConsultasPet() {
        return consultasPet;
    }

    public void setConsultasPet(Vector<Consulta> consultasPet) {
        this.consultasPet = consultasPet;
    }

}
