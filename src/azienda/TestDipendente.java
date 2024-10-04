package azienda;

public class TestDipendente {
    public static void main(String[] args){
        Dipendente[] dipendenti = new Dipendente[2];
        dipendenti[0]= new Dipendente("4723",1999.99,9.99);
        dipendenti[1]= new Dipendente("4724",1499.99,7.99);
        for (int i = 0; i< dipendenti.length; i++){
            System.out.println(dipendenti[i].stampa());
        }
    }
}
