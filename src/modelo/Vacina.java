package modelo;

public class Vacina{
    
    private String nomeVac;
    private int codVac;
    private String descricaoVac;
    private String data;
    private String dataReforco;
    private int codPet; //vínculo com o pet

    //para cadastro
    public Vacina(String nomeVac, int codVac, String descricaoVac, String data, String dataReforco, int codPet) {
        this.nomeVac = nomeVac;
        this.codVac = codVac;
        this.descricaoVac = descricaoVac;
        this.data = data;
        this.dataReforco = dataReforco;
        this.codPet = codPet;
    }

    public Vacina() {
      
    }
    
    public String getNomeVac() {
        return nomeVac;
    }

    public void setNomeVac(String nomeVac) {
        this.nomeVac = nomeVac;
    }

    public int getCodVac() {
        return codVac;
    }

    public void setCodVac(int codVac) {
        this.codVac = codVac;
    }

    public String getDescricaoVac() {
        return descricaoVac;
    }

    public void setDescricaoVac(String descricaoVac) {
        this.descricaoVac = descricaoVac;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDataReforco() {
        return dataReforco;
    }

    public void setDataReforco(String dataReforco) {
        this.dataReforco = dataReforco;
    }

    public int getCodPet() {
        return codPet;
    }

    public void setCodPet(int codPet) {
        this.codPet = codPet;
    }
 
}
