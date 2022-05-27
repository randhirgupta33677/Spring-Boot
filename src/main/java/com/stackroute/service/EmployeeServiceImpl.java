package com.stackroute.service;

import com.stackroute.errorhandler.EmployeeExistsException;
import com.stackroute.errorhandler.EmployeeNotFoundException;
import com.stackroute.model.Employee;
import com.stackroute.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

/*
Add appropriate annotation/s to create a bean for service layer
Implement all the functionality based on the EmployeeService Interface
*/


public class EmployeeServiceImpl implements EmployeeService{
    /*
      Inject the repository bean
     */

}