package com.dev2.maridaoExpress.domain.dtos;

import com.dev2.maridaoExpress.domain.Tecnico;
import com.dev2.maridaoExpress.domain.enums.Perfil;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
public class TecnicoDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    protected Integer id;
    @NotBlank
    @NotNull(message = "O campo 'NOME' e obrigatorio")
    protected String nome;
    @NotBlank
    @NotNull(message = "O campo 'CPF' e obrigatorio")
    protected String cpf;
    @NotBlank
    @NotNull(message = "O campo 'EMAIL' e obrigatorio")
    protected String email;
    @NotBlank
    @NotNull(message = "O campo 'SENHA' e obrigatorio")
    protected String senha;
    protected Set<Integer> perfis = new HashSet<>();

    @JsonFormat(pattern = "dd/MM/yyy")
    protected LocalDate dataCriacao = LocalDate.now();

    public TecnicoDTO(Tecnico obj) {
        super();
        this.id = obj.getId();
        this.nome = obj.getNome();
        this.cpf = obj.getCpf();
        this.email = obj.getEmail();
        this.senha = obj.getSenha();
        this.perfis = obj.getPerfis().stream().map(Perfil::getCodigo).collect(Collectors.toSet());
        this.dataCriacao = obj.getDataCriacao();
    }

    public Set<Perfil> getPerfis() {
        return perfis.stream().map(Perfil::toEnum).collect(Collectors.toSet());
    }

    public void addPerfis(Perfil perfil) {
        this.perfis.add(perfil.getCodigo());
    }

}
