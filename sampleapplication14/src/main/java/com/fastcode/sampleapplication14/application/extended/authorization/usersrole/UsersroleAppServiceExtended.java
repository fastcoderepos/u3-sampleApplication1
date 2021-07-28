package com.fastcode.sampleapplication14.application.extended.authorization.usersrole;

import org.springframework.stereotype.Service;
import com.fastcode.sampleapplication14.application.core.authorization.usersrole.UsersroleAppService;

import com.fastcode.sampleapplication14.domain.extended.authorization.usersrole.IUsersroleRepositoryExtended;
import com.fastcode.sampleapplication14.domain.extended.authorization.role.IRoleRepositoryExtended;
import com.fastcode.sampleapplication14.domain.extended.authorization.users.IUsersRepositoryExtended;
import com.fastcode.sampleapplication14.commons.logging.LoggingHelper;

@Service("usersroleAppServiceExtended")
public class UsersroleAppServiceExtended extends UsersroleAppService implements IUsersroleAppServiceExtended {

	public UsersroleAppServiceExtended(IUsersroleRepositoryExtended usersroleRepositoryExtended,
				IRoleRepositoryExtended roleRepositoryExtended,IUsersRepositoryExtended usersRepositoryExtended,IUsersroleMapperExtended mapper,LoggingHelper logHelper) {

		super(usersroleRepositoryExtended,
		roleRepositoryExtended,usersRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

