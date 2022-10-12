package com.github.romankh3.deploymentexample;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("students")
@RequiredArgsConstructor
public class StudentController {

  private final StudentRepository studentRepository;

  @GetMapping
  public List<StudentEntity> findAll() {
    return studentRepository.findAll();
  }

  @GetMapping("/{id}")
  public StudentEntity findById(@PathVariable Long id) {
    return studentRepository.findById(id).orElse(null);
  }

  @PostMapping
  public StudentEntity save(@RequestBody StudentCreateDto createDto) {
    StudentEntity studentEntity = new StudentEntity();
    studentEntity.setName(createDto.getName());
    studentEntity.setEmail(createDto.getEmail());
    return studentRepository.save(studentEntity);
  }

  @DeleteMapping("/{id}")
  public void deleteById(@PathVariable Long id) {
    studentRepository.deleteById(id);
  }

  @PutMapping
  public StudentEntity update(@RequestBody StudentEntity studentEntity) {
    return studentRepository.save(studentEntity);
  }
}
