public class Sekuntikello {
    
    private Viisari sadasosat;
    private Viisari sekunnit;
    
    public Sekuntikello() {
        this.sadasosat = new Viisari(100);
        this.sekunnit = new Viisari(60);
    
    }
    
    public void etene() {
        this.sadasosat.etene();
        
        if (this.sadasosat.arvo() == 0) {
            this.sekunnit.etene();
        }
    }
    
    public String toString() {
        return this.sekunnit + ":" + this.sadasosat;
    }
}