package com.fastcode.sampleapplication14.application.extended.authorization.rolepermission;

import org.springframework.stereotype.Service;
import com.fastcode.sampleapplication14.application.core.authorization.rolepermission.RolepermissionAppService;

import com.fastcode.sampleapplication14.domain.extended.authorization.rolepermission.IRolepermissionRepositoryExtended;
import com.fastcode.sampleapplication14.domain.extended.authorization.permission.IPermissionRepositoryExtended;
import com.fastcode.sampleapplication14.domain.extended.authorization.role.IRoleRepositoryExtended;
import com.fastcode.sampleapplication14.domain.extended.authorization.usersrole.IUsersroleRepositoryExtended;
import com.fastcode.sampleapplication14.security.JWTAppService;
import com.fastcode.sampleapplication14.commons.logging.LoggingHelper;

@Service("rolepermissionAppServiceExtended")
public class RolepermissionAppServiceExtended extends RolepermissionAppService implements IRolepermissionAppServiceExtended {

	public RolepermissionAppServiceExtended(JWTAppService jwtAppService,IUsersroleRepositoryExtended usersroleRepositoryExtended,IRolepermissionRepositoryExtended rolepermissionRepositoryExtended,
				IPermissionRepositoryExtended permissionRepositoryExtended,IRoleRepositoryExtended roleRepositoryExtended,IRolepermissionMapperExtended mapper,LoggingHelper logHelper) {

		super(jwtAppService, usersroleRepositoryExtended,rolepermissionRepositoryExtended,
		permissionRepositoryExtended,roleRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

