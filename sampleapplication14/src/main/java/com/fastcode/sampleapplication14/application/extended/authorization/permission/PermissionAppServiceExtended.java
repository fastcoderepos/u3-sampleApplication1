package com.fastcode.sampleapplication14.application.extended.authorization.permission;

import org.springframework.stereotype.Service;
import com.fastcode.sampleapplication14.application.core.authorization.permission.PermissionAppService;

import com.fastcode.sampleapplication14.domain.extended.authorization.permission.IPermissionRepositoryExtended;
import com.fastcode.sampleapplication14.commons.logging.LoggingHelper;

@Service("permissionAppServiceExtended")
public class PermissionAppServiceExtended extends PermissionAppService implements IPermissionAppServiceExtended {

	public PermissionAppServiceExtended(IPermissionRepositoryExtended permissionRepositoryExtended,
				IPermissionMapperExtended mapper,LoggingHelper logHelper) {

		super(permissionRepositoryExtended,
		mapper,logHelper);

	}

 	//Add your custom code here
 
}

