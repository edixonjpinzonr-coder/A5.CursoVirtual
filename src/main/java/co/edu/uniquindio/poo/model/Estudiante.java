package co.edu.uniquindio.poo.model;

public class Estudiante implements Cloneable {
    private String nombre;
    private String correo;
    private String telefono;
    private String direccion;
    private String intereses;

    public Estudiante(Builder builder) {
        this.nombre = builder.nombre;
        this.correo = builder.correo;
        this.telefono = builder.telefono;
        this.direccion = builder.direccion;
        this.intereses = builder.intereses;
    }

    public Estudiante clone() throws CloneNotSupportedException {
        return (Estudiante) super.clone();
    }

    public String getIntereses() {
        return intereses;
    }

    public void setIntereses(String intereses) {
        this.intereses = intereses;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", intereses='" + intereses + '\'' +
                '}';
    }

    public static class Builder {
        private String nombre;
        private String correo;
        private String telefono;
        private String direccion;
        private String intereses;


        public Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder correo(String correo) {
            this.correo = correo;
            return this;
        }

        public Builder telefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public Builder direccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public Builder intereses(String intereses) {
            this.intereses = intereses;
            return this;
        }

        public Estudiante build() {
            return new Estudiante(this);
        }

    }
}
