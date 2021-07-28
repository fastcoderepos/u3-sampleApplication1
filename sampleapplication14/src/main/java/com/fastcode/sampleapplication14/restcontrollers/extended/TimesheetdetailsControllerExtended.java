package com.fastcode.sampleapplication14.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.sampleapplication14.restcontrollers.core.TimesheetdetailsController;
import com.fastcode.sampleapplication14.application.extended.timesheetdetails.ITimesheetdetailsAppServiceExtended;
import com.fastcode.sampleapplication14.application.extended.task.ITaskAppServiceExtended;
import com.fastcode.sampleapplication14.application.extended.timeofftype.ITimeofftypeAppServiceExtended;
import com.fastcode.sampleapplication14.application.extended.timesheet.ITimesheetAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.sampleapplication14.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/timesheetdetails/extended")
public class TimesheetdetailsControllerExtended extends TimesheetdetailsController {

		public TimesheetdetailsControllerExtended(ITimesheetdetailsAppServiceExtended timesheetdetailsAppServiceExtended, ITaskAppServiceExtended taskAppServiceExtended, ITimeofftypeAppServiceExtended timeofftypeAppServiceExtended, ITimesheetAppServiceExtended timesheetAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		timesheetdetailsAppServiceExtended,
    	taskAppServiceExtended,
    	timeofftypeAppServiceExtended,
    	timesheetAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

