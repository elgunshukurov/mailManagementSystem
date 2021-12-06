package az.itcity.mailmanagementsystem.repository.jpa;

import az.itcity.mailmanagementsystem.entity.Mail;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MailRepository extends CrudRepository<Mail, Long> {
    @Override
    Optional<Mail> findById(Long aLong);
}
