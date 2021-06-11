package RAF;

//import VALIDACIONES.ValidarFecha;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import models.Registro;

/**
 *
 * @author STEVEN UNIVERSE
 */
public class RAF {
    public static final int SIZE = 630;
    private RandomAccessFile raf,tempo;
    private File file,temporal;

    public RAF() {
    }

    private void open() throws IOException {
        file = new File("REGISTRO.txt");
        if (!file.exists()) {
            file.createNewFile();
            raf = new RandomAccessFile(file, "rw");
            raf.seek(0);
            raf.writeInt(0);
            raf.writeInt(0);
        } else {
            raf = new RandomAccessFile(file, "rw");
        }
    }
    private void opentempo() throws IOException {
        temporal = new File("TEMPORAL.txt");
        if (!temporal.exists()) {
            temporal.createNewFile();
            tempo = new RandomAccessFile(temporal, "rw");
            tempo.seek(0);
            tempo.writeInt(0);
            tempo.writeInt(0);
        } else {
            tempo = new RandomAccessFile(temporal, "rw");
        }
    }
    private void close() throws IOException {
        if (raf != null) {
            raf.close();
        }
    }

    private String limit(String text, int size) {
        StringBuilder buffer;
        if (text == null) {
            buffer = new StringBuilder(size);
        } else {
            buffer = new StringBuilder(text);
            buffer.setLength(size);
        }
        return buffer.toString();
    }

    
    public void guardar(Registro t) throws IOException {
        open();
        raf.seek(0);
        int n = raf.readInt();
        int k = raf.readInt();
        long pos = 8 + n * SIZE;
        raf.seek(pos);
        raf.writeUTF(limit(t.getCodigo(),12));
        raf.writeUTF(limit(t.getFechaRegistro(),10));
        raf.writeUTF(limit(t.getPersonaDifunto().getNombres(),30));
        raf.writeUTF(limit(t.getPersonaDifunto().getApellidos(),30));
        raf.writeUTF(limit(t.getPersonaDifunto().getNoCedula(),16));
        raf.writeUTF(limit(t.getPersonaDifunto().getFechaDefuncion(),10));
        raf.writeUTF(limit(t.getPersonaResponsable().getNombres(),30));
        raf.writeUTF(limit(t.getPersonaResponsable().getApellidos(),30));
        raf.writeUTF(limit(t.getPersonaResponsable().getNoCedula(),16));
        raf.writeUTF(limit(t.getPersonaResponsable().getDireccion(),100));
        raf.writeUTF(limit(t.getTierra().getCodigo(),12));
        raf.writeInt(t.getTierra().getPagoTerreno());
        raf.writeInt(t.getTierra().getPagoSepultura());
        raf.seek(0);
        raf.writeInt(++n);
        raf.writeInt(++k);
        close();
    }

    
    public void actualizar(Registro t) throws IOException {
        
        open();
        raf.seek(0);
        int n = raf.readInt();
        if (n <= 0) {
            System.out.println("No existen Registros");
        }
        for (int i = 0; i < n; i++) {
            long pos = 8 + i * SIZE;
            raf.seek(pos);
            String codigo_actualizar = raf.readUTF();
            if (t.getCodigo()== codigo_actualizar) {
                
                raf.writeUTF(limit(t.getFechaRegistro(),10));
                raf.writeUTF(limit(t.getPersonaDifunto().getNombres(),30));
                raf.writeUTF(limit(t.getPersonaDifunto().getApellidos(),30));
                raf.writeUTF(limit(t.getPersonaDifunto().getNoCedula(),16));
                raf.writeUTF(limit(t.getPersonaDifunto().getFechaDefuncion(),10));
                raf.writeUTF(limit(t.getPersonaResponsable().getNombres(),30));
                raf.writeUTF(limit(t.getPersonaResponsable().getApellidos(),30));
                raf.writeUTF(limit(t.getPersonaResponsable().getNoCedula(),16));
                raf.writeUTF(limit(t.getPersonaResponsable().getDireccion(),100));
                raf.writeUTF(limit(t.getTierra().getCodigo(),12));
                raf.writeInt(t.getTierra().getPagoTerreno());
                close();
                break;
            }
        }
    }

    
    public void borrar(String identificador) throws IOException {
        opentempo();
        open();
        raf.seek(0);
        int n=raf.readInt();
        int k=raf.readInt();
        int j=0;
        tempo.seek(0);
        int n1=tempo.readInt();
        int k1=tempo.readInt();
        for(int i=0;i<n;i++){
            long pos= 8+ i*SIZE;
            raf.seek(pos);
            Registro t=lectura_datos();
            if(t.getCodigo()!= identificador){                
                long indice= 8 + j*SIZE;
                tempo.seek(indice);
                tempo.writeUTF(limit(t.getCodigo(),12));
                tempo.writeUTF(limit(t.getFechaRegistro(),10));
                tempo.writeUTF(limit(t.getPersonaDifunto().getNombres(),30));
                tempo.writeUTF(limit(t.getPersonaDifunto().getApellidos(),30));
                tempo.writeUTF(limit(t.getPersonaDifunto().getNoCedula(),16));
                tempo.writeUTF(limit(t.getPersonaDifunto().getFechaDefuncion(),10));
                tempo.writeUTF(limit(t.getPersonaResponsable().getNombres(),30));
                tempo.writeUTF(limit(t.getPersonaResponsable().getApellidos(),30));
                tempo.writeUTF(limit(t.getPersonaResponsable().getNoCedula(),16));
                tempo.writeUTF(limit(t.getPersonaResponsable().getDireccion(),100));
                tempo.writeUTF(limit(t.getTierra().getCodigo(),12));
                tempo.writeInt(t.getTierra().getPagoTerreno());
                tempo.writeInt(t.getTierra().getPagoSepultura());
                tempo.seek(0);
                tempo.writeInt(++n1);
                tempo.writeInt(++k1);
                j++;
            }
        }
        close();
        tempo.close();
        try {
            if (file.delete()) {
                System.out.println("EMPLEADO ELIMINADO CORRECTAMENTE");
            }
        } catch (SecurityException ex) {
            System.err.println("ERROR AL ELIMINAR" + ex.getMessage());
        } finally {
            temporal.renameTo(new File("REGISTRO.txt"));
            System.out.println("");
            
        }
    }

    
    public List<Registro> vertodo() throws IOException {
        List<Registro> visualizar_todos = new ArrayList();
        open();
        raf.seek(0);
        int n = raf.readInt();
        if (n <= 0) {
            return null;
        }
        for (int i = 0; i < n; i++) {
            long pos = 8 + i * SIZE;
            raf.seek(pos);
            Registro employee = lectura_datos();
            visualizar_todos.add(employee);
        }
        close();
        return visualizar_todos;
    }
    
