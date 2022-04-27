package ps.programmers.hash.lvl01;

import java.util.Objects;

public class MutableKey {
	
	private String name;

	void setName(String name) {
		this.name = name;
	}
	
	public MutableKey(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o){
		// 같은 인스턴스를 참조하고 있으면
		if(this == o){
			return true;
		}

		// 파라미터로 받은 객체가 null을 참조하거나 둘의 인스턴스가 다르면
		if(o == null || this.getClass() !=o.getClass()){
			return false;
		}

		MutableKey that = (MutableKey) o;

		//두 데이터의 값 일치를 비교해서 결과 리턴
		return Objects.equals(name, that.name);
	}

	@Override
	public int hashCode(){
		// name이 같을 경우 같은 hashcode 리턴
		return Objects.hash(name);
	}
}
