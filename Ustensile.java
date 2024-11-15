import java.time.LocalDate;

abstract class Ustensile {
    protected int annee;

    public Ustensile(int annee){
        this.annee=annee;
    }

    int getAnnee(){
        return this.annee;
    }

    public int calculervaleur(){
        LocalDate date= LocalDate.now();
        int annee_courante=date.getYear();
        int annee=getAnnee();
        int age=annee_courante-annee;
        int Valeur=0;
        if(age >50){
            Valeur=(age-50)*1;
        }
        return Valeur;
    }
    
}