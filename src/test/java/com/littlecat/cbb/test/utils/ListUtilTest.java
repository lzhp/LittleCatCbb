package com.littlecat.cbb.test.utils;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.littlecat.cbb.utils.ListUtil;

public class ListUtilTest
{
	@Test
	public void testJoin2String()
	{
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("aaaaa");
		
		System.out.println(ListUtil.join2String(list));
		System.out.println(ListUtil.join2String(list,"|"));
	}
}
