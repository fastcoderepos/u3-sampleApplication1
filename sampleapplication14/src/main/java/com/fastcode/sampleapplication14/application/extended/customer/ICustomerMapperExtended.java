package com.fastcode.sampleapplication14.application.extended.customer;

import org.mapstruct.Mapper;
import com.fastcode.sampleapplication14.application.core.customer.ICustomerMapper;

@Mapper(componentModel = "spring")
public interface ICustomerMapperExtended extends ICustomerMapper {

}

