package model.dao;

import Exceptions.DuplicateEntryException;
import Exceptions.NotfoundException;
import java.util.List;

public interface DAO<T> {
    
    
    public abstract void save(T data); 
    public abstract T getById(T id);
    public abstract List<T> listall();
    public abstract void update(T data);
    public abstract void delete(T data);
}
    
    
