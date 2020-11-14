package com.example.shoppingcart.bean;

import com.example.shoppingcart.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个文具商品的名称数组
    private static String[] mNameArray = {
            "得力中性笔", "得力笔袋", "晨光孔庙祈福中性笔", "晨光按动中性笔", "晨光橡皮擦", "小米签字笔", "小米巨能写中性笔", "白雪中性笔"
    };
    // 声明一个文具商品的描述数组
    private static String[] mDescArray = {
            "得力中性笔 0.5黑色水笔签字笔碳素笔 12支学生用文具用品",
            "得力67004 莫兰迪色系笔袋 双层大容量 PU多用途文具盒",
            "晨光孔庙祈福中性笔 学生用考试专用笔 0.5MM碳素黑色水性笔",
            "晨光按动中性笔 学生用考试 碳素黑色水性签字笔芯0.5mm 按压式",
            "晨光橡皮 小学生擦得干净4B 无毒像皮象皮米菲 不留痕无碎屑",
            "小米签字笔 米家中性笔0.5mm旋转出芯式墨黑笔水笔 学生用",
            "小米巨能写中性笔 米家签字笔芯 黑色0.5mm写字水笔 学生用",
            "白雪直液式走珠笔中性笔 黑色红直液笔0.5mm针管式 速干水笔学生用碳素笔"
    };
    // 声明一个文具商品的价格数组
    private static float[] mPriceArray = {11, 20, 10, 11, 8, 12, 9, 11};
    // 声明一个文具商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.deli_pen, R.drawable.deli_bihe, R.drawable.chenguagn_pen2, R.drawable.chenguang_pen,
            R.drawable.chenguang_eraser, R.drawable.xiaomi_pen, R.drawable.xiaomi_pen2, R.drawable.baixue_pen
    };
    // 声明一个文具商品的大图数组
    private static int[] mPicArray = {
            R.drawable.deli_pen_s, R.drawable.deli_bihe_s, R.drawable.chenguang_pen2_s, R.drawable.chenguang_pen_s,
            R.drawable.chenguang_eraser_s, R.drawable.xiaomi_pen_s, R.drawable.xiaomi_pen2_s, R.drawable.baixue_pen_s
    };

    // 获取默认的文具信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}