package azienda;

public class Dipendente {
    private String matricola;
    private float stipendio;
    private float straordinario;

    public float getStipendio(){
        return stipendio;
    }
    public float paga(int ore){
        return stipendio + (straordinario*ore);
    }
    public String stampa(){
        return matricola + " - " + stipendio + " - " + straordinario;
    }
    public Dipendente(String matricola, float stipendio, float straordinario){
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.straordinario = straordinario;
    }
}