package com.fastcode.sampleapplication14.application.core.timeofftype;

import org.springframework.data.domain.Pageable;
import com.fastcode.sampleapplication14.application.core.timeofftype.dto.*;
import com.fastcode.sampleapplication14.commons.search.SearchCriteria;

import java.util.*;

public interface ITimeofftypeAppService {
	
	//CRUD Operations
	
	CreateTimeofftypeOutput create(CreateTimeofftypeInput timeofftype);

    void delete(Long id);

    UpdateTimeofftypeOutput update(Long id, UpdateTimeofftypeInput input);

    FindTimeofftypeByIdOutput findById(Long id);

    List<FindTimeofftypeByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;
    
    //Join Column Parsers

	Map<String,String> parseTimesheetdetailsJoinColumn(String keysString);
}

