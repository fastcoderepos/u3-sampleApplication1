package com.fastcode.sampleapplication14.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.sampleapplication14.restcontrollers.core.UserspermissionController;
import com.fastcode.sampleapplication14.application.extended.authorization.userspermission.IUserspermissionAppServiceExtended;
import com.fastcode.sampleapplication14.application.extended.authorization.permission.IPermissionAppServiceExtended;
import com.fastcode.sampleapplication14.application.extended.authorization.users.IUsersAppServiceExtended;
import com.fastcode.sampleapplication14.security.JWTAppService;
import org.springframework.core.env.Environment;
import com.fastcode.sampleapplication14.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/userspermission/extended")
public class UserspermissionControllerExtended extends UserspermissionController {

		public UserspermissionControllerExtended(IUserspermissionAppServiceExtended userspermissionAppServiceExtended, IPermissionAppServiceExtended permissionAppServiceExtended, IUsersAppServiceExtended usersAppServiceExtended,
	    JWTAppService jwtAppService, LoggingHelper helper, Environment env) {
		super(
		userspermissionAppServiceExtended,
    	permissionAppServiceExtended,
    	usersAppServiceExtended,
	    jwtAppService,
		helper, env);
	}

	//Add your custom code here

}

