public class Estudiante {

    private String nombre;
    private int edad;
    private String curso;

    public Estudiante() {
        this("Sin nombre", 0); 
        this.curso = "Sin asignar";
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = (edad >= 0) ? edad : 0;
        this.curso = "Sin asignar";
    }

    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad); 
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", curso='" + curso + '\'' +
                '}';
    }
}
