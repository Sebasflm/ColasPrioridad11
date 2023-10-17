import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Clinica {
    private PriorityQueue<Paciente>listaPacientes;
    public Clinica(){
        listaPacientes=new PriorityQueue<Paciente>();
    }
    public void encolar(Paciente dato){
        listaPacientes.offer(dato);
    }
    public Paciente atender()throws Exception{
        if(listaPacientes.isEmpty())
            throw new Exception("No existe elementos");
        return listaPacientes.remove();
    }
    public List<Paciente> listarPacientes(){
        return listaPacientes.stream().collect(Collectors.toList());
        /*List<Paciente> pacientes=new LinkedList<>();
        for (Paciente p:listaPacientes){
            pacientes.add(p);
        }
        return pacientes;*/
    }
}
