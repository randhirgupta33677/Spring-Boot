package com.stackroute.controller;

/*
Add appropriate annotation/s to create a bean for handling http requests for the rest api
 */

import com.stackroute.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



public class EmployeeController {
    /*
        Inject the service object here
    */
    @Autowired
    private EmployeeService employeeService;

    /*
    Create API endpoints as per the requirement given below
    */

    /*
     description  :  create new employee
     api endpoint : /api/employee
     http request : POST
     request body : employee details
     success response:
            body: created employee    - http status: 201
     failure response:
            If an employee exists with same employee id and joining date
            body: failure message   - http status: 409
     */


    /*
     description  : get an employee by employee id
     api endpoint : /api/employee/{id}
     http request : GET
     success response:
            body: Employee Details   - http status: 200
     failure response:
            If no employee exists for given criteria
            body: failure message - http status: 404
  */


    /*
     description  : get all employees by sector id
     api endpoint : /api/employee/sector/{sectorId}
     http request : GET
     success response:
            body: list of employees    - http status: 200
     failure response:
            if no employee exists for given criteria
            body: failure message   - http status: 404
  */


    /*
     description  : get all employees by branch Id and joining date
     api endpoint : /api/employee
     request query parameters: branch and date
                               ex: <...pathurl>?branch=xxx&date=yyyy-MM-dd
     http request : GET
     success response:
            body: list of employees    - http status: 200
     failure response:
            if no employees exists for given criteria
            body: failure message   - http status: 404
  */


    /*
     description  : update the department name for given employee id
     api endpoint : /api/employee
     http request : PUT
     request body : employee id and new department name
     success response:
            body: updated employee    - http status: 200
     failure response:
            If no employee exists for given criteria
            body: failure message - http status: 404
  */

}
