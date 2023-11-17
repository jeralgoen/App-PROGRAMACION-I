import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Registro {
    private String nombre;
    private String correoElectronico;
    private String fechaNacimiento;
    private String numeroTelefono;
    private String registrarContrasena;
    private String recuperarContrasena;
    private boolean eliminarRegistro;

   
    public Registro(String nombre, String correoElectronico, String fechaNacimiento, String numeroTelefono,
                    String registrarContrasena, String recuperarContrasena, boolean eliminarRegistro) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroTelefono = numeroTelefono;
        this.registrarContrasena = registrarContrasena;
        this.recuperarContrasena = recuperarContrasena;
        this.eliminarRegistro = eliminarRegistro;
    }
}


class Usuario {
    private String nombre;
    private String correoElectronico;

    
    public Usuario(String nombre, String correoElectronico) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
    }
}


class Mensajeria {
    private List<String> bandejaEntrada;
    private List<String> bandejaSalida;

    
    public Mensajeria() {
        this.bandejaEntrada = new ArrayList<>();
        this.bandejaSalida = new ArrayList<>();
    }

    public void enviarMensaje(String mensaje) {
        bandejaSalida.add(mensaje);
    }

    public void recibirMensaje(String mensaje) {
        bandejaEntrada.add(mensaje);
    }
}


class Amigos {
    private List<String> listaAmigos;
    private List<String> grupos;

    
    public Amigos() {
        this.listaAmigos = new ArrayList<>();
        this.grupos = new ArrayList<>();
    }

    public void agregarAmigo(String amigo) {
        listaAmigos.add(amigo);
    }

    public void eliminarAmigo(String amigo) {
        listaAmigos.remove(amigo);
    }

    public void crearGrupo(String nombreGrupo) {
        grupos.add(nombreGrupo);
    }
}


class Publicaciones {
    private List<String> listaPublicaciones;

   
    public Publicaciones() {
        this.listaPublicaciones = new ArrayList<>();
    }

    public void realizarPublicacion(String contenido) {
        listaPublicaciones.add(contenido);
    }

    public void verPublicacion(int index) {
        System.out.println(listaPublicaciones.get(index));
    }

    public void eliminarPublicacion(int index) {
        listaPublicaciones.remove(index);
    }
}


class Comentarios {
    private List<String> listaComentarios;
    private List<Date> fechasComentarios;

    
    public Comentarios() {
        this.listaComentarios = new ArrayList<>();
        this.fechasComentarios = new ArrayList<>();
    }

    public void agregarComentario(String comentario) {
        listaComentarios.add(comentario);
        fechasComentarios.add(new Date());
    }

    public void verComentario(int index) {
        System.out.println(listaComentarios.get(index) + " - Fecha: " + fechasComentarios.get(index));
    }

    public void eliminarComentario(int index) {
        listaComentarios.remove(index);
        fechasComentarios.remove(index);
    }
}


class Eventos {
    private String nombreEvento;
    private Date fechaInicio;
    private Date fechaFinal;

    public Eventos(String nombreEvento, Date fechaInicio, Date fechaFinal) {
        this.nombreEvento = nombreEvento;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    public void crearEvento(String nombreEvento, Date fechaInicio, Date fechaFinal) {
        this.nombreEvento = nombreEvento;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    public void obtenerInformacionEvento() {
        System.out.println("Evento: " + nombreEvento);
        System.out.println("Fecha de inicio: " + fechaInicio);
        System.out.println("Fecha final: " + fechaFinal);
    }
}

