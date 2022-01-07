package net.javaguides.springboot.repository.specification;

import net.javaguides.springboot.model.Employee;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
public class EmployeeSpecification {

    public static Specification<Employee> search(String searchWord){
        return Specification.where(containsFirstname(searchWord))
                .or(containsLastName(searchWord))
                .or(containsEmail(searchWord));
    }
    public static Specification<Employee> containsFirstname(String firstname){
        return ((root, criteriaQuery, criteriaBuilder) -> {
            return criteriaBuilder.like(root.get("firstName"),"%"+ firstname + "%");
        });
    }
    public static Specification<Employee> containsLastName(String lastname){
        return ((root, criteriaQuery, criteriaBuilder) -> {
            return criteriaBuilder.like(root.get("lastName"),"%"+ lastname + "%");
        });
    }

    public static Specification<Employee> containsEmail(String email){
        return ((root, criteriaQuery, criteriaBuilder) -> {
            return criteriaBuilder.like(root.get("emailId"),"%"+ email + "%");
        });
    }
}