package modelo.dao;
import Exceptions.DuplicateEntryException;
import java.util.ArrayList;
import java.util.List;
import modelo.entidades.room;
import Exceptions.NotfoundException;
import static java.awt.AWTEventMulticaster.remove;

public class roomImplementsDAO implements DAO <room> {
    
    private List <room> rooms; 
    
      public roomImplementsDAO(List<room> rooms) {
        this.rooms = new ArrayList ();
    }

    @Override
    public void save(room data) throws DuplicateEntryException  {
     for ( room s : this.rooms){
         if (s.getId()== data.getId()){
             throw new DuplicateEntryException ("Room whit " + data.getId() +" already exists if your create new Room press 1 or 2 for update");
             /*if (Dependiendo el requeriemiento por consola o interfaz grafica llamo a la funcion update o creo nuevo elemento)*/
                 
         }
     }
     data.setId(this.rooms.size()+1);
     this.rooms.add(data);
    } 
    
    @Override
    public room getById(int id)throws NotfoundException {
        for (room room : this.rooms){
            if (room.getId() == id){
                return room;
            }
        }   
        throw new NotfoundException ("Room whit id " + id + "not found");
    }

    @Override
    public List<room> listall() {
        return this.rooms;
    }

    @Override
    public void update(room data) {
         for ( room s : this.rooms){
         if (s.getId()== data.getId()){  
         }
     }
    }

    @Override
    public void delete(room data) {
              for ( room s : this.rooms){
         if (s.getId()== data.getId()){
            rooms.remove(data.getId());
         }    
         }
    }

    private void getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
    
    
    
    
}
