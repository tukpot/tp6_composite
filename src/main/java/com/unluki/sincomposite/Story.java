public class Story {
    private int id;
    private HashMap<int,Tarea> tareas;

    public Story(){
        this.tareas = new HashMap<>();
    }

    public void addTask(Tarea tarea){
        this.tareas.put(tarea);
    }
    
    public Task getTask(int id){
        return this.tareas.get(id);
    }

    public int getCantidadTareas(){
        return this.tareas.size();
    }

    public int getPorcentajeCompletado() {
        if (tareas.isEmpty()) return 0;

        int suma = 0;

        for (Tarea tarea : tareas.values()) {
            suma += tarea.getProgreso();
        }

        int promedio = suma / getCantidadTareas();

        return (int) Math.round(promedio);
    }

    public void removeTask(int id){
        this.tareas.remove(id);
    }

    public int getDuracionTotal(){
        int result = 0;
        for (Tarea tarea : tareas.values()) {
            result = result + tarea.getDuracion();
        }

        return result;
    }

    public int getProgresoTotal(){
        int result = 0;
        for (Tarea tarea : tareas.values()) {
            result = result + tarea.getProgreso();
        }

        return result;
    }
}
