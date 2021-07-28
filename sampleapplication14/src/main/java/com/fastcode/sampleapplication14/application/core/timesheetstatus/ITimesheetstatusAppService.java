package com.fastcode.sampleapplication14.application.core.timesheetstatus;

import org.springframework.data.domain.Pageable;
import com.fastcode.sampleapplication14.application.core.timesheetstatus.dto.*;
import com.fastcode.sampleapplication14.commons.search.SearchCriteria;

import java.util.*;

public interface ITimesheetstatusAppService {
	
	//CRUD Operations
	
	CreateTimesheetstatusOutput create(CreateTimesheetstatusInput timesheetstatus);

    void delete(Long id);

    UpdateTimesheetstatusOutput update(Long id, UpdateTimesheetstatusInput input);

    FindTimesheetstatusByIdOutput findById(Long id);

    List<FindTimesheetstatusByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;
    
    //Join Column Parsers

	Map<String,String> parseTimesheetsJoinColumn(String keysString);
}

