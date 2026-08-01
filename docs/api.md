# FMS API 摘要

Copyright 2026 上海如静知华信息科技有限公司。

除 `/api/auth/login` 与健康检查外，所有接口均要求 `Authorization: Bearer <token>`。财务接口前缀为 `/api/fms`。

| 方法 | 路径 | 说明 | 角色 |
| --- | --- | --- | --- |
| GET | `/dashboard` | 资金、应收应付、预算和待审费用摘要 | 登录用户 |
| GET | `/accounts` | 资金账户列表 | 登录用户 |
| GET / POST | `/receivables` | 应收台账 / 新建应收 | 查询：登录用户；新增：管理员、财务经理 |
| PATCH | `/receivables/{id}/receipt` | 登记回款并自动更新结清状态 | 管理员、财务经理 |
| GET | `/payables` | 应付台账 | 登录用户 |
| GET / POST | `/expenses` | 费用单据 / 提交报销 | 登录用户 |
| GET | `/budgets` | 当前财年预算执行 | 登录用户 |

演示角色为 `ADMIN`、`FINANCE_MANAGER`、`EMPLOYEE`。生产落地必须增加法人、核算组织、责任中心、币种、会计期间和单据级数据权限。

## 预算预测

`POST /api/fms/budget-forecast`：返回预测完工成本、预算偏差、超支比例和控制建议。
