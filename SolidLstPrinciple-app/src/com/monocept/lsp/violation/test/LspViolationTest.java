package com.monocept.lsp.violation.test;

import com.monocept.lsp.violation.Rectangle;
import com.monocept.lsp.violation.Square;

public class LspViolationTest {
	public static void main(String [] args) {
		shouldNotModifyHeightWidthIsChange(new Rectangle(5, 20));
		shouldNotModifyHeightWidthIsChange(new Square(30));
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
