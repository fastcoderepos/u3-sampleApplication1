package com.fastcode.sampleapplication14.application.extended.customer;

import org.springframework.stereotype.Service;
import com.fastcode.sampleapplication14.application.core.customer.CustomerAppService;

import com.fastcode.sampleapplication14.domain.extended.customer.ICustomerRepositoryExtended;
import com.fastcode.sampleapplication14.commons.logging.LoggingHelper;

@Service("customerAppServiceExtended")
public class CustomerAppServiceExtended extends CustomerAppService implements ICustomerAppServiceExtended {

	public CustomerAppServiceExtended(ICustomerRepositoryExtended customerRepositoryExtended,
				ICustomerMapperExtended mapper,LoggingHelper logHelper) {

		super(customerRepositoryExtended,
		mapper,logHelper);

	}

 	//Add your custom code here
 
}

