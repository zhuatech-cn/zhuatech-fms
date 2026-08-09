/* Copyright 2026 上海如静知华信息科技有限公司 */
package cn.zhuatech.fms.controller;

import cn.zhuatech.fms.common.ApiResponse;
import cn.zhuatech.fms.service.CashRunwayForecastService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fms/insights")
public class CashRunwayForecastController {
    private final CashRunwayForecastService service;

    public CashRunwayForecastController(CashRunwayForecastService service) {
        this.service = service;
    }

    @PostMapping("/cash-runway-forecast")
    public ApiResponse<CashRunwayForecastService.Result> forecast(
        @Valid @RequestBody CashRunwayForecastService.Request request) {
        return ApiResponse.ok(service.forecast(request));
    }
}
