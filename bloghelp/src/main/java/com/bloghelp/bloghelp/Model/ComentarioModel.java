package com.bloghelp.bloghelp.Model;

public class ComentarioModel {
    
    private String conteudo;
    private String autor;
    private PostModel post;

    public ComentarioModel(String conteudo, String autor, PostModel post){

        this.conteudo = conteudo;
        this.autor = autor;
        this.post = post;
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

    public PostModel getPost(){
        return post;
    }

    public void setPost(PostModel post){
        this.post = post;
    }
}
