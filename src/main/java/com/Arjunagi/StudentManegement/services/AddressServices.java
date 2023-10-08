package com.Arjunagi.StudentManegement.services;

import com.Arjunagi.StudentManegement.Models.Address;
import com.Arjunagi.StudentManegement.repositories.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServices {
    @Autowired
    IAddressRepo addressRepo;

    public void addAddress(Address address) {
        addressRepo.save(address);
    }

    public void updateLandMark(Integer id, String landMark) {
        Address address=addressRepo.findById(id).orElseThrow();
        address.setLandmark(landMark);
        addressRepo.save(address);
    }

    public List<Address> getAllAddress() {
        return addressRepo.findAll();
    }

    public void deleteAddressById(Integer id) {
        addressRepo.deleteById(id);
    }
}
