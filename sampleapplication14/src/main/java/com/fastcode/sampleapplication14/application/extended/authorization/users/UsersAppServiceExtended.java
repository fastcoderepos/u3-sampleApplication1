package com.fastcode.sampleapplication14.application.extended.authorization.users;

import org.springframework.stereotype.Service;
import com.fastcode.sampleapplication14.application.core.authorization.users.UsersAppService;

import com.fastcode.sampleapplication14.domain.extended.authorization.users.IUsersRepositoryExtended;
import com.fastcode.sampleapplication14.domain.core.authorization.userspreference.IUserspreferenceRepository;
import com.fastcode.sampleapplication14.commons.logging.LoggingHelper;

@Service("usersAppServiceExtended")
public class UsersAppServiceExtended extends UsersAppService implements IUsersAppServiceExtended {

	public UsersAppServiceExtended(IUsersRepositoryExtended usersRepositoryExtended,
				IUserspreferenceRepository userspreferenceRepository,IUsersMapperExtended mapper,LoggingHelper logHelper) {

		super(usersRepositoryExtended,
		userspreferenceRepository,mapper,logHelper);

	}

 	//Add your custom code here
 
}

