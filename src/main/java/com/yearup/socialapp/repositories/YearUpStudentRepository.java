package com.yearup.socialapp.repositories;

import com.yearup.socialapp.models.YearUpStudent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface YearUpStudentRepository extends CrudRepository<YearUpStudent, String> {

    Optional<YearUpStudent> findYearUpStudentByFirstName(String firstName);

    Optional<YearUpStudent> findYearUpStudentByLastName(String lastName);
}
