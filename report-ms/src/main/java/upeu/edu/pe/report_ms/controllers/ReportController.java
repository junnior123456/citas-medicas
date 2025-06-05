package upeu.edu.pe.report_ms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upeu.edu.pe.report_ms.services.ReportService;

import java.util.List;

@RestController
@RequestMapping("/api/report")
public class ReportController {

    @Autowired
    private ReportService service;

    @GetMapping("/citas")
    public List<String> obtenerReporte() {
        return service.generarReporte();
    }
}