package com.fastcode.sampleapplication14.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.sampleapplication14.restcontrollers.core.RolepermissionController;
import com.fastcode.sampleapplication14.application.extended.authorization.rolepermission.IRolepermissionAppServiceExtended;
import com.fastcode.sampleapplication14.application.extended.authorization.permission.IPermissionAppServiceExtended;
import com.fastcode.sampleapplication14.application.extended.authorization.role.IRoleAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.sampleapplication14.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/rolepermission/extended")
public class RolepermissionControllerExtended extends RolepermissionController {

		public RolepermissionControllerExtended(IRolepermissionAppServiceExtended rolepermissionAppServiceExtended, IPermissionAppServiceExtended permissionAppServiceExtended, IRoleAppServiceExtended roleAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		rolepermissionAppServiceExtended,
    	permissionAppServiceExtended,
    	roleAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

