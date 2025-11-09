public class Tarea {
    private int id;
    private int duracion;
    private String descripcion;
    private Estado estado;


    public int getDuracion(){
        return this.duracion;
    }

    public int getProgreso(){
        return this.estado.getCodigo();
    }

    public Estado getEstado(){
        return this.estado;
    }

    public Estado setEstado(Estado estado){
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(id, persona.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    
}
