package com.bunny.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.bunny.palindrome.PalindromeResult;
import com.bunny.palindrome.PalindromeUtils;
import com.google.gson.Gson;
/**
 * Api rest for palindrome hallenge
 * @author Luz Angélica Jiménez Rozo
 *
 */
@Path("/findPalindrome")
public class PalindromeRest {
	/**
	 * Method for find palindromes number between params x and y
	 * @param x Init number
	 * @param y Final number
	 * @return json array: 
	 */
    @GET
    @Path("/{param}/{param2}")
    @Produces({"application/json"})
    public String find(@PathParam("param") Integer x,@PathParam("param2") Integer y) {
    	PalindromeResult result = PalindromeUtils.find(x, y);
        return new Gson().toJson(result);
    }
}