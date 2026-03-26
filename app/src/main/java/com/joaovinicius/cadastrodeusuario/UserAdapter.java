package com.joaovinicius.cadastrodeusuario;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class UserAdapter{
    //Classe Adapter: Gerencia a criação e preenchimento dos itens na RecycleView

    public class UserAdapter extends RecyclerView
    .Adapter<UserAdapter.ViewHolder>{
        //Atributo privado mprivado que armazena a referencia dos dadosque serão exibidos

        private List<String> listaUsuarios;

        //Construtor que permiteque a MainActivity "entregue" a lista de dados para este Adapter

        public UserAdapter(List<String> listaUsuarios){
            this.listaUsuarios = listaUsuarios;
        }

        //Metodo 1: Cria "do zero" o visual de uma linha da lista (+ViewHolder)
        @NonNull
        @Override
        public UserAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
           //LayoutInflater transformao arquivo XML em um objeto View Java
           //Aqui usamos um layoutpadrão do Android (simple_list_item_1) para facilitar
            View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);

        }
    }
}

public class UserAdapter {
}
