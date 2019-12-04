public class Harjoitusapuri
{
    
    private int ika;
    private int leposyke;
    
    public Harjoitusapuri(int ika, int leposyke) {
        this.ika = ika;
        this.leposyke = leposyke;
        
    }
    
    public double tavoitesyke(double prosenttiaMaksimista) {
        double maxsyke = 206.3 - (0.711 * this.ika);
        prosenttiaMaksimista = ((maxsyke - this.leposyke) * (prosenttiaMaksimista) +this.leposyke);
        return prosenttiaMaksimista;
    }
    
}
