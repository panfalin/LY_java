package com.ruoyi.aliexpress.domain;

public class AliexpressFinancialRecord {
    private int sId;
    private String store;
    private String trade_order_id;
    private String amount;
    private String fee_item;
    private String remark;
    private String income_account;
    private String expense_account;
    private String platform_transaction_id;

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getTrade_order_id() {
        return trade_order_id;
    }

    public void setTrade_order_id(String trade_order_id) {
        this.trade_order_id = trade_order_id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getFee_item() {
        return fee_item;
    }

    public void setFee_item(String fee_item) {
        this.fee_item = fee_item;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getIncome_account() {
        return income_account;
    }

    public void setIncome_account(String income_account) {
        this.income_account = income_account;
    }

    public String getExpense_account() {
        return expense_account;
    }

    public void setExpense_account(String expense_account) {
        this.expense_account = expense_account;
    }

    public String getPlatform_transaction_id() {
        return platform_transaction_id;
    }

    public void setPlatform_transaction_id(String platform_transaction_id) {
        this.platform_transaction_id = platform_transaction_id;
    }
}
