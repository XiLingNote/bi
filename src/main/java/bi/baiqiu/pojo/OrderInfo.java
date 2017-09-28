package bi.baiqiu.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class OrderInfo {
    private Integer orderId;

    private String orderSn;

    private Integer userId;

    private Integer beneficiaryId;

    private Boolean orderStatus;

    private Boolean shippingStatus;

    private Boolean payStatus;

    private String consignee;

    private String consigneeEncrypt;

    private Short country;

    private Short province;

    private Short city;

    private Short district;

    private String address;

    private String zipcode;

    private String tel;

    private String telEncrypt;

    private String mobile;

    private String mobileEncrypt;

    private String email;

    private String emailEncrypt;

    private String bestTime;

    private String signBuilding;

    private String postscript;

    private Byte shippingId;

    private String shippingName;

    private Byte payId;

    private String payName;

    private String howOos;

    private String howSurplus;

    private String packName;

    private String cardName;

    private String cardMessage;

    private String invPayee;

    private String invContent;

    private BigDecimal goodsAmount;

    private BigDecimal shippingFee;

    private BigDecimal insureFee;

    private BigDecimal payFee;

    private BigDecimal packFee;

    private BigDecimal cardFee;

    private BigDecimal moneyPaid;

    private String surplus;

    private String integral;

    private String integralMoney;

    private String bonus;

    private BigDecimal orderAmount;

    private Short fromAd;

    private String referer;

    private Integer addTime;

    private Integer confirmTime;

    private Integer payTime;

    private Integer prepayTime;

    private Integer shippingTime;

    private Byte packId;

    private Byte cardId;

    private Short bonusId;

    private String invoiceNo;

    private String extensionCode;

    private Integer extensionId;

    private String toBuyer;

    private String payNote;

    private Short agencyId;

    private String invType;

    private BigDecimal tax;

    private Boolean isSeparate;

    private Integer parentId;

    private BigDecimal discount;

    private Boolean deliveryType;

    private Boolean outletType;

    private Boolean invoiceStatus;

    private Integer deliveryStationId;

    private Integer lockStatus;

    private Integer rj;

    private Integer goodsCount;

    private Boolean orderFrom;

    private Boolean processStatus;

    private Byte shippingDays;

    private Boolean rangeStatus;

    private Boolean returnStatus;

    private Boolean refundStatus;

    private Integer rangeTime;

    private Integer deliveryTime;

    private Boolean occupiedStock;

    private Boolean occupiedAvailable;

    private Boolean questionStatus;

    private Integer questionTime;

    private String mergeFrom;

    private String splitTo;

    private Boolean isWeigh;

    private String weigh;

    private String weighBrief;

    private Boolean chasedOrNot;

    private Boolean noticeStatus;

    private Integer noticeTime;

    private Boolean directRange;

    private Integer splitFrom;

    private Boolean isDeliveryPrint;

    private Boolean waitPay;

    private BigDecimal totalAmount;

    private Byte isLocked;

    private Byte noticePay;

    private Integer jhdId;

    private Byte lylx;

    private String dealCode;

    private Integer sdId;

    private Byte isSend;

    private String orderNum;

    private String userNick;

    private String userNickEncrypt;

    private String orderNote;

    private BigDecimal backAmount;

    private BigDecimal realMoney;

    private Byte distType;

    private BigDecimal realShippingFee;

    private Integer ckId;

    private Byte isHandled;

    private String alipayNo;

    private Boolean isPrint;

    private Integer updateTime;

    private String userAlipay;

    private String userAlipayEncrypt;

    private Integer lfStatus;

    private Integer boxAddStatus;

    private Integer isAdds;

    private Date appointTime;

    private Integer refundId;

    private Integer isHand;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBeneficiaryId() {
        return beneficiaryId;
    }

    public void setBeneficiaryId(Integer beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }

    public Boolean getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Boolean getShippingStatus() {
        return shippingStatus;
    }

    public void setShippingStatus(Boolean shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    public Boolean getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Boolean payStatus) {
        this.payStatus = payStatus;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getConsigneeEncrypt() {
        return consigneeEncrypt;
    }

    public void setConsigneeEncrypt(String consigneeEncrypt) {
        this.consigneeEncrypt = consigneeEncrypt == null ? null : consigneeEncrypt.trim();
    }

    public Short getCountry() {
        return country;
    }

    public void setCountry(Short country) {
        this.country = country;
    }

    public Short getProvince() {
        return province;
    }

    public void setProvince(Short province) {
        this.province = province;
    }

    public Short getCity() {
        return city;
    }

    public void setCity(Short city) {
        this.city = city;
    }

    public Short getDistrict() {
        return district;
    }

    public void setDistrict(Short district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getTelEncrypt() {
        return telEncrypt;
    }

    public void setTelEncrypt(String telEncrypt) {
        this.telEncrypt = telEncrypt == null ? null : telEncrypt.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getMobileEncrypt() {
        return mobileEncrypt;
    }

    public void setMobileEncrypt(String mobileEncrypt) {
        this.mobileEncrypt = mobileEncrypt == null ? null : mobileEncrypt.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getEmailEncrypt() {
        return emailEncrypt;
    }

    public void setEmailEncrypt(String emailEncrypt) {
        this.emailEncrypt = emailEncrypt == null ? null : emailEncrypt.trim();
    }

    public String getBestTime() {
        return bestTime;
    }

    public void setBestTime(String bestTime) {
        this.bestTime = bestTime == null ? null : bestTime.trim();
    }

    public String getSignBuilding() {
        return signBuilding;
    }

    public void setSignBuilding(String signBuilding) {
        this.signBuilding = signBuilding == null ? null : signBuilding.trim();
    }

    public String getPostscript() {
        return postscript;
    }

    public void setPostscript(String postscript) {
        this.postscript = postscript == null ? null : postscript.trim();
    }

    public Byte getShippingId() {
        return shippingId;
    }

    public void setShippingId(Byte shippingId) {
        this.shippingId = shippingId;
    }

    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName == null ? null : shippingName.trim();
    }

    public Byte getPayId() {
        return payId;
    }

    public void setPayId(Byte payId) {
        this.payId = payId;
    }

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName == null ? null : payName.trim();
    }

    public String getHowOos() {
        return howOos;
    }

    public void setHowOos(String howOos) {
        this.howOos = howOos == null ? null : howOos.trim();
    }

    public String getHowSurplus() {
        return howSurplus;
    }

    public void setHowSurplus(String howSurplus) {
        this.howSurplus = howSurplus == null ? null : howSurplus.trim();
    }

    public String getPackName() {
        return packName;
    }

    public void setPackName(String packName) {
        this.packName = packName == null ? null : packName.trim();
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName == null ? null : cardName.trim();
    }

    public String getCardMessage() {
        return cardMessage;
    }

    public void setCardMessage(String cardMessage) {
        this.cardMessage = cardMessage == null ? null : cardMessage.trim();
    }

    public String getInvPayee() {
        return invPayee;
    }

    public void setInvPayee(String invPayee) {
        this.invPayee = invPayee == null ? null : invPayee.trim();
    }

    public String getInvContent() {
        return invContent;
    }

    public void setInvContent(String invContent) {
        this.invContent = invContent == null ? null : invContent.trim();
    }

    public BigDecimal getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(BigDecimal goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public BigDecimal getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(BigDecimal shippingFee) {
        this.shippingFee = shippingFee;
    }

    public BigDecimal getInsureFee() {
        return insureFee;
    }

    public void setInsureFee(BigDecimal insureFee) {
        this.insureFee = insureFee;
    }

    public BigDecimal getPayFee() {
        return payFee;
    }

    public void setPayFee(BigDecimal payFee) {
        this.payFee = payFee;
    }

    public BigDecimal getPackFee() {
        return packFee;
    }

    public void setPackFee(BigDecimal packFee) {
        this.packFee = packFee;
    }

    public BigDecimal getCardFee() {
        return cardFee;
    }

    public void setCardFee(BigDecimal cardFee) {
        this.cardFee = cardFee;
    }

    public BigDecimal getMoneyPaid() {
        return moneyPaid;
    }

    public void setMoneyPaid(BigDecimal moneyPaid) {
        this.moneyPaid = moneyPaid;
    }

    public String getSurplus() {
        return surplus;
    }

    public void setSurplus(String surplus) {
        this.surplus = surplus == null ? null : surplus.trim();
    }

    public String getIntegral() {
        return integral;
    }

    public void setIntegral(String integral) {
        this.integral = integral == null ? null : integral.trim();
    }

    public String getIntegralMoney() {
        return integralMoney;
    }

    public void setIntegralMoney(String integralMoney) {
        this.integralMoney = integralMoney == null ? null : integralMoney.trim();
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus == null ? null : bonus.trim();
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Short getFromAd() {
        return fromAd;
    }

    public void setFromAd(Short fromAd) {
        this.fromAd = fromAd;
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer == null ? null : referer.trim();
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public Integer getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Integer confirmTime) {
        this.confirmTime = confirmTime;
    }

    public Integer getPayTime() {
        return payTime;
    }

    public void setPayTime(Integer payTime) {
        this.payTime = payTime;
    }

    public Integer getPrepayTime() {
        return prepayTime;
    }

    public void setPrepayTime(Integer prepayTime) {
        this.prepayTime = prepayTime;
    }

    public Integer getShippingTime() {
        return shippingTime;
    }

    public void setShippingTime(Integer shippingTime) {
        this.shippingTime = shippingTime;
    }

    public Byte getPackId() {
        return packId;
    }

    public void setPackId(Byte packId) {
        this.packId = packId;
    }

    public Byte getCardId() {
        return cardId;
    }

    public void setCardId(Byte cardId) {
        this.cardId = cardId;
    }

    public Short getBonusId() {
        return bonusId;
    }

    public void setBonusId(Short bonusId) {
        this.bonusId = bonusId;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo == null ? null : invoiceNo.trim();
    }

    public String getExtensionCode() {
        return extensionCode;
    }

    public void setExtensionCode(String extensionCode) {
        this.extensionCode = extensionCode == null ? null : extensionCode.trim();
    }

    public Integer getExtensionId() {
        return extensionId;
    }

    public void setExtensionId(Integer extensionId) {
        this.extensionId = extensionId;
    }

    public String getToBuyer() {
        return toBuyer;
    }

    public void setToBuyer(String toBuyer) {
        this.toBuyer = toBuyer == null ? null : toBuyer.trim();
    }

    public String getPayNote() {
        return payNote;
    }

    public void setPayNote(String payNote) {
        this.payNote = payNote == null ? null : payNote.trim();
    }

    public Short getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Short agencyId) {
        this.agencyId = agencyId;
    }

    public String getInvType() {
        return invType;
    }

    public void setInvType(String invType) {
        this.invType = invType == null ? null : invType.trim();
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public Boolean getIsSeparate() {
        return isSeparate;
    }

    public void setIsSeparate(Boolean isSeparate) {
        this.isSeparate = isSeparate;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public Boolean getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(Boolean deliveryType) {
        this.deliveryType = deliveryType;
    }

    public Boolean getOutletType() {
        return outletType;
    }

    public void setOutletType(Boolean outletType) {
        this.outletType = outletType;
    }

    public Boolean getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(Boolean invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public Integer getDeliveryStationId() {
        return deliveryStationId;
    }

    public void setDeliveryStationId(Integer deliveryStationId) {
        this.deliveryStationId = deliveryStationId;
    }

    public Integer getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(Integer lockStatus) {
        this.lockStatus = lockStatus;
    }

    public Integer getRj() {
        return rj;
    }

    public void setRj(Integer rj) {
        this.rj = rj;
    }

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    public Boolean getOrderFrom() {
        return orderFrom;
    }

    public void setOrderFrom(Boolean orderFrom) {
        this.orderFrom = orderFrom;
    }

    public Boolean getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(Boolean processStatus) {
        this.processStatus = processStatus;
    }

    public Byte getShippingDays() {
        return shippingDays;
    }

    public void setShippingDays(Byte shippingDays) {
        this.shippingDays = shippingDays;
    }

    public Boolean getRangeStatus() {
        return rangeStatus;
    }

    public void setRangeStatus(Boolean rangeStatus) {
        this.rangeStatus = rangeStatus;
    }

    public Boolean getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(Boolean returnStatus) {
        this.returnStatus = returnStatus;
    }

    public Boolean getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Boolean refundStatus) {
        this.refundStatus = refundStatus;
    }

    public Integer getRangeTime() {
        return rangeTime;
    }

    public void setRangeTime(Integer rangeTime) {
        this.rangeTime = rangeTime;
    }

    public Integer getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Integer deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Boolean getOccupiedStock() {
        return occupiedStock;
    }

    public void setOccupiedStock(Boolean occupiedStock) {
        this.occupiedStock = occupiedStock;
    }

    public Boolean getOccupiedAvailable() {
        return occupiedAvailable;
    }

    public void setOccupiedAvailable(Boolean occupiedAvailable) {
        this.occupiedAvailable = occupiedAvailable;
    }

    public Boolean getQuestionStatus() {
        return questionStatus;
    }

    public void setQuestionStatus(Boolean questionStatus) {
        this.questionStatus = questionStatus;
    }

    public Integer getQuestionTime() {
        return questionTime;
    }

    public void setQuestionTime(Integer questionTime) {
        this.questionTime = questionTime;
    }

    public String getMergeFrom() {
        return mergeFrom;
    }

    public void setMergeFrom(String mergeFrom) {
        this.mergeFrom = mergeFrom == null ? null : mergeFrom.trim();
    }

    public String getSplitTo() {
        return splitTo;
    }

    public void setSplitTo(String splitTo) {
        this.splitTo = splitTo == null ? null : splitTo.trim();
    }

    public Boolean getIsWeigh() {
        return isWeigh;
    }

    public void setIsWeigh(Boolean isWeigh) {
        this.isWeigh = isWeigh;
    }

    public String getWeigh() {
        return weigh;
    }

    public void setWeigh(String weigh) {
        this.weigh = weigh == null ? null : weigh.trim();
    }

    public String getWeighBrief() {
        return weighBrief;
    }

    public void setWeighBrief(String weighBrief) {
        this.weighBrief = weighBrief == null ? null : weighBrief.trim();
    }

    public Boolean getChasedOrNot() {
        return chasedOrNot;
    }

    public void setChasedOrNot(Boolean chasedOrNot) {
        this.chasedOrNot = chasedOrNot;
    }

    public Boolean getNoticeStatus() {
        return noticeStatus;
    }

    public void setNoticeStatus(Boolean noticeStatus) {
        this.noticeStatus = noticeStatus;
    }

    public Integer getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(Integer noticeTime) {
        this.noticeTime = noticeTime;
    }

    public Boolean getDirectRange() {
        return directRange;
    }

    public void setDirectRange(Boolean directRange) {
        this.directRange = directRange;
    }

    public Integer getSplitFrom() {
        return splitFrom;
    }

    public void setSplitFrom(Integer splitFrom) {
        this.splitFrom = splitFrom;
    }

    public Boolean getIsDeliveryPrint() {
        return isDeliveryPrint;
    }

    public void setIsDeliveryPrint(Boolean isDeliveryPrint) {
        this.isDeliveryPrint = isDeliveryPrint;
    }

    public Boolean getWaitPay() {
        return waitPay;
    }

    public void setWaitPay(Boolean waitPay) {
        this.waitPay = waitPay;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Byte getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Byte isLocked) {
        this.isLocked = isLocked;
    }

    public Byte getNoticePay() {
        return noticePay;
    }

    public void setNoticePay(Byte noticePay) {
        this.noticePay = noticePay;
    }

    public Integer getJhdId() {
        return jhdId;
    }

    public void setJhdId(Integer jhdId) {
        this.jhdId = jhdId;
    }

    public Byte getLylx() {
        return lylx;
    }

    public void setLylx(Byte lylx) {
        this.lylx = lylx;
    }

    public String getDealCode() {
        return dealCode;
    }

    public void setDealCode(String dealCode) {
        this.dealCode = dealCode == null ? null : dealCode.trim();
    }

    public Integer getSdId() {
        return sdId;
    }

    public void setSdId(Integer sdId) {
        this.sdId = sdId;
    }

    public Byte getIsSend() {
        return isSend;
    }

    public void setIsSend(Byte isSend) {
        this.isSend = isSend;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }

    public String getUserNick() {
        return userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick == null ? null : userNick.trim();
    }

    public String getUserNickEncrypt() {
        return userNickEncrypt;
    }

    public void setUserNickEncrypt(String userNickEncrypt) {
        this.userNickEncrypt = userNickEncrypt == null ? null : userNickEncrypt.trim();
    }

    public String getOrderNote() {
        return orderNote;
    }

    public void setOrderNote(String orderNote) {
        this.orderNote = orderNote == null ? null : orderNote.trim();
    }

    public BigDecimal getBackAmount() {
        return backAmount;
    }

    public void setBackAmount(BigDecimal backAmount) {
        this.backAmount = backAmount;
    }

    public BigDecimal getRealMoney() {
        return realMoney;
    }

    public void setRealMoney(BigDecimal realMoney) {
        this.realMoney = realMoney;
    }

    public Byte getDistType() {
        return distType;
    }

    public void setDistType(Byte distType) {
        this.distType = distType;
    }

    public BigDecimal getRealShippingFee() {
        return realShippingFee;
    }

    public void setRealShippingFee(BigDecimal realShippingFee) {
        this.realShippingFee = realShippingFee;
    }

    public Integer getCkId() {
        return ckId;
    }

    public void setCkId(Integer ckId) {
        this.ckId = ckId;
    }

    public Byte getIsHandled() {
        return isHandled;
    }

    public void setIsHandled(Byte isHandled) {
        this.isHandled = isHandled;
    }

    public String getAlipayNo() {
        return alipayNo;
    }

    public void setAlipayNo(String alipayNo) {
        this.alipayNo = alipayNo == null ? null : alipayNo.trim();
    }

    public Boolean getIsPrint() {
        return isPrint;
    }

    public void setIsPrint(Boolean isPrint) {
        this.isPrint = isPrint;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public String getUserAlipay() {
        return userAlipay;
    }

    public void setUserAlipay(String userAlipay) {
        this.userAlipay = userAlipay == null ? null : userAlipay.trim();
    }

    public String getUserAlipayEncrypt() {
        return userAlipayEncrypt;
    }

    public void setUserAlipayEncrypt(String userAlipayEncrypt) {
        this.userAlipayEncrypt = userAlipayEncrypt == null ? null : userAlipayEncrypt.trim();
    }

    public Integer getLfStatus() {
        return lfStatus;
    }

    public void setLfStatus(Integer lfStatus) {
        this.lfStatus = lfStatus;
    }

    public Integer getBoxAddStatus() {
        return boxAddStatus;
    }

    public void setBoxAddStatus(Integer boxAddStatus) {
        this.boxAddStatus = boxAddStatus;
    }

    public Integer getIsAdds() {
        return isAdds;
    }

    public void setIsAdds(Integer isAdds) {
        this.isAdds = isAdds;
    }

    public Date getAppointTime() {
        return appointTime;
    }

    public void setAppointTime(Date appointTime) {
        this.appointTime = appointTime;
    }

    public Integer getRefundId() {
        return refundId;
    }

    public void setRefundId(Integer refundId) {
        this.refundId = refundId;
    }

    public Integer getIsHand() {
        return isHand;
    }

    public void setIsHand(Integer isHand) {
        this.isHand = isHand;
    }
}