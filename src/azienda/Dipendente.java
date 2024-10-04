package azienda;

public class Dipendente {
    private String matricola;
    private double stipendio;
    private double straordinario;

    public double getStipendio(){
        return stipendio;
    }
    public double getStraordinario(){
        return straordinario;
    }
    public String matricola(){
        return matricola;
    }

    public void setMatricola(String matricola){
        this.matricola=matricola;
    }
    public void setStipendio(double stipendio){
        this.stipendio=stipendio;
    }
    public void setStraordinario(double straordinario){
        this.straordinario=straordinario;
    }

    public double paga(int ore){
        return stipendio + (straordinario*ore);
    }
    public String stampa(){
        return matricola + " - " + stipendio + " - " + straordinario;
    }





    public Dipendente(String matricola, double stipendio, double straordinario){
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.straordinario = straordinario;
    }
}