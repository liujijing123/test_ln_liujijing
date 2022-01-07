package com.liujijing.pojo;

/**
 * 本类作者：刘计静
 * 创建时间：2021/12/29 8:43
 * 本类作用：xxx
 */
public class UserExBean {
    private int userId;
    private String userName;
    private int userSex;
    private String  userIdNumber;
    private String userPhone;
    private int   userType;
    private int roomTypeId;
    private String      typeName;
    private String zhong;
    private int      roomId;
    private int roomType;
    private double    roomPrice;
    private String roomFloor;
     private String       roomState;
     private int     OutID;
     private String       userInDate;
    private String userOutDate;
    private double  receiptIn;
    private int   InID;
    private int InType;
    private String UserInDate;
     private String   UserOutDate;
     private double  RoomCash;
     private double RoomReceipt;
     private String     RoomReceiptType;
   private String RoomRemark;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserSex() {
        return userSex;
    }

    public void setUserSex(int userSex) {
        this.userSex = userSex;
    }

    public String getUserIdNumber() {
        return userIdNumber;
    }

    public void setUserIdNumber(String userIdNumber) {
        this.userIdNumber = userIdNumber;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public int getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(int roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getZhong() {
        return zhong;
    }

    public void setZhong(String zhong) {
        this.zhong = zhong;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getRoomType() {
        return roomType;
    }

    public void setRoomType(int roomType) {
        this.roomType = roomType;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String getRoomFloor() {
        return roomFloor;
    }

    public void setRoomFloor(String roomFloor) {
        this.roomFloor = roomFloor;
    }

    public String getRoomState() {
        return roomState;
    }

    public void setRoomState(String roomState) {
        this.roomState = roomState;
    }

    public int getOutID() {
        return OutID;
    }

    public void setOutID(int outID) {
        OutID = outID;
    }

    public String getUserInDate() {
        return userInDate;
    }

    public void setUserInDate(String userInDate) {
        this.userInDate = userInDate;
    }

    public String getUserOutDate() {
        return userOutDate;
    }

    public void setUserOutDate(String userOutDate) {
        this.userOutDate = userOutDate;
    }

    public double getRoomCash() {
        return RoomCash;
    }

    public void setRoomCash(double roomCash) {
        RoomCash = roomCash;
    }

    public double getRoomReceipt() {
        return RoomReceipt;
    }

    public void setRoomReceipt(double roomReceipt) {
        RoomReceipt = roomReceipt;
    }

    public String getRoomReceiptType() {
        return RoomReceiptType;
    }

    public void setRoomReceiptType(String roomReceiptType) {
        RoomReceiptType = roomReceiptType;
    }

    public String getRoomRemark() {
        return RoomRemark;
    }

    public void setRoomRemark(String roomRemark) {
        RoomRemark = roomRemark;
    }

    public double getReceiptIn() {
        return receiptIn;
    }

    public void setReceiptIn(double receiptIn) {
        this.receiptIn = receiptIn;
    }

    public int getInID() {
        return InID;
    }

    public void setInID(int inID) {
        InID = inID;
    }

    public int getInType() {
        return InType;
    }

    public void setInType(int inType) {
        InType = inType;
    }

    public UserExBean(int userId, String userName, int userSex, String userIdNumber, String userPhone, int userType, int roomTypeId, String typeName, String zhong, int roomId, int roomType, double roomPrice, String roomFloor, String roomState, int outID, String userInDate, String userOutDate, double receiptIn, int inID, int inType, String userInDate1, String userOutDate1, double roomCash, double roomReceipt, String roomReceiptType, String roomRemark) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.userIdNumber = userIdNumber;
        this.userPhone = userPhone;
        this.userType = userType;
        this.roomTypeId = roomTypeId;
        this.typeName = typeName;
        this.zhong = zhong;
        this.roomId = roomId;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.roomFloor = roomFloor;
        this.roomState = roomState;
        OutID = outID;
        this.userInDate = userInDate;
        this.userOutDate = userOutDate;
        this.receiptIn = receiptIn;
        InID = inID;
        InType = inType;
        UserInDate = userInDate1;
        UserOutDate = userOutDate1;
        RoomCash = roomCash;
        RoomReceipt = roomReceipt;
        RoomReceiptType = roomReceiptType;
        RoomRemark = roomRemark;
    }

    public UserExBean() {
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", userIdNumber='" + userIdNumber + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userType=" + userType +
                ", roomTypeId=" + roomTypeId +
                ", typeName='" + typeName + '\'' +
                ", zhong='" + zhong + '\'' +
                ", roomId=" + roomId +
                ", roomType=" + roomType +
                ", roomPrice=" + roomPrice +
                ", roomFloor='" + roomFloor + '\'' +
                ", roomState='" + roomState + '\'' +
                ", OutID=" + OutID +
                ", userInDate='" + userInDate + '\'' +
                ", userOutDate='" + userOutDate + '\'' +
                ", receiptIn=" + receiptIn +
                ", InID=" + InID +
                ", InType=" + InType +
                ", UserInDate='" + UserInDate + '\'' +
                ", UserOutDate='" + UserOutDate + '\'' +
                ", RoomCash=" + RoomCash +
                ", RoomReceipt=" + RoomReceipt +
                ", RoomReceiptType='" + RoomReceiptType + '\'' +
                ", RoomRemark='" + RoomRemark + '\'' +
                '}';
    }
}
