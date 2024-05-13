public class Relogio {
    // ATRIBUTOS
    private int hora;
    private int min;
    private int seg;   


    // CONTRUTOR
    public Relogio() {

    }

    public Relogio(int new_hora) {
        this.hora = new_hora;
    }

    public Relogio(int new_hora, int new_min) {
        this.hora = new_hora;
        this.min = new_min;
    }

    public Relogio(int new_hora, int new_min, int new_seg) {
        this.hora = new_hora;
        this.min = new_min;
        this.seg = new_seg;
    }


    // MÉTODOS ACESSORES
    public int getHora() {
        return this.hora;
    }

    public int getMin() {
        return this.min;
    }

    public int getSeg() {
        return this.seg;
    }


    // MÉTODOS MODIFICADORES
    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    
}
