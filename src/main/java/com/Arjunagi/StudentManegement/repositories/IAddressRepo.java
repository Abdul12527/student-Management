package com.Arjunagi.StudentManegement.repositories;

import com.Arjunagi.StudentManegement.Models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address,Integer> {
}
