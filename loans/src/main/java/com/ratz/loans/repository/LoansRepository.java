package com.ratz.loans.repository;

import com.ratz.loans.entity.Loans;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoansRepository extends CrudRepository<Loans, Long> {

	List<Loans> findByCustomerIdOrderByStartDtDesc(int customerId); // find by customer id and order by startDt (Loans entity property) Descending order

}
