package com.demo.service;

import java.util.List;

import com.demo.entity.Invoice;

public interface InvoiceService {

	public Invoice saveInvice(Invoice invoice);
    public List<Invoice> getAllInvoices();
    public Invoice getInvoiceById(Long id);
    public void deleteInvoiceById(Long id);
    public void updateInvoice(Invoice invoice);
}
