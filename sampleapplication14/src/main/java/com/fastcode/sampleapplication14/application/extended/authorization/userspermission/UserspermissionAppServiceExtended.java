package com.fastcode.sampleapplication14.application.extended.authorization.userspermission;

import org.springframework.stereotype.Service;
import com.fastcode.sampleapplication14.application.core.authorization.userspermission.UserspermissionAppService;

import com.fastcode.sampleapplication14.domain.extended.authorization.userspermission.IUserspermissionRepositoryExtended;
import com.fastcode.sampleapplication14.domain.extended.authorization.permission.IPermissionRepositoryExtended;
import com.fastcode.sampleapplication14.domain.extended.authorization.users.IUsersRepositoryExtended;
import com.fastcode.sampleapplication14.commons.logging.LoggingHelper;

@Service("userspermissionAppServiceExtended")
public class UserspermissionAppServiceExtended extends UserspermissionAppService implements IUserspermissionAppServiceExtended {

	public UserspermissionAppServiceExtended(IUserspermissionRepositoryExtended userspermissionRepositoryExtended,
				IPermissionRepositoryExtended permissionRepositoryExtended,IUsersRepositoryExtended usersRepositoryExtended,IUserspermissionMapperExtended mapper,LoggingHelper logHelper) {

		super(userspermissionRepositoryExtended,
		permissionRepositoryExtended,usersRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

