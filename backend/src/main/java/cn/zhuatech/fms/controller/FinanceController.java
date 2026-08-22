/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.fms.controller;

import cn.zhuatech.fms.common.ApiResponse;import cn.zhuatech.fms.dto.FinanceDto.*;import cn.zhuatech.fms.service.FinanceService;import jakarta.validation.Valid;import org.springframework.security.access.prepost.PreAuthorize;import org.springframework.web.bind.annotation.*;import java.util.List;

@RestController @RequestMapping("/api/fms")
public class FinanceController {
    private final FinanceService service; public FinanceController(FinanceService service){this.service=service;}
    @GetMapping("/dashboard") public ApiResponse<Dashboard> dashboard(){return ApiResponse.ok(service.dashboard());}
    @GetMapping("/accounts") public ApiResponse<List<AccountView>> accounts(){return ApiResponse.ok(service.accounts());}
    @GetMapping("/receivables") public ApiResponse<List<ReceivableView>> receivables(){return ApiResponse.ok(service.receivables());}
    @GetMapping("/payables") public ApiResponse<List<PayableView>> payables(){return ApiResponse.ok(service.payables());}
    @GetMapping("/expenses") public ApiResponse<List<ExpenseView>> expenses(){return ApiResponse.ok(service.expenses());}
    @GetMapping("/budgets") public ApiResponse<List<BudgetView>> budgets(){return ApiResponse.ok(service.budgets());}
    @PostMapping("/receivables") @PreAuthorize("hasAnyRole('ADMIN','FINANCE_MANAGER')") public ApiResponse<ReceivableView> createReceivable(@Valid @RequestBody CreateReceivableRequest request){return ApiResponse.ok("应收记录创建成功",service.createReceivable(request));}
    @PatchMapping("/receivables/{id}/receipt") @PreAuthorize("hasAnyRole('ADMIN','FINANCE_MANAGER')") public ApiResponse<ReceivableView> recordReceipt(@PathVariable Long id,@Valid @RequestBody RecordReceiptRequest request){return ApiResponse.ok("收款登记成功",service.recordReceipt(id,request));}
    @PostMapping("/expenses") @PreAuthorize("hasAnyRole('ADMIN','FINANCE_MANAGER','EMPLOYEE')") public ApiResponse<ExpenseView> submitExpense(@Valid @RequestBody SubmitExpenseRequest request){return ApiResponse.ok("报销申请已提交",service.submitExpense(request));}
}
