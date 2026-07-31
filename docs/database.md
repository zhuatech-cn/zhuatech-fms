# 数据库说明

Copyright 2026 上海如静知华信息科技有限公司。

数据库：MySQL 8.4；结构由 `backend/src/main/resources/db/migration` 中的 Flyway 脚本管理。

| 表 | 用途 | 关键约束 |
| --- | --- | --- |
| `sys_user` | 演示用户与角色 | `username` 唯一 |
| `fms_cash_account` | 资金账户 | `account_code` 唯一，金额精度 16,2 |
| `fms_receivable` | 客户应收 | `receivable_no` 唯一，按到期日和状态索引 |
| `fms_payable` | 供应商应付 | `payable_no` 唯一，按到期日和状态索引 |
| `fms_expense_claim` | 费用报销 | `claim_no` 唯一，按状态和发生日期索引 |
| `fms_budget` | 年度预算 | `budget_no` 唯一，按财年和部门索引 |

业务实体统一保存 `id`、`created_at` 与 `updated_at`。生产扩展应补充法人、账套、核算组织、币种、税率、会计期间、制单人、审核人、乐观锁、软删除、不可篡改日志和严格外键关系。
