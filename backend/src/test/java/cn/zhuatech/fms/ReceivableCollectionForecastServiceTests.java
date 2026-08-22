/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.fms;

import cn.zhuatech.fms.service.ReceivableCollectionForecastService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ReceivableCollectionForecastServiceTests {
    private final ReceivableCollectionForecastService service = new ReceivableCollectionForecastService();

    @Test
    void marksLargeCollectionGapCritical() {
        var result = service.forecast(new ReceivableCollectionForecastService.Request(
                1_000_000, 300_000, 450_000, 75, 80_000, 120_000, 0.55, 500_000));
        assertEquals("CRITICAL", result.status());
        assertTrue(result.liquidityGap() > 200_000);
    }

    @Test
    void keepsStrongCollectionPlanHealthy() {
        var result = service.forecast(new ReceivableCollectionForecastService.Request(
                1_000_000, 600_000, 80_000, 12, 120_000, 0, 0.9, 600_000));
        assertEquals("HEALTHY", result.status());
    }
}
