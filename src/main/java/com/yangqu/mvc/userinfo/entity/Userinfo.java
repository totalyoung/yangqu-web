package com.yangqu.mvc.userinfo.entity;

import java.io.Serializable;

/**
 * 玩家信息表 实体
 */
public class Userinfo implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	
	public Userinfo(){
		super();
	}


	/**
	 * Userinfo构造函数
	 * @param userId		角色Id
	 * @param accountId		账号Id
	 * @param nickName		角色昵称
	 * @param face		头像
	 * @param exp		经验
	 * @param level		等级
	 * @param vip		vip等级
	 * @param diamond		钻石数量
	 * @param gold		金币数量
	 * @param honor		荣誉点
	 * @param skillPoint
	 * @param ST		玩家体力
	 * @param BP		玩家能量
	 * @param commonFragment		玩家通用碎片
	 * @param leagueId		联盟id
	 * @param leaguePosition		玩家在联盟的职位, 1:盟主 2:副盟主 3:长老 4:精英 5:成员
	 */
	public Userinfo(Long userId, Integer accountId, String nickName, String face, Integer exp, Integer level, Integer vip, Integer diamond, Integer gold, Integer honor, Integer skillPoint, Integer ST, Integer BP, Integer commonFragment, Integer leagueId, Integer leaguePosition) {
		super();
		this.userId = userId;
		this.accountId = accountId;
		this.nickName = nickName;
		this.face = face;
		this.exp = exp;
		this.level = level;
		this.vip = vip;
		this.diamond = diamond;
		this.gold = gold;
		this.honor = honor;
		this.skillPoint = skillPoint;
		this.ST = ST;
		this.BP = BP;
		this.commonFragment = commonFragment;
		this.leagueId = leagueId;
		this.leaguePosition = leaguePosition;
	}

	/**
	 * 角色Id
	 */
	private Long userId;

	/**
	 * 账号Id
	 */
	private Integer accountId;

	/**
	 * 角色昵称
	 */
	private String nickName;

	/**
	 * 头像
	 */
	private String face;

	/**
	 * 经验
	 */
	private Integer exp;

	/**
	 * 等级
	 */
	private Integer level;

	/**
	 * vip等级
	 */
	private Integer vip;

	/**
	 * 钻石数量
	 */
	private Integer diamond;

	/**
	 * 金币数量
	 */
	private Integer gold;

	/**
	 * 荣誉点
	 */
	private Integer honor;

	/**
	 *
	 */
	private Integer skillPoint;

	/**
	 * 玩家体力
	 */
	private Integer ST;

	/**
	 * 玩家能量
	 */
	private Integer BP;

	/**
	 * 玩家通用碎片
	 */
	private Integer commonFragment;

	/**
	 * 联盟id
	 */
	private Integer leagueId;

	/**
	 * 玩家在联盟的职位, 1:盟主 2:副盟主 3:长老 4:精英 5:成员
	 */
	private Integer leaguePosition;

	/**
	 * 获取 角色Id
	 * @return userId
	 */
	public Long getUserId(){
		return userId;
	}

	/**
	 * 设置 角色Id
	 * @param userId
	 */
	public void setUserId(Long userId){
		this.userId = userId;
	}

	/**
	 * 获取 账号Id
	 * @return accountId
	 */
	public Integer getAccountId(){
		return accountId;
	}

	/**
	 * 设置 账号Id
	 * @param accountId
	 */
	public void setAccountId(Integer accountId){
		this.accountId = accountId;
	}

	/**
	 * 获取 角色昵称
	 * @return nickName
	 */
	public String getNickName(){
		return nickName;
	}

	/**
	 * 设置 角色昵称
	 * @param nickName
	 */
	public void setNickName(String nickName){
		this.nickName = nickName;
	}

	/**
	 * 获取 头像
	 * @return face
	 */
	public String getFace(){
		return face;
	}

	/**
	 * 设置 头像
	 * @param face
	 */
	public void setFace(String face){
		this.face = face;
	}

	/**
	 * 获取 经验
	 * @return exp
	 */
	public Integer getExp(){
		return exp;
	}

	/**
	 * 设置 经验
	 * @param exp
	 */
	public void setExp(Integer exp){
		this.exp = exp;
	}

	/**
	 * 获取 等级
	 * @return level
	 */
	public Integer getLevel(){
		return level;
	}

	/**
	 * 设置 等级
	 * @param level
	 */
	public void setLevel(Integer level){
		this.level = level;
	}

	/**
	 * 获取 vip等级
	 * @return vip
	 */
	public Integer getVip(){
		return vip;
	}

	/**
	 * 设置 vip等级
	 * @param vip
	 */
	public void setVip(Integer vip){
		this.vip = vip;
	}

	/**
	 * 获取 钻石数量
	 * @return diamond
	 */
	public Integer getDiamond(){
		return diamond;
	}

	/**
	 * 设置 钻石数量
	 * @param diamond
	 */
	public void setDiamond(Integer diamond){
		this.diamond = diamond;
	}

	/**
	 * 获取 金币数量
	 * @return gold
	 */
	public Integer getGold(){
		return gold;
	}

	/**
	 * 设置 金币数量
	 * @param gold
	 */
	public void setGold(Integer gold){
		this.gold = gold;
	}

	/**
	 * 获取 荣誉点
	 * @return honor
	 */
	public Integer getHonor(){
		return honor;
	}

	/**
	 * 设置 荣誉点
	 * @param honor
	 */
	public void setHonor(Integer honor){
		this.honor = honor;
	}

	/**
	 * 获取
	 * @return skillPoint
	 */
	public Integer getSkillPoint(){
		return skillPoint;
	}

	/**
	 * 设置
	 * @param skillPoint
	 */
	public void setSkillPoint(Integer skillPoint){
		this.skillPoint = skillPoint;
	}

	/**
	 * 获取 玩家体力
	 * @return ST
	 */
	public Integer getST(){
		return ST;
	}

	/**
	 * 设置 玩家体力
	 * @param ST
	 */
	public void setST(Integer ST){
		this.ST = ST;
	}

	/**
	 * 获取 玩家能量
	 * @return BP
	 */
	public Integer getBP(){
		return BP;
	}

	/**
	 * 设置 玩家能量
	 * @param BP
	 */
	public void setBP(Integer BP){
		this.BP = BP;
	}

	/**
	 * 获取 玩家通用碎片
	 * @return commonFragment
	 */
	public Integer getCommonFragment(){
		return commonFragment;
	}

	/**
	 * 设置 玩家通用碎片
	 * @param commonFragment
	 */
	public void setCommonFragment(Integer commonFragment){
		this.commonFragment = commonFragment;
	}

	/**
	 * 获取 联盟id
	 * @return leagueId
	 */
	public Integer getLeagueId(){
		return leagueId;
	}

	/**
	 * 设置 联盟id
	 * @param leagueId
	 */
	public void setLeagueId(Integer leagueId){
		this.leagueId = leagueId;
	}

	/**
	 * 获取 玩家在联盟的职位, 1:盟主 2:副盟主 3:长老 4:精英 5:成员
	 * @return leaguePosition
	 */
	public Integer getLeaguePosition(){
		return leaguePosition;
	}

	/**
	 * 设置 玩家在联盟的职位, 1:盟主 2:副盟主 3:长老 4:精英 5:成员
	 * @param leaguePosition
	 */
	public void setLeaguePosition(Integer leaguePosition){
		this.leaguePosition = leaguePosition;
	}
}