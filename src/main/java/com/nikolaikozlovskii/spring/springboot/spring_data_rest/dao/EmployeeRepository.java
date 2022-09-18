package com.nikolaikozlovskii.spring.springboot.spring_data_rest.dao;



import com.nikolaikozlovskii.spring.springboot.spring_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
  //Можем добавить недостающие методы(имена задавать по подсказке IDE
//    public List<Employee> findAllByName(String name);
    //employees
}
