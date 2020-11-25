package com.yearup.socialapp.repositories;

import com.yearup.socialapp.models.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {


}
