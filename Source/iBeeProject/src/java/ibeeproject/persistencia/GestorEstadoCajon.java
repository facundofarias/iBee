/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ibeeproject.persistencia;

import ibeeproject.model.cajon.EstadoCajon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author farias.facundo
 */

public class GestorEstadoCajon implements Manejable {

    private ConexionPoolBD connPool;
    private Connection conn;
    private ArrayList list;

    public GestorEstadoCajon()
    {
            connPool = ConexionPoolBD.getInstance();
            list = new ArrayList();
    }

    public ArrayList getTodos() {
    try{
        conn = connPool.getConnection();
        String sql = "SELECT * FROM EstadoCajon ORDER BY 1";
        PreparedStatement ps;
        ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
       while (rs.next())
       {
           EstadoCajon estado = new EstadoCajon();
           estado.setNumero(rs.getInt("idEstadoCajon"));
           estado.setEstado(rs.getString("estado"));
           list.add(estado);
       }
        ps.close();
        connPool.closeConnection(conn);
        }catch(Exception a)
            {
            a.printStackTrace();
            System.out.print("Error en conexion BD: GestorEstadoCajon !!! (getTodos)");
            }
        return list;
    }

    public Object getUltimo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ArrayList getAsignado() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ArrayList getSinAsignar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object getUno(int idObjeto) {
        EstadoCajon estado = new EstadoCajon();
        try{
            conn = connPool.getConnection();
            String sql = "SELECT * FROM EstadoCajon where idEstadoCajon = ? ";
            PreparedStatement ps;
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idObjeto);
            ResultSet rs = ps.executeQuery();
           while (rs.next())
           {
               estado.setNumero(rs.getInt("idEstadoCajon"));
               estado.setEstado(rs.getString("estado"));
           }
            ps.close();
            connPool.closeConnection(conn);
        }catch(Exception a)
            {
            a.printStackTrace();
            System.out.print("Error en conexion BD: GestorEstadoCajon !!! (getUno)");
            }
        return estado;
    }

    public int insertUno(Object object) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int deleteUno(Object object) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int updateUno(Object object) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
