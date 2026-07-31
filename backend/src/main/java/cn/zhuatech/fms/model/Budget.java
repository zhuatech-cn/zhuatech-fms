/* Copyright 2026 上海如静知华信息科技有限公司 */
package cn.zhuatech.fms.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="fms_budget")
public class Budget extends BaseEntity {
    @Column(nullable=false,unique=true,length=32) private String budgetNo;
    @Column(nullable=false,length=60) private String department;
    @Column(nullable=false,length=60) private String subjectName;
    @Column(nullable=false) private int fiscalYear;
    @Column(nullable=false,precision=16,scale=2) private BigDecimal annualAmount;
    @Column(nullable=false,precision=16,scale=2) private BigDecimal occupiedAmount;
    @Column(nullable=false,precision=16,scale=2) private BigDecimal actualAmount;
    @Column(nullable=false,length=20) private String status;

    protected Budget() {}
    public Budget(String no,String department,String subject,int year,BigDecimal annual,BigDecimal occupied,BigDecimal actual,String status){this.budgetNo=no;this.department=department;this.subjectName=subject;this.fiscalYear=year;this.annualAmount=annual;this.occupiedAmount=occupied;this.actualAmount=actual;this.status=status;}
    public String getBudgetNo(){return budgetNo;} public String getDepartment(){return department;} public String getSubjectName(){return subjectName;} public int getFiscalYear(){return fiscalYear;} public BigDecimal getAnnualAmount(){return annualAmount;} public BigDecimal getOccupiedAmount(){return occupiedAmount;} public BigDecimal getActualAmount(){return actualAmount;} public String getStatus(){return status;}
}
