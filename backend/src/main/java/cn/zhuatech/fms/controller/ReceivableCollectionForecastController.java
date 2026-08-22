/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.fms.controller;

import cn.zhuatech.fms.common.ApiResponse;
import cn.zhuatech.fms.service.ReceivableCollectionForecastService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fms/insights/receivable-forecast")
public class ReceivableCollectionForecastController {
    private final ReceivableCollectionForecastService service;

    public ReceivableCollectionForecastController(ReceivableCollectionForecastService service) { this.service = service; }

    @PostMapping
    public ApiResponse<ReceivableCollectionForecastService.Result> forecast(
            @Valid @RequestBody ReceivableCollectionForecastService.Request request) {
        return ApiResponse.ok(service.forecast(request));
    }
}
