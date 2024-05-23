package com.example.lugaluga.view;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.lugaluga.R;
import com.example.lugaluga.RecyclerItemClickListener;
import com.example.lugaluga.model.Produto;
import com.example.lugaluga.view.adapter.AdapterProduto;

import java.util.ArrayList;
import java.util.List;

public class ProdutosFragment extends Fragment {
    private RecyclerView recyclerView;

    private AdapterProduto adapterProduto;

    private List<Produto> produtoList = new ArrayList<>();

    public ProdutosFragment() {
        // Required empty public constructor
    }

    public static ProdutosFragment newInstance(String param1, String param2) {
        ProdutosFragment fragment = new ProdutosFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_produtos, container, false);

        recyclerView = view.findViewById(R.id.Produtos);

        CriarListaProdutos();

        adapterProduto = new AdapterProduto(produtoList);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), LinearLayout.VERTICAL));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapterProduto);


        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getContext(),
                        recyclerView,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                Intent intent = new Intent(getContext(), ProdutoActivity.class);
                                intent.putExtra("produto", produtoList.get(position));
                                startActivity(intent);
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                                Toast.makeText(getContext(), produtoList.get(position).getStatus(), Toast.LENGTH_SHORT).show();

                            }

                            @Override

                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            }
                        }));

        return view;

    }

    public void CriarListaProdutos() {
        Produto produto;
        produto = new Produto(
                "IPhone 15",
                8000.00,
                "Descrição",
                10,
                "Indisponível"
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
                "Indisponível"
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
                "Indisponível"
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