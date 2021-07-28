package com.fastcode.sampleapplication14.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.sampleapplication14.restcontrollers.core.TaskController;
import com.fastcode.sampleapplication14.application.extended.task.ITaskAppServiceExtended;
import com.fastcode.sampleapplication14.application.extended.project.IProjectAppServiceExtended;
import com.fastcode.sampleapplication14.application.extended.timesheetdetails.ITimesheetdetailsAppServiceExtended;
import com.fastcode.sampleapplication14.application.extended.usertask.IUsertaskAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.sampleapplication14.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/task/extended")
public class TaskControllerExtended extends TaskController {

		public TaskControllerExtended(ITaskAppServiceExtended taskAppServiceExtended, IProjectAppServiceExtended projectAppServiceExtended, ITimesheetdetailsAppServiceExtended timesheetdetailsAppServiceExtended, IUsertaskAppServiceExtended usertaskAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		taskAppServiceExtended,
    	projectAppServiceExtended,
    	timesheetdetailsAppServiceExtended,
    	usertaskAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

