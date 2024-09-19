package modelo.dao;

import Exceptions.DuplicateEntryException;
import Exceptions.NotfoundException;
import modelo.entidades.room;
import java.util.ArrayList;
import java.util.List;

public class roomImplementsDAO implements DAO<room> {

    private List<room> rooms;

    public roomImplementsDAO(List<room> rooms) {
        this.rooms = new ArrayList<>();
    }

    @Override
    public void save(room data) throws DuplicateEntryException {
        for (room s : this.rooms) {
            if (s.getId() == data.getId()) {
                throw new DuplicateEntryException("Room with ID " + data.getId() + " already exists. Use update to modify.");
            }
        }
        data.setId(this.rooms.size() + 1);
        this.rooms.add(data);
    }

    @Override
    public room getById(int id) throws NotfoundException {
        for (room room : this.rooms) {
            if (room.getId() == id) {
                return room;
            }
        }
        throw new NotfoundException("Room with ID " + id + " not found.");
    }

    @Override
    public List<room> listall() {
        return this.rooms;
    }

    @Override
    public void update(room data) throws NotfoundException {
        int index = -1;
        for (int i = 0; i < this.rooms.size(); i++) {
            if (this.rooms.get(i).getId() == data.getId()) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            throw new NotfoundException("Room with ID " + data.getId() + " not found.");
        }
        this.rooms.set(index, data);
    }

    @Override
    public void delete(room data) throws NotfoundException {
        int index = -1;
        for (int i = 0; i < this.rooms.size(); i++) {
            if (this.rooms.get(i).getId() == data.getId()) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            throw new NotfoundException("Room with ID " + data.getId() + " not found.");
        }
        this.rooms.remove(index);
    }
}

    
    
    