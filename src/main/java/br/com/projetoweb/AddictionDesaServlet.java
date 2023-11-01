package br.com.projetoweb;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

@WebServlet("/adicionaDespesa")
public class AddictionDesaServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        List<String> items = new ArrayList<>();
        items.add("Como Aprender Java em 7 dias");
        items.add("Como Ficar Rico ");
        items.add("Porque Java é tão dificil?");
        items.add("Como Entra no Melhor dos Mundos");
        items.add("Da onde surgiu a POO");
        items.add("Programar é Difícil?");
        items.add("Baseado em POO");

        request.setAttribute("items", items);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/despesas.jsp");
        dispatcher.forward(request, response);



    }
}
