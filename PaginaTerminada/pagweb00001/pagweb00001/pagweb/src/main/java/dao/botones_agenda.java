package dao;

import clasesgetset.agenda;

import java.util.List;

public interface botones_agenda {

    public int Insertar_Agenda (agendar agendar);

    public List<agenda> Mostrar_Agenda(agendar agendar);

    public int Update_Agendar(agendar agendar);

    int Update_Agendar(agenda agenda);
}
