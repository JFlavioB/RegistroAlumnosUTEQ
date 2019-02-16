package mx.uteq.regitroAlumnos;

import java.util.List;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text);
    
    
    
    public Alumno saveAlumno(Alumno alumno);
    
    public List<Alumno> getAll();
}

