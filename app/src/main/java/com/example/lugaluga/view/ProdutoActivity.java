package com.example.lugaluga.view;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.lugaluga.R;
import com.example.lugaluga.model.Produto;

class ProdutoActivity extends AppCompatActivity {

    private Produto produto;

    private TextView nomeProduto, qtdProduto, precoProduto, descProduto;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);

        nomeProduto = findViewById(R.id.g_nomeProduto);
        qtdProduto = findViewById(R.id.gqtdProduto);
        precoProduto = findViewById(R.id.precoProduto);
        descProduto = findViewById(R.id.g_descProduto);

        produto = getIntent().getExtras().getParcelable("produto");

        nomeProduto.setText(produto.getNome());
        qtdProduto.setText(produto.getQuantidade());
        precoProduto.setText(String.valueOf(produto.getPreco());
        descProduto.setText(produto.getDescricao());


    }
}