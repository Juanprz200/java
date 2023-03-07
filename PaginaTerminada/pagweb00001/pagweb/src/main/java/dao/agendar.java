package dao;

import clasesgetset.agenda;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class agendar implements botones_agenda {
    String SQL_INSERT = "INSERT INTO dato(cedula,paciente,eps,direccion" + "especialidad,sexo,observacion) VALUES(?,?,?,?,?,?,?";
    Connection conex;
    PreparedStatement stmt;

    int registros=0;

    private  String agenda;


    @Override
    public int Insertar_Agenda(agendar agenda) {
        try{
            conex = conexion.ConectarnosBD();
            agenda ag = new agenda();
            stmt = conex.prepareStatement(SQL_INSERT);
            stmt.setString(1,ag.getCedula());
            stmt.setString(2,ag.getPaciente());
            stmt.setString(3,ag.getEps());
            stmt.setString(4,ag.getDireccion());
            stmt.setString(5,ag.getEspecialidad());
            stmt.setString(6,ag.getSexo());
            stmt.setString(7,ag.getObservacion());

            registros = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return registros;
    }


    String SQL_SELECT = "SELECT + FROM dato";

    @Override
    public List<clasesgetset.agenda> Mostrar_Agenda(agendar agendar) {
        Connection conn;
        PreparedStatement stmt = null;
        ResultSet rs= null;
        agenda Agendar = null;
        List<agenda> Agendados = new ArrayList<>();

        try {
            conn = conexion.ConectarnosBD();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs=stmt.executeQuery();

                while (rs.next()){
                    String CedulaAgendar = rs.getString("cedula");
                    String PacienteAgendar = rs.getString("paciente");
                    String EpsAgendar = rs.getString("eps");
                    String DirreccionAgendar = rs.getString("direccion");
                    String EspAgendar = rs.getString("especialidad");
                    String SexoAgendar = rs.getString("sexo");
                    String obsAgendar = rs.getString("observacion");
                    String FechaAgendar = rs.getString("fecha-cita");
                    String EstadoAgendar = rs.getString("estado");

                    Agendar = new agenda(CedulaAgendar,PacienteAgendar,EpsAgendar,DirreccionAgendar,EspAgendar,SexoAgendar,obsAgendar,FechaAgendar,EstadoAgendar);
                    Agendados.add(Agendar);


                }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return Agendados;
    }

    @Override
    public int Update_Agendar(agendar agendar) {
        return 0;
    }


    String SQL_UPDATE = "UPDATE dato SET estado = 'Inactivo' WHERE cedula = ?";
    @Override
    public int Update_Agendar(agenda agenda) {
        Connection conex;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conex = conexion.ConectarnosBD();
            stmt = conex.prepareStatement(SQL_UPDATE);
            stmt.setString(1,agenda.getCedula());

            registros = stmt.executeUpdate();
        }catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return registros;
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


}
