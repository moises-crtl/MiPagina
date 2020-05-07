package com.servlet;

import com.model.Persona;
import com.service.PersonaService;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@WebServlet("/home")
public class PersonaServlet extends HttpServlet{
    
    @Inject
    PersonaService personaService;
    
    Logger log = LogManager.getRootLogger();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
        List<Persona> personas = personaService.findAll();
        log.debug("Objeto Persona" + personas);
        request.setAttribute("personas", personas);
        request.getRequestDispatcher("/listadoPersonas.jsp").forward(request, response);       
        
    }
}
