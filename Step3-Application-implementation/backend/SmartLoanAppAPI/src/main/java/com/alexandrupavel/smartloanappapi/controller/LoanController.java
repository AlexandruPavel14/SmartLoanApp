//package com.alexandrupavel.smartloanappapi.controller;
//
//import com.alexandrupavel.smartloanappapi.model.Loan;
//import com.alexandrupavel.smartloanappapi.repository.LoanRepository;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/loans")
//public class LoanController {
//
//    private final LoanRepository repo;
//
//    public LoanController(LoanRepository repo) {
//        this.repo = repo;
//    }
//
//    @PostMapping
//    public Loan create(@RequestBody Loan loan) {
//        return repo.save(loan);
//    }
//
//    @GetMapping
//    public List<Loan> list() {
//        return repo.findAll();
//    }
//}

package com.alexandrupavel.smartloanappapi.controller;

import com.alexandrupavel.smartloanappapi.model.Loan;
import com.alexandrupavel.smartloanappapi.repository.LoanRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/loans")
public class LoanController {

    private final LoanRepository repo;

    public LoanController(LoanRepository repo) {
        this.repo = repo;
    }

    // Insert mock data at startup if table is empty
    @PostConstruct
    public void insertMockData() {
        if (repo.count() == 0) {
            repo.save(new Loan(null, new BigDecimal("10000.50"), LocalDate.of(2024, 7, 26), 12));
            repo.save(new Loan(null, new BigDecimal("5000.00"), LocalDate.of(2024, 6, 15), 24));
            repo.save(new Loan(null, new BigDecimal("1500.75"), LocalDate.of(2024, 1, 10), 6));
        }
    }

    @PostMapping
    public Loan create(@RequestBody Loan loan) {
        return repo.save(loan);
    }

    @GetMapping
    public List<Loan> list() {
        return repo.findAll();
    }
}
