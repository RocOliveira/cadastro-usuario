package com.rodrigooliveira.cadastrodeusuario;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.rodrigo.cadastrodeusuario.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
//Declaração dos componentes visuais e do adaptor da lista

    RecyclerView recyclerView;

    UserAdapter userAdapter;

    Button btnCadastrar;

    //Atenção: Atributo estático (static) permite que os dados persitam na memoria
    //Enquanto o app estiver aberto e sejam acessados diretamente por outras telas (Activities)

    public static List<String> listaNomes = new ArrayList<>();

    //Metodo de inicialização da Activity (Ponto de entrada da tela)
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        //Vincula o arquivo de layout XML (activity_main.xml) a essa classe java
        setContentView(R.layout.activity_main);

        //Regar de negocios: insere um texto no topo da lista, caso ela etseja vazia
        if(listaNomes.isEmpty()){
            listaNomes.add("Nomes de cadastro");
        }

        //Mapeamento dos componentes do RecyclerView do XML para o objeto java
        recyclerView = findViewById(R.id.recycle_view);

        //Define o LayoutManager: organiza itens da lista numa coluna vertical simples


    }

}