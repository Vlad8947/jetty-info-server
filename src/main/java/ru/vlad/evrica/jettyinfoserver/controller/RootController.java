package ru.vlad.evrica.jettyinfoserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.vlad.evrica.jettyinfoserver.ByteFormatter;

import java.util.Calendar;

@Controller
public class RootController {

    private static final String USER_NAME = "user.name";

    @GetMapping(value = "/")
    @ResponseBody
    public String rootRequest() {
        String freeMem = ByteFormatter.format(Runtime.getRuntime().freeMemory(), false);
        String totalMem = ByteFormatter.format(Runtime.getRuntime().totalMemory(), false);
        StringBuilder sb = new StringBuilder();
        sb.append("Current time: " + Calendar.getInstance().getTime() + "<br>")
                .append("User name: " + System.getProperties().getProperty(USER_NAME) + "<br>")
                .append("Free java memory: " + freeMem + "<br>")
                .append("Total java memory: " + totalMem + "<br>");
        return sb.toString();
    }

}
