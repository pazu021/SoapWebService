package org.pazu;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.pazu.exception.InvalidInputException;

@WebService
@SOAPBinding(style = javax.jws.soap.SOAPBinding.Style.RPC)
public class ShopInfo {

	@WebMethod
	@WebResult(partName="lookupOutput")
	public String getShopInfo(@WebParam(partName="lookupInput") String property) throws InvalidInputException {
		String response = null;
		if ("shopName".equals(property)) {
			response = "Shop A";
		} else if ("since".equals(property)) {
			response = "since 2012";
		} else {
			throw new InvalidInputException("Invalid Input", property + " is not a valid input.");
		}
		return response;
	}
}
