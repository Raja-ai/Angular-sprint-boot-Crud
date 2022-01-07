package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeCustomRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

public class EmployeeCustomRepositoryImpl implements EmployeeCustomRepository {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> searchByFirstnameOrLastnameOrEmail(String search) {
        return null;
    }
}