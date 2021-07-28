package com.fastcode.sampleapplication14.application.extended.usertask;

import org.springframework.stereotype.Service;
import com.fastcode.sampleapplication14.application.core.usertask.UsertaskAppService;

import com.fastcode.sampleapplication14.domain.extended.usertask.IUsertaskRepositoryExtended;
import com.fastcode.sampleapplication14.domain.extended.task.ITaskRepositoryExtended;
import com.fastcode.sampleapplication14.domain.extended.authorization.users.IUsersRepositoryExtended;
import com.fastcode.sampleapplication14.commons.logging.LoggingHelper;

@Service("usertaskAppServiceExtended")
public class UsertaskAppServiceExtended extends UsertaskAppService implements IUsertaskAppServiceExtended {

	public UsertaskAppServiceExtended(IUsertaskRepositoryExtended usertaskRepositoryExtended,
				ITaskRepositoryExtended taskRepositoryExtended,IUsersRepositoryExtended usersRepositoryExtended,IUsertaskMapperExtended mapper,LoggingHelper logHelper) {

		super(usertaskRepositoryExtended,
		taskRepositoryExtended,usersRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

