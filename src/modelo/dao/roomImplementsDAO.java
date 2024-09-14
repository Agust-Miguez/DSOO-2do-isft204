package modelo.dao;
import Exceptions.DuplicateEntryException;
import java.util.ArrayList;
import java.util.List;
import modelo.entidades.room;
import Exceptions.NotfoundException;

public class roomImplementsDAO implements DAO <room> {
    
    private List <room> rooms; 
    
      public roomImplementsDAO(List<room> rooms) {
        this.rooms = new ArrayList ();
    }

    @Override
    public void save(room data) throws DuplicateEntryException  {
     for ( room s : this.rooms){
         if (s.getId()== data.getId()){
             throw new DuplicateEntryException ("Room whit " + data.getId() +" already exists");
         }
     }
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(room data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(room data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
    
    
    
    
}
