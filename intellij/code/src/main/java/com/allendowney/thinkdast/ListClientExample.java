package com.allendowney.thinkdast;

import java.util.ArrayList;
import java.util.List;

public class ListClientExample {
	@SuppressWarnings("rawtypes")
	private List list;
	// overspecified
//	private ArrayList list;

	@SuppressWarnings("rawtypes")
	public ListClientExample() {
	    // interface-based programming
        /**
         * 특정 구체적인 클래스에 의존하지 않음.
         * 추후 구현이 변경되도 인터페이스 그대로 이용 **/
	    list = new ArrayList();
	}

	@SuppressWarnings("rawtypes")
	public List getList() {
		return list;
	}
	
	public static void main(String[] args) {
		ListClientExample lce = new ListClientExample();
        @SuppressWarnings("rawtypes")
		List list = lce.getList();
		System.out.println(list);
	}
}
