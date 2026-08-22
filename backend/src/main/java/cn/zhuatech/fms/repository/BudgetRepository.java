/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.fms.repository;
import cn.zhuatech.fms.model.Budget;import org.springframework.data.jpa.repository.JpaRepository;import java.util.List;
public interface BudgetRepository extends JpaRepository<Budget,Long>{List<Budget> findByFiscalYearOrderByDepartmentAsc(int fiscalYear);}
