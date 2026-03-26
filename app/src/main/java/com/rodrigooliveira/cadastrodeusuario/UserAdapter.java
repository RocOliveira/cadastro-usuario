package com.rodrigooliveira.cadastrodeusuario;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

// Classe Adapter: Gerencia a criacao e o preenchimento dos itens na RecycleView
public class UserAdapter extends RecyclerView
        .Adapter<UserAdapter.ViewHolder> {
    // Atributo privado que armazena a referencia dos dados que serao exibidos
    private List<String> listaUsuarios;

    // Construtor que permite que a MainActivity "entregue" a lista de dados para este Adapter
    public UserAdapter(List<String> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    // Metodo 1: Cria "do zero" o visual de uma linha da lista (+ViewHolder)
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                         int viewType) {
        // LayoutInflater o arquivo XML em um objeto View Java
        // Aqui usamos um layout padrao do Android (simple_list_item_1) para facilitar
        View view = LayoutInflater.from(parent.getContext())
                .inflate(android.R.layout.simple_list_item_1,
                        parent, false);

        // Retornar uma nova instancia da nossa classe interna ViewHolder com a View Criada
        return new ViewHolder(view);
    }

    // Metodo 2: Vincular os dados de um objeto de lista a uma linha especifica da tela
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,
                                 int position) {
        // Recupera os dados da lista de acordo com a posicao que o Android esta desenhando agora
        String nome = listaUsuarios.get(position);

        // define o texto no componente visual que esta guardando dentro de "holder"
        holder.tvNome.setText(nome);
    }

    @Override
    // Metodo 3: Informa ao Android quantos itens a lista possui ao todo
    public int getItemCount() {
        // Se a lista existir, retorna o tamanho. Se nao, retorna zero
        return listaUsuarios != null ? listaUsuarios.size():0;
    }


    // Classe interna ViewHolder: Servir para "segurar" as referencias dos componentes de cada linha
    // Evitar chamadas respectivas ao findViewById, melhorando a performance do RecycleView
    public class ViewHolder extends RecyclerView.ViewHolder {
        // Referencia para o TextView da linha
        TextView tvNome;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // Faz o mapeamento do ID do layout para o projeto java
            // android.R.id.text1 e o ID padrao do layout simple_list_item_1
            tvNome = itemView.findViewById(android.R.id.text1);
        }
    }
}
