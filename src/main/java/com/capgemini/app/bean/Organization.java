package com.capgemini.app.bean;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Organization {
	private int orgId;
	private String name;
	private Set<String> cities;
	private List<String> boardMembers;
	private Map<String, String> branchManagers;
	private LocalDate dateOfEstablishment;
	private double shareValue;
	private boolean listed;
	private Properties ipAddresses;
	public Organization() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Organization(int orgId, String name) {
		super();
		this.orgId = orgId;
		this.name = name;
	}
	public int getOrgId() {
		return orgId;
	}
	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getCities() {
		return cities;
	}
	public void setCities(Set<String> cities) {
		this.cities = cities;
	}
	public List<String> getBoardMembers() {
		return boardMembers;
	}
	public void setBoardMembers(List<String> boardMembers) {
		this.boardMembers = boardMembers;
	}
	public Map<String, String> getBranchManagers() {
		return branchManagers;
	}
	public void setBranchManagers(Map<String, String> branchManagers) {
		this.branchManagers = branchManagers;
	}
	public LocalDate getDateOfEstablishment() {
		return dateOfEstablishment;
	}
	public void setDateOfEstablishment(LocalDate dateOfEstablishment) {
		this.dateOfEstablishment = dateOfEstablishment;
	}
	public double getShareValue() {
		return shareValue;
	}
	public void setShareValue(double shareValue) {
		this.shareValue = shareValue;
	}
	public boolean isListed() {
		return listed;
	}
	public void setListed(boolean listed) {
		this.listed = listed;
	}
	public Properties getIpAddresses() {
		return ipAddresses;
	}
	public void setIpAddresses(Properties ipAddresses) {
		this.ipAddresses = ipAddresses;
	}
	@Override
	public String toString() {
		return "Organization [orgId=" + orgId + ", name=" + name + ", cities=" + cities + ", boardMembers="
				+ boardMembers + ", branchManagers=" + branchManagers + ", dateOfEstablishment=" + dateOfEstablishment
				+ ", shareValue=" + shareValue + ", listed=" + listed + ", ipAddresses=" + ipAddresses + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((boardMembers == null) ? 0 : boardMembers.hashCode());
		result = prime * result + ((branchManagers == null) ? 0 : branchManagers.hashCode());
		result = prime * result + ((cities == null) ? 0 : cities.hashCode());
		result = prime * result + ((dateOfEstablishment == null) ? 0 : dateOfEstablishment.hashCode());
		result = prime * result + ((ipAddresses == null) ? 0 : ipAddresses.hashCode());
		result = prime * result + (listed ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + orgId;
		long temp;
		temp = Double.doubleToLongBits(shareValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Organization other = (Organization) obj;
		if (boardMembers == null) {
			if (other.boardMembers != null)
				return false;
		} else if (!boardMembers.equals(other.boardMembers))
			return false;
		if (branchManagers == null) {
			if (other.branchManagers != null)
				return false;
		} else if (!branchManagers.equals(other.branchManagers))
			return false;
		if (cities == null) {
			if (other.cities != null)
				return false;
		} else if (!cities.equals(other.cities))
			return false;
		if (dateOfEstablishment == null) {
			if (other.dateOfEstablishment != null)
				return false;
		} else if (!dateOfEstablishment.equals(other.dateOfEstablishment))
			return false;
		if (ipAddresses == null) {
			if (other.ipAddresses != null)
				return false;
		} else if (!ipAddresses.equals(other.ipAddresses))
			return false;
		if (listed != other.listed)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (orgId != other.orgId)
			return false;
		if (Double.doubleToLongBits(shareValue) != Double.doubleToLongBits(other.shareValue))
			return false;
		return true;
	}
	
}