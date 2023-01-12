package com.example.jpa.service;

import com.example.jpa.entity.Address;

import java.util.List;

public interface AddressService {
    public List<Address>getAll();

    Address getById(Integer id);
}
