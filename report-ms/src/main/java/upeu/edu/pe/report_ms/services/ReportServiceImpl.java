package upeu.edu.pe.report_ms.services;

import org.springframework.stereotype.Service;
import upeu.edu.pe.report_ms.helpers.ReportHelper;
import upeu.edu.pe.report_ms.models.Company;
import upeu.edu.pe.report_ms.models.WebSite;
import upeu.edu.pe.report_ms.repositories.CompaniesRepository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

@Service
public class ReportServiceImpl implements ReportService {

    private final CompaniesRepository companiesRepository;
    private final ReportHelper reportHelper;

    public ReportServiceImpl(CompaniesRepository companiesRepository, ReportHelper reportHelper) {
        this.companiesRepository = companiesRepository;
        this.reportHelper = reportHelper;
    }

    @Override
    public String makeReport(String name) {
        return reportHelper.readTemplate(companiesRepository.getByName(name).orElseThrow());
    }

    @Override
    public String saveReport(String report) {
        var format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var placeholders = reportHelper.getPlaceholdersFromTemplate(report);
        var webSites = Stream.of(placeholders.get(3))
                .map(site -> WebSite.builder().name(site).build()).toList();

        var company = Company.builder()
                .name(placeholders.get(0))
                .foundationDate(LocalDate.parse(placeholders.get(1), format))
                .founder(placeholders.get(2))
                .webSites(webSites)
                .build();

        companiesRepository.postByName(company);
        return "Saved";
    }

    @Override
    public void deleteReport(String name) {
        companiesRepository.deleteByName(name);
    }
}
