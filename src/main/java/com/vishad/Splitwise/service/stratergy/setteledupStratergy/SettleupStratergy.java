package com.vishad.Splitwise.service.stratergy.setteledupStratergy;

import com.vishad.Splitwise.entity.Expense;
import com.vishad.Splitwise.entity.SettlementTransaction;

import java.util.List;

public interface SettleupStratergy {

    List<SettlementTransaction> getSettlementTransaction(List<Expense> expenses);
}
