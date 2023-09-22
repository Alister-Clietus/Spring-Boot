package com.alister.bankaccount.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.alister.bankaccount.entity.TransactionPrimaryKeysEntity;
import com.alister.bankaccount.entity.TransactionTable;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionTable,TransactionPrimaryKeysEntity>
{
    @Query(value = "SELECT MAX(a.no_of_columns) FROM TransactionTable a")
    Long findMxNoOfColumns();
    @Query("SELECT DISTINCT accountName FROM TransactionTable")
    String findDistinctAccoutName();
    List<TransactionTable> findByStatus(String status);
}
