public class Paciente implements Comparable<Paciente>{
    private int prioridad;
    private String nombre;
    private String sintomas;

    public Paciente(int prioridad, String nombre, String sintomas) {
        this.prioridad = prioridad;
        this.nombre = nombre;
        this.sintomas = sintomas;
    }

    public int getPrioridad() {
        return prioridad;
    }
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getSintomas() {
        return sintomas;
    }
    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    @Override
    public String toString() {
        return "Paciente tiene prioridad: "+ prioridad +
                ", Nombre: " + nombre +
                ", Sintomas: " + sintomas;
    }
    @Override
    public int compareTo(Paciente o) {
        if (this.prioridad<o.getPrioridad())
            return -1;
        else
            return 1;
    }
}
