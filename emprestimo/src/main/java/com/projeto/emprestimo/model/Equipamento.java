package com.projeto.emprestimo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;

@Entity
public class Equipamento {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


@NotBlank(message = "O patrimônio é obrigatório")
@Column(nullable = false, unique = true)
private String patrimonio;


@NotBlank(message = "O nome é obrigatório")
@Column(nullable = false)
private String nome;

@Enumerated(EnumType.STRING)
@Column(nullable = false)
private TipoEquipamento tipo;

@Column(nullable = false)
private boolean disponivel = true;

public Equipamento() { }
// getters e setters no próximo slide

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getPatrimonio() {
    return patrimonio;
}

public void setPatrimonio(String patrimonio) {
    this.patrimonio = patrimonio;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public TipoEquipamento getTipo() {
    return tipo;
}

public void setTipo(TipoEquipamento tipo) {
    this.tipo = tipo;
}

public boolean isDisponivel() {
    return disponivel;
}

public void setDisponivel(boolean disponivel) {
    this.disponivel = disponivel;
}
}