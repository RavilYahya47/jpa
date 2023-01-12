package com.example.jpa.service.impl;

import com.example.jpa.entity.Address;
import com.example.jpa.repo.AddressRepository;
import com.example.jpa.service.AddressService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    private final AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }


    @Override
    public List<Address> getAll() {
        return addressRepository.findAll();
    }

   public Address getById(Integer id){
        return addressRepository.findById(id).get();
   }
}
