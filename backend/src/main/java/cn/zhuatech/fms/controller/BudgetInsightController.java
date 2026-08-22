/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.fms.controller;

import cn.zhuatech.fms.common.ApiResponse;
import cn.zhuatech.fms.service.BudgetForecastService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fms")
public class BudgetInsightController {
    private final BudgetForecastService service;
    public BudgetInsightController(BudgetForecastService service) { this.service = service; }

    @PostMapping("/budget-forecast")
    public ApiResponse<BudgetForecastService.Result> forecast(@Valid @RequestBody BudgetForecastService.Request request) {
        return ApiResponse.ok(service.forecast(request));
    }
}
