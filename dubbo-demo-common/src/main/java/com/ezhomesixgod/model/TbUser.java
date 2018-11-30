package com.ezhomesixgod.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "tb_user")
public class TbUser {
    /**
     * 用户ID>10000
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 邀请者ID
     */
    @Column(name = "father_id")
    private Integer fatherId;

    /**
     * 经纪人id
     */
    @Column(name = "agent_id")
    private Integer agentId;

    /**
     * 用户昵称
     */
    private String name;

    /**
     * 真实名字
     */
    @Column(name = "name_real")
    private String nameReal;

    /**
     * 身份证号码
     */
    private String idcard;

    /**
     * 用户的头像
     */
    private String head;

    /**
     * 用户性别：0-未知 1-男 2-女
     */
    private Byte sex;

    /**
     * 用户身份位：  0-普通用户   1-主播    2-机器人    3-主播申请中（普通用户）
     */
    private Byte identity;

    /**
     * 是否为官方账号： 0-不是    1-审核中 2-是
     */
    @Column(name = "is_official")
    private Integer isOfficial;

    /**
     * 是否为巡管： 0-不是    1-是
     */
    @Column(name = "is_patrol")
    private Integer isPatrol;

    /**
     * 是否为志愿者： 0-不是    1-审核中 2-是
     */
    @Column(name = "is_volunteer")
    private Integer isVolunteer;

    /**
     * 是否为经纪人： 0-不是    1-审核中 2-是
     */
    @Column(name = "is_agent")
    private Integer isAgent;


    /**
     * 绑定的手机号
     */
    private String phone;

    /**
     * 用户登陆密码
     */
    private String password;

    /**
     * 绑定微信登陆
     */
    @Column(name = "openid_wx")
    private String openidWx;

    /**
     * 微信账号
     */
    @Column(name = "wx_account")
    private String wxAccount;

    /**
     * 绑定支付宝
     */
    @Column(name = "openid_alipay")
    private String openidAlipay;

    /**
     * QQ登录
     */
    @Column(name = "openid_qq")
    private String openidQq;

    /**
     * 微博
     */
    @Column(name = "openid_wb")
    private String openidWb;

    /**
     * 钻石
     */
    private Integer diamond;

    /**
     * 绿票收益
     */
    private Integer total;

    /**
     * 绿钞
     */
    private Integer money;

    /**
     * 金币
     */
    private BigDecimal point;

    /**
     * 红心
     */
    private Integer heart;

    /**
     * 每日免费领取的红心个数
     */
    @Column(name = "heart_get")
    private Integer heartGet;

    /**
     * 期权
     */
    private Integer shareoption;

    /**
     * 交易密码
     */
    @Column(name = "pay_pwd")
    private String payPwd;

    /**
     * 实名认证： 0-未认证    1-正在审核  2-认证通过
     */
    @Column(name = "is_real")
    private Byte isReal;

    /**
     * 省
     */
    private String prov;

    /**
     * 市
     */
    private String city;

    /**
     * 个性签名
     */
    private String signature;

    /**
     * 备注，冻结的时候可以备注原因
     */
    private String comment;

    /**
     * 用户状态：0-正常 1-冻结
     */
    private Byte status;

    /**
     * 用户登陆态
     */
    private String token;

    /**
     * 用户登陆时间
     */
    @Column(name = "login_time")
    private Date loginTime;

    /**
     * 富豪经验值
     */
    @Column(name = "level_one")
    private Integer levelOne;

    /**
     * 明星经验值
     */
    @Column(name = "level_two")
    private Integer levelTwo;

    /**
     * 注册时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 获取用户ID>10000
     *
     * @return id - 用户ID>10000
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置用户ID>10000
     *
     * @param id 用户ID>10000
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取邀请者ID
     *
     * @return father_id - 邀请者ID
     */
    public Integer getFatherId() {
        return fatherId;
    }

    /**
     * 设置邀请者ID
     *
     * @param fatherId 邀请者ID
     */
    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    /**
     * 获取经纪人id
     *
     * @return agent_id - 经纪人id
     */
    public Integer getAgentId() {
        return agentId;
    }

    /**
     * 设置经纪人id
     *
     * @param agentId 经纪人id
     */
    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    /**
     * 获取用户昵称
     *
     * @return name - 用户昵称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用户昵称
     *
     * @param name 用户昵称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取真实名字
     *
     * @return name_real - 真实名字
     */
    public String getNameReal() {
        return nameReal;
    }

