/* Copyright 2026 上海如静知华信息科技有限公司 */
package cn.zhuatech.fms.repository;
import cn.zhuatech.fms.model.ExpenseClaim;import org.springframework.data.jpa.repository.JpaRepository;import java.util.List;
public interface ExpenseClaimRepository extends JpaRepository<ExpenseClaim,Long>{List<ExpenseClaim> findAllByOrderByExpenseDateDesc();}
