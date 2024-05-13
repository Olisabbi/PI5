package com.bloghelp.bloghelp.Controller;

import com.bloghelp.bloghelp.Model.PostModel;
import com.bloghelp.bloghelp.View.PostView;

public class PostController {
    
    private PostView view;

    public PostController(PostView view){
        this.view = view;
    }

    public void criarPost(String titulo, String conteudo, String autor){
        PostModel post = new PostModel(titulo, conteudo, autor);
        view.renderPost(post);
    }

    public void deletePost(int postId){

    }
}
