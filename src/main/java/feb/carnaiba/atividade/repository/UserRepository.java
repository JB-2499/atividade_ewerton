package feb.carnaiba.atividade.repository;

import feb.carnaiba.atividade.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}