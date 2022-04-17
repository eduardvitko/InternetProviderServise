package com.dao;

import java.util.List;

public interface Dao<T>{
    public T create(T item); //save//signup //registration
    public T findByField(String value);
    public T update(T item);
    public boolean delete(int id);
    public List<T> getAllUsers();

}
