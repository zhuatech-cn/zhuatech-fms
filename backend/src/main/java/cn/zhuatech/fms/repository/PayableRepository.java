/* Copyright 2026 上海如静知华信息科技有限公司 */
package cn.zhuatech.fms.repository;
import cn.zhuatech.fms.model.Payable;import org.springframework.data.jpa.repository.JpaRepository;import java.util.List;
public interface PayableRepository extends JpaRepository<Payable,Long>{List<Payable> findAllByOrderByDueDateAsc();}
