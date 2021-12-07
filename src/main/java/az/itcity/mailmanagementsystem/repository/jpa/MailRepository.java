package az.itcity.mailmanagementsystem.repository.jpa;

import az.itcity.mailmanagementsystem.entity.Mail;
import az.itcity.mailmanagementsystem.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MailRepository extends CrudRepository<Mail, Long> {
//    @Override
    Optional<Mail> findByUser(Optional<User> user);
}
