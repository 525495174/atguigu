package com.day10.homework.test_three;

public enum Payment implements Payable{
    ALIPAY{
        @Override
        public void pay() {
            System.out.println("扫码支付");
        }
    },WECHAT{
        @Override
        public void pay() {
            System.out.println("扫码支付");
        }
    }
    ,CREDIT_CARD,DEPOSIT_CARD;

    @Override
    public void pay() {
        System.out.println("输入卡号支付");
    }


//    @Override
//    public void pay() {
//        switch (this){
//            case ALIPAY:
//            case WECHAT:
//                System.out.println("扫码支付");
//                break;
//            case CREDIT_CARD:
//            case DEPOSIT_CARD:
//                System.out.println("输入卡号支付");
//                break;
//        }
//
//    }


}
