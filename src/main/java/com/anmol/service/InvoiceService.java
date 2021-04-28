package com.anmol.service;

import com.anmol.entity.Invoice;
import com.anmol.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Service
public class InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    public void insert(Invoice invoice) {
        invoiceRepository.save(invoice);
    }


    public Optional<Invoice> findById(int id) {
        return invoiceRepository.findById(id);
    }

    public Iterable<Invoice> findAll() {
        return invoiceRepository.findAll();
    }

    public void updateInvoice(Invoice invoice) {
        invoiceRepository.save(invoice);
    }

    public void deleteInvoice(Invoice invoice) {
        invoiceRepository.delete(invoice);
    }



}
