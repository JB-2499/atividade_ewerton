package feb.carnaiba.atividade.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name="aluno")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;

    @NotNull
    @Size(min=1, max=100)
    private String nome;

    @NotNull
    @Size(min=10, max=20)
    private String senha;

    @Email
    private String email;
}