package com.p2p.pojo.product;



/**
 * @ClassName: ProductEarningRate
 * @Description: 产品收益表实体 以及 产品收益表日志实体
 */

public class ProductEarningRate {

    private Integer id;//主键id

    private Integer productId;//产品id

    private Integer month;//月份

    private double incomeRate; //收益率


    public ProductEarningRate() {
        super();
    }

    public ProductEarningRate(Integer month, double incomeRate) {
        super();
        this.month = month;
        this.incomeRate = incomeRate;
    }


    /**
     * @return id
     */

    public Integer getId() {
        return id;
    }

    /**
     * @param id 要设置的 id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return productId
     */

    public Integer getProductId() {
        return productId;
    }

    /**
     * @param productId 要设置的 productId
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * @return month
     */

    public Integer getMonth() {
        return month;
    }

    /**
     * @param month 要设置的 month
     */
    public void setMonth(Integer month) {
        this.month = month;
    }

    /**
     * @return incomeRate
     */

    public double getIncomeRate() {
        return incomeRate;
    }

    /**
     * @param incomeRate 要设置的 incomeRate
     */
    public void setIncomeRate(double incomeRate) {
        this.incomeRate = incomeRate;
    }


}
