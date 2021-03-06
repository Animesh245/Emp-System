package com.example.empsystem.service;

import com.example.empsystem.entity.Employee;
import com.example.empsystem.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {

    @Autowired
    private EmpRepository repo;

    public void addEmp(Employee e){
        repo.save(e);
    }

    public List<Employee> getAllEmp(){
        return repo.findAll();
    }

    public  Employee getEmpById(int id){
        Optional<Employee> employee= repo.findById(id);
        if(employee.isPresent()){
            return  employee.get();
        }
        return  null;
    }

    public  void deleteEmp(int id){
        repo.deleteById(id);
    }
}
