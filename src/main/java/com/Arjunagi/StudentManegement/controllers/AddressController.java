package com.Arjunagi.StudentManegement.controllers;

import com.Arjunagi.StudentManegement.Models.Address;
import com.Arjunagi.StudentManegement.services.AddressServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("student/management")
public class AddressController {
    @Autowired
    AddressServices addressServices;

    @PostMapping("/address")
    public String addAddress(@RequestBody Address address){
        addressServices.addAddress(address);
        return "added sucessfully";
    }

    @PutMapping("/address/{id}/landmark")
    public String updateLandmarkInAddress(@PathVariable Integer id, @RequestParam String landMark){
        addressServices.updateLandMark(id,landMark);
        return "updates sucessfully";
    }

    @GetMapping("/addresses")
    public List<Address> getAllAddress(){
        return addressServices.getAllAddress();
    }

    @DeleteMapping("/address/id/{id}")
    public String deleteAddressById(@PathVariable Integer id){
        addressServices.deleteAddressById(id);
        return "Deleted sucessfully";
    }
}
