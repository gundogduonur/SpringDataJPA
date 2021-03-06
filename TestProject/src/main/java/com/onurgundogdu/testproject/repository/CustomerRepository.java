package com.onurgundogdu.testproject.repository;

import com.onurgundogdu.testproject.entity.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer,Long> {
    List<Customer> findByLastName(String lastName);
    Customer findById(long id);
    List<Customer> findTopByFirstNameIsStartingWith(String firstname);
    List<Customer> findByAgeEquals(Integer age);
    List<Customer> findByAgeGreaterThanEqual(Integer age);
    List<Customer> findByAgeBetween(Integer first,Integer second);
    List<Customer> findAllByAgeIsNotNull();

}
