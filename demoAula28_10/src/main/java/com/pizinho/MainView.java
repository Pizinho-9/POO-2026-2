package com.pizinho;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;


@Route("")
public class MainView extends VerticalLayout {
    private Grid<Livro> gridLivros;


    public MainView() {
        gridLivros = new Grid<>();
        gridLivros.addColumn(livro->livro.titulo()).setHeader("Titulo").setAutoWidth(true).setSortable(true);
        gridLivros.addColumn(livro->livro.autor()).setHeader("Autor").setAutoWidth(true).setSortable(true);
        gridLivros.setItems(Biblioteca.getInstance().livros());
        gridLivros.setWidth("600px");

        setSizeFull();
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);

        H1 titulo = new H1("demoAula28_10");



        add(titulo);
        add(gridLivros);
    }
}
