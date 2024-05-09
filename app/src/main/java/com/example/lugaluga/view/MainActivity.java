package com.example.lugaluga.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.example.lugaluga.R;
import com.example.lugaluga.RecyclerItemClickListener;
import com.example.lugaluga.model.Produto;
import com.example.lugaluga.view.adapter.AdapterProduto;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private AdapterProduto adapterProduto;

    private List<Produto> produtoList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar =(Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        recyclerView = findViewById(R.id.Produtos);

        CriarListaProdutos();

        adapterProduto = new AdapterProduto(produtoList);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapterProduto);


        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recyclerView,
                        new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent = new Intent(MainActivity.this, ProdutoActivity.class);
                intent.putExtra("produto", produtoList.get(position));
                startActivity(intent);
            }

            @Override
            public void onLongItemClick(View view, int position) {
                Toast.makeText(getApplicationContext(),produtoList.get(position).getStatus(),Toast.LENGTH_SHORT).show();

            }

            @Override

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        }));

    }

    public void CriarListaProdutos(){
        Produto produto;
        produto = new Produto(
                        "IPhone 15",
                        8000.00,
                        "Descrição",
                        10,
                        "Disponível"
                );
        produtoList.add(produto);


        produto = new Produto(
                        "Fone",
                        50.00,
                        "Bluetooth",
                        105,
                        "Disponível"
                );
        produtoList.add(produto);

        produto = new Produto(
                        "IPhone 11",
                        2000.00,
                        "Descrição",
                        41,
                        "Disponível"
                );
        produtoList.add(produto);

        produto = new Produto(
                        "Ar condicionado",
                        1500.00,
                        "Descrição",
                        20,
                        "Disponível"
                );
        produtoList.add(produto);

        produto = new Produto(
                        "IPhone 12",
                        3000.00,
                        "Descrição",
                        60,
                        "Disponível"
                );
        produtoList.add(produto);

        produto = new Produto(
                        "IPhone 13",
                        4000.00,
                        "Descrição",
                        89,
                        "Disponível"
                );
        produtoList.add(produto);

        produto = new Produto(
                        "Iphone XR",
                        1000.00,
                        "Descrição",
                        58,
                        "Disponível"
                );
        produtoList.add(produto);

        produto = new Produto(
                        "IPhone 14",
                        3000.00,
                        "Descrição",
                        35,
                        "Disponível"
                );
        produtoList.add(produto);

        produto = new Produto(
                        "IPhone 11 pro",
                        1500.00,
                        "Descrição",
                        31,
                        "Disponível"
                );
        produtoList.add(produto);

        produto =
                new Produto(
                        "iPad",
                        1000.00,
                        "Descrição",
                        50,
                        "Disponível"
                );
        produtoList.add(produto);
    }


}