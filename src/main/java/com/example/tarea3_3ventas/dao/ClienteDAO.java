package com.example.tarea3_3ventas.dao;

import com.example.tarea3_3ventas.domain.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteDAO {
    public void create(Cliente cliente);

    public List<Cliente> getAll();
    public Optional<Cliente> find(int id);

    public void update(Cliente cliente);

    public void delete(long id);
}
