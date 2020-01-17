package tester;

import java.util.ArrayList;
import java.util.List;

import core.Emp;
import core.Mgr;
import core.SalesMgr;

public class Test {

	static void fun1(List<? super  Mgr> l)
	{
		ArrayList<SalesMgr> aa=new ArrayList<>();
	//	l.addAll(aa);
	}
	public static void main(String[] args) {
		//ArrayList< extends Mgr> a=new ArrayList<Mgr>();
		//a.add(new Mgr(1, "44", 100.0));
		//a=new ArrayList<SalesMgr>();
		 
				//ArrayList<SalesMgr> aa=new ArrayList<>();
				//a.addAll(aa);
		//a.add(new Mgr(1, "a", 100));
		ArrayList<Number> aa=new ArrayList<>();
		aa.add(10);
		aa.add(10.0);
		int i=(int)aa.get(0);
	}
}
