/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archdoc.docmanager;

import java.sql.Connection;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class WebController {

    //vamos ter um desse pra cada html. esse aqui é o do form
    @RequestMapping("/contato")
    public String siteContato(Model modelo) {
        return "contato";
    }
    @RequestMapping("/cadastro")
    public String siteCadastro(Model modelo) {
        System.out.println("aaaaa");
        return "cadastro";
    }
    @RequestMapping("/index")
    public String siteHome(Model modelo) {
        System.out.println("aaaaa");
        return "index";
    }
    public String siteLogin(Model modelo) {
        System.out.println("aaaaa");
        return "login";
    }
    public String siteUser(Model modelo) {
        System.out.println("aaaaa");
        return "user";
    }

}


