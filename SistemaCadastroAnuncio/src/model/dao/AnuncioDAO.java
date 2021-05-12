/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import com.mysql.jdbc.PreparedStatement;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Anuncio;

/**
 *
 * @author Ricardo
 */
public class AnuncioDAO {

    // Método para Inserir os dados no Banco:
    public void create(Anuncio a) {

        // Abre a conexão com o Banco:
        Connection con = ConnectionFactory.getConnection();
        // Inicializa o objeto que manipula os comandos SQL:
        PreparedStatement stmt = null;

        try {
            // Script de Inserção de dados no Banco, na tabela Anuncio:
            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO anuncio (NOME_ANUNCIO, CLIENTE, DATA_INICIO, DATA_TERMINO, VALOR_INVEST_DIA)VALUES(?,?,?,?,?)");

            // Pega os valores dos campos que serão inseridos no Banco de Dados: 
            stmt.setString(1, a.getNOME_ANUNCIO());
            stmt.setString(2, a.getCLIENTE());
            stmt.setDate(3, java.sql.Date.valueOf(a.getDATA_INICIO()));
            stmt.setDate(4, java.sql.Date.valueOf(a.getDATA_TERMINO()));
            stmt.setInt(5, a.getVALOR_INVEST_DIA());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Anúncio Cadastrado com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar: " + ex);
        } finally {
            // Fecha as conexões com o Banco de Dados:
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) con, stmt);
        }

    }

    // Método que lê dados do Banco:
    public List<Anuncio> read() {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        // Os dados do Banco serão adicionados nessa lista:
        List<Anuncio> anuncios = new ArrayList<>();

        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM anuncio");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Anuncio anuncio = new Anuncio();

                // Pegando cada campo da Tabela Anuncio:
                anuncio.setID(rs.getInt("ID"));
                anuncio.setNOME_ANUNCIO(rs.getString("NOME_ANUNCIO"));
                anuncio.setCLIENTE(rs.getString("CLIENTE"));
                anuncio.setDATA_INICIO_BD(rs.getDate("DATA_INICIO"));
                anuncio.setDATA_TERMINO_BD(rs.getDate("DATA_TERMINO"));
                anuncio.setVALOR_INVEST_DIA(rs.getInt("VALOR_INVEST_DIA"));

                anuncios.add(anuncio);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Ler dados do Banco.");
        } finally {
            // Fecha as conexões com o Banco:
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) con, stmt, rs);
        }

        return anuncios;

    }

    // Método que lê dados bo Banco, recebendo o parâmetro a ser filtrado:
    public List<Anuncio> readForClient(String client) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        // Os dados do Banco serão adicionados nessa lista:
        List<Anuncio> anuncios = new ArrayList<>();

        try {
            // Pesquisa pelo nome do Cliente na Tabela Anuncio:
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM anuncio WHERE CLIENTE LIKE ?");

            // O nome do cliente pesquisado pode estar em qualquer posição:
            stmt.setString(1, "%" + client + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Anuncio anuncio = new Anuncio();

                // Pegando cada campo da Tabela Anuncio:
                anuncio.setID(rs.getInt("ID"));
                anuncio.setNOME_ANUNCIO(rs.getString("NOME_ANUNCIO"));
                anuncio.setCLIENTE(rs.getString("CLIENTE"));
                anuncio.setDATA_INICIO_BD(rs.getDate("DATA_INICIO"));
                anuncio.setDATA_TERMINO_BD(rs.getDate("DATA_TERMINO"));
                anuncio.setVALOR_INVEST_DIA(rs.getInt("VALOR_INVEST_DIA"));

                anuncios.add(anuncio);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Ler dados do Banco:" + ex);
        } finally {
            // Fecha as conexões com o Banco:
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) con, stmt, rs);
        }

        return anuncios;

    }

}
