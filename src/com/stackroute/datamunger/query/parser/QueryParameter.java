package com.stackroute.datamunger.query.parser;

import java.util.List;

/* 
 * This class will contain the elements of the parsed Query String such as conditions,
 * logical operators,aggregate functions, file name, fields group by fields, order by
 * fields, Query Type
 * */

public class QueryParameter {
    private String fileName;
    private List<Restriction> restrictions;
    private List<String> extractFields;
    private String baseQuery;
    private List<String> logicalOperators;
    List<AggregateFunction> aggregateFunctions;
    List<String> groupBy;
    List<String> orderBy;
 
    public void setRestrictions(List<Restriction> restrictions) {
	  this.restrictions = restrictions;
    }
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String query) {
		this.fileName = query;
	}

	public String getBaseQuery() {
		return baseQuery;
	}
	public void setBaseQuery(String query) {
		 this.baseQuery = query;
	}

	public List<Restriction> getRestrictions() {
		return restrictions;
	}

	public List<String> getLogicalOperators() {
		return logicalOperators;
	}

	public List<String> getFields() {
		return extractFields;
	}

	public List<AggregateFunction> getAggregateFunctions() {
		return aggregateFunctions;
	}

	public List<String> getGroupByFields() {
		return groupBy;
	}
	public void setGroupByFields(List<String> query) {
		this.groupBy = query;
	}

	public List<String> getOrderByFields() {
		return orderBy;
	}
	public void setOrderByFields(List<String> query) {
		this.orderBy = query;
	}
	
	public void setField(List<String> extractFields) {
		this.extractFields = extractFields;
	}
}