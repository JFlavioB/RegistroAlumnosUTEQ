
package mx.uteq.regitroAlumnos;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface = "mx.uteq.regitroAlumnos.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
	
	static List<Alumno> alumnos = new ArrayList<>();

    public String sayHi(String text) {
        return "Hello " + text;
    }

	@Override
	public Alumno saveAlumno(Alumno alumno) {
		alumnos.add(alumno);
		return alumno;
		
	}

	@Override
	public List<Alumno> getAll() {
		
		return alumnos;
	}
}

