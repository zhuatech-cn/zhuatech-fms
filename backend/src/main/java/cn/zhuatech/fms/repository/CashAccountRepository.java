/* Copyright 2026 上海如静知华信息科技有限公司 */
package cn.zhuatech.fms.repository;
import cn.zhuatech.fms.model.CashAccount;import org.springframework.data.jpa.repository.JpaRepository;import java.util.Optional;
public interface CashAccountRepository extends JpaRepository<CashAccount,Long>{Optional<CashAccount> findByAccountCode(String accountCode);}
