package com.bloghelp.bloghelp.Model;

public class PostModel {

    private String titulo;
    private String conteudo;
    private String autor;


    public PostModel(String titulo, String conteudo, String autor){
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.autor = autor;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getConteudo(){
        return conteudo;
    }

    public void setConteudo(String conteudo){
        this.conteudo = conteudo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }
    
}
