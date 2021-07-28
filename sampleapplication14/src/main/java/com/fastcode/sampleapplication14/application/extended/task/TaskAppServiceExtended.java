package com.fastcode.sampleapplication14.application.extended.task;

import org.springframework.stereotype.Service;
import com.fastcode.sampleapplication14.application.core.task.TaskAppService;

import com.fastcode.sampleapplication14.domain.extended.task.ITaskRepositoryExtended;
import com.fastcode.sampleapplication14.domain.extended.project.IProjectRepositoryExtended;
import com.fastcode.sampleapplication14.commons.logging.LoggingHelper;

@Service("taskAppServiceExtended")
public class TaskAppServiceExtended extends TaskAppService implements ITaskAppServiceExtended {

	public TaskAppServiceExtended(ITaskRepositoryExtended taskRepositoryExtended,
				IProjectRepositoryExtended projectRepositoryExtended,ITaskMapperExtended mapper,LoggingHelper logHelper) {

		super(taskRepositoryExtended,
		projectRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

