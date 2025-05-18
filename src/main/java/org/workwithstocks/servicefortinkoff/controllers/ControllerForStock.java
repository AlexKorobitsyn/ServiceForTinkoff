package org.workwithstocks.servicefortinkoff.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.workwithstocks.servicefortinkoff.model.Stock;
import org.workwithstocks.servicefortinkoff.service.StockDataService;

@RestController
@RequestMapping("/api/stocks")
public class ControllerForStock {
    private final StockDataService stockDataService;

    public ControllerForStock(StockDataService stockDataService) {
        this.stockDataService = stockDataService;
    }

    @GetMapping("/{ticker}")
    public Stock getStockInfo(String ticker) {
        return stockDataService.getStockData(ticker);
    }

    @PostMapping("/price-list")
    public StockPriceListResponse getStockPrices(@RequestBody FigiListRequest request) {
        return stockDataService.getPriceData(request);
    }

    @PostMapping("/by-tickers")
    public StockListResponse getStocksByTickerList(@RequestBody TickerListRequest request) {
        return stockDataService.getStocksByTickers(request);
    }
}
