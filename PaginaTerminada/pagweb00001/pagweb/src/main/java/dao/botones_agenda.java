package dao;

import clasesgetset.agenda;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public interface botones_agenda {

    public int Insertar_Agenda (agendar agendar);

    public List<agenda> Mostrar_Agenda(agendar agendar);

    public int Update_Agendar(agendar agendar);

    int Update_Agendar(agenda agenda);


    void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}

