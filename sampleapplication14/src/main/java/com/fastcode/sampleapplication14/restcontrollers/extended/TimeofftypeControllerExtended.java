package com.fastcode.sampleapplication14.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.sampleapplication14.restcontrollers.core.TimeofftypeController;
import com.fastcode.sampleapplication14.application.extended.timeofftype.ITimeofftypeAppServiceExtended;
import com.fastcode.sampleapplication14.application.extended.timesheetdetails.ITimesheetdetailsAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.sampleapplication14.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/timeofftype/extended")
public class TimeofftypeControllerExtended extends TimeofftypeController {

		public TimeofftypeControllerExtended(ITimeofftypeAppServiceExtended timeofftypeAppServiceExtended, ITimesheetdetailsAppServiceExtended timesheetdetailsAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		timeofftypeAppServiceExtended,
    	timesheetdetailsAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

