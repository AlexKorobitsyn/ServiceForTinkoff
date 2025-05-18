package org.workwithstocks.servicefortinkoff.service;

import org.workwithstocks.servicefortinkoff.model.Stock;

public interface StockDataService {
    Stock getStockByTicker(String ticker);
}
