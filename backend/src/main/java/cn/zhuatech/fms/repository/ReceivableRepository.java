/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.fms.repository;
import cn.zhuatech.fms.model.Receivable;import org.springframework.data.jpa.repository.JpaRepository;import java.util.List;import java.util.Optional;
public interface ReceivableRepository extends JpaRepository<Receivable,Long>{Optional<Receivable> findByReceivableNo(String no);List<Receivable> findAllByOrderByDueDateAsc();}
