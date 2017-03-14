package org.tpri.sc.dao.condition;

/**
 * @description 查询排序条件
 * @author 易文俊
 * @since 2015-04-02
 */
public class Order {
	private final static String ASC = "asc";
	private final static String DESC = "desc";
	private String fieldName;
	private String orderRule; 
	
	public Order (String fieldName,String orderRule){
		this.fieldName = fieldName;
		this.orderRule = orderRule;
	}
	
	public static Order asc(String fieldName){
		return new Order(fieldName,ASC);
	}
	
	public static Order desc(String fieldName){
		return new Order(fieldName,DESC);
	}

	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public String getOrderRule() {
		return orderRule;
	}
	public void setOrderRule(String orderRule) {
		this.orderRule = orderRule;
	}
	
}
