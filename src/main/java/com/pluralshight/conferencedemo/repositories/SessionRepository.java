package com.pluralshight.conferencedemo.repositories;

import com.pluralshight.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
