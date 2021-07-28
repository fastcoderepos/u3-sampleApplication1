package com.fastcode.sampleapplication14.application.core.timesheetstatus;

import org.mapstruct.Mapper;
import com.fastcode.sampleapplication14.application.core.timesheetstatus.dto.*;
import com.fastcode.sampleapplication14.domain.core.timesheetstatus.Timesheetstatus;
import java.time.*;

@Mapper(componentModel = "spring")
public interface ITimesheetstatusMapper {

   Timesheetstatus createTimesheetstatusInputToTimesheetstatus(CreateTimesheetstatusInput timesheetstatusDto);
   CreateTimesheetstatusOutput timesheetstatusToCreateTimesheetstatusOutput(Timesheetstatus entity);
   
    Timesheetstatus updateTimesheetstatusInputToTimesheetstatus(UpdateTimesheetstatusInput timesheetstatusDto);
    
   	UpdateTimesheetstatusOutput timesheetstatusToUpdateTimesheetstatusOutput(Timesheetstatus entity);

   	FindTimesheetstatusByIdOutput timesheetstatusToFindTimesheetstatusByIdOutput(Timesheetstatus entity);


}

