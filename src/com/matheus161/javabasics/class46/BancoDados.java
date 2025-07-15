package com.matheus161.javabasics.class46;

public interface BancoDados extends SqlDCL, SqlDML, SqlDDL {
    void abrirConexao();
    void fecharConexao();
}
