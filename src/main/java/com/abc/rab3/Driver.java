package com.abc.rab3;

public class Driver {
	private Integer Id;
	private String name;
	private String license;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	@Override
	public String toString() {
		return "Driver [Id=" + Id + ", name=" + name + ", license=" + license + "]";
	}

}
