package com.pizinho;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Material> materiais = new ArrayList<>();
        materiais.add(new Material(1, "Caderno universitário 96fls", Setor.PAPELARIA, 18.90));
        materiais.add(new Material(2, "Caneta esferográfica azul", Setor.PAPELARIA, 2.50));
        materiais.add(new Material(3, "Lápis preto nº2", Setor.PAPELARIA, 1.20));
        materiais.add(new Material(4, "Borracha branca", Setor.PAPELARIA, 1.80));
        materiais.add(new Material(5, "Régua 30cm", Setor.DESENHO, 5.40));
        materiais.add(new Material(6, "Compasso escolar", Setor.DESENHO, 14.75));
        materiais.add(new Material(7, "Esquadro 45º", Setor.DESENHO, 8.30));
        materiais.add(new Material(8, "Transferidor 180º", Setor.DESENHO, 6.00));
        materiais.add(new Material(9, "Mochila escolar 30L", Setor.MOCHILAS, 89.90));
        materiais.add(new Material(10, "Mochila notebook 15.6\"", Setor.MOCHILAS, 129.90));
        materiais.add(new Material(11, "Papel sulfite A4 500fls", Setor.PAPELARIA, 27.50));
        materiais.add(new Material(12, "Marca-texto amarelo", Setor.PAPELARIA, 3.90));
        materiais.add(new Material(13, "Corretivo líquido", Setor.PAPELARIA, 4.20));
        materiais.add(new Material(14, "Tesoura escolar", Setor.PAPELARIA, 9.80));
        materiais.add(new Material(15, "Cola bastão 20g", Setor.PAPELARIA, 5.60));
        materiais.add(new Material(16, "Prancheta A4", Setor.DESENHO, 12.00));
        materiais.add(new Material(17, "Lapiseira 0.5mm", Setor.DESENHO, 11.50));
        materiais.add(new Material(18, "Carvão para desenho", Setor.DESENHO, 7.90));
        materiais.add(new Material(19, "Papel manteiga A3", Setor.DESENHO, 15.00));
        materiais.add(new Material(20, "Escalímetro 30cm", Setor.DESENHO, 22.40));
        materiais.add(new Material(21, "Mochila infantil 15L", Setor.MOCHILAS, 59.90));
        materiais.add(new Material(22, "Mochila esportiva 40L", Setor.MOCHILAS, 149.90));
        materiais.add(new Material(23, "Mochila viagem 60L", Setor.MOCHILAS, 199.90));
        materiais.add(new Material(24, "Clips metálico caixa 50un", Setor.PAPELARIA, 3.50));
        materiais.add(new Material(25, "Grampeador médio", Setor.PAPELARIA, 18.00));

        // Imprime a lista de produtos que a papelaria vende:
        System.out.println("Lista geral de produtos:");
        materiais.forEach(material -> System.out.println(material.toString()));
        long quantpapelaria = materiais.stream()
                .filter(m -> m.getSetor() == Setor.PAPELARIA).count();

        System.out.println(quantpapelaria);

        List<Material> lisMochila = materiais.stream()
                .filter(m -> m.getSetor() == Setor.MOCHILAS)
                .filter(m -> m.getPrecoUnitario() < 100).toList();

        System.out.println(lisMochila.toString());

    }

}
