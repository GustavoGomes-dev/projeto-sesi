package com.sesi.projeto.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_status")
public enum StatusDoPedido {
	
	Aguardando_Pagamento,
	Pago,
	Enviado,
	Entregue,
	Cancelado

}
