package com.fastcode.sampleapplication14.application.extended.timesheetstatus;

import org.springframework.stereotype.Service;
import com.fastcode.sampleapplication14.application.core.timesheetstatus.TimesheetstatusAppService;

import com.fastcode.sampleapplication14.domain.extended.timesheetstatus.ITimesheetstatusRepositoryExtended;
import com.fastcode.sampleapplication14.commons.logging.LoggingHelper;

@Service("timesheetstatusAppServiceExtended")
public class TimesheetstatusAppServiceExtended extends TimesheetstatusAppService implements ITimesheetstatusAppServiceExtended {

	public TimesheetstatusAppServiceExtended(ITimesheetstatusRepositoryExtended timesheetstatusRepositoryExtended,
				ITimesheetstatusMapperExtended mapper,LoggingHelper logHelper) {

		super(timesheetstatusRepositoryExtended,
		mapper,logHelper);

	}

 	//Add your custom code here
 
}

