package com.egse.entity.admin;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.share.passport.domain.Organization;
import com.share.passport.domain.Passport;
import com.share.passport.domain.Profile;

@Entity
@Table(name = "install_person")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class InstallPerson implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8510626049748923317L;

	public Long id;
	/**
	 * 安装人员编号
	 */

	private String installPersonId;
	/**
	 * 安装人员名称
	 */
	private String installPersonName;
	/**
	 * 安装人员电话
	 */
	private String installPersonPhone;
	/**
	 * 安装人员生日
	 */
	private Date installPersonBirthday;
	/**
	 * 安装人员地址
	 */
	private String installPersonAddress;
	/**
	 * 安装人员身份证号
	 */
	private String installPersonCard;
	/**
	 * 安装人员级别
	 */
	private String installPersonLevel;
	/**
	 * 安装人员位置
	 */
	private String installPersonPos;
	/**
	 * 所属安装队
	 */
	private Long installTeamId;
	/**
	 * 入职时间
	 */
	private Date startingDate;
	/**
	 * 工作进度
	 */
	private String workLoad;
	/**
	 * 状态 0 有效 1 无效
	 */
	private String status;
	/**
	 * 创建人
	 */
	private String createPerson;
	/**
	 * 创建时间
	 */
	private Date createDate;
	/**
	 * 修改人
	 */
	private String editPerson;
	/**
	 * 创建时间
	 */
	private Date editDate;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 信誉额度
	 */
	private String credit;
	/**
	 * 删除状态
	 */
	private String isDelete;
	
	private Profile profile;
	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "userId")
	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}	
	
	@Transient
	private boolean selected;

	private InstallTeam installTeam;

	private Organization org;// 部门
	private Long orgId;// 部门ID，冗余

	private Passport owner;// 创建人
	private Long ownerId;// 创建人ID，冗余

	@Id
	@GeneratedValue
	@Column(name = "id")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "ORG_ID", insertable = false, updatable = false)
	
	

	public Organization getOrg() {
		return org;
	}

	public void setOrg(Organization org) {
		this.org = org;
	}

	

	public Long getOrgId() {
		return orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "OWNER_ID", insertable = false, updatable = false)
	public Passport getOwner() {
		return owner;
	}

	public void setOwner(Passport owner) {
		this.owner = owner;
	}

	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	@Transient
	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	@Column(name = "install_person_id")
	public String getInstallPersonId() {
		return installPersonId;
	}

	public void setInstallPersonId(String installPersonId) {
		this.installPersonId = installPersonId;
	}

	@Column(name = "install_person_name")
	public String getInstallPersonName() {
		return installPersonName;
	}

	public void setInstallPersonName(String installPersonName) {
		this.installPersonName = installPersonName;
	}

	@Column(name = "install_person_phone")
	public String getInstallPersonPhone() {
		return installPersonPhone;
	}

	public void setInstallPersonPhone(String installPersonPhone) {
		this.installPersonPhone = installPersonPhone;
	}

	@Column(name = "install_person_address")
	public String getInstallPersonAddress() {
		return installPersonAddress;
	}

	public void setInstallPersonAddress(String installPersonAddress) {
		this.installPersonAddress = installPersonAddress;
	}

	@Column(name = "install_person_birthday")
	public Date getInstallPersonBirthday() {
		return installPersonBirthday;
	}

	public void setInstallPersonBirthday(Date installPersonBirthday) {
		this.installPersonBirthday = installPersonBirthday;
	}

	@Column(name = "install_person_card")
	public String getInstallPersonCard() {
		return installPersonCard;
	}

	public void setInstallPersonCard(String installPersonCard) {
		this.installPersonCard = installPersonCard;
	}

	@Column(name = "install_person_level")
	public String getInstallPersonLevel() {
		return installPersonLevel;
	}

	public void setInstallPersonLevel(String installPersonLevel) {
		this.installPersonLevel = installPersonLevel;
	}

	@Column(name = "install_person_pos")
	public String getInstallPersonPos() {
		return installPersonPos;
	}

	public void setInstallPersonPos(String installPersonPos) {
		this.installPersonPos = installPersonPos;
	}

	@Column(name = "install_team_id")
	public Long getInstallTeamId() {
		return installTeamId;
	}

	public void setInstallTeamId(Long installTeamId) {
		this.installTeamId = installTeamId;
	}

	public Date getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}

	@Column(name = "work_load")
	public String getWorkLoad() {
		return workLoad;
	}

	public void setWorkLoad(String workLoad) {
		this.workLoad = workLoad;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "create_person")
	public String getCreatePerson() {
		return createPerson;
	}

	public void setCreatePerson(String createPerson) {
		this.createPerson = createPerson;
	}

	@Column(name = "create_date")
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "edit_person")
	public String getEditPerson() {
		return editPerson;
	}

	public void setEditPerson(String editPerson) {
		this.editPerson = editPerson;
	}

	@Column(name = "edit_date")
	public Date getEditDate() {
		return editDate;
	}

	public void setEditDate(Date editDate) {
		this.editDate = editDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	@Column(name = "is_delete")
	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "install_team_id", insertable = false, updatable = false)
	public InstallTeam getInstallTeam() {
		return installTeam;
	}

	public void setInstallTeam(InstallTeam installTeam) {
		this.installTeam = installTeam;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((this.getId() == null) ? 0 : this.getId().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof InstallPerson))
			return false;
		InstallPerson other = (InstallPerson) obj;
		if (this.getId() == null) {
			if (other.getId() != null)
				return false;
		} else if (!this.getId().equals(other.getId()))
			return false;

		return true;
	}
}
