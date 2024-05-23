package com.example.lugaluga.view;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import com.example.lugaluga.R;
import com.example.lugaluga.model.Produto;

public class ProdutoActivity extends AppCompatActivity {

    private Produto produto;

    private TextView nomeProduto, qtdProduto, precoProduto, descProduto;
    private Button btnAlugar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);

        Toolbar myToolbar =(Toolbar) findViewById(R.id.my_toolbar);
        myToolbar.setTitle("Produto");
        setSupportActionBar(myToolbar);

        nomeProduto = findViewById(R.id.g_nomeProduto);
        qtdProduto = findViewById(R.id.gqtdProduto);
        precoProduto = findViewById(R.id.precoProduto);
        descProduto = findViewById(R.id.g_descProduto);

        btnAlugar = findViewById(R.id.alugaBtn);

        produto = getIntent().getExtras().getParcelable("produto");

        if (produto.getStatus().equals ("Indisponível")){
            btnAlugar.setEnabled(false);
            btnAlugar.setText("Indisponível");

        }

        nomeProduto.setText(produto.getNome());
        qtdProduto.setText(String.valueOf(produto.getQuantidade()));
        precoProduto.setText(String.valueOf(produto.getPreco()));
        descProduto.setText(produto.getDescricao());

        btnAlugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ProdutoActivity.this);
                builder.setMessage("Deseja realmente alugar este produto?");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Concluído", Toast.LENGTH_SHORT).show();
                        btnAlugar.setText("Solicitado");
                        btnAlugar.setBackgroundColor(getColor(R.color.yellow));
                        btnAlugar.setEnabled(false);
                    }
                });

                builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });

    }
}
