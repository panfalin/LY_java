package com.ruoyi.aliexpress.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * warehouse对象 bc_reserve_warehouse
 * 
 * @author ruoyi
 * @date 2024-12-10
 */
public class BcReserveWarehouse extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** sku */
    @Excel(name = "sku")
    private String sku;

    /** 备货单号 */
    @Excel(name = "备货单号")
    private String stockId;

    /** 备货仓 */
    @Excel(name = "备货仓")
    private String stockWarehouse;

    /** 仓位 */
    @Excel(name = "仓位")
    private String warehousePosition;


    /** 货品编号 */
    @Excel(name = "货品ID")
    private String goodsId;

    /** 货品数量 */
    @Excel(name = "货品数量")
    private String goodsNumber;

    /** 店铺名 */
    @Excel(name = "店铺名")
    private String shopId;

    /** 箱号1 */
    @Excel(name = "箱号1")
    private String box1;

    /** 箱号2 */
    @Excel(name = "箱号2")
    private String box2;

    /** 箱号3 */
    @Excel(name = "箱号3")
    private String box3;

    /** 箱号4 */
    @Excel(name = "箱号4")
    private String box4;

    /** 箱号5 */
    @Excel(name = "箱号5")
    private String box5;

    /** 箱号6 */
    @Excel(name = "箱号6")
    private String box6;

    /** 箱号7 */
    @Excel(name = "箱号7")
    private String box7;

    /** 箱号8 */
    @Excel(name = "箱号8")
    private String box8;

    /** 箱号9 */
    @Excel(name = "箱号9")
    private String box9;

    /** 箱号10 */
    @Excel(name = "箱号10")
    private String box10;

    /** 外箱尺寸 */
    @Excel(name = "外箱尺寸")
    private String boxSize;

    /** 重量 */
    @Excel(name = "重量")
    private String weight;


    public String getWarehousePosition() {
        return warehousePosition;
    }

    public void setWarehousePosition(String warehousePosition) {
        this.warehousePosition = warehousePosition;
    }

    public void setSku(String sku)
    {
        this.sku = sku;
    }

    public String getSku() 
    {
        return sku;
    }
    public void setStockId(String stockId) 
    {
        this.stockId = stockId;
    }

    public String getStockId() 
    {
        return stockId;
    }
    public void setStockWarehouse(String stockWarehouse) 
    {
        this.stockWarehouse = stockWarehouse;
    }

    public String getStockWarehouse() 
    {
        return stockWarehouse;
    }
    public void setGoodsId(String goodsId) 
    {
        this.goodsId = goodsId;
    }

    public String getGoodsId() 
    {
        return goodsId;
    }
    public void setGoodsNumber(String goodsNumber) 
    {
        this.goodsNumber = goodsNumber;
    }

    public String getGoodsNumber() 
    {
        return goodsNumber;
    }
    public void setShopId(String shopId) 
    {
        this.shopId = shopId;
    }

    public String getShopId() 
    {
        return shopId;
    }
    public void setBox1(String box1) 
    {
        this.box1 = box1;
    }

    public String getBox1() 
    {
        return box1;
    }
    public void setBox2(String box2) 
    {
        this.box2 = box2;
    }

    public String getBox2() 
    {
        return box2;
    }
    public void setBox3(String box3) 
    {
        this.box3 = box3;
    }

    public String getBox3() 
    {
        return box3;
    }
    public void setBox4(String box4) 
    {
        this.box4 = box4;
    }

    public String getBox4() 
    {
        return box4;
    }
    public void setBox5(String box5) 
    {
        this.box5 = box5;
    }

    public String getBox5() 
    {
        return box5;
    }
    public void setBox6(String box6) 
    {
        this.box6 = box6;
    }

    public String getBox6() 
    {
        return box6;
    }
    public void setBox7(String box7) 
    {
        this.box7 = box7;
    }

    public String getBox7() 
    {
        return box7;
    }
    public void setBox8(String box8) 
    {
        this.box8 = box8;
    }

    public String getBox8() 
    {
        return box8;
    }
    public void setBox9(String box9) 
    {
        this.box9 = box9;
    }

    public String getBox9() 
    {
        return box9;
    }
    public void setBox10(String box10) 
    {
        this.box10 = box10;
    }

    public String getBox10() 
    {
        return box10;
    }
    public void setBoxSize(String boxSize) 
    {
        this.boxSize = boxSize;
    }

    public String getBoxSize() 
    {
        return boxSize;
    }
    public void setWeight(String weight) 
    {
        this.weight = weight;
    }

    public String getWeight() 
    {
        return weight;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("sku", getSku())
            .append("stockId", getStockId())
            .append("stockWarehouse", getStockWarehouse())
            .append("goodsId", getGoodsId())
            .append("goodsNumber", getGoodsNumber())
            .append("shopId", getShopId())
            .append("box1", getBox1())
            .append("box2", getBox2())
            .append("box3", getBox3())
            .append("box4", getBox4())
            .append("box5", getBox5())
            .append("box6", getBox6())
            .append("box7", getBox7())
            .append("box8", getBox8())
            .append("box9", getBox9())
            .append("box10", getBox10())
            .append("boxSize", getBoxSize())
            .append("weight", getWeight())
            .toString();
    }
}
