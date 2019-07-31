package com.labtrackensino.lavanderia.models;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ITEMS")
@SequenceGenerator(name = "SEQ_ITEMS", allocationSize = 10, sequenceName = "SEQ_ITEMS")
public class Item implements Entidade {

	@Id
	@Column(name = "ID_ITEM")
	@GeneratedValue(generator = "SEQ_ITEMS", strategy = GenerationType.SEQUENCE)
	private Long id;

	@Lob
	@Column(name = "DESCRICAO")
	private String descricao;

	@Column(name = "VL_PRECO", precision = 15, scale = 5)
	private BigDecimal valor;

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
}
