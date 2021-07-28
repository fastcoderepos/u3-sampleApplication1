package com.fastcode.sampleapplication14.domain.core.usertask;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.time.*;
@Repository("usertaskRepository")
public interface IUsertaskRepository extends JpaRepository<Usertask, UsertaskId>,QuerydslPredicateExecutor<Usertask> {

}

