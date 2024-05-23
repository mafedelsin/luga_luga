package com.example.lugaluga.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Usuario1 implements Parcelable {

    private String nome;
    private String cpf;
    private String dataNascimento;
    private String cep;
    private String cidade;
    private String uf;
    private String logradouro;
    private int numero;
    private String Complemento;
    private String bairro;
    private int telefone;
    private String email;
    private String senha;

    public Usuario1() {
    }

    public Usuario1(String nome, String cpf, String dataNascimento, String cep, String cidade, String uf, String logradouro, int numero, String complemento, String bairro, int telefone, String email, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
        this.logradouro = logradouro;
        this.numero = numero;
        Complemento = complemento;
        this.bairro = bairro;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    protected Usuario1(Parcel in) {
        nome = in.readString();
        cpf = in.readString();
        dataNascimento = in.readString();
        cep = in.readString();
        cidade = in.readString();
        uf = in.readString();
        logradouro = in.readString();
        numero = in.readInt();
        Complemento = in.readString();
        bairro = in.readString();
        telefone = in.readInt();
        email = in.readString();
        senha = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nome);
        dest.writeString(cpf);
        dest.writeString(dataNascimento);
        dest.writeString(cep);
        dest.writeString(cidade);
        dest.writeString(uf);
        dest.writeString(logradouro);
        dest.writeInt(numero);
        dest.writeString(Complemento);
        dest.writeString(bairro);
        dest.writeInt(telefone);
        dest.writeString(email);
        dest.writeString(senha);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Usuario1> CREATOR = new Creator<Usuario1>() {
        @Override
        public Usuario1 createFromParcel(Parcel in) {
            return new Usuario1(in);
        }

        @Override
        public Usuario1[] newArray(int size) {
            return new Usuario1[size];
        }
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String complemento) {
        Complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
