/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalolot.view.console;

import hospitalolot.model.business.entities.Treballador;
import hospitalolot.model.persistence.dao.implementations.jdbc.JDBCTreballador;
import hospitalolot.model.persistence.dao.implementations.jdbc.utils.JDBCRelacio;
import hospitalolot.model.persistence.exception.DAOException;

/**
 *
 * @author usuario
 */
public class test {
     public static void main(String[] args) throws DAOException {
         JDBCRelacio jr = new JDBCRelacio();
         JDBCTreballador jt = new JDBCTreballador();
         Treballador t = jt.get(2); 
         t.reservarGuardia();
    }
}
