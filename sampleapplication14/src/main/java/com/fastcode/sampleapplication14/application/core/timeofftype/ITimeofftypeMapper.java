package com.fastcode.sampleapplication14.application.core.timeofftype;

import org.mapstruct.Mapper;
import com.fastcode.sampleapplication14.application.core.timeofftype.dto.*;
import com.fastcode.sampleapplication14.domain.core.timeofftype.Timeofftype;
import java.time.*;

@Mapper(componentModel = "spring")
public interface ITimeofftypeMapper {

   Timeofftype createTimeofftypeInputToTimeofftype(CreateTimeofftypeInput timeofftypeDto);
   CreateTimeofftypeOutput timeofftypeToCreateTimeofftypeOutput(Timeofftype entity);
   
    Timeofftype updateTimeofftypeInputToTimeofftype(UpdateTimeofftypeInput timeofftypeDto);
    
   	UpdateTimeofftypeOutput timeofftypeToUpdateTimeofftypeOutput(Timeofftype entity);

   	FindTimeofftypeByIdOutput timeofftypeToFindTimeofftypeByIdOutput(Timeofftype entity);


}

