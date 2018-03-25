package pl.sternik.jk.weekend.hello;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

////// WAZNA JEST KOLEJNOSC ODPALANIA FILTRÓW !!!!!!!!!!!!   <<<UWAGA UWAGA>>>
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String imie = req.getParameter("Imie");
        String nazwisko = req.getParameter("Nazwisko");
        String wiek = req.getParameter("Wiek");
        String muza = req.getParameter("Muzyka");
        resp.getOutputStream().print("NAZYWASZ SIĘ " + imie + " " + nazwisko + " i masz "+ wiek + " i słuchasz" + muza);
    }
}