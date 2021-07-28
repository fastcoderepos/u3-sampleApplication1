package com.fastcode.sampleapplication14.application.extended.timeofftype;

import org.springframework.stereotype.Service;
import com.fastcode.sampleapplication14.application.core.timeofftype.TimeofftypeAppService;

import com.fastcode.sampleapplication14.domain.extended.timeofftype.ITimeofftypeRepositoryExtended;
import com.fastcode.sampleapplication14.commons.logging.LoggingHelper;

@Service("timeofftypeAppServiceExtended")
public class TimeofftypeAppServiceExtended extends TimeofftypeAppService implements ITimeofftypeAppServiceExtended {

	public TimeofftypeAppServiceExtended(ITimeofftypeRepositoryExtended timeofftypeRepositoryExtended,
				ITimeofftypeMapperExtended mapper,LoggingHelper logHelper) {

		super(timeofftypeRepositoryExtended,
		mapper,logHelper);

	}

 	//Add your custom code here
 
}

