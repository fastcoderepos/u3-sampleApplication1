package com.fastcode.sampleapplication14.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.sampleapplication14.restcontrollers.core.ProjectController;
import com.fastcode.sampleapplication14.application.extended.project.IProjectAppServiceExtended;
import com.fastcode.sampleapplication14.application.extended.customer.ICustomerAppServiceExtended;
import com.fastcode.sampleapplication14.application.extended.task.ITaskAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.sampleapplication14.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/project/extended")
public class ProjectControllerExtended extends ProjectController {

		public ProjectControllerExtended(IProjectAppServiceExtended projectAppServiceExtended, ICustomerAppServiceExtended customerAppServiceExtended, ITaskAppServiceExtended taskAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		projectAppServiceExtended,
    	customerAppServiceExtended,
    	taskAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

