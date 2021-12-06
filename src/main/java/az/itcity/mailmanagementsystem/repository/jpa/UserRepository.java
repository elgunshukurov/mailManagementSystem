package az.itcity.mailmanagementsystem.repository.jpa;

import az.itcity.mailmanagementsystem.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    @Override
    Iterable<User> findAll();
}
