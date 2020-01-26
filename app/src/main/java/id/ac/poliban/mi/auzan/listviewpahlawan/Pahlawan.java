package id.ac.poliban.mi.auzan.listviewpahlawan;

public class Pahlawan {
    private String pahlawanFoto;
    private  String pahlawanNama;
    private  String pahlawanDesc;

    public Pahlawan(String pahlawanFoto, String pahlawanNama, String pahlawanDesc) {
        this.pahlawanFoto = pahlawanFoto;
        this.pahlawanNama = pahlawanNama;
        this.pahlawanDesc = pahlawanDesc;
    }

    public String getPahlawanFoto() {
        return pahlawanFoto;
    }

    public void setPahlawanFoto(String pahlawanFoto) {
        this.pahlawanFoto = pahlawanFoto;
    }

    public String getPahlawanNama() {
        return pahlawanNama;
    }

    public void setPahlawanNama(String pahlawanNama) {
        this.pahlawanNama = pahlawanNama;
    }

    public String getPahlawanDesc() {
        return pahlawanDesc;
    }

    public void setPahlawanDesc(String pahlawanDesc) {
        this.pahlawanDesc = pahlawanDesc;
    }

    @Override
    public String toString() {
        return String.format("%30s\n\n%s", getPahlawanNama(), getPahlawanDesc());
    }
}
