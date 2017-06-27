package com;

import org.apache.thrift.TException;

import com.thrift.*;

public class QueryImp implements TestQry.Iface {
	public QryResult qryTest(int qryCode) throws TException {
		QryResult result = new QryResult();
		if (qryCode == 1) {
			result.code = 1;
			result.msg = "success";
		} else {
			result.code = 0;
			result.msg = "fail";
		}
		return result;
	}
}