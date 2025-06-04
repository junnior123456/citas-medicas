package upeu.edu.pe.report_ms.repositories;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import upeu.edu.pe.report_ms.beans.LoadBalancerConfiguration;
import upeu.edu.pe.report_ms.models.Company;

import java.util.Optional;

@FeignClient(name = "companies-crud")
@LoadBalancerClient(name = "companies-crud", configuration = LoadBalancerConfiguration.class)
public interface CompaniesRepository {

    @GetMapping("companies-crud/company/{name}")
    Optional<Company> getByName(@PathVariable String name);

    @PostMapping("companies-crud/company")
    Optional<Company> postByName(@RequestBody Company company);

    @DeleteMapping("companies-crud/company/{name}")
    void deleteByName(@PathVariable String name);
}
