package com.fastcode.sampleapplication14.application.core.authorization.users;

import org.springframework.data.domain.Pageable;
import com.fastcode.sampleapplication14.domain.core.authorization.users.Users;
import com.fastcode.sampleapplication14.domain.core.authorization.userspreference.Userspreference;
import com.fastcode.sampleapplication14.application.core.authorization.users.dto.*;
import com.fastcode.sampleapplication14.commons.search.SearchCriteria;

import java.util.*;

public interface IUsersAppService {
	
	//CRUD Operations
	
	CreateUsersOutput create(CreateUsersInput users);

    void delete(Long id);

    UpdateUsersOutput update(Long id, UpdateUsersInput input);

    FindUsersByIdOutput findById(Long id);

    List<FindUsersByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;
    
   	Userspreference createDefaultUsersPreference(Users users);
   	
   	void updateTheme(Users users, String theme);
   	
   	void updateLanguage(Users users, String language);
    
    void updateUsersData(FindUsersWithAllFieldsByIdOutput users);
	
	UsersProfile updateUsersProfile(FindUsersWithAllFieldsByIdOutput users, UsersProfile usersProfile);
	
	FindUsersWithAllFieldsByIdOutput findWithAllFieldsById(Long usersId);
	
	UsersProfile getProfile(FindUsersByIdOutput user);
	 
	Users getUsers();
	
	FindUsersByUsernameOutput findByUsername(String username);
	
	FindUsersByUsernameOutput findByEmailaddress(String emailAddress);
    
    //Join Column Parsers

	Map<String,String> parseTimesheetsJoinColumn(String keysString);

	Map<String,String> parseUserspermissionsJoinColumn(String keysString);

	Map<String,String> parseUsersrolesJoinColumn(String keysString);

	Map<String,String> parseUsertasksJoinColumn(String keysString);
}

