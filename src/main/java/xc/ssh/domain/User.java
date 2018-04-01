package xc.ssh.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class User implements Serializable {
	private Long id;
	private String name;
	private String password;
	private Car car;
	private Set cars;
	private List  list;
	private Map map;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set getCars() {
		return cars;
	}
	public void setCars(Set cars) {
		this.cars = cars;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	
	public Car getCar() {
		System.out.println("使用了getCar方法");
		return car;
	}
	public void setCar(Car car) {
		System.out.println("使用了setCar方法");
		this.car = car;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", cars=" + cars
				+ ", list=" + list + ", map=" + map + "]";
	}
	
	
	
	
}
