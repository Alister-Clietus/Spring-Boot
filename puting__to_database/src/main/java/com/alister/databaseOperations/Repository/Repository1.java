package com.alister.databaseOperations.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alister.databaseOperations.entity.NumberTable;

@Repository
public interface Repository1 extends JpaRepository<NumberTable, Integer>
{
	
}
