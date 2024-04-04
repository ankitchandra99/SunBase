package com.example.SunBaseAssignment.repository;

import com.example.SunBaseAssignment.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    public  Customer findByEmail(String email);

    public void deleteByEmail(String email);

    List<Customer> findByFirstNameLike(String searchQuery);

    List<Customer> findByCityLike(String searchQuery);

    List<Customer> findByPhoneLike(String searchQuery);

    List<Customer> findByEmailLike(String searchQuery);
}
