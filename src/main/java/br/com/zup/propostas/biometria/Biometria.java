package br.com.zup.propostas.biometria;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.zup.propostas.cartao.Cartao;

@Entity
public class Biometria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@ManyToOne
	private Cartao cartao;
	
	@NotBlank
	private String biometria;
	
	@Deprecated
	public Biometria() {
	}

	public Biometria(@NotNull Cartao cartao, @NotBlank String biometria) {
		this.cartao = cartao;
		this.biometria = biometria;
	}

	public Long getId() {
		return id;
	}

	public String getBiometria() {
		return biometria;
	}
	
}
