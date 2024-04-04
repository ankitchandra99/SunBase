package com.example.SunBaseAssignment.service;

import com.example.SunBaseAssignment.Dto.Request.CustomerRequestDto;
import com.example.SunBaseAssignment.Dto.Response.CustomerResponseDto;
import org.springframework.data.domain.Page;

import java.util.List;

public interface customerService {

    CustomerResponseDto createCustomer(CustomerRequestDto customerRequestDto , boolean SyncDb);

    CustomerResponseDto udapteCustomer(String email , CustomerRequestDto customerRequestDto);


    String deleteCustomer(String email);

    CustomerResponseDto getCustomerWithId(String email);

    List<CustomerResponseDto> searchBySpecificType(String searchBy, String searchQuery);

    Page<CustomerResponseDto> getAllCustomers(int pageNo, int rowsCount, String sortBy, String searchBy);
}
