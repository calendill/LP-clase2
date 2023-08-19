package src.builder;

public class Empleado {

    private long id;
    private String nombre;
    public Empleado(String nombre, long id) {
        this.nombre=nombre;
        this.id=id;
    }
    public static EmpleadoBuilder builder(){
        return new EmpleadoBuilder();
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public static class EmpleadoBuilder{
        public EmpleadoBuilder(){}

        public EmpleadoBuilder nombre(String nombre){
            this.nombre = nombre;
            return this;
        }

        public EmpleadoBuilder id(long id){
            this.id = d;
            return this;
        }
        public Empleado build(){
            return new Empleado(nombre,id);
            }
        }
    }
}
