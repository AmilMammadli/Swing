/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao.inter;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author amila
 */
public abstract class AbstractDao {
    
    public Connection connect() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/resume";
        String username = "root";
        String password = "amil2003";
        Connection c = DriverManager.getConnection(url, username, password);
        return c;
    }
}
