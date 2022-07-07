package escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import escola.dominio.aluno.Email;

class EmailTest {

	@Test
	void naoDeveriaCriarEmailsComEnderecoInvalidos() {
		assertThrows(IllegalArgumentException.class, () -> new Email(null));

		assertThrows(IllegalArgumentException.class, () -> new Email(""));

		assertThrows(IllegalArgumentException.class, () -> new Email("Invalido"));
	}

}
