package com.yearup.socialapp.repositories;

import com.yearup.socialapp.models.YearUpStudent;
import org.springframework.data.repository.CrudRepository;

public interface YearUpStudentRepository extends CrudRepository<YearUpStudent, String> {

    Iterable<YearUpStudent> findYearUpStudentByFNameAndLName(String fName, String lName);
}
