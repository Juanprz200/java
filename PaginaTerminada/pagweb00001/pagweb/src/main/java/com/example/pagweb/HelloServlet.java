package com.example.pagweb;


import  clasesgetset.agenda;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import dao.agendar;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "serveletAgendar", value = "/ServeletAgendar")
public class HelloServlet extends HttpServlet {

    agendar age = new agendar();

    agenda agen = new agenda();

    int resultado;

    List<agenda> agendados = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String agendamiento = request.getParameter("agendamiento");
        if (agendamiento.equalsIgnoreCase("Agendar")) {
            String cedula = request.getParameter("cedula");
            String paciente = request.getParameter("paciente");
            String eps = request.getParameter("eps");
            String direccion = request.getParameter("direccion");
            String especialidad = request.getParameter("especialidad");
            String sexo = request.getParameter("sexo");
            String observacion = request.getParameter("observacion");

            agen.setCedula(cedula);
            agen.setPaciente(paciente);
            agen.setEps(eps);
            agen.setDireccion(direccion);
            agen.setEspecialidad(especialidad);
            agen.setSexo(sexo);
            agen.setObservacion(observacion);


        }


    }
}