    /*@Override
    public Empleado buscarById(int id) throws IOException{
        open();
        raf.seek(0);
        int n=raf.readInt();
        if(n<=0){
            String message="No hay Empleados registrados";
            Object b=message;
        return (Empleado) b;
        }
        Empleado e=null;
        for(int i = 0; i < n; i++) {
          long pos=8+ i*SIZE;
          raf.seek(pos);
          int id_buscado=raf.readInt();
          if(id_buscado==id){
              raf.seek(pos);
              e=lectura_datos();
              close();
              return e;
          }     
            }
        close();
        return e;   
    }*/
    
    private Registro lectura_datos() throws IOException{
        Registro emp=new Registro();
        emp.setCodigo(raf.readUTF().replace('\0',' ').trim());
        emp.setFechaRegistro(raf.readUTF().replace('\0',' ').trim());
        emp.getPersonaDifunto().setNombres(raf.readUTF().replace('\0',' ').trim());
        emp.getPersonaDifunto().setApellidos(raf.readUTF().replace('\0',' ').trim());
        emp.getPersonaDifunto().setNoCedula(raf.readUTF().replace('\0',' ').trim());
        emp.getPersonaDifunto().setFechaDefuncion(raf.readUTF().replace('\0',' ').trim());
        emp.getPersonaResponsable().setNombres(raf.readUTF().replace('\0',' ').trim());
        emp.getPersonaResponsable().setApellidos(raf.readUTF().replace('\0',' ').trim());
        emp.getPersonaResponsable().setNoCedula(raf.readUTF().replace('\0',' ').trim());
        emp.getPersonaResponsable().setDireccion(raf.readUTF().replace('\0',' ').trim());
        return emp;
    }
    /*
    public List<Empleado> buscarByName(String name) throws IOException {
        List<Empleado> lista = new ArrayList<>();
        open();
        raf.seek(0);
        int n = raf.readInt();
        if (n <= 0) {
            System.out.println("No existen registros");
        }
        for (int i = 0; i < n; i++) {
            long pos = 8 + i * SIZE;
            raf.seek(pos);
            Empleado em = lectura_datos();
            if (em.getNombre().equalsIgnoreCase(name)) {
                lista.add(em);
            }
        }
        close();

        return lista;
    }
    public List<Empleado> buscarByDepartamento(String name) throws IOException{
        List<Empleado> bowie=new ArrayList();
        open();
        raf.seek(0);
        int n=raf.readInt();
        if(n<=0){
            System.out.println("NO EXISTEN REGISTROS");
        }
        for(int i=0;i<n;i++){
            long pos = 8 + i * SIZE;
            raf.seek(pos);
            Empleado em = lectura_datos();
            if (em.getDepartamento().equalsIgnoreCase(name)) {
                bowie.add(em);
            }
        }
        close();
        return bowie;
    }
    public List<Empleado> nominaByDepartamento(String dept) throws IOException{
        List<Empleado> elton =new ArrayList();
        open();
        raf.seek(0);
        int n=raf.readInt();
        if(n<=0){
            System.out.println("NO EXISTEn REGISTROS");
        }
        for(int i=0;i<n;i++){
            long pos = 8 + i * SIZE;
            raf.seek(pos);
            Empleado em = lectura_datos();
            if (em.getDepartamento().equalsIgnoreCase(dept)) {
                elton.add(em);
            }
        }
        close();
        return elton;
    }*/
}
