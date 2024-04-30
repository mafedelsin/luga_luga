package com.example.lugaluga.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.lugaluga.R;
import com.example.lugaluga.model.Produto;
import com.example.lugaluga.view.adapter.AdapterProduto;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private AdapterProduto adapterProduto;

    private List<Produto> produtoList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView.findViewById(R.id.Produtos);
    }

    public void CriarListaProdutos(){
        Produto produto =
                new Produto(
                        "IPhone 15",
                        200.00,
                        "Descrição",
                        10,
                        "Disponível"
                );
        produtoList.add(produto);

    }


}