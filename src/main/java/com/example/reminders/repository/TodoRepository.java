package com.example.reminders.repository;

import com.example.reminders.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Date;
import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

    List<Todo> findAllByFlagged(Boolean flag);

    long countByDate(Date date);
    long countByFlagged(Boolean flag);

}

