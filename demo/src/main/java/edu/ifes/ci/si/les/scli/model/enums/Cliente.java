package edu.ifes.ci.si.les.scli.model.enums;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import lombok.*;
import org.hibernate.annotations.Type;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = { "id" })
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String nome;

	private String cpf;

	private String email;

	private String senha;

	private String uf;

	private String cidade;

	private String bairro;

	private String rua;

}