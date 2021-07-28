package com.fastcode.sampleapplication14.application.extended.timesheetdetails;

import org.springframework.stereotype.Service;
import com.fastcode.sampleapplication14.application.core.timesheetdetails.TimesheetdetailsAppService;

import com.fastcode.sampleapplication14.domain.extended.timesheetdetails.ITimesheetdetailsRepositoryExtended;
import com.fastcode.sampleapplication14.domain.extended.task.ITaskRepositoryExtended;
import com.fastcode.sampleapplication14.domain.extended.timeofftype.ITimeofftypeRepositoryExtended;
import com.fastcode.sampleapplication14.domain.extended.timesheet.ITimesheetRepositoryExtended;
import com.fastcode.sampleapplication14.commons.logging.LoggingHelper;

@Service("timesheetdetailsAppServiceExtended")
public class TimesheetdetailsAppServiceExtended extends TimesheetdetailsAppService implements ITimesheetdetailsAppServiceExtended {

	public TimesheetdetailsAppServiceExtended(ITimesheetdetailsRepositoryExtended timesheetdetailsRepositoryExtended,
				ITaskRepositoryExtended taskRepositoryExtended,ITimeofftypeRepositoryExtended timeofftypeRepositoryExtended,ITimesheetRepositoryExtended timesheetRepositoryExtended,ITimesheetdetailsMapperExtended mapper,LoggingHelper logHelper) {

		super(timesheetdetailsRepositoryExtended,
		taskRepositoryExtended,timeofftypeRepositoryExtended,timesheetRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

