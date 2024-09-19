package modelo.dao;

import Exceptions.DuplicateEntryException;
import Exceptions.NotfoundException;
import java.util.List;

public interface DAO<T> {
    
    public abstract void save(T data) throws DuplicateEntryException;
    public abstract T getById(int id) throws NotfoundException;
    public abstract List<T> listall();
    public abstract void update(T data) throws NotfoundException;
    public abstract void delete(T data) throws NotfoundException;
}
    
    
