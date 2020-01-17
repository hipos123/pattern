package com.yaoxj.switchcase;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @description:
 * @author: yaoxj
 * @create: 2020-01-14 11:52
 **/
@Data
public class BaTaiShouHuoRiBaoBiaoMingXi {
    private Integer id;//   主键
    private Integer baoBiaoId;//   报表ID
    private Integer huoPinId;//   货品ID
    private String huoPinName;//   货品名称
    private String danWei;//   货品单位
    private BigDecimal danJia;//   单价
    private BigDecimal qiChuKuCunShuLiang;//   期初库存
    private BigDecimal xiaoShouQiChu;//   销售期初 : 总期初 - 寄存(整瓶)期初
    private BigDecimal lingYong;//   领用数
    private BigDecimal tuiKu;//   退库数
    private BigDecimal zhiBo;//   直拨数
    private BigDecimal tuiBo;//   退拨数
    private BigDecimal chongGong;//   充公数
    private BigDecimal zhiHuanChongGong;//   置换充公
    private BigDecimal xiaoShou;//   销售数量
    private BigDecimal tuiPin;//   退品数量
    private BigDecimal taoCanPeiSong;//   套餐配送
    private BigDecimal jingLiZengSong;//   经理赠送
    private BigDecimal guoQiLingQu;//   过期领取
    private BigDecimal zhiHuanChuPin;//   置换出品 (货品分类未勾选)
    private BigDecimal taoCanZhiHuan;//   套餐置换出品
    private BigDecimal taoCanZhiHuanTuiPin;//   套餐置换退品
    private BigDecimal panYing;//   盘盈数
    private BigDecimal panKui;//   盘亏数
    private BigDecimal jieJiuShu;//   借酒数
    private BigDecimal huanJiuShu;//   还酒数
    private BigDecimal qiChuJiCunZhengPin;//   期初寄存整瓶
    private BigDecimal zhengPinCunRu;//   整瓶存入
    private BigDecimal zhengPinQuChu;//   整瓶取出
    private BigDecimal zhengPinCunJiuChongGong;//   整瓶充公
    private BigDecimal weiGuoQiShouQuanQuChu;//
    private BigDecimal guoQiShouQuanQuChu;//
    private BigDecimal guoQiChongGongQuChu;//
    private BigDecimal zhengPinJiCunZhiHuanQuChu;//   寄存置换取出 (货品分类勾选)
    private BigDecimal qiChuJiCunKaiFen;//   期初开封数
    private BigDecimal kaiFengCunRu;//   开封存入
    private BigDecimal kaiFengQuChu;//   开封取出
    private BigDecimal kaiFengChongGong;//   开封充公
    private BigDecimal kaiFengWeiGuoQiShouQuanQuChu;//   开封未过期授权取出
    private BigDecimal kaiFengGuoQiShouQuanQuChu;//   开封过期授权取出
    private BigDecimal shiPanShu;//   实盘数
    private Integer zengSongType;//   赠送类型
    private BigDecimal taoCanChuPin;//   套餐出品
    private BigDecimal kaiFengChongGongShouQuanQuChu;//   开封充公授权取出
    private BigDecimal yuePanYing;//   月盘盈
    private BigDecimal yuePanKui;//   月盘亏
    private BigDecimal jieJiuGuaZhang;//   借酒挂账
    private BigDecimal qiMoKuCun;//  期末库存
    private BigDecimal sanJiuCunLiang;//   散酒存量
}
