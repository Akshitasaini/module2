package comm.example.Dto;

import org.mapstruct.Mapper;

import comm.example.model.Customer;


@Mapper
public interface CustomerDtoImpl {
	public Customer customerDtoToCustomer(CustomerDto dto);
	public CustomerDto customertoCustomerDto(Customer customer);
}
