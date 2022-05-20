package com.itse1907.bimatrauan.repository;

import com.itse1907.bimatrauan.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoursesRepository extends JpaRepository<Courses, Long> {
    List<Courses> findByStudentIdOrderByIdDesc(String studentId);

    List<Courses> findByStudentIdAndCourseName(String studentId, String courseName);
}
