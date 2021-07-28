package com.fastcode.sampleapplication14.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.sampleapplication14.restcontrollers.core.UsersroleController;
import com.fastcode.sampleapplication14.application.extended.authorization.usersrole.IUsersroleAppServiceExtended;
import com.fastcode.sampleapplication14.application.extended.authorization.role.IRoleAppServiceExtended;
import com.fastcode.sampleapplication14.application.extended.authorization.users.IUsersAppServiceExtended;
import com.fastcode.sampleapplication14.security.JWTAppService;
import org.springframework.core.env.Environment;
import com.fastcode.sampleapplication14.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/usersrole/extended")
public class UsersroleControllerExtended extends UsersroleController {

		public UsersroleControllerExtended(IUsersroleAppServiceExtended usersroleAppServiceExtended, IRoleAppServiceExtended roleAppServiceExtended, IUsersAppServiceExtended usersAppServiceExtended,
	    JWTAppService jwtAppService, LoggingHelper helper, Environment env) {
		super(
		usersroleAppServiceExtended,
    	roleAppServiceExtended,
    	usersAppServiceExtended,
	    jwtAppService,
		helper, env);
	}

	//Add your custom code here

}

