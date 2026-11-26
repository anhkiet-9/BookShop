package com.catbook.catbook.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "import_details")
public class ImportDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "receipt_id")
    private ImportReceipt receipt;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    private Integer quantity;

    @Column(name = "import_price", precision = 12, scale = 2)
    private BigDecimal importPrice;

    @Column(precision = 14, scale = 2)
    private BigDecimal subtotal;

    public ImportDetail() {
    }
}