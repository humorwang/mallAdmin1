package com.jfinal.club.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMlGoodsType<M extends BaseMlGoodsType<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setTypeName(java.lang.String typeName) {
		set("type_name", typeName);
	}
	
	public java.lang.String getTypeName() {
		return getStr("type_name");
	}

	public void setTypeCode(java.lang.Integer typeCode) {
		set("type_code", typeCode);
	}
	
	public java.lang.Integer getTypeCode() {
		return getInt("type_code");
	}

	public void setParentType(java.lang.Integer parentType) {
		set("parent_type", parentType);
	}
	
	public java.lang.Integer getParentType() {
		return getInt("parent_type");
	}

	public void setCreator(java.lang.Integer creator) {
		set("creator", creator);
	}
	
	public java.lang.Integer getCreator() {
		return getInt("creator");
	}

	public void setCreated(java.util.Date created) {
		set("created", created);
	}
	
	public java.util.Date getCreated() {
		return get("created");
	}

	public void setModifier(java.lang.Integer modifier) {
		set("modifier", modifier);
	}
	
	public java.lang.Integer getModifier() {
		return getInt("modifier");
	}

	public void setModified(java.util.Date modified) {
		set("modified", modified);
	}
	
	public java.util.Date getModified() {
		return get("modified");
	}

	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}
	
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	public void setCurrentMallId(java.lang.Integer currentMallId) {
		set("current_mall_id", currentMallId);
	}
	
	public java.lang.Integer getCurrentMallId() {
		return getInt("current_mall_id");
	}

	public void setRemark(java.lang.String remark) {
		set("remark", remark);
	}
	
	public java.lang.String getRemark() {
		return getStr("remark");
	}

	public void setTypeKind(java.lang.Integer typeKind) {
		set("type_kind", typeKind);
	}
	
	public java.lang.Integer getTypeKind() {
		return getInt("type_kind");
	}

}
