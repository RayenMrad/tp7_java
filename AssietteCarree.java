public  class AssietteCarree extends Assiette{
    public double cote;

    public AssietteCarree(int annee,double cote){
        super(annee);
        this.cote=cote;
    }

    public double calculerSurface(){
        return cote*cote;
    }

    public int calculervaleur(){
        return (super.calculervaleur())*5;
    }
}
