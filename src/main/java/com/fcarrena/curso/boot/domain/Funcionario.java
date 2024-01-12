package com.fcarrena.curso.boot.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name= "funcionarios")
public class Funcionario extends AbstractEntity<Long> {
@Column(nullable = false, unique = true)
private String nome;
@Column(nullable = false, columnDefinition = "DECIMAL(7,2) DEFAULT 0.00")
private BigDecimal salario;

@Column(name="data_entrada", nullable = false, columnDefinition = "DATE")
private LocalDate dataEntrada;

@Column(name="data_saida", columnDefinition = "Date")
private LocalDate dataSaida;
@OneToOne
@JoinColumn(name= "endereco_id_fk")
private Endereco  endereco;
@ManyToOne
@JoinColumn(name="cargo_id_fk")
private Cargo cargo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSallario() {
        return salario;
    }

    public void setSallario(BigDecimal sallario) {
        this.salario = sallario;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
