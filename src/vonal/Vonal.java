
package vonal;


public class Vonal {
    private int hossz;
    private int eltolas;
    private Szinek szin;
    private Stilusok stilus;
    
    public enum Szinek{PIROS,KEK,ZOLD,FEKETE};
    public enum Stilusok{SZIMPLA,DUPLA,PONT};

    public Vonal(int hossz) throws Exception {
        this(3,0,Szinek.FEKETE,Stilusok.SZIMPLA);
    }

    public Vonal(int hossz, int eltolas) throws Exception {
        this(hossz,eltolas,Szinek.FEKETE,Stilusok.SZIMPLA);
    }

    public Vonal(int hossz, int eltolas, Szinek szin) throws Exception {
        this(hossz,eltolas,szin,Stilusok.SZIMPLA);
    }

    public Vonal(int hossz, int eltolas, Szinek szin, Stilusok stilus) throws Exception {
        this.hossz = hossz;
        if(hossz < 1){
            throw new Exception(" mert nem létező a hossz!");
        }
        
        if(eltolas < 0){
            eltolas = 0;
        }
        this.eltolas = eltolas;
        
        this.szin = szin;
        this.stilus = stilus;
    }
    
    public void eltolas(int egyseg){
        egyseg = eltolas ;
    }
    
    public String vonalAbra(){
        String jel = ".";
        if(stilus == Stilusok.DUPLA){
            jel = "=";
        }else if(stilus == Stilusok.SZIMPLA){
            jel = "_";
        }
        
        String szinKod = "\u001B[30m";
        switch(szin){
            case PIROS:
                szinKod = "\u001B[31m";
                break;
            case KEK:
                szinKod = "\u001B[34m";
                break;
            case ZOLD:
                szinKod = "\u001B[32m";
                break;
        }
        String kep = " ".repeat(eltolas)+jel.repeat(hossz);
        final String RESET = "\u001B[0m";
        return szinKod + kep + RESET;
    
    }
    
    @Override
    public String toString() {
        return "Vonal{" + "hossz=" + hossz + ", eltolas=" + eltolas + ", szin=" + szin + ", stilus=" + stilus + '}';
    }
    
    
    
}
