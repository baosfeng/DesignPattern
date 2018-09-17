package demo.memeno;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 * @date 2018/8/25
 */
class CareTaker {

	private Memeno memeno;
	private Map<String, Memeno> map = new HashMap<>();

	CareTaker(Memeno memeno) {
		this.memeno = memeno;
	}

	CareTaker() {

	}

	Memeno getMemeno() {
		return memeno;
	}

	void setMemeno(String desc, Memeno memeno) {
		map.put(desc, memeno);
	}

	Memeno getMemenoByDesc(String desc) {
		if (map.get(desc) != null) {
			return map.get(desc);
		}
		throw new RuntimeException("不存在该描述的对象");
	}
}
