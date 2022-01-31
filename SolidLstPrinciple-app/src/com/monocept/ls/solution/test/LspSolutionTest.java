package com.monocept.ls.solution.test;

import com.monocept.lsp.solution.*;


public class LspSolutionTest {
	
	public static void main(String [] args) {
		shouldNotModifyHeightWidthIsChange(new Rectangle(5, 20));
//		shouldNotModifyHeightWidthIsChange(new Square(30));
	}
	
	public static void  shouldNotModifyHeightWidthIsChange(Rectangle rectangle) {
		int beforeChange = rectangle.getHeight();
		rectangle.setWidth(rectangle.getWidth()+10);
		int afterChange = rectangle.getHeight();
		System.out.println(beforeChange == afterChange);
		System.out.println(beforeChange);
		System.out.println(afterChange);
		System.out.println();
	}
}
