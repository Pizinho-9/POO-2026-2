package com.pizinho;

class Material{
    private int codigo;
    private String descricao;
    private Setor setor;
    private double precoUnitario;

    public Material(int codigo, String descricao, Setor setor, double precoUnitario) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.setor = setor;
        this.precoUnitario = precoUnitario;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Setor getSetor() {
        return setor;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    @Override
    public String toString() {
        return "Material [codigo=" + codigo + ", descricao=" + descricao + ", setor=" + setor + ", precoUnitario="
                + precoUnitario + "]";
    }


}
