package com.example.jpa.controller;

import com.example.jpa.entity.Address;
import com.example.jpa.service.AddressService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }
    @GetMapping("/getAddress")
    public List<Address>getAll(){
        return addressService.getAll();
    }
    @GetMapping("/getAddressById/{id}")
    public Address getById(@PathVariable Integer id){
        return addressService.getById(id);
    }
}
