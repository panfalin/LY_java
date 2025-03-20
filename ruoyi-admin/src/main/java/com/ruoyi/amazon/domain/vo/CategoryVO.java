package com.ruoyi.amazon.domain.vo;

import lombok.Data;
import java.util.List;

@Data
public class CategoryVO {
    /** 目录名称 */
    private String label;
    
    /** 目录值 */
    private String value;
    
    /** 商品数量 */
    private Integer count;
    
    /** 子目录 */
    private List<CategoryVO> children;
} 