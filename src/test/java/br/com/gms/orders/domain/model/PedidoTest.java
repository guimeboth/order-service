package br.com.gms.orders.domain.model;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PedidoTest {

    @Test
    @DisplayName("Pedido não pode ter valor negativo")
    void pedidoNaoPodeTerValorNegativo() {

        var pedido = new Pedido();
        var valorTotal = new BigDecimal("-10.00");
        assertThrows(IllegalArgumentException.class, () -> pedido.setValorTotal(valorTotal));

    }

    @Test
    @DisplayName("Pedido precisa ter ao menos 1 item")
    void pedidoPrecisaTerAoMenos1Item() {
        var pedido = new Pedido();
        var itens = new ArrayList<ItemPedido>();
        assertThrows(IllegalArgumentException.class, () -> pedido.setItens(itens));
    }

}
