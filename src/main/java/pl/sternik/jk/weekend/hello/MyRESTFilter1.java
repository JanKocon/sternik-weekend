package pl.sternik.jk.weekend.hello;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


////// WAZNA JEST KOLEJNOSC ODPALANIA FILTRÓW !!!!!!!!!!!!   <<<UWAGA UWAGA>>>
@WebFilter(filterName = "/MyRESTFilter", urlPatterns = {"/hello"})
public class MyRESTFilter1 implements javax.servlet.Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("---------------- aaaaaaaaaa ---------------");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("---------------- bbbbbbbbbb ---------------");
    }

    @Override
    public void destroy() {

    }
}
