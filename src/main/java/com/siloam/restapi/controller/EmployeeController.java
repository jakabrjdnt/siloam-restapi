package com.siloam.restapi.controller;

import com.siloam.restapi.dto.EmployeeDto;
import com.siloam.restapi.dto.EmployeeRequestDto;
import com.siloam.restapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee-service")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public Page<EmployeeDto> findAllEmployee(EmployeeRequestDto requestDto, Pageable pageable){
        return employeeService.findAll(requestDto, pageable);
    }

}
