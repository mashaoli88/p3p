package com.p2p.mapper;

import com.p2p.pojo.product.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2018/1/23.
 */
public interface ProductMapper {
    @Select("select T_PID as proId," +
            "T_CLOSE_PREIOD as closedPeriod," +
            "T_EARLY_REDEPTION_TYPE as earlyRedeptionType," +
            "T_EARTING_TYPE as earningType," +
            "T_INVEST_RULE as investRule," +
            "T_ALLOW_TRANSFER as isAllowTransfer," +
            "T_IS_REPEAT_INVEST as isRepeatInvest," +
            "T_LOWER_LIMIT as lowerTimeLimit," +
            "T_LOWER_INVEST as proLowerInvest," +
            "T_PRONUM as proNum," +
            "T_PROTYPE_ID as proTypeId," +
            "T_UPPER_INVEST as proUpperInvest," +
            "T_PRODUCT_NAME as productName," +
            "T_STATUS as status," +
            "T_UPPER_LIMIT as upperTimeLimit," +
            "T_RETURN_MONEY as wayToReturnMoney"+
            " from t_product")
    List<Product> selectAll();
}
