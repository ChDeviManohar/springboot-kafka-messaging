package io.mano.messaging.model;

public class UserBean {

	private String name = null;
	private Integer age = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserBean [name=" + name + ", age=" + age + "]";
	}

}