    /**
     * 设置真实名字
     *
     * @param nameReal 真实名字
     */
    public void setNameReal(String nameReal) {
        this.nameReal = nameReal;
    }



    /**
     * 获取身份证号码
     *
     * @return idcard - 身份证号码
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * 设置身份证号码
     *
     * @param idcard 身份证号码
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    /**
     * 获取用户的头像
     *
     * @return head - 用户的头像
     */
    public String getHead() {
        return head;
    }

    /**
     * 设置用户的头像
     *
     * @param head 用户的头像
     */
    public void setHead(String head) {
        this.head = head;
    }

    /**
     * 获取用户性别：0-未知 1-男 2-女
     *
     * @return sex - 用户性别：0-未知 1-男 2-女
     */
    public Byte getSex() {
        return sex;
    }

    /**
     * 设置用户性别：0-未知 1-男 2-女
     *
     * @param sex 用户性别：0-未知 1-男 2-女
     */
    public void setSex(Byte sex) {
        this.sex = sex;
    }

    /**
     * 获取用户身份位：  0-普通用户   1-主播    2-机器人
     *
     * @return identity - 用户身份位：  0-普通用户   1-主播    2-机器人
     */
    public Byte getIdentity() {
        return identity;
    }

    /**
     * 设置用户身份位：  0-普通用户   1-主播    2-机器人
     *
     * @param identity 用户身份位：  0-普通用户   1-主播    2-机器人
     */
    public void setIdentity(Byte identity) {
        this.identity = identity;
    }


    public Integer getIsOfficial() {
        return isOfficial;
    }

    public void setIsOfficial(Integer isOfficial) {
        this.isOfficial = isOfficial;
    }

    public Integer getIsPatrol() {
        return isPatrol;
    }

    public void setIsPatrol(Integer isPatrol) {
        this.isPatrol = isPatrol;
    }

    public Integer getIsVolunteer() {
        return isVolunteer;
    }

    public void setIsVolunteer(Integer isVolunteer) {
        this.isVolunteer = isVolunteer;
    }

    public Integer getIsAgent() {
        return isAgent;
    }

    public void setIsAgent(Integer isAgent) {
        this.isAgent = isAgent;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }


    /**
     * 获取绑定的手机号
     *
     * @return phone - 绑定的手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置绑定的手机号
     *
     * @param phone 绑定的手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取用户登陆密码
     *
     * @return password - 用户登陆密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置用户登陆密码
     *
     * @param password 用户登陆密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取绑定微信登陆
     *
     * @return openid_wx - 绑定微信登陆
     */
    public String getOpenidWx() {
        return openidWx;
    }

    /**
     * 设置绑定微信登陆
     *
     * @param openidWx 绑定微信登陆
     */
    public void setOpenidWx(String openidWx) {
        this.openidWx = openidWx;
    }

    /**
     * 获取微信账号
     *
     * @return wx_account - 微信账号
     */
    public String getWxAccount() {
        return wxAccount;
    }

    /**
     * 设置微信账号
     *
     * @param wxAccount 微信账号
     */
    public void setWxAccount(String wxAccount) {
        this.wxAccount = wxAccount;
    }

    /**
     * 获取绑定支付宝
     *
     * @return openid_alipay - 绑定支付宝
     */
    public String getOpenidAlipay() {
        return openidAlipay;
    }

    /**
     * 设置绑定支付宝
     *
     * @param openidAlipay 绑定支付宝
     */
    public void setOpenidAlipay(String openidAlipay) {
        this.openidAlipay = openidAlipay;
    }

    /**
     * 获取QQ登录
     *
     * @return openid_qq - QQ登录
     */
    public String getOpenidQq() {
        return openidQq;
    }

    /**
     * 设置QQ登录
     *
     * @param openidQq QQ登录
     */
    public void setOpenidQq(String openidQq) {
        this.openidQq = openidQq;
    }

    /**
     * 获取微博
     *
     * @return openid_wb - 微博
     */
    public String getOpenidWb() {
        return openidWb;
    }

    /**
     * 设置微博
     *
     * @param openidWb 微博
     */
    public void setOpenidWb(String openidWb) {
        this.openidWb = openidWb;
    }

    /**
     * 获取钻石
     *
     * @return diamond - 钻石
     */
    public Integer getDiamond() {
        return diamond;
    }

    /**
     * 设置钻石
     *
     * @param diamond 钻石
     */
    public void setDiamond(Integer diamond) {
        this.diamond = diamond;
    }

