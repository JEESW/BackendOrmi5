package com.example.fashionlog.repository;

import com.example.fashionlog.domain.DailyLookComment;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DailyLookCommentRepository extends JpaRepository<DailyLookComment, Long> {

    List<DailyLookComment> findAllByDailyLookId(Long id);
}