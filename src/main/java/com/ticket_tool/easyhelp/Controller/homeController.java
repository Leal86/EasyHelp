package com.ticket_tool.easyhelp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class homeController {

    @GetMapping("/")
    public String home(Model model) {
        //Passa dados para a página HTML
        model.addAttribute("appName", "EasyHelp");
        return "index"; //Renderiza o arquivo src/main/resources/templates/index.html
    }
    
    @GetMapping("/users")
    public String users(Model model) {
        //Adiciona mais lógica para buscar usuários, se necessário
        model.addAttribute("titulo", "Lista de Usuários");
        return "users"; //Renderiza o arquivo src/main/resources/templates/usuarios.html
    }
}