    /**
     * 获取绿钞
     *
     * @return money - 绿钞
     */
    public Integer getMoney() {
        return money;
    }

    /**
     * 设置绿钞
     *
     * @param money 绿钞
     */
    public void setMoney(Integer money) {
        this.money = money;
    }

    /**
     * 获取金币
     *
     * @return point - 金币
     */
    public BigDecimal getPoint() {
        return point;
    }

    /**
     * 设置金币
     *
     * @param point 金币
     */
    public void setPoint(BigDecimal point) {
        this.point = point;
    }

    /**
     * 获取红心
     *
     * @return heart - 红心
     */
    public Integer getHeart() {
        return heart;
    }

    /**
     * 设置红心
     *
     * @param heart 红心
     */
    public void setHeart(Integer heart) {
        this.heart = heart;
    }

    /**
     * 获取每日免费领取的红心个数
     *
     * @return heart_get - 每日免费领取的红心个数
     */
    public Integer getHeartGet() {
        return heartGet;
    }

    /**
     * 设置每日免费领取的红心个数
     *
     * @param heartGet 每日免费领取的红心个数
     */
    public void setHeartGet(Integer heartGet) {
        this.heartGet = heartGet;
    }

    /**
     * 获取期权
     *
     * @return shareoption - 期权
     */
    public Integer getShareoption() {
        return shareoption;
    }

    /**
     * 设置期权
     *
     * @param shareoption 期权
     */
    public void setShareoption(Integer shareoption) {
        this.shareoption = shareoption;
    }

    /**
     * 获取交易密码
     *
     * @return pay_pwd - 交易密码
     */
    public String getPayPwd() {
        return payPwd;
    }

    /**
     * 设置交易密码
     *
     * @param payPwd 交易密码
     */
    public void setPayPwd(String payPwd) {
        this.payPwd = payPwd;
    }

    /**
     * 获取实名认证： 0-未认证    1-正在审核  2-认证通过
     *
     * @return is_real - 实名认证： 0-未认证    1-正在审核  2-认证通过
     */
    public Byte getIsReal() {
        return isReal;
    }

    /**
     * 设置实名认证： 0-未认证    1-正在审核  2-认证通过
     *
     * @param isReal 实名认证： 0-未认证    1-正在审核  2-认证通过
     */
    public void setIsReal(Byte isReal) {
        this.isReal = isReal;
    }

    /**
     * 获取省
     *
     * @return prov - 省
     */
    public String getProv() {
        return prov;
    }

    /**
     * 设置省
     *
     * @param prov 省
     */
    public void setProv(String prov) {
        this.prov = prov;
    }

    /**
     * 获取市
     *
     * @return city - 市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置市
     *
     * @param city 市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取个性签名
     *
     * @return signature - 个性签名
     */
    public String getSignature() {
        return signature;
    }

    /**
     * 设置个性签名
     *
     * @param signature 个性签名
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * 获取备注，冻结的时候可以备注原因
     *
     * @return comment - 备注，冻结的时候可以备注原因
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置备注，冻结的时候可以备注原因
     *
     * @param comment 备注，冻结的时候可以备注原因
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * 获取用户状态：0-正常 1-冻结
     *
     * @return status - 用户状态：0-正常 1-冻结
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置用户状态：0-正常 1-冻结
     *
     * @param status 用户状态：0-正常 1-冻结
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取用户登陆态
     *
     * @return token - 用户登陆态
     */
    public String getToken() {
        return token;
    }

    /**
     * 设置用户登陆态
     *
     * @param token 用户登陆态
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * 获取用户登陆时间
     *
     * @return login_time - 用户登陆时间
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * 设置用户登陆时间
     *
     * @param loginTime 用户登陆时间
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * 获取富豪经验值
     *
     * @return level_one - 富豪经验值
     */
    public Integer getLevelOne() {
        return levelOne;
    }

    /**
     * 设置富豪经验值
     *
     * @param levelOne 富豪经验值
     */
    public void setLevelOne(Integer levelOne) {
        this.levelOne = levelOne;
    }

    /**
     * 获取明星经验值
     *
     * @return level_two - 明星经验值
     */
    public Integer getLevelTwo() {
        return levelTwo;
    }

    /**
     * 设置明星经验值
     *
     * @param levelTwo 明星经验值
     */
    public void setLevelTwo(Integer levelTwo) {
        this.levelTwo = levelTwo;
    }

    /**
     * 获取注册时间
     *
     * @return create_time - 注册时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置注册时间
     *
     * @param createTime 注册时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}