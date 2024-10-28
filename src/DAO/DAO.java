/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.List;

public interface DAO<T> {
    
    
    public abstract void save(T data); 
    public abstract T getById(T id);
    public abstract List<T> listall();
    public abstract void update(T data);
    public abstract void delete(T data);
  
}
